package ast.visitor;


import Classes.Basic.*;
import Classes.Controller.*;
import Classes.Pages.*;
import Classes.PhpElement;
import Classes.PhpPlus;
import Classes.Splus;
import Classes.Style.*;
import Classes.elements.*;
import Code_Generation.Code_Generation;
import Semantics_Check.Semantic_Check;
import Symbol_Tables.Basic_Table;
import Symbol_Tables.Db_Table;
import Symbol_Tables.Pages_Table;
import Symbol_Tables.Rows.*;
import Symbol_Tables.Symbol_Table;
import com.sun.org.apache.xerces.internal.util.SymbolTable;
import gen.HTMLParser;
import gen.HTMLParserBaseVisitor;

import java.io.FileNotFoundException;
import java.io.IOException;


public class BaseVisitor extends HTMLParserBaseVisitor

{
    Basic_Table basic_table = new Basic_Table();
    Pages_Table pages_table = new Pages_Table();
    Db_Table db = new Db_Table();
    Symbol_Table symbolTable = new Symbol_Table();
    Semantic_Check semantic_check =  new Semantic_Check();
    Code_Generation code_generation =new Code_Generation();
    Style_row style_row =new Style_row();
    String table_name= " ";
    String view_type= " ";
    String column_name= " ";

    Table_row table_row =new Table_row();

    boolean exception = true;
    int j = 0;
    int pi=0;
  // rows



    @Override
    public Splus visitSplus(HTMLParser.SplusContext ctx)  {
        Splus splus = new Splus();

        if(ctx.START()!=null)
        {
            NormalRow clone = new NormalRow();
            clone.setFunction_name("app");
            clone.setFunction_value("none");
            this.symbolTable.getRow().add(clone);
            this.basic_table.getBasic().add(j,ctx.START().getText());
            this.pages_table.getPages().add(pi,"home");
            this.j++;
            this.pi++;
        }
        for (int i = 0; i < ctx.phpPlus().size(); i++) {
            if(ctx.phpPlus(i)!=null)
                splus.getPhpPluses().add(visitPhpPlus(ctx.phpPlus(i)));
        }

       this.exception = this.semantic_check.project_name(this.basic_table.getBasic());

        this.exception = this.semantic_check.auth_is_acceptable(this.basic_table.getBasic());

        this.exception = this.semantic_check.inject_user_is_acceptable(this.basic_table.getBasic());


        this.basic_table.print();
        this.pages_table.print();
        this.db.print();
        if(this.exception ) {
            System.out.println("no exceptions the Symbol table ");
            this.symbolTable.print();
            /*try {
                this.code_generation.app(this.symbolTable);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }*/
        }
        return splus;
    }

    @Override
    public PhpPlus visitPhpPlus(HTMLParser.PhpPlusContext ctx) {
        PhpPlus phpPlus= new PhpPlus();
        for (int i = 0; i < ctx.phpElement().size(); i++) {
            if(ctx.phpElement(i)!=null)
                phpPlus.getPhpElements().add(visitPhpElement(ctx.phpElement(i)));
        }

        return phpPlus;
    }

    @Override
    public PhpElement visitPhpElement(HTMLParser.PhpElementContext ctx) {
        PhpElement phpElement= new PhpElement();
        if(ctx.name()!=null)
        phpElement.setName(visitName(ctx.name()));
        if(ctx.auth()!=null)
        phpElement.setAuth(visitAuth(ctx.auth()));
        if(ctx.contollers()!=null)
        phpElement.setControllers(visitContollers(ctx.contollers()));
        if(ctx.logo()!=null)
        phpElement.setLogo(visitLogo(ctx.logo()));
        if(ctx.login()!=null)
        phpElement.setLogin(visitLogin(ctx.login()));
        if(ctx.inject()!=null)
        phpElement.setInject(visitInject(ctx.inject()));
        if(ctx.signUp()!=null)
        phpElement.setSignUp(visitSignUp(ctx.signUp()));
        if(ctx.page()!=null)
        phpElement.setPage(visitPage(ctx.page()));
        if(ctx.nav()!=null)
        phpElement.setNav(visitNav(ctx.nav()));
        if(ctx.footer()!=null)
        phpElement.setFooter(visitFooter(ctx.footer()));
        if(ctx.style()!=null)
        phpElement.setStyle(visitStyle(ctx.style()));
        return phpElement;
    }

