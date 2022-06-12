// Generated from C:/Users/User/Desktop/Ahmad Al Hafez\HTMLParser.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#splus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplus(HTMLParser.SplusContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#phpPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhpPlus(HTMLParser.PhpPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#phpElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhpElement(HTMLParser.PhpElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(HTMLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(HTMLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(HTMLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#logo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogo(HTMLParser.LogoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#nav}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNav(HTMLParser.NavContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#footer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooter(HTMLParser.FooterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(HTMLParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogin(HTMLParser.LoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#signUp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignUp(HTMLParser.SignUpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#auth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuth(HTMLParser.AuthContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#inject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInject(HTMLParser.InjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole(HTMLParser.RoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail(HTMLParser.EmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(HTMLParser.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#name_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_page(HTMLParser.Name_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(HTMLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(HTMLParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#pageAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageAttributes(HTMLParser.PageAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#authiticated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthiticated(HTMLParser.AuthiticatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#pageForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageForm(HTMLParser.PageFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#pageTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageTable(HTMLParser.PageTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#viewAs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewAs(HTMLParser.ViewAsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#contollers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContollers(HTMLParser.ContollersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#loginController}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoginController(HTMLParser.LoginControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#singUpController}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingUpController(HTMLParser.SingUpControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#navController}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavController(HTMLParser.NavControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#footerController}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooterController(HTMLParser.FooterControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#formController}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormController(HTMLParser.FormControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#pageController}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageController(HTMLParser.PageControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#pageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageName(HTMLParser.PageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#destenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestenation(HTMLParser.DestenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(HTMLParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(HTMLParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#formAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormAttributes(HTMLParser.FormAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(HTMLParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(HTMLParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttType(HTMLParser.AttTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(HTMLParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#loginStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoginStyle(HTMLParser.LoginStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#signUpStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignUpStyle(HTMLParser.SignUpStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#navStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavStyle(HTMLParser.NavStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#footerStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooterStyle(HTMLParser.FooterStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#pageStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageStyle(HTMLParser.PageStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#styleAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttributes(HTMLParser.StyleAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#textColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextColor(HTMLParser.TextColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(HTMLParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#inputColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputColor(HTMLParser.InputColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#align}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlign(HTMLParser.AlignContext ctx);
}