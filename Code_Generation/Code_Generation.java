package Code_Generation;

import Symbol_Tables.Symbol_Table;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code_Generation {

    String footer ="";
    String nav ="";
    String logo = "";
    String nav_links =" <?php require_once(\"connect.php\");\n" +
            "if(!isset($_SESSION)){session_start();} ?>   <!--<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.2.1/css/bootstrap.min.css\">-->\n" +
            "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootswatch/4.2.1/materia/bootstrap.min.css\"/>\n" +
            "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"/>\n" +
            "    <link rel=\"stylesheet\" href=\"login/nav/css/navbar-fixed-right.min.css\">\n" +
            "    <link rel=\"stylesheet\" href=\"login/nav/css/navbar-fixed-left.min.css\">\n" +
            "    <link rel=\"stylesheet\" href=\"login/nav/css/docs.css\">\n" +
            this.logo+
            "    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n" +
            "            integrity=\"sha256-k2WSCIexGzOj3Euiig+TlR8gA0EmPjuc79OEeY5L45g=\" crossorigin=\"anonymous\"></script>\n" +
            "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.2.1/js/bootstrap.js\"></script>\n" +
            "    <script src=\"login/nav/js/docs.js\"></script>\n" +
            "    <script async defer src=\"https://buttons.github.io/buttons.js\"></script>\n" ;
    public void app(Symbol_Table symbol_table) throws FileNotFoundException {

        PrintWriter writer;
        String name = "";

        boolean auth =false;


        for (int i = 0; i < symbol_table.getRow().size(); i++) {
            if(symbol_table.getRow().get(i)!=null)
            {

                if (symbol_table.getRow().get(i).getFunction_name().equals("name")) {
                    name = symbol_table.getRow().get(i).getFunction_value();
                }

                if(symbol_table.getRow().get(i).getFunction_name().equals("footer"))
                {
                    this.footer = getFooter(symbol_table,symbol_table.getRow().get(i).getFunction_value());

                }
                if(symbol_table.getRow().get(i).getFunction_name().equals("nav"))
                {
                    this.nav = getNav(symbol_table,name);
                }
            }
        }

        // get project name from symbol table
        for (int i = 0; i < symbol_table.getRow().size(); i++) {

            if (symbol_table.getRow().get(i).getFunction_name().equals("name")) {
                //create new folder by project name
                File theDir = new File(name);
                if (!theDir.exists()) {
                    theDir.mkdirs();
                }

                //create new folder

                // create index page

                File file = new File(name + "/index.php");
                writer = new PrintWriter(name + "/index.php");
                writer.println("<html> <head> "+this.nav_links+" </head> <body>"+ this.nav+" <h1> hello </h1> "+this.footer+" </body></html>"  );
                writer.close();

            }

            if (symbol_table.getRow().get(i) != null) {

                if (symbol_table.getRow().get(i).getFunction_name().equals("logo")) {

                    this.logo = "<link rel=\"icon\" type=\"image/png\" href=\""+symbol_table.getRow().get(i).getFunction_value()+"\" sizes=\"32x32\">";
                }



                if (symbol_table.getRow().get(i).getFunction_name().equals("auth")) {
                    authourization(symbol_table, name);
                    auth = true;
                    CreatAuth(symbol_table,name,auth);
                }
                if (symbol_table.getRow().get(i).getFunction_name().equals("login")) {
                    authetication(symbol_table, name);
                    CreatAuth(symbol_table,name,auth);
                }

                if (symbol_table.getRow().get(i).getFunction_name().equals("signUp")) {
                    CreatReg(symbol_table,name);
                }

            }
        }

        createPages(symbol_table,name);
        // call connect to db function
        connect_to_db(name);
        // to create tables
        tables(symbol_table, name);
        injectUsers(symbol_table,name);

    }

    public void createPages (Symbol_Table symbol_table , String project_name) throws FileNotFoundException {
        for (int i = 0; i < symbol_table.getPage_rows().size(); i++) {
            if(symbol_table.getPage_rows().get(i)!=null)
                if(!symbol_table.getPage_rows().get(i).getPage_name().contains("home"))
                    write_in_file(project_name+"/"+ symbol_table.getPage_rows().get(i).getPage_name()+".php",getPageContent(symbol_table,project_name,symbol_table.getPage_rows().get(i).getPage_name()));
                if(symbol_table.getPage_rows().get(i).getPage_name().contains("home"))
                    write_in_file(project_name+"/index.php",getPageContent(symbol_table,project_name,symbol_table.getPage_rows().get(i).getPage_name()));
        }
    }

    public void CreatAuth(Symbol_Table symbol_table,String name,boolean auth) throws FileNotFoundException {

        String destination= "index";
        //create new folder by project name
        create_folders(name+"/controller");
        /*final Path fromPath = Paths.get("C:/Users/User/Desktop/Ahmad Al Hafez/phpPlus/");
        try {
            Files.walk(fromPath)
                    .forEach(source -> copySourceToDest(fromPath, source,name));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        for (int i = 0; i < symbol_table.getController_rows().size(); i++) {
            if(symbol_table.getController_rows().get(i)!=null)
            {
                if(symbol_table.getController_rows().get(i).getStart().equals("login"))
                    if(!symbol_table.getController_rows().get(i).getDestination().equals("home"))
                        destination = symbol_table.getController_rows().get(i).getDestination();
            }
        }
        if(!auth)
        {write_in_file(name+"/controller/auth.php",getAuthphp(destination));}
        else{
            write_in_file(name+"/controller/auth.php",getAuthphpAuthorize(destination));
        }
        write_in_file(name+"/logout.php",getLogOutphp());
        write_in_file(name+"/login.php",getLogInphp(name,symbol_table));




    }


    private static void copySourceToDest(Path fromPath, Path source , String name) {

        Path destination = Paths.get(name+"/", source.toString()
                .substring(fromPath.toString()
                        .length()));
        try {

            Files.copy(source, destination);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void CreatReg(Symbol_Table symbol_table,String name) throws FileNotFoundException {

        String destination= "login";
        //create new folder by project name
        create_folders(name+"/controller");
        /*
        final Path fromPath = Paths.get("C:/Users/User/Desktop/Ahmad Al Hafez/phpPlus/");
        try {
            Files.walk(fromPath)
                    .forEach(source -> copySourceToDest(fromPath, source,name));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        for (int i = 0; i < symbol_table.getController_rows().size(); i++) {
            if(symbol_table.getController_rows().get(i)!=null)
            {
                if(symbol_table.getController_rows().get(i).getStart().equals("signUp"))
                    if(!symbol_table.getController_rows().get(i).getDestination().equals("home"))
                        destination = symbol_table.getController_rows().get(i).getDestination();
            }
        }
        write_in_file(name+"/controller/reg.php",getRegPhp(destination));
        write_in_file(name+"/signUp.php",getSingUpPhp(name,symbol_table));

    }



    public void create_folders (String location){
        File theDir6 = new File(location);
        if (!theDir6.exists()) {
            theDir6.mkdirs();
        }
    }


    public void write_in_file(String file_destenation , String file_content) throws FileNotFoundException {
        PrintWriter writer;
        File file = new File(file_destenation);
        writer = new PrintWriter(file_destenation);
        writer.println(file_content);
        writer.close();
    }

    public  void  createLogo(String logo , String projectName) throws FileNotFoundException {
       /* PrintWriter writer;
        writer = new PrintWriter(projectName + "/index.php");
        writer.println("element");
        writer.close();*/
    }


    public void connect_to_db(String dbName) throws FileNotFoundException {

//create db at mysql
        try {

            Connection Conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/?user=root");
            Statement state = Conn.createStatement();

            state.executeUpdate("CREATE DATABASE IF NOT EXISTS " + dbName);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

//create Connect file

        PrintWriter writer;
        File file = new File(dbName + "/connect.php");
        writer = new PrintWriter(dbName + "/connect.php");
        writer.println("<?php\n" +
                "\n" +
                "            $con = mysqli_connect('localhost','root','','" + dbName + "');\n" +
                "if(!$con){\n" +
                "        die('please check your connection'.mysqli_error());\n" +
                "    }\n" +
                "\n" +
                "?>");

        writer.close();
    }

    boolean tableExists(Connection connection, String tableName) throws SQLException {
        DatabaseMetaData meta = connection.getMetaData();
        ResultSet resultSet = meta.getTables(null, null, tableName, new String[]{"TABLE"});

        return resultSet.next();
    }

    public void authetication(Symbol_Table symbol_table, String name) {

// Defines username and password to connect to database server.
        String url = "jdbc:mysql://localhost/" + name;
        String username = "root";
        String password = "";

        // get project name from symbol table
        for (int i = 0; i < symbol_table.getRow().size(); i++) {
            if (symbol_table.getRow().get(i) != null) {
                if (symbol_table.getRow().get(i).getFunction_name().equals("login") || symbol_table.getRow().get(i).getFunction_name().equals("signUp")) {
                    try (Connection conn = DriverManager.getConnection(url, username, password);
                         Statement stmt = conn.createStatement();
                    ) {
                        if (!tableExists(conn, "USERS")) {
                            String sql = "CREATE TABLE USERS " +
                                    "(id INTEGER not NULL AUTO_INCREMENT, " +
                                    " email VARCHAR(255), " +
                                    " password VARCHAR(255), " +
                                    " PRIMARY KEY ( id ))";
                            stmt.executeUpdate(sql);
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;


                }
            }
        }

    }


    public void authourization(Symbol_Table symbol_table, String name) {

// Defines username and password to connect to database server.
        String url = "jdbc:mysql://localhost/" + name;
        String username = "root";
        String password = "";

        // get project name from symbol table
        for (int i = 0; i < symbol_table.getRow().size(); i++) {
            if (symbol_table.getRow().get(i) != null) {
                if (symbol_table.getRow().get(i).getFunction_name().equals("auth") ) {
                    try (Connection conn = DriverManager.getConnection(url, username, password);
                         Statement stmt = conn.createStatement();
                    ) {
                        if (!tableExists(conn, "ADMIN")) {
                            String sql = "CREATE TABLE ADMIN " +
                                    "(id INTEGER not NULL AUTO_INCREMENT, " +
                                    " email VARCHAR(255), " +
                                    " password VARCHAR(255), " +
                                    " PRIMARY KEY ( id ))  ";
                            stmt.executeUpdate(sql);
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;


                }
            }
        }

    }



public void tables (Symbol_Table symbol_table, String dbName){

    // Defines username and password to connect to database server.
    String url = "jdbc:mysql://localhost/" + dbName;
    String username = "root";
    String password = "";

    for (int i = 0; i < symbol_table.getTable_rows().size(); i++) {
        String columns = "";
        if (symbol_table.getTable_rows().get(i) != null) {
            for (int j = 0; j < symbol_table.getTable_rows().get(i).getTable_columns().size(); j++) {
                if(symbol_table.getTable_rows().get(i).getTable_columns().get(j)!=null && !symbol_table.getTable_rows().get(i).getTableName().contains("nav")&& !symbol_table.getTable_rows().get(i).getTableName().contains("footer")){
                    columns = columns + "   " +  symbol_table.getTable_rows().get(i).getTable_columns().get(j).replaceAll(":String" ,"").replaceAll(",","")+ " VARCHAR(255), ";
                }
            }

            }

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
        ) {
            if (!tableExists(conn, symbol_table.getTable_rows().get(i).getTableName()) && !symbol_table.getTable_rows().get(i).getTableName().contains("nav")&& !symbol_table.getTable_rows().get(i).getTableName().contains("footer")) {
                String sql = "CREATE TABLE  " + symbol_table.getTable_rows().get(i).getTableName() +
                        "(id INTEGER not NULL AUTO_INCREMENT , " +
                        columns   +
                        " PRIMARY KEY ( id ))";
                stmt.executeUpdate(sql);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        }
    }


public void injectUsers (Symbol_Table symbol_table , String dbName){
    String url = "jdbc:mysql://localhost/" + dbName;
    String username = "root";
    String password = "";
    String sql ="";
    for (int i = 0; i < symbol_table.getInject_rows().size(); i++) {
        if(symbol_table.getInject_rows().get(i)!=null)
        {

            try {
                Connection conn = DriverManager.getConnection(url, username, password);
                if(symbol_table.getInject_rows().get(i).getRole().contains("'user'"))
                 sql = "INSERT INTO USERS (email, password ) values (?, ?)";
                if(symbol_table.getInject_rows().get(i).getRole().contains("'admin'"))
                    sql = "INSERT INTO ADMIN (email, password) values (?, ?)";

                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, symbol_table.getInject_rows().get(i).getEmail());
                statement.setString(2, symbol_table.getInject_rows().get(i).getPassword());
                int row = statement.executeUpdate();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
public String getNav(Symbol_Table symbol_table,String projectName){
        String link ="";
        String color ="";
        String textColor="";
        String align="left";
        String nav = "";
    for (int i = 0; i < symbol_table.getStyle_rows().size(); i++) {
        if(symbol_table.getStyle_rows().get(i)!=null)
            if(symbol_table.getStyle_rows().get(i).getPage_name().replaceAll(" ","").equals("nav"))
            {
            color = symbol_table.getStyle_rows().get(i).getColor();
            textColor = symbol_table.getStyle_rows().get(i).getText_color();
            align = symbol_table.getStyle_rows().get(i).getAlign().replaceAll("align:","").replace("'","");

            }
    }
    for (int i = 0; i < symbol_table.getController_rows().size(); i++) {
        if (symbol_table.getTable_rows().get(i) != null) {

            if (symbol_table.getTable_rows().get(i).getTableName().replaceAll(" ","").equals("nav"))
                for (int j = 0; j < symbol_table.getTable_rows().get(i).getTable_columns().size(); j++) {
                    if (symbol_table.getTable_rows().get(i).getTable_columns().get(j) != null) {
                        link += getNavlinks(symbol_table.getTable_rows().get(i).getTable_columns().get(j).replaceAll(",",""));

                    }
                }
        }
    }

    nav = "<nav class=\"navbar navbar-expand-md navbar-dark fixed-"+align+"\" >\n" +
            "    <a class=\"navbar-brand\" href=\"#\">"+projectName+"</a>\n" +
            "\n" +
            "    <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n" +
            "        <ul class=\"navbar-nav\">" + link +
            "<?php if(isset($_SESSION['USER'])||isset($_SESSION['ADMIN']))\n" +
            "{ ?>"+
            "             <li class=\"nav-item\">\n" +
            "                <a class=\"nav-link\" href=\"logout.php\">Log out</a>\n" +
            "            </li>" +
            "<?php }?>"+
            "</ul>\n" +
            "        \n" +
            "    </div>\n" +
            "</nav>\n" +
            "<style >\n" +
            "    nav {\n" +
            "  background-color: "+color+";\n" +
            "\n" +
            "  \n" +
            "}\n" +
            "\n" +
            "\n" +
            "</style>\n" +
            "\n" +
            "\n" ;
        return nav;
}
public String getNavlinks(String links){
        if(links.equals("home"))
            links = "index";
        String link = "" +
                " <li class=\"nav-item\">"+
                "<a class=\"nav-link\" href=\""+links+".php\">"+links+"</a>"+
                " </li>";
        return link;
}
public String getFooter(Symbol_Table symbol_table,String value){



    String color = "white";
    String textColor = "black";
    String signUp= "";
    for (int i = 0; i < symbol_table.getStyle_rows().size(); i++) {
        if(symbol_table.getStyle_rows().get(i)!=null){
            if(symbol_table.getStyle_rows().get(i).getPage_name().equals("footer")){
                if(symbol_table.getStyle_rows().get(i).getColor()!=null)
                {
                    color = symbol_table.getStyle_rows().get(i).getColor();
                }
                if(symbol_table.getStyle_rows().get(i).getText_color()!=null)
                {
                    textColor = symbol_table.getStyle_rows().get(i).getText_color();
                }
            }
        }
    }

        String footer="" +
                "<style>\n" +
                "footer {\n" +
                "  text-align: center;\n" +
                "  padding: 3px;\n" +
                "  background-color: "+color+";\n" +
                "  color: "+textColor+";\n" +
                "}\n" +
                "</style>" +
                "<div class=\"col-md-12 offset-2\">"+
                "<footer>\n" +
                "  <p>"+value+"</p>\n" +
                "</footer>" +
                "</div>";
        return footer;
}
public String formLabel(String labelName){
        String Label="              <div class=\"form-group first\">\n" +
                "                <label for=\"username\">"+labelName.replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+"</label>\n" +
                "                <input type=\"text\" class=\"form-control\" id=\""+labelName.replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+"\" name=\""+labelName.replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+"\">\n" +
                "              </div>";
        return Label;
}
public String getAuthphp(String destination){
        String auth ="<?php\n" +
                "\n" +
                "require_once('../connect.php');\n" +
                "\n" +
                "session_start();\n" +
                "\n" +
                "if(isset($_POST['login'])){\n" +
                "\n" +
                "if(empty($_POST['email'])||empty($_POST['password']))\n" +
                "{\n" +
                "header(\"location:../login.php?Empty=please fill the blanks\");\n" +
                "}\n" +
                "else{\n" +
                "$query = \"select * FROM USERS where email = '\".$_POST['email'].\"' and password = '\".$_POST['password'].\"'\";\n" +
                "$result = mysqli_query($con,$query);\n" +
                "if(mysqli_fetch_assoc($result))\n" +
                "{\n" +
                "\t$_SESSION['USER'] = $_POST['email'];\n" +
                "\theader(\"location:../"+destination+".php\");\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "\theader(\"location:../login.php?Empty=please fill correct info\");\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "else{\n" +
                "\n" +
                "}\n" +
                "\n" +
                "?>";
        return auth;
}
public String getAuthphpAuthorize(String destination){
        String auth ="<?php\n" +
                "\n" +
                "require_once('../connect.php');\n" +
                "\n" +
                "session_start();\n" +
                "\n" +
                "if(isset($_POST['login'])){\n" +
                "\n" +
                "if(empty($_POST['email'])||empty($_POST['password']))\n" +
                "{\n" +
                "header(\"location:../login.php?Empty=please fill the blanks\");\n" +
                "}\n" +
                "else{\n" +
                "   $query2 = \t\"select * FROM ADMIN where email = '\".$_POST['email'].\"' and password = '\".$_POST['password'].\"'\";\n" +
                "   $result2 = mysqli_query($con,$query2);\n" +
                "   if(mysqli_fetch_assoc($result2))\n" +
                "{\n" +
                "\t$_SESSION['ADMIN'] = $_POST['email'];\n" +
                "\theader(\"location:../"+destination+".php\");\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "$query = \"select * FROM USERS where email = '\".$_POST['email'].\"' and password = '\".$_POST['password'].\"'\";\n" +
                "$result = mysqli_query($con,$query);\n" +
                "if(mysqli_fetch_assoc($result))\n" +
                "{\n" +
                "\t$_SESSION['USER'] = $_POST['email'];\n" +
                "\theader(\"location:../"+destination+".php\");\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "\theader(\"location:../login.php?Empty=please fill correct info\");\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "else{\n" +
                "\n" +
                "}\n" +
                "\n" +
                "?>\n";
        return auth;
    }
public String getLogOutphp(){
        String logout="<?php\n" +
                "session_start();\n" +
                "\tsession_destroy();\n" +
                "\theader(\"location:login.php\");\n" +
                "\n" +
                "\n" +
                "?>";
        return logout;
}
public String getLogInphp(String project_name , Symbol_Table symbol_table){
        String color = "white";
        String textColor = "black";
        String inputColor ="";
        String signUp= "";
    for (int i = 0; i < symbol_table.getStyle_rows().size(); i++) {
        if(symbol_table.getStyle_rows().get(i)!=null){
            if(symbol_table.getStyle_rows().get(i).getPage_name().equals("login")){
                if(symbol_table.getStyle_rows().get(i).getColor()!=null)
                {
                    color = symbol_table.getStyle_rows().get(i).getColor();
                }
                if(symbol_table.getStyle_rows().get(i).getText_color()!=null)
                {
                    textColor = symbol_table.getStyle_rows().get(i).getText_color();
                }
                if(symbol_table.getStyle_rows().get(i).getInput_color()!=null){
                    inputColor =symbol_table.getStyle_rows().get(i).getInput_color();
                }
            }
        }
    }
    for (int i = 0; i < symbol_table.getRow().size(); i++) {
        if(symbol_table.getRow().get(i)!=null)
            if(symbol_table.getRow().get(i).getFunction_name().equals("signUp"))
            {
                signUp = "<a class=\"col-12\" id=\"register\" href=\"/"+project_name+"/signUp.php\">Sign up</a>";
                break;
            }
    }
String login = "  " +
        "<?php \n" +
        "require_once(\"connect.php\");\n" +
        "session_start();\n" +
        "if(isset($_SESSION['USER'])||isset($_SESSION['ADMIN']))\n" +
        "{\n" +
        "header(\"location:index.php\");\n" +
        "}\n" +
        "\n" +
        "else {\n" +
        "\n" +
        "\n" +
        "\n" +
        "?>  <!doctype html>\n" +
        "<html lang=\"en\">\n" +
        "  <head>\n" +
        "    <!-- Required meta tags -->\n" +
        "    <meta charset=\"utf-8\">\n" +
        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
        "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
        "\n" +
        "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
        "\n" +
        "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
        "\n" +
        "    <!-- Bootstrap CSS -->\n" +
        "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
        "   \n" +
        "    <!-- Style -->\n" +
        "    <link rel=\"stylesheet\" href=\"login/css/style.css\">\n" +
        this.nav_links+
        "\n" +
        "<style type=\"text/css\">\n" +
        ".login{background-color:" + inputColor + ";}\n" +
        "body {\n" +
        "  background-color:" + color + "; \n" +
        "  color:" + textColor + ";\n" +
        "}\n" +
        " \n" +
        "</style>\n" +
        "\n" +
        "    <title>Login</title>\n" +
        "  </head>\n" +
        "  <body>\n" +
        "\n" +
        "\n" +
        "\n" +
        "  \n" +
        this.nav+
        "  <div class=\"content\">\n" +
        "    <div class=\"container\">\n" +
        "      <div class=\"row\">\n" +
        "        <div class=\"col-md-6\">\n" +
        "          <img src=\"login/images/power.png\" alt=\"Image\" class=\"img-fluid\">\n" +
        "        </div>\n" +
        "        <div class=\"col-md-6 contents\">\n" +
        "          <div class=\"row justify-content-center\">\n" +
        "            <div class=\"col-md-8\">\n" +
        "              <div class=\"mb-4\">\n" +
        "              \t<?php\n" +
        "                    if(@$_GET['Empty'] == true)\n" +
        "                    {\n" +
        "              \t?>\n" +
        "              \t<div class=\"alert-light text-danger\"> <?php\n" +
        "                    echo $_GET['Empty'] \n" +
        "                    \n" +
        "              \t?></div>\n" +
        "\n" +
        "              \t<?php\n" +
        "                   }\n" +
        "              \t?>\n" +
        "              <h3>Log In</h3>\n" +
        "              <p class=\"mb-4\">" + project_name + " </p>\n" +
        "            </div>\n" +
        "            <form action=\"controller/auth.php\" method=\"POST\">\n" +
        "\n" +
        "              <div class=\"form-group first\">\n" +
        "                <label for=\"username\">Email</label>\n" +
        "                <input type=\"text\" class=\"form-control\" id=\"email\" name=\"email\">\n" +
        "              </div>\n" +
        "\n" +
        "              <div class=\"form-group last mb-4\">\n" +
        "                <label for=\"password\">Password</label>\n" +
        "                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\">\n" +
        "              </div>\n" +
        "              \n" +
        "              <div class=\" d-flex mb-5 align-items-center\">\n" +
        "              <input type=\"submit\" name=\"login\" value=\"Login\" class=\"login btn btn-block btn-danger\" >\n" +
        "              \n" +
        "            </form>\n" +
         signUp +
        "            </div>\n" +
        "          </div>\n" +
        "          \n" +
        "        </div>\n" +
        "        \n" +
        "      </div>\n" +
        "    </div>\n" +
        "  </div>\n" +
        "\n" +
        "  \n" + this.footer +
        "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
        "<script src=\"login/js/popper.min.js\"></script>\n" +
        "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
        "<script src=\"login/js/main.js\"></script>\n" +
        "</body>\n" +
        "</html>" +
        "<?php\n" +
        "\n" +
        "}\n" +
        "?>";
        return login;
}
public String getSingUpPhp(String project_name , Symbol_Table symbol_table){
        String color = "white";
        String textColor = "black";
        String inputColor ="";

        for (int i = 0; i < symbol_table.getStyle_rows().size(); i++) {
            if(symbol_table.getStyle_rows().get(i)!=null){
                if(symbol_table.getStyle_rows().get(i).getPage_name().equals("singUp")){
                    if(symbol_table.getStyle_rows().get(i).getColor()!=null)
                    {
                        color = symbol_table.getStyle_rows().get(i).getColor();
                    }
                    if(symbol_table.getStyle_rows().get(i).getText_color()!=null)
                    {
                        textColor = symbol_table.getStyle_rows().get(i).getText_color();
                    }
                    if(symbol_table.getStyle_rows().get(i).getInput_color()!=null){
                        inputColor =symbol_table.getStyle_rows().get(i).getInput_color();
                    }
                }
            }
        }
        String login = " " +
                "<?php \n" +
                "require_once(\"connect.php\");\n" +
                "session_start();\n" +
                "if(isset($_SESSION['USER'])||isset($_SESSION['ADMIN']))\n" +
                "{\n" +
                "header(\"location:index.php\");\n" +
                "}\n" +
                "\n" +
                "else {\n" +
                "\n" +
                "\n" +
                "\n" +
                "?>   <!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <!-- Required meta tags -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
                "\n" +
                "    <!-- Bootstrap CSS -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
                "   \n" +
                "    <!-- Style -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/style.css\">\n" +
                this.nav_links+
                "\n" +
                "<style type=\"text/css\">\n" +
                ".login{background-color:" + inputColor + ";}\n" +
                "body {\n" +
                "  background-color:" + color + "; \n" +
                "  color:" + textColor + ";\n" +
                "}\n" +
                " \n" +
                "</style>\n" +
                "\n" +
                "    <title>Sign Up</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                this.nav+
                "  <div class=\"content\">\n" +
                "    <div class=\"container\">\n" +
                "      <div class=\"row\">\n" +
                "        <div class=\"col-md-6\">\n" +
                "          <img src=\"login/images/power.png\" alt=\"Image\" class=\"img-fluid\">\n" +
                "        </div>\n" +
                "        <div class=\"col-md-6 contents\">\n" +
                "          <div class=\"row justify-content-center\">\n" +
                "            <div class=\"col-md-8\">\n" +
                "              <div class=\"mb-4\">\n" +
                "              \t<?php\n" +
                "                    if(@$_GET['Empty'] == true)\n" +
                "                    {\n" +
                "              \t?>\n" +
                "              \t<div class=\"alert-light text-danger\"> <?php\n" +
                "                    echo $_GET['Empty'] \n" +
                "                    \n" +
                "              \t?></div>\n" +
                "\n" +
                "              \t<?php\n" +
                "                   }\n" +
                "              \t?>\n" +
                "              <h3>Sign Up</h3>\n" +
                "              <p class=\"mb-4\">" + project_name + " </p>\n" +
                "            </div>\n" +
                "            <form action=\"controller/reg.php\" method=\"POST\">\n" +
                "\n" +
                "              <div class=\"form-group first\">\n" +
                "                <label for=\"username\">Email</label>\n" +
                "                <input type=\"text\" class=\"form-control\" id=\"email\" name=\"email\">\n" +
                "              </div>\n" +
                "\n" +
                "              <div class=\"form-group last mb-4\">\n" +
                "                <label for=\"password\">Password</label>\n" +
                "                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\">\n" +
                "              </div>\n" +
                "              \n" +
                "              <div class=\" d-flex mb-5 align-items-center\">\n" +
                "              <input type=\"submit\" name=\"signUp\" value=\"Sign Up\" class=\"login btn btn-block btn-danger\" >\n" +
                "              \n" +
                "            </form>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          \n" +
                "        </div>\n" +
                "        \n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "  \n" +this.footer +
                "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
                "<script src=\"login/js/popper.min.js\"></script>\n" +
                "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
                "<script src=\"login/js/main.js\"></script>\n" +
                "</body>\n" +
                "</html>" +
                "<?php\n" +
                "\n" +
                "}\n" +
                "?>";
        return login;
    }
public String getRegPhp(String destination){

        String reg = "<?php\n" +
                "\n" +
                "require_once('../connect.php');\n" +
                "\n" +
                "session_start();\n" +
                "\n" +
                "if(isset($_POST['signUp'])){\n" +
                "\n" +
                "if(empty($_POST['email'])||empty($_POST['password']))\n" +
                "{\n" +
                "header(\"location:../signUp.php?Empty=please fill the blanks\");\n" +
                "}\n" +
                "else{\n" +
                "\t $email = $_POST['email'];\n" +
                "\t $password = $_POST['password'];\n" +
                "$query = \"insert into USERS (email,password) values('$email','$password') \";\n" +
                "$result = mysqli_query($con,$query);\n" +
                "if($result)\n" +
                "{\n" +
                "\t\n" +
                "\theader(\"location:../"+destination+".php\");\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "\theader(\"location:../signUp.php?Empty=please check your connection\");\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "else{\n" +
                "\n" +
                "}\n" +
                "\n" +
                "?>";
        return reg;
    }
public String getPageContent(Symbol_Table symbol_table , String name,String pageName) throws FileNotFoundException {
        String contnet = "empty";
        String color = "white";
        String textColor = "black";
        String inputColor ="";

        for (int i = 0; i < symbol_table.getPage_rows().size(); i++) {
            if(symbol_table.getPage_rows().get(i)!=null)
                if(symbol_table.getPage_rows().get(i).getPage_name().equals(pageName))
                if(symbol_table.getPage_rows().get(i).getForm_Or_table().contains("form")) {
                    if (symbol_table.getPage_rows().get(i).getTable_name().equals("users")) {
                        for (int j = 0; j < symbol_table.getStyle_rows().size(); j++) {
                            if (symbol_table.getStyle_rows().get(j) != null) {
                                if (symbol_table.getStyle_rows().get(j).getPage_name().contains(symbol_table.getPage_rows().get(i).getPage_name())) {
                                    if (symbol_table.getStyle_rows().get(j).getColor() != null) {
                                        color = symbol_table.getStyle_rows().get(j).getColor();
                                    }
                                    if (symbol_table.getStyle_rows().get(j).getText_color() != null) {
                                        textColor = symbol_table.getStyle_rows().get(j).getText_color();
                                    }
                                    if (symbol_table.getStyle_rows().get(j).getInput_color() != null) {
                                        inputColor = symbol_table.getStyle_rows().get(j).getInput_color();
                                    }
                                }
                            }
                        }
                        contnet = getEdit_User_view(color, textColor, inputColor, symbol_table.getPage_rows().get(i).getPage_name(), name);
                        //
                        getEdit_User(symbol_table.getPage_rows().get(i).getPage_name(), name);
                        return contnet;
                    }
                    else {
                        for (int j = 0; j < symbol_table.getPage_rows().size(); j++) {
                            if(symbol_table.getPage_rows().get(j)!=null)
                            {
                                contnet = getFormPage(symbol_table,color,textColor,inputColor,j,name);
                                write_in_file(name+"/controller/"+symbol_table.getPage_rows().get(j).getPage_name()+".php",getFormController(symbol_table,j,name));
                                return contnet;
                            }
                        }

                    }


                }
            else {
                if(symbol_table.getPage_rows().get(i).getView_type().equals("list"))
                {contnet = getTablePage(symbol_table,color,textColor,name,i);}
                else
                {contnet = getBlockPage(symbol_table,color,textColor,name,i);}
            }

        }
        return contnet;
    }

    public String getBlockPage(Symbol_Table symbol_table, String color , String textColor , String projectName,int index)
    {
        String content="";
        String role ="";
        String tabletd = getTableTd(symbol_table,index);
        String tableDb = getTableDb(symbol_table,index);
        String blockPhp= getBlockphp(symbol_table,index);
        if(symbol_table.getPage_rows().get(index).getRole()!= null)
         role = symbol_table.getPage_rows().get(index).getRole().replaceAll("only:","").replaceAll(" ","");
        if(role.equals("admin"))
            content ="<?php\n" +

        " require_once(\"connect.php\");\n" +
                "session_start();"+
                "if(isset($_SESSION['ADMIN'])) {"+
                " $query = \"select * from "+symbol_table.getPage_rows().get(index).getTable_name()+" \" ;\n" +
                " $result = mysqli_query($con,$query);\n" +
                " \n" +
                "\n" +
                "?>\n" +
                "\n" +
                "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <!-- Required meta tags -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
                "\n" +
                "    <!-- Bootstrap CSS -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
                "   \n" +
                "    <!-- Style -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/style.css\">"+
                this.nav_links+ "<style type=\"text/css\">\n" +
                "body {\n" +
                "  font-family: \"Roboto\", sans-serif;\n" +
                "  background-color: "+color+"; \n" +
                "  color:"+textColor+";\n" +
                "}\n" +
                " \n" +
                "</style>\n" +
                "\n" +
                "    <title> "+symbol_table.getPage_rows().get(index).getPage_name()+"</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "\n" + this.nav + "" +
                " <div class=\"content\">\n" +
                "    <div class=\"container\">\n" +
                "      <div class=\"row\">\n" +
                "        <div class=\"col-md-12 contents\">\n" +
                "          <div class=\"row justify-content-center\">\n" +
                "            <div class=\"col-md-8\">\n" +
                "              <div class=\"mb-4\">\n" +
                "\n" +
                "<div class=\"container-fluid bg-2 text-center\"> <h3>"+symbol_table.getPage_rows().get(index).getPage_name()+"</h3>\n" +
                "              <p class=\"mb-4\">"+projectName+"</p>\n" +
                "            \n" +

                "\n" +
                "             <?php  while ($row=mysqli_fetch_assoc($result)){\n " +
                tableDb +
                "           \n?>" + "" +
                blockPhp +
                "\n" +
                "             <?php } ?>\n" +

                "            \n" +
                "            </div>\n" +
                "          </div>\n" +
                "          \n" +
                "        </div>\n" +
                "        \n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>" + this.footer+ " \n" +
                "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
                "<script src=\"login/js/popper.min.js\"></script>\n" +
                "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
                "<script src=\"login/js/main.js\"></script>\n" +
                "</body>\n" +
                "</html>" +
                "<?php } else {  \tsession_destroy();\n" +
                " header(\"location:login.php?Empty=you are not authorized to see this page\");}?>";
            else if(role.equals("users"))
                content="<?php\n" +

        " require_once(\"connect.php\");\n" +
                        "session_start();"+
                        "if(isset($_SESSION['USER'])) {"+
                " $query = \"select * from "+symbol_table.getPage_rows().get(index).getTable_name()+" \" ;\n" +
                " $result = mysqli_query($con,$query);\n" +
                " \n" +
                "\n" +
                "?>\n" +
                "\n" +
                "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <!-- Required meta tags -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
                "\n" +
                "    <!-- Bootstrap CSS -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
                "   \n" +
                "    <!-- Style -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/style.css\">"+
                this.nav_links+ "<style type=\"text/css\">\n" +
                "body {\n" +
                "  font-family: \"Roboto\", sans-serif;\n" +
                "  background-color: "+color+"; \n" +
                "  color:"+textColor+";\n" +
                "}\n" +
                " \n" +
                "</style>\n" +
                "\n" +
                "    <title> "+symbol_table.getPage_rows().get(index).getPage_name()+"</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "\n" + this.nav + "" +
                " <div class=\"content\">\n" +
                "    <div class=\"container\">\n" +
                "      <div class=\"row\">\n" +
                "        <div class=\"col-md-12 contents\">\n" +
                "          <div class=\"row justify-content-center\">\n" +
                "            <div class=\"col-md-8\">\n" +
                "              <div class=\"mb-4\">\n" +
                "\n" +
                "<div class=\"container-fluid bg-2 text-center\"> <h3>"+symbol_table.getPage_rows().get(index).getPage_name()+"</h3>\n" +
                "              <p class=\"mb-4\">"+projectName+"</p>\n" +
                "            \n" +

                "\n" +
                "             <?php  while ($row=mysqli_fetch_assoc($result)){\n " +
                tableDb +
                "           \n?>" + "" +
                blockPhp +
                "\n" +
                "             <?php } ?>\n" +

                "            \n" +
                "            </div>\n" +
                "          </div>\n" +
                "          \n" +
                "        </div>\n" +
                "        \n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>" + this.footer+ " \n" +
                "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
                "<script src=\"login/js/popper.min.js\"></script>\n" +
                "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
                "<script src=\"login/js/main.js\"></script>\n" +
                "</body>\n" +
                "</html>" +
                        "<?php } else {  \tsession_destroy();\n" +
                        " header(\"location:login.php?Empty=you are not authorized to see this page\");}?>";
                else
                content="<?php\n" +
                        " require_once(\"connect.php\");\n" +
                        " $query = \"select * from "+symbol_table.getPage_rows().get(index).getTable_name()+" \" ;\n" +
                        " $result = mysqli_query($con,$query);\n" +
                        " \n" +
                        "\n" +
                        "?>\n" +
                        "\n" +
                        "<!doctype html>\n" +
                        "<html lang=\"en\">\n" +
                        "  <head>\n" +
                        "    <!-- Required meta tags -->\n" +
                        "    <meta charset=\"utf-8\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                        "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
                        "\n" +
                        "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
                        "\n" +
                        "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
                        "\n" +
                        "    <!-- Bootstrap CSS -->\n" +
                        "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
                        "   \n" +
                        "    <!-- Style -->\n" +
                        "    <link rel=\"stylesheet\" href=\"login/css/style.css\">"+
                        this.nav_links+ "<style type=\"text/css\">\n" +
                        "body {\n" +
                        "  font-family: \"Roboto\", sans-serif;\n" +
                        "  background-color: "+color+"; \n" +
                        "  color:"+textColor+";\n" +
                        "}\n" +
                        " \n" +
                        "</style>\n" +
                        "\n" +
                        "    <title> "+symbol_table.getPage_rows().get(index).getPage_name()+"</title>\n" +
                        "  </head>\n" +
                        "  <body>\n" +
                        "\n" + this.nav + "" +
                        " <div class=\"content\">\n" +
                        "    <div class=\"container\">\n" +
                        "      <div class=\"row\">\n" +
                        "        <div class=\"col-md-12 contents\">\n" +
                        "          <div class=\"row justify-content-center\">\n" +
                        "            <div class=\"col-md-8\">\n" +
                        "              <div class=\"mb-4\">\n" +
                        "\n" +
                        "<div class=\"container-fluid bg-2 text-center\"> <h3>"+symbol_table.getPage_rows().get(index).getPage_name()+"</h3>\n" +
                        "              <p class=\"mb-4\">"+projectName+"</p>\n" +
                        "            \n" +

                        "\n" +
                        "             <?php  while ($row=mysqli_fetch_assoc($result)){\n " +
                       tableDb +
                        "           \n?>" + "" +
                         blockPhp +
                        "\n" +
                        "             <?php } ?>\n" +

                        "            \n" +
                        "            </div>\n" +
                        "          </div>\n" +
                        "          \n" +
                        "        </div>\n" +
                        "        \n" +
                        "      </div>\n" +
                        "    </div>\n" +
                        "  </div>" + this.footer+ " \n" +
                        "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
                        "<script src=\"login/js/popper.min.js\"></script>\n" +
                        "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
                        "<script src=\"login/js/main.js\"></script>\n" +
                        "</body>\n" +
                        "</html>";
        return content;
    }



    public String getTablePage(Symbol_Table symbol_table, String color , String textColor , String projectName,int index)
    {
        String content="";
        String role ="";
        String tabletd = getTableTd(symbol_table,index);
        String tableDb = getTableDb(symbol_table,index);
        String tablePhp= getTablePhp(symbol_table,index);
        if(symbol_table.getPage_rows().get(index).getRole()!= null)
            role = symbol_table.getPage_rows().get(index).getRole().replaceAll("only:","").replaceAll(" ","");
        if(role.equals("admin"))
            content ="<?php\n" +

                    " require_once(\"connect.php\");\n" +
                    "session_start();"+
                    "if(isset($_SESSION['ADMIN'])) {"+
                    " $query = \"select * from "+symbol_table.getPage_rows().get(index).getTable_name()+" \" ;\n" +
                    " $result = mysqli_query($con,$query);\n" +
                    " \n" +
                    "\n" +
                    "?>\n" +
                    "\n" +
                    "<!doctype html>\n" +
                    "<html lang=\"en\">\n" +
                    "  <head>\n" +
                    "    <!-- Required meta tags -->\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                    "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
                    "\n" +
                    "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
                    "\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
                    "\n" +
                    "    <!-- Bootstrap CSS -->\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
                    "   \n" +
                    "    <!-- Style -->\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/style.css\">"+
                    this.nav_links+ "<style type=\"text/css\">\n" +
                    "body {\n" +
                    "  font-family: \"Roboto\", sans-serif;\n" +
                    "  background-color: "+color+"; \n" +
                    "  color:"+textColor+";\n" +
                    "}\n" +
                    " \n" +
                    "</style>\n" +
                    "\n" +
                    "    <title> "+symbol_table.getPage_rows().get(index).getPage_name()+"</title>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "\n" + this.nav + "" +
                    " <div class=\"content\">\n" +
                    "    <div class=\"container\">\n" +
                    "      <div class=\"row\">\n" +
                    "        <div class=\"col-md-12 contents\">\n" +
                    "          <div class=\"row justify-content-center\">\n" +
                    "            <div class=\"col-md-8\">\n" +
                    "              <div class=\"mb-4\">\n" +
                    "\n" +
                    "<div class=\"col-md-12 offset-2\"> <h3>"+symbol_table.getPage_rows().get(index).getPage_name()+"</h3>\n" +
                    "              <p class=\"mb-4\">"+projectName+"</p>\n" +
                    "            \n" +
                    "           <table class=\"table table-bordered\">\n" +
                    "             <tr>"+tabletd+"</tr>"+ "" +
                    "\n" +
                    "             <?php  while ($row=mysqli_fetch_assoc($result)){\n " +
                    tableDb +
                    "           \n?>" + "" +
                    tablePhp +
                    "\n" +
                    "             <?php } ?>\n" +
                    "           </table>\n" +
                    "            \n" +
                    "            </div>\n" +
                    "          </div>\n" +
                    "          \n" +
                    "        </div>\n" +
                    "        \n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "  </div>" + this.footer+ " \n" +
                    "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
                    "<script src=\"login/js/popper.min.js\"></script>\n" +
                    "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
                    "<script src=\"login/js/main.js\"></script>\n" +
                    "</body>\n" +
                    "</html>" +
                    "<?php } else {  \tsession_destroy();\n" +
                    " header(\"location:login.php?Empty=you are not authorized to see this page\");}?>";
        else if(role.equals("users"))
            content="<?php\n" +

                    " require_once(\"connect.php\");\n" +
                    "session_start();"+
                    "if(isset($_SESSION['USER'])) {"+
                    " $query = \"select * from "+symbol_table.getPage_rows().get(index).getTable_name()+" \" ;\n" +
                    " $result = mysqli_query($con,$query);\n" +
                    " \n" +
                    "\n" +
                    "?>\n" +
                    "\n" +
                    "<!doctype html>\n" +
                    "<html lang=\"en\">\n" +
                    "  <head>\n" +
                    "    <!-- Required meta tags -->\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                    "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
                    "\n" +
                    "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
                    "\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
                    "\n" +
                    "    <!-- Bootstrap CSS -->\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
                    "   \n" +
                    "    <!-- Style -->\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/style.css\">"+
                    this.nav_links+ "<style type=\"text/css\">\n" +
                    "body {\n" +
                    "  font-family: \"Roboto\", sans-serif;\n" +
                    "  background-color: "+color+"; \n" +
                    "  color:"+textColor+";\n" +
                    "}\n" +
                    " \n" +
                    "</style>\n" +
                    "\n" +
                    "    <title> "+symbol_table.getPage_rows().get(index).getPage_name()+"</title>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "\n" + this.nav + "" +
                    " <div class=\"content\">\n" +
                    "    <div class=\"container\">\n" +
                    "      <div class=\"row\">\n" +
                    "        <div class=\"col-md-12 contents\">\n" +
                    "          <div class=\"row justify-content-center\">\n" +
                    "            <div class=\"col-md-8\">\n" +
                    "              <div class=\"mb-4\">\n" +
                    "\n" +
                    "<div class=\"col-md-12 offset-2\"> <h3>"+symbol_table.getPage_rows().get(index).getPage_name()+"</h3>\n" +
                    "              <p class=\"mb-4\">"+projectName+"</p>\n" +
                    "            \n" +
                    "           <table class=\"table table-bordered\">\n" +
                    "             <tr>"+tabletd+"</tr>"+ "" +
                    "\n" +
                    "             <?php  while ($row=mysqli_fetch_assoc($result)){\n " +
                    tableDb +
                    "           \n?>" + "" +
                    tablePhp +
                    "\n" +
                    "             <?php } ?>\n" +
                    "           </table>\n" +
                    "            \n" +
                    "            </div>\n" +
                    "          </div>\n" +
                    "          \n" +
                    "        </div>\n" +
                    "        \n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "  </div>" + this.footer+ " \n" +
                    "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
                    "<script src=\"login/js/popper.min.js\"></script>\n" +
                    "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
                    "<script src=\"login/js/main.js\"></script>\n" +
                    "</body>\n" +
                    "</html>" +
                    "<?php } else {  \tsession_destroy();\n" +
                    " header(\"location:login.php?Empty=you are not authorized to see this page\");}?>";
        else
            content="<?php\n" +
                    " require_once(\"connect.php\");\n" +
                    " $query = \"select * from "+symbol_table.getPage_rows().get(index).getTable_name()+" \" ;\n" +
                    " $result = mysqli_query($con,$query);\n" +
                    " \n" +
                    "\n" +
                    "?>\n" +
                    "\n" +
                    "<!doctype html>\n" +
                    "<html lang=\"en\">\n" +
                    "  <head>\n" +
                    "    <!-- Required meta tags -->\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                    "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
                    "\n" +
                    "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
                    "\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
                    "\n" +
                    "    <!-- Bootstrap CSS -->\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
                    "   \n" +
                    "    <!-- Style -->\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/style.css\">"+
                    this.nav_links+ "<style type=\"text/css\">\n" +
                    "body {\n" +
                    "  font-family: \"Roboto\", sans-serif;\n" +
                    "  background-color: "+color+"; \n" +
                    "  color:"+textColor+";\n" +
                    "}\n" +
                    " \n" +
                    "</style>\n" +
                    "\n" +
                    "    <title> "+symbol_table.getPage_rows().get(index).getPage_name()+"</title>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "\n" + this.nav + "" +
                    " <div class=\"content\">\n" +
                    "    <div class=\"container\">\n" +
                    "      <div class=\"row\">\n" +
                    "        <div class=\"col-md-12 contents\">\n" +
                    "          <div class=\"row justify-content-center\">\n" +
                    "            <div class=\"col-md-8\">\n" +
                    "              <div class=\"mb-4\">\n" +
                    "\n" +
                    "<div class=\"col-md-12 offset-2\"> <h3>"+symbol_table.getPage_rows().get(index).getPage_name()+"</h3>\n" +
                    "              <p class=\"mb-4\">"+projectName+"</p>\n" +
                    "            \n" +
                    "           <table class=\"table table-bordered\">\n" +
                    "             <tr>"+tabletd+"</tr>"+ "" +
                    "\n" +
                    "             <?php  while ($row=mysqli_fetch_assoc($result)){\n " +
                    tableDb +
                    "           \n?>" + "" +
                    tablePhp +
                    "\n" +
                    "             <?php } ?>\n" +
                    "           </table>\n" +
                    "            \n" +
                    "            </div>\n" +
                    "          </div>\n" +
                    "          \n" +
                    "        </div>\n" +
                    "        \n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "  </div>" + this.footer+ " \n" +
                    "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
                    "<script src=\"login/js/popper.min.js\"></script>\n" +
                    "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
                    "<script src=\"login/js/main.js\"></script>\n" +
                    "</body>\n" +
                    "</html>";
        return content;
    }



public String getFormPage(Symbol_Table symbol_table,String color, String textColor , String inputColor, int index ,String projectName)
    {
        String parameter = " ";
        String form ="";
        for (int i = 0; i < symbol_table.getTable_rows().size(); i++) {
        if(symbol_table.getTable_rows().get(i)!=null)
        {
            if(symbol_table.getTable_rows().get(i).getTableName().equals(symbol_table.getPage_rows().get(index).getTable_name()))
            {
                for (int j = 0; j < symbol_table.getTable_rows().get(i).getTable_columns().size(); j++) {
                    if(symbol_table.getTable_rows().get(i).getTable_columns().get(j)!=null)
                        parameter += formLabel(symbol_table.getTable_rows().get(i).getTable_columns().get(j));
                }
            }
        }

        }
        String role = symbol_table.getPage_rows().get(index).getRole().replaceAll("only:","").replaceAll(" ","");
        if(role.equals("admin"))
        { form="<?php\n" +
                "require_once(\"connect.php\");\n" +
                "session_start();" +
                "if(isset($_SESSION['ADMIN']))\n" +
                "{\n" +
                "\n" +
                "?>\n" +
                "\n" +
                "    <!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <!-- Required meta tags -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
                "\n" +
                "    <!-- Bootstrap CSS -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
                "   \n" +
                "    <!-- Style -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/style.css\">\n" +
                "\n" +
                this.nav_links+
                "<style type=\"text/css\">\n" +
                ".login{background-color:"+inputColor+";}\n" +
                "body {\n" +
                "  font-family: \"Roboto\", sans-serif;\n" +
                "  background-color: "+color+"; \n" +
                "  color:"+textColor+";\n" +
                "}\n" +
                " \n" +
                "</style>\n" +
                "\n" +
                "    <title> "+symbol_table.getPage_rows().get(index).getPage_name()+"</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                this.nav+
                "  <div class=\"content\">\n" +
                "    <div class=\"container\">\n" +
                "      <div class=\"row\">\n" +
                "        <div class=\"col-md-12 contents\">\n" +
                "          <div class=\"row justify-content-center\">\n" +
                "            <div class=\"col-md-8\">\n" +
                "              <div class=\"mb-4\">\n" +
                "              \t<?php\n" +
                "                    if(@$_GET['Empty'] == true)\n" +
                "                    {\n" +
                "              \t?>\n" +
                "              \t<div class=\"alert-light text-danger\"> <?php\n" +
                "                    echo $_GET['Empty'] \n" +
                "                    \n" +
                "              \t?></div>\n" +
                "\n" +
                "              \t<?php\n" +
                "                   }\n" +
                "              \t?>\n" +
                "<div class=\"col-md-12 offset-2\">"+
                "              <h3>"+symbol_table.getPage_rows().get(index).getPage_name()+"</h3>\n" +
                "              <p class=\"mb-4\">"+projectName+"</p>\n" +
                "            \n" +
                "            <form action=\"controller/"+symbol_table.getPage_rows().get(index).getPage_name()+".php\" method=\"POST\">\n" +
                "\n" +
                "              "+ parameter +
                "              \n" +
                "              <div class=\" d-flex mb-5 align-items-center\">\n" +
                "              <input type=\"submit\" name=\""+symbol_table.getPage_rows().get(index).getPage_name()+"\" value=\"Submit\" class=\"login btn btn-block btn-danger\" >\n" +
                "              \n" +
                "            </form>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          \n" +
                "        </div>\n" +
                "        \n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +this.footer +
                "\n" +
                "  \n" +
                "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
                "<script src=\"login/js/popper.min.js\"></script>\n" +
                "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
                "<script src=\"login/js/main.js\"></script>\n" +
                "</body>\n" +
                "</html>\n" +
                "\n" +
                "<?php\n" +
                "}\n" +
                "else {\n" +

                " \tsession_destroy();\n" +
                " header(\"location:login.php?Empty=you are not authorized to see this page\");\n" +
                "}\n" +
                "?>";
        }
        else if(role.equals("user"))
        {
            form ="<?php\n" +
                    "require_once(\"connect.php\");\n" +
                    "session_start();" +
                    "if(isset($_SESSION['USER']))\n" +
                    "{\n" +
                    "\n" +
                    "?>\n" +
                    "\n" +
                    "    <!doctype html>\n" +
                    "<html lang=\"en\">\n" +
                    "  <head>\n" +
                    "    <!-- Required meta tags -->\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                    "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
                    "\n" +
                    "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
                    "\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
                    "\n" +
                    "    <!-- Bootstrap CSS -->\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
                    "   \n" +
                    "    <!-- Style -->\n" +
                    "    <link rel=\"stylesheet\" href=\"login/css/style.css\">\n" +
                    "\n" +
                    this.nav_links+
                    "<style type=\"text/css\">\n" +
                    ".login{background-color:"+inputColor+";}\n" +
                    "body {\n" +
                    "  font-family: \"Roboto\", sans-serif;\n" +
                    "  background-color: "+color+"; \n" +
                    "  color:"+textColor+";\n" +
                    "}\n" +
                    " \n" +
                    "</style>\n" +
                    "\n" +
                    "    <title> "+symbol_table.getPage_rows().get(index).getPage_name()+"</title>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "  \n" +
                    this.nav+
                    "  <div class=\"content\">\n" +
                    "    <div class=\"container\">\n" +
                    "      <div class=\"row\">\n" +
                    "        <div class=\"col-md-12 contents\">\n" +
                    "          <div class=\"row justify-content-center\">\n" +
                    "            <div class=\"col-md-8\">\n" +
                    "              <div class=\"mb-4\">\n" +
                    "              \t<?php\n" +
                    "                    if(@$_GET['Empty'] == true)\n" +
                    "                    {\n" +
                    "              \t?>\n" +
                    "              \t<div class=\"alert-light text-danger\"> <?php\n" +
                    "                    echo $_GET['Empty'] \n" +
                    "                    \n" +
                    "              \t?></div>\n" +
                    "\n" +
                    "              \t<?php\n" +
                    "                   }\n" +
                    "              \t?>\n" +
                    "<div class=\"col-md-12 offset-2\">"+
                    "              <h3>"+symbol_table.getPage_rows().get(index).getPage_name()+"</h3>\n" +
                    "              <p class=\"mb-4\">"+projectName+"</p>\n" +
                    "            \n" +
                    "            <form action=\"controller/"+symbol_table.getPage_rows().get(index).getPage_name()+".php\" method=\"POST\">\n" +
                    "\n" +
                    "              "+ parameter +
                    "              \n" +
                    "              <div class=\" d-flex mb-5 align-items-center\">\n" +
                    "              <input type=\"submit\" name=\""+symbol_table.getPage_rows().get(index).getPage_name()+"\" value=\"Submit\" class=\"login btn btn-block btn-danger\" >\n" +
                    "              \n" +
                    "            </form>\n" +
                    "            </div>\n" +
                    "          </div>\n" +
                    "          \n" +
                    "        </div>\n" +
                    "        \n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "  </div>\n" +
                    "\n" +
                    "  \n" +this.footer +
                    "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
                    "<script src=\"login/js/popper.min.js\"></script>\n" +
                    "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
                    "<script src=\"login/js/main.js\"></script>\n" +
                    "</body>\n" +
                    "</html>\n" +
                    "\n" +
                    "<?php } else {" +
                    " \tsession_destroy();\n" +
                    " header(\"location:login.php?Empty=you are not authorized to see this page\");\n";
        }

        else
        { form= "    <!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <!-- Required meta tags -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
                "\n" +
                "    <!-- Bootstrap CSS -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
                "   \n" +
                "    <!-- Style -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/style.css\">\n" +
                "\n" +
                this.nav_links+
                "<style type=\"text/css\">\n" +
                ".login{background-color:"+inputColor+";}\n" +
                "body {\n" +
                "  font-family: \"Roboto\", sans-serif;\n" +
                "  background-color: "+color+"; \n" +
                "  color:"+textColor+";\n" +
                "}\n" +
                " \n" +
                "</style>\n" +
                "\n" +
                "    <title> "+symbol_table.getPage_rows().get(index).getPage_name()+"</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                this.nav+
                "  <div class=\"content\">\n" +
                "    <div class=\"container\">\n" +
                "      <div class=\"row\">\n" +
                "        <div class=\"col-md-12 contents\">\n" +
                "          <div class=\"row justify-content-center\">\n" +
                "            <div class=\"col-md-8\">\n" +
                "              <div class=\"mb-4\">\n" +
                "              \t<?php\n" +
                "                    if(@$_GET['Empty'] == true)\n" +
                "                    {\n" +
                "              \t?>\n" +
                "              \t<div class=\"alert-light text-danger\"> <?php\n" +
                "                    echo $_GET['Empty'] \n" +
                "                    \n" +
                "              \t?></div>\n" +
                "\n" +
                "              \t<?php\n" +
                "                   }\n" +
                "              \t?>\n" +
                "<div class=\"col-md-12 offset-2\">"+
                "              <h3>"+symbol_table.getPage_rows().get(index).getPage_name()+"</h3>\n" +
                "              <p class=\"mb-4\">"+projectName+"</p>\n" +
                "            \n" +
                "            <form action=\"controller/"+symbol_table.getPage_rows().get(index).getPage_name()+".php\" method=\"POST\">\n" +
                "\n" +
                "              "+ parameter +
                "              \n" +
                "              <div class=\" d-flex mb-5 align-items-center\">\n" +
                "              <input type=\"submit\" name=\""+symbol_table.getPage_rows().get(index).getPage_name()+"\" value=\"Submit\" class=\"login btn btn-block btn-danger\" >\n" +
                "              \n" +
                "            </form>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          \n" +
                "        </div>\n" +
                "        \n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "  \n" + this.footer +
                "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
                "<script src=\"login/js/popper.min.js\"></script>\n" +
                "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
                "<script src=\"login/js/main.js\"></script>\n" +
                "</body>\n" +
                "</html>\n" +
                "\n";}


        return form;
    }
    public String getEdit_User_view(String color , String textColor , String inputColor , String pageName , String name){
        String view ="  <?php\n" +
                "require_once(\"connect.php\");\n" +
                "session_start();\n" +
                "if(isset($_SESSION['USER']))\n" +
                "{\n" +
                "$query = \"select * from users where email = '{$_SESSION['USER']}'\";\n" +
                "$result = mysqli_query($con,$query);\n" +
                "$row = mysqli_fetch_assoc($result);\n" +
                "$userEmail = $row['email'];\n" +
                "$userPassword = $row['password'];\n" +
                "?>" +
                "  <!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <!-- Required meta tags -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/fonts/style.css\">\n" +
                "\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/owl.carousel.min.css\">\n" +
                "\n" +
                "    <!-- Bootstrap CSS -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/bootstrap.min.css\">\n" +
                "   \n" +
                "    <!-- Style -->\n" +
                "    <link rel=\"stylesheet\" href=\"login/css/style.css\">\n" +
                "\n" +
                this.nav_links+
                "<style type=\"text/css\">\n" +
                ".login{background-color:" + inputColor + ";}\n" +
                "body {\n" +
                "  background-color:" + color + "; \n" +
                "  color:" + textColor + ";\n" +
                "}\n" +
                " \n" +
                "</style>\n" +
                "\n" +
                "    <title>"+pageName+"</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                this.nav+
                "  <div class=\"content\">\n" +
                "    <div class=\"container\">\n" +
                "      <div class=\"row\">\n" +
                "        <div class=\"col-md-6\">\n" +
                "          <img src=\"login/images/power.png\" alt=\"Image\" class=\"img-fluid\">\n" +
                "        </div>\n" +
                "        <div class=\"col-md-6 contents\">\n" +
                "          <div class=\"row justify-content-center\">\n" +
                "            <div class=\"col-md-8\">\n" +
                "              <div class=\"mb-4\">\n" +
                "              \t<?php\n" +
                "                    if(@$_GET['Empty'] == true)\n" +
                "                    {\n" +
                "              \t?>\n" +
                "              \t<div class=\"alert-light text-danger\"> <?php\n" +
                "                    echo $_GET['Empty'] \n" +
                "                    \n" +
                "              \t?></div>\n" +
                "\n" +
                "              \t<?php\n" +
                "                   }\n" +
                "              \t?>\n" +
                "              <h3>"+pageName+"</h3>\n" +
                "              <p class=\"mb-4\">" + name + " </p>\n" +
                "            </div>\n" +
                "            <form action=\"controller/edit_user.php\" method=\"POST\">\n" +
                "\n" +
                "              <div class=\"form-group first\">\n" +
                "                <label for=\"username\">Email</label>\n" +
                "                <input type=\"text\" class=\"form-control\" id=\"email\" name=\"email\" value=<?php echo $userEmail?> >\n" +
                "              </div>\n" +
                "\n" +
                "              <div class=\"form-group last mb-4\">\n" +
                "                <label for=\"password\">Password</label>\n" +
                "                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" value=<?php echo $userPassword?> >\n" +
                "              </div>\n" +
                "              \n" +
                "              <div class=\" d-flex mb-5 align-items-center\">\n" +
                "              <input type=\"submit\" name=\"edit_user\" value=\"Edit Info\" class=\"login btn btn-block btn-danger\" >\n" +
                "              \n" +
                "            </form>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          \n" +
                "        </div>\n" +
                "        \n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "  \n" + this.footer +
                "<script src=\"login/js/jquery-3.3.1.min.js\"></script>\n" +
                "<script src=\"login/js/popper.min.js\"></script>\n" +
                "<script src=\"login/js/bootstrap.min.js\"></script>\n" +
                "<script src=\"login/js/main.js\"></script>\n" +
                "</body>\n" +
                "</html>" +
                "<?php\n" +
                "}\n" +
                "\n" +
                "else {\n" +
                " \tsession_destroy();\n" +
                " header(\"location:login.php?Empty=you are not authorized to see this page\");\n" +
                "}\n" +
                "\n" +
                "?>";
        return view;
    }
    public void getEdit_User(String pageName,String project_name) throws FileNotFoundException {
        write_in_file(project_name+"/controller/edit_user.php",getEdit_UserPhp(pageName));
    }
    public String getEdit_UserPhp(String pageName){
        String edit ="<?php\n" +
                "\n" +
                "require_once('../connect.php');\n" +
                "\n" +
                "session_start();\n" +
                "\n" +
                "if(isset($_POST['edit_user'])){\n" +
                "\n" +
                "if(empty($_POST['email'])||empty($_POST['password']))\n" +
                "{\n" +
                "header(\"location:../"+pageName+".php?Empty=please fill the blanks\");\n" +
                "}\n" +
                "else{\n" +
                "\t\n" +
                "\t $email = $_POST['email'];\n" +
                "\t $password = $_POST['password'];\n" +
                "\n" +
                "$query = \"update USERS set  email = '\".$email.\"' , password = '\".$password.\"' where email = '{$_SESSION['USER']}' \";\n" +
                "$result = mysqli_query($con,$query);\n" +
                "if($result)\n" +
                "{\n" +
                "\t\n" +
                "\theader(\"location:../logout.php\");\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "\theader(\"location:../"+pageName+".php?Empty=please check your connection\");\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "else{\n" +
                "header(\"location:../"+pageName+".php?Empty=please check your connection\");\n" +
                "}\n" +
                "\n" +
                "?>\n";
        return edit;
    }
    public String getFormController(Symbol_Table symbol_table, int index, String projectName){
        String parameter1 = " ";
        String parameter2 = " ";
        String parameter3= " ";
        String empty ="";
        String destination = "index";
        for (int i = 0; i < symbol_table.getTable_rows().size(); i++) {
            if(symbol_table.getTable_rows().get(i)!=null)
            {
                if(symbol_table.getTable_rows().get(i).getTableName().equals(symbol_table.getPage_rows().get(index).getTable_name()))
                {
                    for (int j = 0; j < symbol_table.getTable_rows().get(i).getTable_columns().size(); j++) {
                        if(symbol_table.getTable_rows().get(i).getTable_columns().get(j)!=null)
                        {
                            parameter1 += formController1(symbol_table.getTable_rows().get(i).getTable_columns().get(j));
                            parameter2 += formController2(symbol_table.getTable_rows().get(i).getTable_columns().get(j));
                            parameter3 += formController3(symbol_table.getTable_rows().get(i).getTable_columns().get(j));

                        empty += checkEmpty(symbol_table.getTable_rows().get(i).getTable_columns().get(j));



                        }
                    }
                }
            }
        }
        parameter2 = parameter2.substring(0,parameter2.length()-1);
        parameter3 = parameter3.substring(0,parameter3.length()-1);
        empty = empty.substring(0,empty.length()-1);
        empty = empty.substring(0,empty.length()-1);
        for (int i = 0; i < symbol_table.getController_rows().size(); i++) {
            if(symbol_table.getController_rows().get(i)!=null)
                if(symbol_table.getController_rows().get(i).getStart().contains(symbol_table.getPage_rows().get(index).getPage_name()))
                    destination = symbol_table.getController_rows().get(i).getDestination().replaceAll(" ","");
        }
        String controller="<?php\n" +
                "\n" +
                "require_once('../connect.php');\n" +
                "\n" +
                "session_start();\n" +
                "if(isset($_POST['"+symbol_table.getPage_rows().get(index).getPage_name()+"'])){" +
                "if("+empty+")" +
                "{ header(\"location:../"+symbol_table.getPage_rows().get(index).getPage_name()+".php?Empty=please fill the blanks\");\n" +
                "}else{" + parameter1 +
                "$query = \"insert into "+symbol_table.getPage_rows().get(index).getTable_name()+" ("+parameter2+") values("+parameter3+") \";" +
                "$result = mysqli_query($con,$query);\n" +
                "if($result)\n" +
                "{\n" +
                "\t\n" +
                "\theader(\"location:../"+destination+".php\");\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "\theader(\"location:../"+symbol_table.getPage_rows().get(index).getPage_name()+".php?Empty=please check your connection\");\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +
                "}\n" +
                "\n" +

                "\n" +
                "?>";
        return controller;
    }
    public String formController1(String labelName){

        String Label="$"+labelName.replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+" = $_POST['"+labelName.replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+"'];";
        return Label;
    }
    public String formController2(String labelName){

        String Label= labelName.replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+",";
        return Label;
    }
    public String formController3(String labelName){

        String Label="'$"+labelName.replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+"',";
        return Label;
    }
    public String getTableTd(Symbol_Table symbol_table ,int index){
        String td ="";
        String indx = symbol_table.getPage_rows().get(index).getTable_name().replaceAll(" ","").replaceAll("\n","");
        for (int i = 0; i < symbol_table.getTable_rows().size(); i++) {
            if (symbol_table.getTable_rows().get(i) != null) {
                if (symbol_table.getTable_rows().get(i).getTableName().replaceAll(" ","").equals(indx)) {
                    for (int j = 0; j < symbol_table.getTable_rows().get(i).getTable_columns().size(); j++) {
                        if (symbol_table.getTable_rows().get(i).getTable_columns().get(j) != null)
                            td += "<td>" + symbol_table.getTable_rows().get(i).getTable_columns().get(j).replaceAll(":String", "").replaceAll(" ", "").replaceAll(",", "") + "</td>\n";
                    }

                }

            }
        }

        return td;
    }

    public String getTableDb(Symbol_Table symbol_table ,int index){
        String db ="";
        String indx = symbol_table.getPage_rows().get(index).getTable_name().replaceAll(" ","").replaceAll("\n","");
        for (int i = 0; i < symbol_table.getTable_rows().size(); i++) {
            if(symbol_table.getTable_rows().get(i)!=null)
                if(symbol_table.getTable_rows().get(i).getTableName().replaceAll(" ","").equals(indx))
                {
                    for (int j = 0; j < symbol_table.getTable_rows().get(i).getTable_columns().size(); j++) {
                        if(symbol_table.getTable_rows().get(i).getTable_columns().get(j)!=null)
                            db += "$"+symbol_table.getTable_rows().get(i).getTable_columns().get(j).replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+"=$row['"+symbol_table.getTable_rows().get(i).getTable_columns().get(j).replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+"'];\n";
                    }

                }

        }
        return db;
    }


    public String getBlockphp(Symbol_Table symbol_table ,int index)
    {
        String php ="";
        String indx = symbol_table.getPage_rows().get(index).getTable_name().replaceAll(" ","").replaceAll("\n","");
        for (int i = 0; i < symbol_table.getTable_rows().size(); i++) {
            if(symbol_table.getTable_rows().get(i)!=null)
                if(symbol_table.getTable_rows().get(i).getTableName().replaceAll(" ","").equals(indx))
                {
                    for (int j = 0; j < symbol_table.getTable_rows().get(i).getTable_columns().size(); j++) {
                        if(symbol_table.getTable_rows().get(i).getTable_columns().get(j)!=null)
                            php += "<p> <?php echo $"+symbol_table.getTable_rows().get(i).getTable_columns().get(j).replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+" ?> </p> \n";
                    }

                }

        }
        return php;
    }

    public String getTablePhp(Symbol_Table symbol_table ,int index){
        String php ="";
        String indx = symbol_table.getPage_rows().get(index).getTable_name().replaceAll(" ","").replaceAll("\n","");
        for (int i = 0; i < symbol_table.getTable_rows().size(); i++) {
            if(symbol_table.getTable_rows().get(i)!=null)
                if(symbol_table.getTable_rows().get(i).getTableName().replaceAll(" ","").equals(indx))
                {
                    for (int j = 0; j < symbol_table.getTable_rows().get(i).getTable_columns().size(); j++) {
                        if(symbol_table.getTable_rows().get(i).getTable_columns().get(j)!=null)
                            php += "<td> <?php echo $"+symbol_table.getTable_rows().get(i).getTable_columns().get(j).replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+" ?> </td> \n";
                    }

                }

        }
        return php;
    }
    public String checkEmpty(String labelName){
        String Label="empty($_POST['"+labelName.replaceAll(":String","").replaceAll(" ","").replaceAll(",","")+"'])||";
        return Label;
    }

}