    @Override
    public Style visitStyle(HTMLParser.StyleContext ctx) {
        Style style= new Style();
        if(ctx.pageStyle()!=null)
        style.setPageStyle(visitPageStyle(ctx.pageStyle()));
        if(ctx.loginStyle()!=null)
            style.setLoginStyle(visitLoginStyle(ctx.loginStyle()));
        if(ctx.signUpStyle()!=null)
            style.setSignUpStyle(visitSignUpStyle(ctx.signUpStyle()));
        if(ctx.navStyle()!=null)
            style.setNavStyle(visitNavStyle(ctx.navStyle()));
        if(ctx.footerStyle()!=null)
            style.setFooterStyle(visitFooterStyle(ctx.footerStyle()));
        return style;
    }

    @Override
    public PageStyle visitPageStyle(HTMLParser.PageStyleContext ctx) {
        PageStyle pageStyle=new PageStyle();
        pageStyle.setVar(visitVar(ctx.var()));
        this.style_row.setColor("");
        this.style_row.setText_color("");
        this.style_row.setInput_color("");
        this.style_row.setAlign("");

        this.exception = this.semantic_check.valid_Style(this.pages_table.getPages(),ctx.var().getText());
        for (int i = 0; i < ctx.styleAttributes().size(); i++) {
            if(ctx.styleAttributes(i)!=null)
                pageStyle.getStyleAttributes().add(visitStyleAttributes(ctx.styleAttributes(i)));
        }

        //symbol table


        Style_row clone = new Style_row();
        clone.setPage_name(pageStyle.getVar().toString());
        clone.setColor(this.style_row.getColor());
        clone.setText_color(this.style_row.getText_color());
        clone.setInput_color(this.style_row.getInput_color());
        clone.setAlign(this.style_row.getAlign());
        this.symbolTable.getStyle_rows().add(clone);

        //symbol table




        return pageStyle;
    }

    @Override
    public FooterStyle visitFooterStyle(HTMLParser.FooterStyleContext ctx) {
        FooterStyle footerStyle=new FooterStyle();
        this.style_row.setColor("");
        this.style_row.setText_color("");
        this.style_row.setInput_color("");
        this.style_row.setAlign("");

        this.exception = this.semantic_check.valid_Style(this.pages_table.getPages(),ctx.FOOTER().getText());
        for (int i = 0; i < ctx.styleAttributes().size(); i++) {
            if(ctx.styleAttributes(i)!=null)
                footerStyle.getStyleAttributes().add(visitStyleAttributes(ctx.styleAttributes(i)));
        }


        //symbol table

        Style_row clone = new Style_row();
        clone.setPage_name("footer");
        clone.setColor(this.style_row.getColor());
        clone.setText_color(this.style_row.getText_color());
        clone.setInput_color(this.style_row.getInput_color());
        clone.setAlign(this.style_row.getAlign());
        this.symbolTable.getStyle_rows().add(clone);

        //symbol table

        return footerStyle;
    }

    @Override
    public NavStyle visitNavStyle(HTMLParser.NavStyleContext ctx) {
        NavStyle navStyle =new NavStyle();
        this.style_row.setColor("");
        this.style_row.setText_color("");
        this.style_row.setInput_color("");
        this.style_row.setAlign("");
        this.exception =this.semantic_check.valid_Style(this.pages_table.getPages(),ctx.NAV().getText());
        for (int i = 0; i < ctx.styleAttributes().size(); i++) {
            if(ctx.styleAttributes(i)!=null)
                navStyle.getStyleAttributes().add(visitStyleAttributes(ctx.styleAttributes(i)));
        }


        //symbol table

        Style_row clone = new Style_row();
        clone.setPage_name("nav");
        clone.setColor(this.style_row.getColor());
        clone.setText_color(this.style_row.getText_color());
        clone.setInput_color(this.style_row.getInput_color());
        clone.setAlign(this.style_row.getAlign());
        this.symbolTable.getStyle_rows().add(clone);

        //symbol table

        return navStyle;
    }


