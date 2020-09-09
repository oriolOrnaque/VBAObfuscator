// Generated from C:/dev/VBAObfuscator/src/VBAObfuscator/parser\vba.g4 by ANTLR 4.8
package VBAObfuscator.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link vbaParser}.
 */
public interface vbaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link vbaParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(vbaParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(vbaParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(vbaParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(vbaParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#moduleHeader}.
	 * @param ctx the parse tree
	 */
	void enterModuleHeader(vbaParser.ModuleHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#moduleHeader}.
	 * @param ctx the parse tree
	 */
	void exitModuleHeader(vbaParser.ModuleHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#moduleConfig}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfig(vbaParser.ModuleConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#moduleConfig}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfig(vbaParser.ModuleConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfigElement(vbaParser.ModuleConfigElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfigElement(vbaParser.ModuleConfigElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#moduleAttributes}.
	 * @param ctx the parse tree
	 */
	void enterModuleAttributes(vbaParser.ModuleAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#moduleAttributes}.
	 * @param ctx the parse tree
	 */
	void exitModuleAttributes(vbaParser.ModuleAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#moduleDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclarations(vbaParser.ModuleDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#moduleDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclarations(vbaParser.ModuleDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionBaseStmt(vbaParser.OptionBaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionBaseStmt(vbaParser.OptionBaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionCompareStmt(vbaParser.OptionCompareStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionCompareStmt(vbaParser.OptionCompareStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionExplicitStmt(vbaParser.OptionExplicitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionExplicitStmt(vbaParser.OptionExplicitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionPrivateModuleStmt(vbaParser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionPrivateModuleStmt(vbaParser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#moduleDeclarationsElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclarationsElement(vbaParser.ModuleDeclarationsElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#moduleDeclarationsElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclarationsElement(vbaParser.ModuleDeclarationsElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#macroStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroStmt(vbaParser.MacroStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#macroStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroStmt(vbaParser.MacroStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(vbaParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(vbaParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#moduleBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleBodyElement(vbaParser.ModuleBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#moduleBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleBodyElement(vbaParser.ModuleBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#attributeStmt}.
	 * @param ctx the parse tree
	 */
	void enterAttributeStmt(vbaParser.AttributeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#attributeStmt}.
	 * @param ctx the parse tree
	 */
	void exitAttributeStmt(vbaParser.AttributeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(vbaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(vbaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(vbaParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(vbaParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#appactivateStmt}.
	 * @param ctx the parse tree
	 */
	void enterAppactivateStmt(vbaParser.AppactivateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#appactivateStmt}.
	 * @param ctx the parse tree
	 */
	void exitAppactivateStmt(vbaParser.AppactivateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#beepStmt}.
	 * @param ctx the parse tree
	 */
	void enterBeepStmt(vbaParser.BeepStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#beepStmt}.
	 * @param ctx the parse tree
	 */
	void exitBeepStmt(vbaParser.BeepStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#chdirStmt}.
	 * @param ctx the parse tree
	 */
	void enterChdirStmt(vbaParser.ChdirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#chdirStmt}.
	 * @param ctx the parse tree
	 */
	void exitChdirStmt(vbaParser.ChdirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#chdriveStmt}.
	 * @param ctx the parse tree
	 */
	void enterChdriveStmt(vbaParser.ChdriveStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#chdriveStmt}.
	 * @param ctx the parse tree
	 */
	void exitChdriveStmt(vbaParser.ChdriveStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#closeStmt}.
	 * @param ctx the parse tree
	 */
	void enterCloseStmt(vbaParser.CloseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#closeStmt}.
	 * @param ctx the parse tree
	 */
	void exitCloseStmt(vbaParser.CloseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#constStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstStmt(vbaParser.ConstStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#constStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstStmt(vbaParser.ConstStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#constSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstSubStmt(vbaParser.ConstSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#constSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstSubStmt(vbaParser.ConstSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#dateStmt}.
	 * @param ctx the parse tree
	 */
	void enterDateStmt(vbaParser.DateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#dateStmt}.
	 * @param ctx the parse tree
	 */
	void exitDateStmt(vbaParser.DateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStmt(vbaParser.DeclareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStmt(vbaParser.DeclareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#deftypeStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeftypeStmt(vbaParser.DeftypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#deftypeStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeftypeStmt(vbaParser.DeftypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#deleteSettingStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSettingStmt(vbaParser.DeleteSettingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#deleteSettingStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSettingStmt(vbaParser.DeleteSettingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#doLoopStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoLoopStmt(vbaParser.DoLoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#doLoopStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoLoopStmt(vbaParser.DoLoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#endStmt}.
	 * @param ctx the parse tree
	 */
	void enterEndStmt(vbaParser.EndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#endStmt}.
	 * @param ctx the parse tree
	 */
	void exitEndStmt(vbaParser.EndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#enumerationStmt}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationStmt(vbaParser.EnumerationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#enumerationStmt}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationStmt(vbaParser.EnumerationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationStmt_Constant(vbaParser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationStmt_Constant(vbaParser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void enterEraseStmt(vbaParser.EraseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void exitEraseStmt(vbaParser.EraseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void enterErrorStmt(vbaParser.ErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void exitErrorStmt(vbaParser.ErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#eventStmt}.
	 * @param ctx the parse tree
	 */
	void enterEventStmt(vbaParser.EventStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#eventStmt}.
	 * @param ctx the parse tree
	 */
	void exitEventStmt(vbaParser.EventStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void enterExitStmt(vbaParser.ExitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void exitExitStmt(vbaParser.ExitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#filecopyStmt}.
	 * @param ctx the parse tree
	 */
	void enterFilecopyStmt(vbaParser.FilecopyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#filecopyStmt}.
	 * @param ctx the parse tree
	 */
	void exitFilecopyStmt(vbaParser.FilecopyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterForEachStmt(vbaParser.ForEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitForEachStmt(vbaParser.ForEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#forNextStmt}.
	 * @param ctx the parse tree
	 */
	void enterForNextStmt(vbaParser.ForNextStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#forNextStmt}.
	 * @param ctx the parse tree
	 */
	void exitForNextStmt(vbaParser.ForNextStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStmt(vbaParser.FunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStmt(vbaParser.FunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#getStmt}.
	 * @param ctx the parse tree
	 */
	void enterGetStmt(vbaParser.GetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#getStmt}.
	 * @param ctx the parse tree
	 */
	void exitGetStmt(vbaParser.GetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#goSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoSubStmt(vbaParser.GoSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#goSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoSubStmt(vbaParser.GoSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#goToStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoToStmt(vbaParser.GoToStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#goToStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoToStmt(vbaParser.GoToStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineIfThenElse}
	 * labeled alternative in {@link vbaParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterInlineIfThenElse(vbaParser.InlineIfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineIfThenElse}
	 * labeled alternative in {@link vbaParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitInlineIfThenElse(vbaParser.InlineIfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockIfThenElse}
	 * labeled alternative in {@link vbaParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockIfThenElse(vbaParser.BlockIfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockIfThenElse}
	 * labeled alternative in {@link vbaParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockIfThenElse(vbaParser.BlockIfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#ifBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfBlockStmt(vbaParser.IfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#ifBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfBlockStmt(vbaParser.IfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#ifConditionStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionStmt(vbaParser.IfConditionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#ifConditionStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionStmt(vbaParser.IfConditionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#ifElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIfBlockStmt(vbaParser.IfElseIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#ifElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIfBlockStmt(vbaParser.IfElseIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#ifElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseBlockStmt(vbaParser.IfElseBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#ifElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseBlockStmt(vbaParser.IfElseBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#implementsStmt}.
	 * @param ctx the parse tree
	 */
	void enterImplementsStmt(vbaParser.ImplementsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#implementsStmt}.
	 * @param ctx the parse tree
	 */
	void exitImplementsStmt(vbaParser.ImplementsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(vbaParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(vbaParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#killStmt}.
	 * @param ctx the parse tree
	 */
	void enterKillStmt(vbaParser.KillStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#killStmt}.
	 * @param ctx the parse tree
	 */
	void exitKillStmt(vbaParser.KillStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(vbaParser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(vbaParser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#lineInputStmt}.
	 * @param ctx the parse tree
	 */
	void enterLineInputStmt(vbaParser.LineInputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#lineInputStmt}.
	 * @param ctx the parse tree
	 */
	void exitLineInputStmt(vbaParser.LineInputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoadStmt(vbaParser.LoadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoadStmt(vbaParser.LoadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void enterLockStmt(vbaParser.LockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void exitLockStmt(vbaParser.LockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#lsetStmt}.
	 * @param ctx the parse tree
	 */
	void enterLsetStmt(vbaParser.LsetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#lsetStmt}.
	 * @param ctx the parse tree
	 */
	void exitLsetStmt(vbaParser.LsetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#macroConstStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroConstStmt(vbaParser.MacroConstStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#macroConstStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroConstStmt(vbaParser.MacroConstStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#macroIfThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroIfThenElseStmt(vbaParser.MacroIfThenElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#macroIfThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroIfThenElseStmt(vbaParser.MacroIfThenElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#macroIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroIfBlockStmt(vbaParser.MacroIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#macroIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroIfBlockStmt(vbaParser.MacroIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#macroElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroElseIfBlockStmt(vbaParser.MacroElseIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#macroElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroElseIfBlockStmt(vbaParser.MacroElseIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#macroElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroElseBlockStmt(vbaParser.MacroElseBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#macroElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroElseBlockStmt(vbaParser.MacroElseBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#midStmt}.
	 * @param ctx the parse tree
	 */
	void enterMidStmt(vbaParser.MidStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#midStmt}.
	 * @param ctx the parse tree
	 */
	void exitMidStmt(vbaParser.MidStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#mkdirStmt}.
	 * @param ctx the parse tree
	 */
	void enterMkdirStmt(vbaParser.MkdirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#mkdirStmt}.
	 * @param ctx the parse tree
	 */
	void exitMkdirStmt(vbaParser.MkdirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#nameStmt}.
	 * @param ctx the parse tree
	 */
	void enterNameStmt(vbaParser.NameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#nameStmt}.
	 * @param ctx the parse tree
	 */
	void exitNameStmt(vbaParser.NameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#onErrorStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnErrorStmt(vbaParser.OnErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#onErrorStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnErrorStmt(vbaParser.OnErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#onGoToStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnGoToStmt(vbaParser.OnGoToStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#onGoToStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnGoToStmt(vbaParser.OnGoToStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#onGoSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnGoSubStmt(vbaParser.OnGoSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#onGoSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnGoSubStmt(vbaParser.OnGoSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#openStmt}.
	 * @param ctx the parse tree
	 */
	void enterOpenStmt(vbaParser.OpenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#openStmt}.
	 * @param ctx the parse tree
	 */
	void exitOpenStmt(vbaParser.OpenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#outputList}.
	 * @param ctx the parse tree
	 */
	void enterOutputList(vbaParser.OutputListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#outputList}.
	 * @param ctx the parse tree
	 */
	void exitOutputList(vbaParser.OutputListContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#outputList_Expression}.
	 * @param ctx the parse tree
	 */
	void enterOutputList_Expression(vbaParser.OutputList_ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#outputList_Expression}.
	 * @param ctx the parse tree
	 */
	void exitOutputList_Expression(vbaParser.OutputList_ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(vbaParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(vbaParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#propertyGetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetStmt(vbaParser.PropertyGetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#propertyGetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetStmt(vbaParser.PropertyGetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#propertySetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetStmt(vbaParser.PropertySetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#propertySetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetStmt(vbaParser.PropertySetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#propertyLetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertyLetStmt(vbaParser.PropertyLetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#propertyLetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertyLetStmt(vbaParser.PropertyLetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#putStmt}.
	 * @param ctx the parse tree
	 */
	void enterPutStmt(vbaParser.PutStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#putStmt}.
	 * @param ctx the parse tree
	 */
	void exitPutStmt(vbaParser.PutStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#raiseEventStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseEventStmt(vbaParser.RaiseEventStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#raiseEventStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseEventStmt(vbaParser.RaiseEventStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#randomizeStmt}.
	 * @param ctx the parse tree
	 */
	void enterRandomizeStmt(vbaParser.RandomizeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#randomizeStmt}.
	 * @param ctx the parse tree
	 */
	void exitRandomizeStmt(vbaParser.RandomizeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#redimStmt}.
	 * @param ctx the parse tree
	 */
	void enterRedimStmt(vbaParser.RedimStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#redimStmt}.
	 * @param ctx the parse tree
	 */
	void exitRedimStmt(vbaParser.RedimStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#redimSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterRedimSubStmt(vbaParser.RedimSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#redimSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitRedimSubStmt(vbaParser.RedimSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#resetStmt}.
	 * @param ctx the parse tree
	 */
	void enterResetStmt(vbaParser.ResetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#resetStmt}.
	 * @param ctx the parse tree
	 */
	void exitResetStmt(vbaParser.ResetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#resumeStmt}.
	 * @param ctx the parse tree
	 */
	void enterResumeStmt(vbaParser.ResumeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#resumeStmt}.
	 * @param ctx the parse tree
	 */
	void exitResumeStmt(vbaParser.ResumeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(vbaParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(vbaParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#rmdirStmt}.
	 * @param ctx the parse tree
	 */
	void enterRmdirStmt(vbaParser.RmdirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#rmdirStmt}.
	 * @param ctx the parse tree
	 */
	void exitRmdirStmt(vbaParser.RmdirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#rsetStmt}.
	 * @param ctx the parse tree
	 */
	void enterRsetStmt(vbaParser.RsetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#rsetStmt}.
	 * @param ctx the parse tree
	 */
	void exitRsetStmt(vbaParser.RsetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#savepictureStmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepictureStmt(vbaParser.SavepictureStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#savepictureStmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepictureStmt(vbaParser.SavepictureStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#saveSettingStmt}.
	 * @param ctx the parse tree
	 */
	void enterSaveSettingStmt(vbaParser.SaveSettingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#saveSettingStmt}.
	 * @param ctx the parse tree
	 */
	void exitSaveSettingStmt(vbaParser.SaveSettingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#seekStmt}.
	 * @param ctx the parse tree
	 */
	void enterSeekStmt(vbaParser.SeekStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#seekStmt}.
	 * @param ctx the parse tree
	 */
	void exitSeekStmt(vbaParser.SeekStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#selectCaseStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectCaseStmt(vbaParser.SelectCaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#selectCaseStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectCaseStmt(vbaParser.SelectCaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondIs}
	 * labeled alternative in {@link vbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondIs(vbaParser.CaseCondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondIs}
	 * labeled alternative in {@link vbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondIs(vbaParser.CaseCondIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondTo}
	 * labeled alternative in {@link vbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondTo(vbaParser.CaseCondToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondTo}
	 * labeled alternative in {@link vbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondTo(vbaParser.CaseCondToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondValue}
	 * labeled alternative in {@link vbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondValue(vbaParser.CaseCondValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondValue}
	 * labeled alternative in {@link vbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondValue(vbaParser.CaseCondValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#sC_Case}.
	 * @param ctx the parse tree
	 */
	void enterSC_Case(vbaParser.SC_CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#sC_Case}.
	 * @param ctx the parse tree
	 */
	void exitSC_Case(vbaParser.SC_CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondElse}
	 * labeled alternative in {@link vbaParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondElse(vbaParser.CaseCondElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondElse}
	 * labeled alternative in {@link vbaParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondElse(vbaParser.CaseCondElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondSelection}
	 * labeled alternative in {@link vbaParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondSelection(vbaParser.CaseCondSelectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondSelection}
	 * labeled alternative in {@link vbaParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondSelection(vbaParser.CaseCondSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#sendkeysStmt}.
	 * @param ctx the parse tree
	 */
	void enterSendkeysStmt(vbaParser.SendkeysStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#sendkeysStmt}.
	 * @param ctx the parse tree
	 */
	void exitSendkeysStmt(vbaParser.SendkeysStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#setattrStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetattrStmt(vbaParser.SetattrStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#setattrStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetattrStmt(vbaParser.SetattrStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetStmt(vbaParser.SetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetStmt(vbaParser.SetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void enterStopStmt(vbaParser.StopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void exitStopStmt(vbaParser.StopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#subStmt}.
	 * @param ctx the parse tree
	 */
	void enterSubStmt(vbaParser.SubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#subStmt}.
	 * @param ctx the parse tree
	 */
	void exitSubStmt(vbaParser.SubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#timeStmt}.
	 * @param ctx the parse tree
	 */
	void enterTimeStmt(vbaParser.TimeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#timeStmt}.
	 * @param ctx the parse tree
	 */
	void exitTimeStmt(vbaParser.TimeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#typeStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeStmt(vbaParser.TypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#typeStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeStmt(vbaParser.TypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#typeStmt_Element}.
	 * @param ctx the parse tree
	 */
	void enterTypeStmt_Element(vbaParser.TypeStmt_ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#typeStmt_Element}.
	 * @param ctx the parse tree
	 */
	void exitTypeStmt_Element(vbaParser.TypeStmt_ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#typeOfStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfStmt(vbaParser.TypeOfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#typeOfStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfStmt(vbaParser.TypeOfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#unloadStmt}.
	 * @param ctx the parse tree
	 */
	void enterUnloadStmt(vbaParser.UnloadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#unloadStmt}.
	 * @param ctx the parse tree
	 */
	void exitUnloadStmt(vbaParser.UnloadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#unlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterUnlockStmt(vbaParser.UnlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#unlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitUnlockStmt(vbaParser.UnlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsStruct}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsStruct(vbaParser.VsStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsStruct}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsStruct(vbaParser.VsStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAdd}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAdd(vbaParser.VsAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAdd}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAdd(vbaParser.VsAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLt}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLt(vbaParser.VsLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLt}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLt(vbaParser.VsLtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAddressOf}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAddressOf(vbaParser.VsAddressOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAddressOf}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAddressOf(vbaParser.VsAddressOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNew}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNew(vbaParser.VsNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNew}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNew(vbaParser.VsNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMult}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMult(vbaParser.VsMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMult}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMult(vbaParser.VsMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNegation}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNegation(vbaParser.VsNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNegation}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNegation(vbaParser.VsNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAssign}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAssign(vbaParser.VsAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAssign}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAssign(vbaParser.VsAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLike}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLike(vbaParser.VsLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLike}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLike(vbaParser.VsLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsDiv}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsDiv(vbaParser.VsDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsDiv}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsDiv(vbaParser.VsDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsPlus}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsPlus(vbaParser.VsPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsPlus}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsPlus(vbaParser.VsPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNot}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNot(vbaParser.VsNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNot}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNot(vbaParser.VsNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsGeq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsGeq(vbaParser.VsGeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsGeq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsGeq(vbaParser.VsGeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsTypeOf}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsTypeOf(vbaParser.VsTypeOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsTypeOf}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsTypeOf(vbaParser.VsTypeOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsICS}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsICS(vbaParser.VsICSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsICS}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsICS(vbaParser.VsICSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNeq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNeq(vbaParser.VsNeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNeq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNeq(vbaParser.VsNeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsXor}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsXor(vbaParser.VsXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsXor}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsXor(vbaParser.VsXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAnd}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAnd(vbaParser.VsAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAnd}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAnd(vbaParser.VsAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLeq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLeq(vbaParser.VsLeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLeq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLeq(vbaParser.VsLeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsPow}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsPow(vbaParser.VsPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsPow}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsPow(vbaParser.VsPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsIs}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsIs(vbaParser.VsIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsIs}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsIs(vbaParser.VsIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMod}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMod(vbaParser.VsModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMod}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMod(vbaParser.VsModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAmp}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAmp(vbaParser.VsAmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAmp}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAmp(vbaParser.VsAmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsOr}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsOr(vbaParser.VsOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsOr}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsOr(vbaParser.VsOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMinus}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMinus(vbaParser.VsMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMinus}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMinus(vbaParser.VsMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLiteral}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLiteral(vbaParser.VsLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLiteral}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLiteral(vbaParser.VsLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsEqv}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsEqv(vbaParser.VsEqvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsEqv}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsEqv(vbaParser.VsEqvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsImp}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsImp(vbaParser.VsImpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsImp}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsImp(vbaParser.VsImpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsGt}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsGt(vbaParser.VsGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsGt}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsGt(vbaParser.VsGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsEq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsEq(vbaParser.VsEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsEq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsEq(vbaParser.VsEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMid}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMid(vbaParser.VsMidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMid}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMid(vbaParser.VsMidContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableStmt(vbaParser.VariableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableStmt(vbaParser.VariableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#variableListStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableListStmt(vbaParser.VariableListStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#variableListStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableListStmt(vbaParser.VariableListStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#variableSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableSubStmt(vbaParser.VariableSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#variableSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableSubStmt(vbaParser.VariableSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#whileWendStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileWendStmt(vbaParser.WhileWendStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#whileWendStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileWendStmt(vbaParser.WhileWendStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#widthStmt}.
	 * @param ctx the parse tree
	 */
	void enterWidthStmt(vbaParser.WidthStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#widthStmt}.
	 * @param ctx the parse tree
	 */
	void exitWidthStmt(vbaParser.WidthStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(vbaParser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(vbaParser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(vbaParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(vbaParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#fileNumber}.
	 * @param ctx the parse tree
	 */
	void enterFileNumber(vbaParser.FileNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#fileNumber}.
	 * @param ctx the parse tree
	 */
	void exitFileNumber(vbaParser.FileNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#explicitCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplicitCallStmt(vbaParser.ExplicitCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#explicitCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplicitCallStmt(vbaParser.ExplicitCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#eCS_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterECS_ProcedureCall(vbaParser.ECS_ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#eCS_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitECS_ProcedureCall(vbaParser.ECS_ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#eCS_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterECS_MemberProcedureCall(vbaParser.ECS_MemberProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#eCS_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitECS_MemberProcedureCall(vbaParser.ECS_MemberProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#implicitCallStmt_InBlock}.
	 * @param ctx the parse tree
	 */
	void enterImplicitCallStmt_InBlock(vbaParser.ImplicitCallStmt_InBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#implicitCallStmt_InBlock}.
	 * @param ctx the parse tree
	 */
	void exitImplicitCallStmt_InBlock(vbaParser.ImplicitCallStmt_InBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#iCS_B_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_B_MemberProcedureCall(vbaParser.ICS_B_MemberProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#iCS_B_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_B_MemberProcedureCall(vbaParser.ICS_B_MemberProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#iCS_B_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_B_ProcedureCall(vbaParser.ICS_B_ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#iCS_B_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_B_ProcedureCall(vbaParser.ICS_B_ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#implicitCallStmt_InStmt}.
	 * @param ctx the parse tree
	 */
	void enterImplicitCallStmt_InStmt(vbaParser.ImplicitCallStmt_InStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#implicitCallStmt_InStmt}.
	 * @param ctx the parse tree
	 */
	void exitImplicitCallStmt_InStmt(vbaParser.ImplicitCallStmt_InStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#iCS_S_VariableOrProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_VariableOrProcedureCall(vbaParser.ICS_S_VariableOrProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#iCS_S_VariableOrProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_VariableOrProcedureCall(vbaParser.ICS_S_VariableOrProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#iCS_S_ProcedureOrArrayCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_ProcedureOrArrayCall(vbaParser.ICS_S_ProcedureOrArrayCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#iCS_S_ProcedureOrArrayCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_ProcedureOrArrayCall(vbaParser.ICS_S_ProcedureOrArrayCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#iCS_S_MembersCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_MembersCall(vbaParser.ICS_S_MembersCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#iCS_S_MembersCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_MembersCall(vbaParser.ICS_S_MembersCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#iCS_S_MemberCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_MemberCall(vbaParser.ICS_S_MemberCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#iCS_S_MemberCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_MemberCall(vbaParser.ICS_S_MemberCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#iCS_S_DictionaryCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_DictionaryCall(vbaParser.ICS_S_DictionaryCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#iCS_S_DictionaryCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_DictionaryCall(vbaParser.ICS_S_DictionaryCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#argsCall}.
	 * @param ctx the parse tree
	 */
	void enterArgsCall(vbaParser.ArgsCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#argsCall}.
	 * @param ctx the parse tree
	 */
	void exitArgsCall(vbaParser.ArgsCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#argCall}.
	 * @param ctx the parse tree
	 */
	void enterArgCall(vbaParser.ArgCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#argCall}.
	 * @param ctx the parse tree
	 */
	void exitArgCall(vbaParser.ArgCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#dictionaryCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryCallStmt(vbaParser.DictionaryCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#dictionaryCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryCallStmt(vbaParser.DictionaryCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(vbaParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(vbaParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(vbaParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(vbaParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#argDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterArgDefaultValue(vbaParser.ArgDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#argDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitArgDefaultValue(vbaParser.ArgDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts(vbaParser.SubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts(vbaParser.SubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(vbaParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(vbaParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#ambiguousIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousIdentifier(vbaParser.AmbiguousIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#ambiguousIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousIdentifier(vbaParser.AmbiguousIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#asTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterAsTypeClause(vbaParser.AsTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#asTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitAsTypeClause(vbaParser.AsTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(vbaParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(vbaParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#certainIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCertainIdentifier(vbaParser.CertainIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#certainIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCertainIdentifier(vbaParser.CertainIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(vbaParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(vbaParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(vbaParser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(vbaParser.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldLength(vbaParser.FieldLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldLength(vbaParser.FieldLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#letterrange}.
	 * @param ctx the parse tree
	 */
	void enterLetterrange(vbaParser.LetterrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#letterrange}.
	 * @param ctx the parse tree
	 */
	void exitLetterrange(vbaParser.LetterrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#lineLabel}.
	 * @param ctx the parse tree
	 */
	void enterLineLabel(vbaParser.LineLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#lineLabel}.
	 * @param ctx the parse tree
	 */
	void exitLineLabel(vbaParser.LineLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(vbaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(vbaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(vbaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(vbaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void enterTypeHint(vbaParser.TypeHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void exitTypeHint(vbaParser.TypeHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(vbaParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(vbaParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#ambiguousKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousKeyword(vbaParser.AmbiguousKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#ambiguousKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousKeyword(vbaParser.AmbiguousKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#remComment}.
	 * @param ctx the parse tree
	 */
	void enterRemComment(vbaParser.RemCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#remComment}.
	 * @param ctx the parse tree
	 */
	void exitRemComment(vbaParser.RemCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(vbaParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(vbaParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#endOfLine}.
	 * @param ctx the parse tree
	 */
	void enterEndOfLine(vbaParser.EndOfLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#endOfLine}.
	 * @param ctx the parse tree
	 */
	void exitEndOfLine(vbaParser.EndOfLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link vbaParser#endOfStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndOfStatement(vbaParser.EndOfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vbaParser#endOfStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndOfStatement(vbaParser.EndOfStatementContext ctx);
}