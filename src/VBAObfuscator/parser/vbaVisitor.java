// Generated from C:/dev/VBAObfuscator/src/VBAObfuscator/parser\vba.g4 by ANTLR 4.8
package VBAObfuscator.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link vbaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface vbaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link vbaParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(vbaParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(vbaParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#moduleHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleHeader(vbaParser.ModuleHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#moduleConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleConfig(vbaParser.ModuleConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleConfigElement(vbaParser.ModuleConfigElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#moduleAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleAttributes(vbaParser.ModuleAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#moduleDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclarations(vbaParser.ModuleDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionBaseStmt(vbaParser.OptionBaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionCompareStmt(vbaParser.OptionCompareStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionExplicitStmt(vbaParser.OptionExplicitStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link vbaParser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionPrivateModuleStmt(vbaParser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#moduleDeclarationsElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclarationsElement(vbaParser.ModuleDeclarationsElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#macroStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroStmt(vbaParser.MacroStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#moduleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBody(vbaParser.ModuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#moduleBodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBodyElement(vbaParser.ModuleBodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#attributeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeStmt(vbaParser.AttributeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(vbaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(vbaParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#appactivateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppactivateStmt(vbaParser.AppactivateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#beepStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeepStmt(vbaParser.BeepStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#chdirStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChdirStmt(vbaParser.ChdirStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#chdriveStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChdriveStmt(vbaParser.ChdriveStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#closeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseStmt(vbaParser.CloseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#constStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstStmt(vbaParser.ConstStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#constSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSubStmt(vbaParser.ConstSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#dateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateStmt(vbaParser.DateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#declareStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStmt(vbaParser.DeclareStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#deftypeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeftypeStmt(vbaParser.DeftypeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#deleteSettingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSettingStmt(vbaParser.DeleteSettingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#doLoopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoLoopStmt(vbaParser.DoLoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#endStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndStmt(vbaParser.EndStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#enumerationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationStmt(vbaParser.EnumerationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationStmt_Constant(vbaParser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#eraseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEraseStmt(vbaParser.EraseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#errorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorStmt(vbaParser.ErrorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#eventStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventStmt(vbaParser.EventStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#exitStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStmt(vbaParser.ExitStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#filecopyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilecopyStmt(vbaParser.FilecopyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#forEachStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStmt(vbaParser.ForEachStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#forNextStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForNextStmt(vbaParser.ForNextStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#functionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStmt(vbaParser.FunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#getStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetStmt(vbaParser.GetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#goSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoSubStmt(vbaParser.GoSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#goToStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToStmt(vbaParser.GoToStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineIfThenElse}
	 * labeled alternative in {@link vbaParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineIfThenElse(vbaParser.InlineIfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockIfThenElse}
	 * labeled alternative in {@link vbaParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockIfThenElse(vbaParser.BlockIfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#ifBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlockStmt(vbaParser.IfBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#ifConditionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionStmt(vbaParser.IfConditionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#ifElseIfBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseIfBlockStmt(vbaParser.IfElseIfBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#ifElseBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseBlockStmt(vbaParser.IfElseBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#implementsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsStmt(vbaParser.ImplementsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#inputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmt(vbaParser.InputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#killStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKillStmt(vbaParser.KillStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#letStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStmt(vbaParser.LetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#lineInputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineInputStmt(vbaParser.LineInputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#loadStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadStmt(vbaParser.LoadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#lockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStmt(vbaParser.LockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#lsetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLsetStmt(vbaParser.LsetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#macroConstStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroConstStmt(vbaParser.MacroConstStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#macroIfThenElseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroIfThenElseStmt(vbaParser.MacroIfThenElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#macroIfBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroIfBlockStmt(vbaParser.MacroIfBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#macroElseIfBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroElseIfBlockStmt(vbaParser.MacroElseIfBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#macroElseBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroElseBlockStmt(vbaParser.MacroElseBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#midStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMidStmt(vbaParser.MidStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#mkdirStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMkdirStmt(vbaParser.MkdirStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#nameStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameStmt(vbaParser.NameStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#onErrorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnErrorStmt(vbaParser.OnErrorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#onGoToStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnGoToStmt(vbaParser.OnGoToStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#onGoSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnGoSubStmt(vbaParser.OnGoSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#openStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenStmt(vbaParser.OpenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#outputList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputList(vbaParser.OutputListContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#outputList_Expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputList_Expression(vbaParser.OutputList_ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(vbaParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#propertyGetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyGetStmt(vbaParser.PropertyGetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#propertySetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySetStmt(vbaParser.PropertySetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#propertyLetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyLetStmt(vbaParser.PropertyLetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#putStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutStmt(vbaParser.PutStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#raiseEventStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseEventStmt(vbaParser.RaiseEventStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#randomizeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomizeStmt(vbaParser.RandomizeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#redimStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedimStmt(vbaParser.RedimStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#redimSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedimSubStmt(vbaParser.RedimSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#resetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetStmt(vbaParser.ResetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#resumeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResumeStmt(vbaParser.ResumeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(vbaParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#rmdirStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmdirStmt(vbaParser.RmdirStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#rsetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRsetStmt(vbaParser.RsetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#savepictureStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepictureStmt(vbaParser.SavepictureStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#saveSettingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaveSettingStmt(vbaParser.SaveSettingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#seekStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeekStmt(vbaParser.SeekStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#selectCaseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCaseStmt(vbaParser.SelectCaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseCondIs}
	 * labeled alternative in {@link vbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCondIs(vbaParser.CaseCondIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseCondTo}
	 * labeled alternative in {@link vbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCondTo(vbaParser.CaseCondToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseCondValue}
	 * labeled alternative in {@link vbaParser#sC_Selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCondValue(vbaParser.CaseCondValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#sC_Case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSC_Case(vbaParser.SC_CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseCondElse}
	 * labeled alternative in {@link vbaParser#sC_Cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCondElse(vbaParser.CaseCondElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseCondSelection}
	 * labeled alternative in {@link vbaParser#sC_Cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCondSelection(vbaParser.CaseCondSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#sendkeysStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendkeysStmt(vbaParser.SendkeysStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#setattrStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetattrStmt(vbaParser.SetattrStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#setStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStmt(vbaParser.SetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#stopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopStmt(vbaParser.StopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#subStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubStmt(vbaParser.SubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#timeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeStmt(vbaParser.TimeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#typeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStmt(vbaParser.TypeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#typeStmt_Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStmt_Element(vbaParser.TypeStmt_ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#typeOfStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOfStmt(vbaParser.TypeOfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#unloadStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnloadStmt(vbaParser.UnloadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#unlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlockStmt(vbaParser.UnlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsStruct}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsStruct(vbaParser.VsStructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsAdd}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsAdd(vbaParser.VsAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsLt}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsLt(vbaParser.VsLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsAddressOf}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsAddressOf(vbaParser.VsAddressOfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsNew}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsNew(vbaParser.VsNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsMult}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsMult(vbaParser.VsMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsNegation}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsNegation(vbaParser.VsNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsAssign}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsAssign(vbaParser.VsAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsLike}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsLike(vbaParser.VsLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsDiv}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsDiv(vbaParser.VsDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsPlus}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsPlus(vbaParser.VsPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsNot}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsNot(vbaParser.VsNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsGeq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsGeq(vbaParser.VsGeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsTypeOf}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsTypeOf(vbaParser.VsTypeOfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsICS}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsICS(vbaParser.VsICSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsNeq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsNeq(vbaParser.VsNeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsXor}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsXor(vbaParser.VsXorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsAnd}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsAnd(vbaParser.VsAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsLeq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsLeq(vbaParser.VsLeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsPow}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsPow(vbaParser.VsPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsIs}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsIs(vbaParser.VsIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsMod}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsMod(vbaParser.VsModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsAmp}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsAmp(vbaParser.VsAmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsOr}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsOr(vbaParser.VsOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsMinus}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsMinus(vbaParser.VsMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsLiteral}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsLiteral(vbaParser.VsLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsEqv}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsEqv(vbaParser.VsEqvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsImp}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsImp(vbaParser.VsImpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsGt}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsGt(vbaParser.VsGtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsEq}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsEq(vbaParser.VsEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsMid}
	 * labeled alternative in {@link vbaParser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsMid(vbaParser.VsMidContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#variableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStmt(vbaParser.VariableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#variableListStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableListStmt(vbaParser.VariableListStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#variableSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableSubStmt(vbaParser.VariableSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#whileWendStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileWendStmt(vbaParser.WhileWendStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#widthStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthStmt(vbaParser.WidthStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#withStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStmt(vbaParser.WithStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(vbaParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#fileNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileNumber(vbaParser.FileNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#explicitCallStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitCallStmt(vbaParser.ExplicitCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#eCS_ProcedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitECS_ProcedureCall(vbaParser.ECS_ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#eCS_MemberProcedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitECS_MemberProcedureCall(vbaParser.ECS_MemberProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#implicitCallStmt_InBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitCallStmt_InBlock(vbaParser.ImplicitCallStmt_InBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#iCS_B_MemberProcedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_B_MemberProcedureCall(vbaParser.ICS_B_MemberProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#iCS_B_ProcedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_B_ProcedureCall(vbaParser.ICS_B_ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#implicitCallStmt_InStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitCallStmt_InStmt(vbaParser.ImplicitCallStmt_InStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#iCS_S_VariableOrProcedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_S_VariableOrProcedureCall(vbaParser.ICS_S_VariableOrProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#iCS_S_ProcedureOrArrayCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_S_ProcedureOrArrayCall(vbaParser.ICS_S_ProcedureOrArrayCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#iCS_S_MembersCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_S_MembersCall(vbaParser.ICS_S_MembersCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#iCS_S_MemberCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_S_MemberCall(vbaParser.ICS_S_MemberCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#iCS_S_DictionaryCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_S_DictionaryCall(vbaParser.ICS_S_DictionaryCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#argsCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsCall(vbaParser.ArgsCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#argCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgCall(vbaParser.ArgCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#dictionaryCallStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryCallStmt(vbaParser.DictionaryCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(vbaParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(vbaParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#argDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgDefaultValue(vbaParser.ArgDefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#subscripts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts(vbaParser.SubscriptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(vbaParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#ambiguousIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousIdentifier(vbaParser.AmbiguousIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#asTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsTypeClause(vbaParser.AsTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(vbaParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#certainIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCertainIdentifier(vbaParser.CertainIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(vbaParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#complexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexType(vbaParser.ComplexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#fieldLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLength(vbaParser.FieldLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#letterrange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetterrange(vbaParser.LetterrangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#lineLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineLabel(vbaParser.LineLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(vbaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(vbaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#typeHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeHint(vbaParser.TypeHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility(vbaParser.VisibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#ambiguousKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousKeyword(vbaParser.AmbiguousKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#remComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemComment(vbaParser.RemCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(vbaParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#endOfLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfLine(vbaParser.EndOfLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link vbaParser#endOfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfStatement(vbaParser.EndOfStatementContext ctx);
}