    @Override
    public SignUpStyle visitSignUpStyle(HTMLParser.SignUpStyleContext ctx) {
        SignUpStyle signUpStyle=new SignUpStyle();
        this.style_row.setColor("");
        this.style_row.setText_color("");
        this.style_row.setInput_color("");
        this.style_row.setAlign("");
        this.exception = this.semantic_check.valid_Style(this.pages_table.getPages(),ctx.SIGNUP().getText());
        for (int i = 0; i < ctx.styleAttributes().size(); i++) {
            if(ctx.styleAttributes(i)!=null)
                signUpStyle.getStyleAttributes().add(visitStyleAttributes(ctx.styleAttributes(i)));
        }


        //symbol table

        Style_row clone = new Style_row();
        clone.setPage_name("signUp");
        clone.setColor(this.style_row.getColor());
        clone.setText_color(this.style_row.getText_color());
        clone.setInput_color(this.style_row.getInput_color());
        clone.setAlign(this.style_row.getAlign());
        this.symbolTable.getStyle_rows().add(clone);

        //symbol table

        return signUpStyle;
    }

    @Override
    public LoginStyle visitLoginStyle(HTMLParser.LoginStyleContext ctx) {
        LoginStyle loginStyle=new LoginStyle();
        this.style_row.setColor("");
        this.style_row.setText_color("");
        this.style_row.setInput_color("");
        this.style_row.setAlign("");

        this.exception = this.semantic_check.valid_Style(this.pages_table.getPages(),ctx.LOGIN().getText());
        for (int i = 0; i < ctx.styleAttributes().size(); i++) {
            if(ctx.styleAttributes(i)!=null)
                loginStyle.getStyleAttributes().add(visitStyleAttributes(ctx.styleAttributes(i)));
        }


        //symbol table
        Style_row clone = new Style_row();
        clone.setPage_name("login");
        clone.setColor(this.style_row.getColor());
        clone.setText_color(this.style_row.getText_color());
        clone.setInput_color(this.style_row.getInput_color());
        clone.setAlign(this.style_row.getAlign());
        this.symbolTable.getStyle_rows().add(clone);

        //symbol table

        return loginStyle;
    }

    @Override
    public StyleAttributes visitStyleAttributes(HTMLParser.StyleAttributesContext ctx) {
        StyleAttributes styleAttributes= new StyleAttributes();


        if(ctx.align()!=null)
        styleAttributes.setAlign(visitAlign(ctx.align()));
        if(ctx.color()!=null)
        styleAttributes.setColor(visitColor(ctx.color()));
        if(ctx.textColor()!=null)
        styleAttributes.setTextColor(visitTextColor(ctx.textColor()));
        if(ctx.inputColor()!=null)
        styleAttributes.setInputColor(visitInputColor(ctx.inputColor()));



        //style row

        return styleAttributes;
    }

    @Override
    public InputColor visitInputColor(HTMLParser.InputColorContext ctx) {
        InputColor inputColor=new InputColor();
        inputColor.setInputColor(ctx.INPUT_COLOR().getText());
        inputColor.setVar(visitVar(ctx.var()));
        this.style_row.setInput_color(ctx.var().getText());
        return inputColor;
    }

    @Override
    public TextColor visitTextColor(HTMLParser.TextColorContext ctx) {
        TextColor textColor=new TextColor();
        textColor.setTextColor(ctx.TEXT_COLOR().getText());
        textColor.setVar(visitVar(ctx.var()));
        this.style_row.setText_color(ctx.var().getText());
        return textColor;
    }

    @Override
    public Color visitColor(HTMLParser.ColorContext ctx) {
        Color color= new Color();
        color.setColor(ctx.COLOR().getText());
        color.setVar(visitVar(ctx.var()));
        this.style_row.setColor(ctx.var().getText());
        return color;
    }

    @Override
    public Align visitAlign(HTMLParser.AlignContext ctx) {
        Align align=new Align();

        if(ctx.ALIGN_LEFT()!=null)
        {align.setAlign(ctx.ALIGN_LEFT().getText());}

        if(ctx.ALIGN_UP()!=null)
        {align.setAlign(ctx.ALIGN_UP().getText());}

        if(ctx.ALIGN_RIGHT()!=null)
        {align.setAlign(ctx.ALIGN_RIGHT().getText());}
        style_row.setAlign(align.getAlign().toString());
        return align;
    }

    @Override
    public Controllers visitContollers(HTMLParser.ContollersContext ctx) {
        Controllers controllers =new Controllers();
        controllers.setControllers(ctx.CONTROLLER().getText());
        if(ctx.loginController()!=null)
        controllers.setLoginController(visitLoginController(ctx.loginController()));
        if(ctx.singUpController()!=null)
        controllers.setSignUpController(visitSingUpController(ctx.singUpController()));
        if(ctx.pageController()!=null)
        controllers.setPageController(visitPageController(ctx.pageController()));
        if(ctx.formController()!=null)
        controllers.setFormController(visitFormController(ctx.formController()));
        if(ctx.navController()!=null)
        controllers.setNavController(visitNavController(ctx.navController()));
        if(ctx.footerController()!=null)
        controllers.setFooterController(visitFooterController(ctx.footerController()));
        return controllers;
    }

    @Override
    public FooterController visitFooterController(HTMLParser.FooterControllerContext ctx) {
        this.table_row.getTable_columns().removeAll(this.table_row.getTable_columns());
        FooterController footerController=new FooterController();
        footerController.setFooter(ctx.FOOTER().getText());
        //this.pages_table.getPages().add(pi,"controller "+ctx.FOOTER().getText());
        this.semantic_check.valid_Controller(this.pages_table.getPages(),ctx.FOOTER().getText());
        footerController.setArray(visitArray(ctx.array()));
        //symbol table
        Table_row clone = new Table_row();
        clone.setTableName("footer ");
        for (int i = 0; i < this.table_row.getTable_columns().size() ; i++) {
            if(this.table_row.getTable_columns().get(i)!=null)
                clone.getTable_columns().add(this.table_row.getTable_columns().get(i));
        }
        this.symbolTable.getTable_rows().add(clone);
        //symbol table
        return footerController;
    }

    @Override
    public NavController visitNavController(HTMLParser.NavControllerContext ctx) {
        this.table_row.getTable_columns().removeAll(this.table_row.getTable_columns());
        NavController navController = new NavController();
        navController.setNav(ctx.NAV().getText());
       // this.pages_table.getPages().add(pi,"controller "+ctx.NAV().getText());
       // this.pi ++;

        this.exception =this.semantic_check.valid_Controller(this.pages_table.getPages(),ctx.NAV().getText());
        navController.setArray(visitArray(ctx.array()));


        //symbol table
        Table_row clone = new Table_row();
        clone.setTableName("nav ");
        for (int i = 0; i < this.table_row.getTable_columns().size() ; i++) {
            if(this.table_row.getTable_columns().get(i)!=null)
                clone.getTable_columns().add(this.table_row.getTable_columns().get(i));
        }
        this.symbolTable.getTable_rows().add(clone);
        //symbol table

        return navController;
    }

    @Override
    public Array visitArray(HTMLParser.ArrayContext ctx) {
        Array array=new Array();
        for (int i = 0; i < ctx.elements().size(); i++) {
            if(ctx.elements(i)!=null)
            {array.getElements().add(visitElements(ctx.elements(i)));
                this.table_row.getTable_columns().add(ctx.elements(i).getText());
            }

            this.exception = this.semantic_check.valid_Controller(this.pages_table.getPages(),ctx.elements(i).getText().replaceAll(",",""));
        }
        return array;
    }

    @Override
    public Elements visitElements(HTMLParser.ElementsContext ctx) {
        Elements elements = new Elements();
        elements.setVar(visitVar(ctx.var()));
        return elements;
    }

    @Override
    public FormController visitFormController(HTMLParser.FormControllerContext ctx) {
        this.table_row.getTable_columns().removeAll(this.table_row.getTable_columns());
        FormController formController=new FormController();
        formController.setTable_name(visitTableName(ctx.tableName()));
        this.db.getDb().add(ctx.tableName().getText());
        formController.setFormAttributes(visitFormAttributes(ctx.formAttributes()));
        //symbol table
        Table_row clone = new Table_row();
        clone.setTableName(ctx.tableName().getText() );
        for (int i = 0; i < this.table_row.getTable_columns().size() ; i++) {
            if(this.table_row.getTable_columns().get(i)!=null)
            clone.getTable_columns().add(this.table_row.getTable_columns().get(i));
        }
        this.symbolTable.getTable_rows().add(clone);
        //symbol table
        return formController;
    }

    @Override
    public FormAttributes visitFormAttributes(HTMLParser.FormAttributesContext ctx) {
        FormAttributes formAttributes =new FormAttributes();
        for (int i = 0; i < ctx.attributes().size(); i++) {
            if(ctx.attributes(i)!=null)
            {formAttributes.getAttributes().add(visitAttributes(ctx.attributes(i)));
            this.table_row.getTable_columns().add(ctx.attributes(i).getText());
            }
        }
        return formAttributes;
    }

    @Override
    public Attributes visitAttributes(HTMLParser.AttributesContext ctx) {
        Attributes attributes =new Attributes();
        attributes.setAttNAme(visitAttName(ctx.attName()));
        attributes.setAttType(visitAttType(ctx.attType()));
        return attributes;
    }

    @Override
    public AttType visitAttType(HTMLParser.AttTypeContext ctx) {
        AttType attType =new AttType();
        attType.setVar(visitVar(ctx.var()));
        return attType;
    }

    @Override
    public AttNAme visitAttName(HTMLParser.AttNameContext ctx) {
        AttNAme attNAme=new AttNAme();
        attNAme.setVar(visitVar(ctx.var()));
        return attNAme;
    }

    @Override
    public PageController visitPageController(HTMLParser.PageControllerContext ctx) {
        PageController pageController= new PageController();
        pageController.setPageName(visitPageName(ctx.pageName()));
        pageController.setDestination(visitDestenation(ctx.destenation()));

        this.exception =this.semantic_check.valid_Controller(this.pages_table.getPages(),ctx.pageName().getText());

        this.exception = this.semantic_check.valid_Controller(this.pages_table.getPages(),ctx.destenation().getText());

        //symbol table
        Controller_row clone = new Controller_row();
        clone.setStart(ctx.pageName().getText());
        clone.setDestination(ctx.destenation().getText());
        this.symbolTable.getController_rows().add(clone);
        //symbol table

        return pageController;
    }

    @Override
    public PageName visitPageName(HTMLParser.PageNameContext ctx) {
        PageName pageName = new PageName();
        pageName.setPname(ctx.PNAME().getText());
        return pageName;
    }

    @Override
    public SignUpController visitSingUpController(HTMLParser.SingUpControllerContext ctx) {
        SignUpController signUpController=new SignUpController();
        signUpController.setSignUp(ctx.SIGNUP().getText());
       // this.pages_table.getPages().add(pi,"controller "+ctx.SIGNUP().getText());
        //this.pi ++;

        this.exception =this.semantic_check.valid_Controller(this.pages_table.getPages(),ctx.SIGNUP().getText());
        signUpController.setDestination(visitDestenation(ctx.destenation()));

        this.exception =this.semantic_check.valid_Controller(this.pages_table.getPages(),ctx.destenation().getText());

        //symbol table
        Controller_row clone = new Controller_row();
        clone.setStart("signUp");
        clone.setDestination(ctx.destenation().getText());
        this.symbolTable.getController_rows().add(clone);
        //symbol table

        return signUpController;
    }

    @Override
    public LoginController visitLoginController(HTMLParser.LoginControllerContext ctx) {
        LoginController loginController =new LoginController();
        loginController.setLogin(ctx.LOGIN().getText());
       // this.pages_table.getPages().add(pi,"controller "+ctx.LOGIN().getText());
       // this.pi ++;

        this.exception =this.semantic_check.valid_Controller(this.pages_table.getPages(),ctx.LOGIN().getText());
        loginController.setDestination(visitDestenation(ctx.destenation()));

        this.exception =this.semantic_check.valid_Controller(this.pages_table.getPages(),ctx.destenation().getText());

        //symbol table
        Controller_row clone = new Controller_row();
        clone.setStart("login");
        clone.setDestination(ctx.destenation().getText());
        this.symbolTable.getController_rows().add(clone);
        //symbol table


        return loginController;
    }

    @Override
    public Destination visitDestenation(HTMLParser.DestenationContext ctx) {
        Destination destination=new Destination();
        destination.setVar(visitVar(ctx.var()));
       // this.pages_table.getPages().add(pi,"controller distenation "+destination.getVar().toString());
       // this.pi ++;

        return destination;
    }

    @Override
    public Inject visitInject(HTMLParser.InjectContext ctx) {
        Inject inject=new Inject();
        inject.setInjectUser(ctx.INJECTUSER().getText());
        this.basic_table.getBasic().add(j,ctx.INJECTUSER().getText());
        this.j++;
        inject.setRole(visitRole(ctx.role()));
        inject.setEmail(visitEmail(ctx.email()));
        inject.setPassword(visitPassword(ctx.password()));

        //symbol table
        Inject_row clone = new Inject_row();
        clone.setRole(ctx.role().getText());
        clone.setEmail(ctx.email().getText());
        clone.setPassword(ctx.password().getText());
        this.symbolTable.getInject_rows().add(clone);
        //symbol table

        return inject;
    }

    @Override
    public Password visitPassword(HTMLParser.PasswordContext ctx) {
        Password password=new Password();
        password.setVar(visitVar(ctx.var()));
        return password;
    }

    @Override
    public Email visitEmail(HTMLParser.EmailContext ctx) {
        Email email=new Email();
        email.setVar(visitVar(ctx.var()));
        return email;
    }

    @Override
    public Role visitRole(HTMLParser.RoleContext ctx) {
        Role role=new Role();
        if(ctx.USER_ROLE()!=null)
        role.setRole(ctx.USER_ROLE().getText());
        if(ctx.ADMIN_ROLE()!=null)
        role.setRole(ctx.ADMIN_ROLE().getText());
        return role;
    }

    @Override
    public SignUp visitSignUp(HTMLParser.SignUpContext ctx) {
        SignUp signUp =new SignUp();
        signUp.setSignUp(ctx.SIGNUP().getText());
        this.basic_table.getBasic().add(j,ctx.SIGNUP().getText());
        this.j++;
        this.pages_table.getPages().add(pi,ctx.SIGNUP().getText());
        this.pi ++;
        this.db.getDb().add("users");
        // symbol table
        NormalRow clone = new NormalRow();
        clone.setFunction_name("signUp");
        clone.setFunction_value("none");
        this.symbolTable.getRow().add(clone);
        // symbol table
        return signUp;
    }

    @Override
    public Login visitLogin(HTMLParser.LoginContext ctx) {
        Login login = new Login();
        login.setLogin(ctx.LOGIN().getText());
        this.basic_table.getBasic().add(j,ctx.LOGIN().getText());
        this.j++;
        this.pages_table.getPages().add(pi,ctx.LOGIN().getText());
        this.pi ++;
        this.db.getDb().add("users");
        // symbol table
        NormalRow clone = new NormalRow();
        clone.setFunction_name("login");
        clone.setFunction_value("none");
        this.symbolTable.getRow().add(clone);
        // symbol table
        return login;
    }

    @Override
    public Page visitPage(HTMLParser.PageContext ctx) {
        Page page = new Page();
        page.setPageAttributes(visitPageAttributes(ctx.pageAttributes()));
        return page;
    }

    @Override
    public PageAttributes visitPageAttributes(HTMLParser.PageAttributesContext ctx) {
        PageAttributes pageAttributes = new PageAttributes();
        pageAttributes.setName_page(visitName_page(ctx.name_page()));
        Page_row clone = new Page_row();
        clone.setPage_name(ctx.name_page().getText());
        this.table_name = "";
        this.table_name= "";
        this.column_name="";
        if(ctx.pageForm()!=null)
        {pageAttributes.setPageForm(visitPageForm(ctx.pageForm()));
        clone.setForm_Or_table("form");
        clone.setTable_name(ctx.pageForm().getText().replaceAll("form:",""));
        }
        if(ctx.pageTable()!=null)
        { pageAttributes.setPageTable(visitPageTable(ctx.pageTable()));
            clone.setForm_Or_table("table");
            clone.setTable_name(this.table_name.replaceAll("Table_name =" ,""));
             clone.setView_type(this.view_type);
             clone.setView_by(this.column_name.replaceAll("Column Name =" ,""));

        }
        if(ctx.authiticated()!=null)
        {  pageAttributes.setAuthiticated(visitAuthiticated(ctx.authiticated()));
        clone.setRole(ctx.authiticated().getText());
        }


        //symbol table


        this.symbolTable.getPage_rows().add(clone);
        //symbol table

        return pageAttributes;
    }

    @Override
    public Authiticated visitAuthiticated(HTMLParser.AuthiticatedContext ctx)
    {
        Authiticated authiticated =new Authiticated();
        authiticated.setOnly(ctx.ONLY().getText());
        if(ctx.USER()!=null)
            authiticated.setAuth(ctx.USER().getText());
        if(ctx.ADMIN()!=null)
            authiticated.setAuth(ctx.ADMIN().getText());
        return authiticated;
    }

    @Override
    public PageTable visitPageTable(HTMLParser.PageTableContext ctx) {
        PageTable pageTable =new PageTable();
        pageTable.setTable(ctx.TABLE().getText());
        pageTable.setTable_name(visitTableName(ctx.tableName()));
        pageTable.setViewAs(visitViewAs(ctx.viewAs()));
        this.table_name = pageTable.getTable_name().toString();

        return pageTable;
    }

    @Override
    public ViewAs visitViewAs(HTMLParser.ViewAsContext ctx) {
        ViewAs viewAs=new ViewAs();
        if(ctx.BLOCK()!=null)
        viewAs.setView(ctx.BLOCK().getText());
        if(ctx.LIST()!=null)
            viewAs.setView(ctx.LIST().getText());
        if(ctx.METRO()!=null)
            viewAs.setView(ctx.METRO().getText());
        viewAs.setColumn_name(visitColumnName(ctx.columnName()));
        this.view_type = viewAs.getView();
        this.column_name = viewAs.getColumn_name().toString();
        return viewAs;
    }

    @Override
    public Column_Name visitColumnName(HTMLParser.ColumnNameContext ctx) {
        Column_Name column_name=new Column_Name();
        column_name.setVar(visitVar(ctx.var()));
        return column_name;
    }

    @Override
    public PageForm visitPageForm(HTMLParser.PageFormContext ctx) {
        PageForm pageForm =new PageForm();
        pageForm.setForm(ctx.FORM().getText());
        pageForm.setTable_name(visitTableName(ctx.tableName()));

        this.exception =this.semantic_check.valid_Form(this.db.getDb(),ctx.tableName().getText());
        return pageForm;
    }

    @Override
    public Table_Name visitTableName(HTMLParser.TableNameContext ctx) {
        Table_Name table_name =new Table_Name();
        table_name.setVar(visitVar(ctx.var()));
        return table_name;
    }

    @Override
    public Name_page visitName_page(HTMLParser.Name_pageContext ctx) {
        Name_page name_page =new Name_page();
        name_page.setVar(visitVar(ctx.var()));
        this.pages_table.getPages().add(pi,name_page.getVar().toString());
        this.pi ++;
        return name_page;
    }

    @Override
    public Footer visitFooter(HTMLParser.FooterContext ctx) {
        Footer footer =new Footer();
        footer.setfooter(ctx.FOOTER().getText());
        this.basic_table.getBasic().add(j,ctx.FOOTER().getText());
        this.j++;
        this.pages_table.getPages().add(pi,ctx.FOOTER().getText());
        this.pi ++;
        footer.setString(visitString(ctx.string()));
        // symbol table
        NormalRow clone = new NormalRow();
        clone.setFunction_name("footer");
        clone.setFunction_value(ctx.string().getText().replaceAll("'",""));
        this.symbolTable.getRow().add(clone);
        // symbol table
        return footer;
    }

    @Override
    public Nav visitNav(HTMLParser.NavContext ctx) {
        Nav nav = new Nav();
        nav.setNav(ctx.NAV().getText());
        this.basic_table.getBasic().add(j,ctx.NAV().getText());
        this.j++;
        this.pages_table.getPages().add(pi,ctx.NAV().getText());
        this.pi ++;
        // symbol table
        NormalRow clone = new NormalRow();
        clone.setFunction_name("nav");
        clone.setFunction_value("none");
        this.symbolTable.getRow().add(clone);
        // symbol table
        return nav;
    }

    @Override
    public Logo visitLogo(HTMLParser.LogoContext ctx) {
        Logo logo = new Logo();
        logo.setlogo(ctx.LOGO().getText());
        this.basic_table.getBasic().add(j,ctx.LOGO().getText());
        this.j++;
        logo.setString(visitString(ctx.string()));
        // symbol table
        NormalRow clone = new NormalRow();
        clone.setFunction_name("logo");
        clone.setFunction_value(ctx.string().getText().replaceAll("'",""));
        this.symbolTable.getRow().add(clone);
        // symbol table
        return logo;
    }

    @Override
    public Auth visitAuth(HTMLParser.AuthContext ctx) {
        Auth auth =new Auth();
        auth.setAuth(ctx.AUTH().getText());
        this.basic_table.getBasic().add(j,ctx.AUTH().getText());
        this.j++;
        // symbol table
        NormalRow clone = new NormalRow();
        clone.setFunction_name("auth");
        clone.setFunction_value("none");
        this.symbolTable.getRow().add(clone);
        // symbol table
        return auth;
    }

    @Override
    public Name visitName(HTMLParser.NameContext ctx) {
        Name name =new Name();
        name.setName(ctx.NAME().getText());
        this.basic_table.getBasic().add(j,ctx.NAME().getText());
        this.j++;
        name.setString(visitString(ctx.string()));

        NormalRow clone = new NormalRow();
        clone.setFunction_name("name");
        clone.setFunction_value(ctx.string().getText().replaceAll("'","").replaceAll(" ",""));
        this.symbolTable.getRow().add(clone);


        return name;
    }

    @Override
    public Strings visitString(HTMLParser.StringContext ctx) {
        Strings strings = new Strings();
        strings.setVar(visitVar(ctx.var()));
        return strings;
    }

    @Override
    public Var visitVar(HTMLParser.VarContext ctx) {
        Var var =new Var();
        var.setVar(ctx.VAR().getText());
        return var;
    }
}


