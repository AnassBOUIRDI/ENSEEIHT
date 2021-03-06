/*
 * generated by Xtext 2.10.0
 */
package fr.enseeiht.gls.projet404.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.enseeiht.gls.projet404.ide.contentassist.antlr.internal.InternalGamesParser;
import fr.enseeiht.gls.projet404.services.GamesGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class GamesParser extends AbstractContentAssistParser {

	@Inject
	private GamesGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalGamesParser createParser() {
		InternalGamesParser result = new InternalGamesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionsAccess().getAlternatives(), "rule__Actions__Alternatives");
					put(grammarAccess.getGameAccess().getGroup(), "rule__Game__Group__0");
					put(grammarAccess.getGameAccess().getGroup_7(), "rule__Game__Group_7__0");
					put(grammarAccess.getGameAccess().getGroup_9(), "rule__Game__Group_9__0");
					put(grammarAccess.getGameAccess().getGroup_9_3(), "rule__Game__Group_9_3__0");
					put(grammarAccess.getGameAccess().getGroup_13(), "rule__Game__Group_13__0");
					put(grammarAccess.getGameAccess().getGroup_15(), "rule__Game__Group_15__0");
					put(grammarAccess.getGameAccess().getGroup_15_3(), "rule__Game__Group_15_3__0");
					put(grammarAccess.getGameAccess().getGroup_19(), "rule__Game__Group_19__0");
					put(grammarAccess.getGameAccess().getGroup_21(), "rule__Game__Group_21__0");
					put(grammarAccess.getGameAccess().getGroup_21_3(), "rule__Game__Group_21_3__0");
					put(grammarAccess.getDifficultyAccess().getGroup(), "rule__Difficulty__Group__0");
					put(grammarAccess.getDifficultyAccess().getGroup_5(), "rule__Difficulty__Group_5__0");
					put(grammarAccess.getDifficultyAccess().getGroup_5_3(), "rule__Difficulty__Group_5_3__0");
					put(grammarAccess.getDifficultyAccess().getGroup_6(), "rule__Difficulty__Group_6__0");
					put(grammarAccess.getPlayerAccess().getGroup(), "rule__Player__Group__0");
					put(grammarAccess.getPlayerAccess().getGroup_3(), "rule__Player__Group_3__0");
					put(grammarAccess.getPlayerAccess().getGroup_4(), "rule__Player__Group_4__0");
					put(grammarAccess.getElementJeuFactAccess().getGroup(), "rule__ElementJeuFact__Group__0");
					put(grammarAccess.getPeopleAccess().getGroup(), "rule__People__Group__0");
					put(grammarAccess.getPeopleAccess().getGroup_7(), "rule__People__Group_7__0");
					put(grammarAccess.getPeopleAccess().getGroup_10(), "rule__People__Group_10__0");
					put(grammarAccess.getPathAccess().getGroup(), "rule__Path__Group__0");
					put(grammarAccess.getPathAccess().getGroup_7(), "rule__Path__Group_7__0");
					put(grammarAccess.getPathAccess().getGroup_12(), "rule__Path__Group_12__0");
					put(grammarAccess.getPathAccess().getGroup_15(), "rule__Path__Group_15__0");
					put(grammarAccess.getPathAccess().getGroup_16(), "rule__Path__Group_16__0");
					put(grammarAccess.getPathAccess().getGroup_17(), "rule__Path__Group_17__0");
					put(grammarAccess.getItemAccess().getGroup(), "rule__Item__Group__0");
					put(grammarAccess.getItemAccess().getGroup_9(), "rule__Item__Group_9__0");
					put(grammarAccess.getItemAccess().getGroup_16(), "rule__Item__Group_16__0");
					put(grammarAccess.getItemAccess().getGroup_17(), "rule__Item__Group_17__0");
					put(grammarAccess.getItemAccess().getGroup_18(), "rule__Item__Group_18__0");
					put(grammarAccess.getItemInSomethingAccess().getGroup(), "rule__ItemInSomething__Group__0");
					put(grammarAccess.getRecipeAccess().getGroup(), "rule__Recipe__Group__0");
					put(grammarAccess.getRecipeAccess().getGroup_5(), "rule__Recipe__Group_5__0");
					put(grammarAccess.getKnowledgeAccess().getGroup(), "rule__Knowledge__Group__0");
					put(grammarAccess.getKnowledgeAccess().getGroup_7(), "rule__Knowledge__Group_7__0");
					put(grammarAccess.getKnowledgeAccess().getGroup_10(), "rule__Knowledge__Group_10__0");
					put(grammarAccess.getKnowledgeAccess().getGroup_11(), "rule__Knowledge__Group_11__0");
					put(grammarAccess.getPlaceAccess().getGroup(), "rule__Place__Group__0");
					put(grammarAccess.getPlaceAccess().getGroup_3(), "rule__Place__Group_3__0");
					put(grammarAccess.getPlaceAccess().getGroup_4(), "rule__Place__Group_4__0");
					put(grammarAccess.getPlaceAccess().getGroup_5(), "rule__Place__Group_5__0");
					put(grammarAccess.getPlaceAccess().getGroup_6(), "rule__Place__Group_6__0");
					put(grammarAccess.getItemInConditionAccess().getGroup(), "rule__ItemInCondition__Group__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getConditionAccess().getGroup_5(), "rule__Condition__Group_5__0");
					put(grammarAccess.getConditionAccess().getGroup_6(), "rule__Condition__Group_6__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getActionAccess().getGroup_7(), "rule__Action__Group_7__0");
					put(grammarAccess.getActionAccess().getGroup_8(), "rule__Action__Group_8__0");
					put(grammarAccess.getActionAccess().getGroup_9(), "rule__Action__Group_9__0");
					put(grammarAccess.getActionAccess().getGroup_10(), "rule__Action__Group_10__0");
					put(grammarAccess.getInteractionAccess().getGroup(), "rule__Interaction__Group__0");
					put(grammarAccess.getInteractionAccess().getGroup_7(), "rule__Interaction__Group_7__0");
					put(grammarAccess.getInteractionAccess().getGroup_8(), "rule__Interaction__Group_8__0");
					put(grammarAccess.getPropositionAccess().getGroup(), "rule__Proposition__Group__0");
					put(grammarAccess.getGameAccess().getNameAssignment_1(), "rule__Game__NameAssignment_1");
					put(grammarAccess.getGameAccess().getPlayerAssignment_3(), "rule__Game__PlayerAssignment_3");
					put(grammarAccess.getGameAccess().getPlacesAssignment_6(), "rule__Game__PlacesAssignment_6");
					put(grammarAccess.getGameAccess().getPlacesAssignment_7_1(), "rule__Game__PlacesAssignment_7_1");
					put(grammarAccess.getGameAccess().getKnowledgeAssignment_9_2(), "rule__Game__KnowledgeAssignment_9_2");
					put(grammarAccess.getGameAccess().getKnowledgeAssignment_9_3_1(), "rule__Game__KnowledgeAssignment_9_3_1");
					put(grammarAccess.getGameAccess().getPeopleAssignment_12(), "rule__Game__PeopleAssignment_12");
					put(grammarAccess.getGameAccess().getPeopleAssignment_13_1(), "rule__Game__PeopleAssignment_13_1");
					put(grammarAccess.getGameAccess().getItemsAssignment_15_2(), "rule__Game__ItemsAssignment_15_2");
					put(grammarAccess.getGameAccess().getItemsAssignment_15_3_1(), "rule__Game__ItemsAssignment_15_3_1");
					put(grammarAccess.getGameAccess().getPathAssignment_18(), "rule__Game__PathAssignment_18");
					put(grammarAccess.getGameAccess().getPathAssignment_19_1(), "rule__Game__PathAssignment_19_1");
					put(grammarAccess.getGameAccess().getRecipesAssignment_21_2(), "rule__Game__RecipesAssignment_21_2");
					put(grammarAccess.getGameAccess().getRecipesAssignment_21_3_1(), "rule__Game__RecipesAssignment_21_3_1");
					put(grammarAccess.getGameAccess().getStartPlaceAssignment_23(), "rule__Game__StartPlaceAssignment_23");
					put(grammarAccess.getGameAccess().getEndPlaceAssignment_25(), "rule__Game__EndPlaceAssignment_25");
					put(grammarAccess.getGameAccess().getDifficultyAssignment_26(), "rule__Game__DifficultyAssignment_26");
					put(grammarAccess.getDifficultyAccess().getLvlAssignment_1(), "rule__Difficulty__LvlAssignment_1");
					put(grammarAccess.getDifficultyAccess().getSizeMaxAssignment_4(), "rule__Difficulty__SizeMaxAssignment_4");
					put(grammarAccess.getDifficultyAccess().getItemsAssignment_5_2(), "rule__Difficulty__ItemsAssignment_5_2");
					put(grammarAccess.getDifficultyAccess().getItemsAssignment_5_3_1(), "rule__Difficulty__ItemsAssignment_5_3_1");
					put(grammarAccess.getDifficultyAccess().getKnowledgesAssignment_6_1(), "rule__Difficulty__KnowledgesAssignment_6_1");
					put(grammarAccess.getPlayerAccess().getNameAssignment_1(), "rule__Player__NameAssignment_1");
					put(grammarAccess.getPlayerAccess().getItemsAssignment_3_1(), "rule__Player__ItemsAssignment_3_1");
					put(grammarAccess.getPlayerAccess().getKnowledgeAssignment_4_1(), "rule__Player__KnowledgeAssignment_4_1");
					put(grammarAccess.getElementJeuFactAccess().getDescriptionAssignment_1(), "rule__ElementJeuFact__DescriptionAssignment_1");
					put(grammarAccess.getElementJeuFactAccess().getVisibleAssignment_3(), "rule__ElementJeuFact__VisibleAssignment_3");
					put(grammarAccess.getElementJeuFactAccess().getCondAssignment_5(), "rule__ElementJeuFact__CondAssignment_5");
					put(grammarAccess.getPeopleAccess().getNameAssignment_1(), "rule__People__NameAssignment_1");
					put(grammarAccess.getPeopleAccess().getDescriptionAssignment_4(), "rule__People__DescriptionAssignment_4");
					put(grammarAccess.getPeopleAccess().getVisibleAssignment_6(), "rule__People__VisibleAssignment_6");
					put(grammarAccess.getPeopleAccess().getConditionsVisibleAssignment_7_1(), "rule__People__ConditionsVisibleAssignment_7_1");
					put(grammarAccess.getPeopleAccess().getActiveAssignment_9(), "rule__People__ActiveAssignment_9");
					put(grammarAccess.getPeopleAccess().getConditionsActiveAssignment_10_1(), "rule__People__ConditionsActiveAssignment_10_1");
					put(grammarAccess.getPeopleAccess().getIsMandatoryAssignment_12(), "rule__People__IsMandatoryAssignment_12");
					put(grammarAccess.getPeopleAccess().getInteractionAssignment_13(), "rule__People__InteractionAssignment_13");
					put(grammarAccess.getPathAccess().getNameAssignment_1(), "rule__Path__NameAssignment_1");
					put(grammarAccess.getPathAccess().getDescriptionAssignment_4(), "rule__Path__DescriptionAssignment_4");
					put(grammarAccess.getPathAccess().getVisibleAssignment_6(), "rule__Path__VisibleAssignment_6");
					put(grammarAccess.getPathAccess().getConditionVisibleAssignment_7_1(), "rule__Path__ConditionVisibleAssignment_7_1");
					put(grammarAccess.getPathAccess().getEndPlaceAssignment_9(), "rule__Path__EndPlaceAssignment_9");
					put(grammarAccess.getPathAccess().getIsOpenAssignment_11(), "rule__Path__IsOpenAssignment_11");
					put(grammarAccess.getPathAccess().getConditionsOpeningAssignment_12_1(), "rule__Path__ConditionsOpeningAssignment_12_1");
					put(grammarAccess.getPathAccess().getIsMandatoryAssignment_14(), "rule__Path__IsMandatoryAssignment_14");
					put(grammarAccess.getPathAccess().getKnowledgeGivenAssignment_15_1(), "rule__Path__KnowledgeGivenAssignment_15_1");
					put(grammarAccess.getPathAccess().getItemsGivenAssignment_16_1(), "rule__Path__ItemsGivenAssignment_16_1");
					put(grammarAccess.getPathAccess().getItemsConsumedAssignment_17_1(), "rule__Path__ItemsConsumedAssignment_17_1");
					put(grammarAccess.getItemAccess().getNameAssignment_1(), "rule__Item__NameAssignment_1");
					put(grammarAccess.getItemAccess().getSizeAssignment_4(), "rule__Item__SizeAssignment_4");
					put(grammarAccess.getItemAccess().getDescriptionAssignment_6(), "rule__Item__DescriptionAssignment_6");
					put(grammarAccess.getItemAccess().getVisibleAssignment_8(), "rule__Item__VisibleAssignment_8");
					put(grammarAccess.getItemAccess().getConditionsVisibleAssignment_9_1(), "rule__Item__ConditionsVisibleAssignment_9_1");
					put(grammarAccess.getItemAccess().getActiveAssignment_11(), "rule__Item__ActiveAssignment_11");
					put(grammarAccess.getItemAccess().getConditionsActiveAssignment_13(), "rule__Item__ConditionsActiveAssignment_13");
					put(grammarAccess.getItemAccess().getCanPutDownAssignment_15(), "rule__Item__CanPutDownAssignment_15");
					put(grammarAccess.getItemAccess().getConditionsPutDownAssignment_16_1(), "rule__Item__ConditionsPutDownAssignment_16_1");
					put(grammarAccess.getItemAccess().getConditionsGiveAssignment_17_1(), "rule__Item__ConditionsGiveAssignment_17_1");
					put(grammarAccess.getItemAccess().getConditionsConsumedAssignment_18_1(), "rule__Item__ConditionsConsumedAssignment_18_1");
					put(grammarAccess.getItemInSomethingAccess().getItemAssignment_0(), "rule__ItemInSomething__ItemAssignment_0");
					put(grammarAccess.getItemInSomethingAccess().getQuantiteAssignment_2(), "rule__ItemInSomething__QuantiteAssignment_2");
					put(grammarAccess.getRecipeAccess().getNameAssignment_1(), "rule__Recipe__NameAssignment_1");
					put(grammarAccess.getRecipeAccess().getObjectsUsedAssignment_4(), "rule__Recipe__ObjectsUsedAssignment_4");
					put(grammarAccess.getRecipeAccess().getConditionsAssignment_5_1(), "rule__Recipe__ConditionsAssignment_5_1");
					put(grammarAccess.getRecipeAccess().getItemsMadeAssignment_7(), "rule__Recipe__ItemsMadeAssignment_7");
					put(grammarAccess.getKnowledgeAccess().getNameAssignment_1(), "rule__Knowledge__NameAssignment_1");
					put(grammarAccess.getKnowledgeAccess().getDescriptionAssignment_4(), "rule__Knowledge__DescriptionAssignment_4");
					put(grammarAccess.getKnowledgeAccess().getVisibleAssignment_6(), "rule__Knowledge__VisibleAssignment_6");
					put(grammarAccess.getKnowledgeAccess().getConditionsVisibleAssignment_7_1(), "rule__Knowledge__ConditionsVisibleAssignment_7_1");
					put(grammarAccess.getKnowledgeAccess().getActiveAssignment_9(), "rule__Knowledge__ActiveAssignment_9");
					put(grammarAccess.getKnowledgeAccess().getConditionsActiveAssignment_10_1(), "rule__Knowledge__ConditionsActiveAssignment_10_1");
					put(grammarAccess.getKnowledgeAccess().getConditionsGiveAssignment_11_1(), "rule__Knowledge__ConditionsGiveAssignment_11_1");
					put(grammarAccess.getPlaceAccess().getNameAssignment_1(), "rule__Place__NameAssignment_1");
					put(grammarAccess.getPlaceAccess().getKnowledgesAssignment_3_1(), "rule__Place__KnowledgesAssignment_3_1");
					put(grammarAccess.getPlaceAccess().getPeopleAssignment_4_1(), "rule__Place__PeopleAssignment_4_1");
					put(grammarAccess.getPlaceAccess().getPathsAssignment_5_1(), "rule__Place__PathsAssignment_5_1");
					put(grammarAccess.getPlaceAccess().getObjectsAssignment_6_1(), "rule__Place__ObjectsAssignment_6_1");
					put(grammarAccess.getItemInConditionAccess().getItemAssignment_0(), "rule__ItemInCondition__ItemAssignment_0");
					put(grammarAccess.getItemInConditionAccess().getQuantityAssignment_2(), "rule__ItemInCondition__QuantityAssignment_2");
					put(grammarAccess.getItemInConditionAccess().getMustBeExactAssignment_4(), "rule__ItemInCondition__MustBeExactAssignment_4");
					put(grammarAccess.getConditionAccess().getNameAssignment_1(), "rule__Condition__NameAssignment_1");
					put(grammarAccess.getConditionAccess().getPlayerAssignment_4(), "rule__Condition__PlayerAssignment_4");
					put(grammarAccess.getConditionAccess().getKnowAssignment_5_1(), "rule__Condition__KnowAssignment_5_1");
					put(grammarAccess.getConditionAccess().getItemAssignment_6_1(), "rule__Condition__ItemAssignment_6_1");
					put(grammarAccess.getActionAccess().getNameAssignment_1(), "rule__Action__NameAssignment_1");
					put(grammarAccess.getActionAccess().getValAssignment_4(), "rule__Action__ValAssignment_4");
					put(grammarAccess.getActionAccess().getInterSuivanteAssignment_6(), "rule__Action__InterSuivanteAssignment_6");
					put(grammarAccess.getActionAccess().getKnowledgeGivenAssignment_7_1(), "rule__Action__KnowledgeGivenAssignment_7_1");
					put(grammarAccess.getActionAccess().getItemsGivenAssignment_8_1(), "rule__Action__ItemsGivenAssignment_8_1");
					put(grammarAccess.getActionAccess().getItemsConsumedAssignment_9_1(), "rule__Action__ItemsConsumedAssignment_9_1");
					put(grammarAccess.getActionAccess().getConditionsActionsAvailableAssignment_10_1(), "rule__Action__ConditionsActionsAvailableAssignment_10_1");
					put(grammarAccess.getActionAccess().getGameAssignment_12(), "rule__Action__GameAssignment_12");
					put(grammarAccess.getInteractionAccess().getNameAssignment_1(), "rule__Interaction__NameAssignment_1");
					put(grammarAccess.getInteractionAccess().getPropAssignment_5(), "rule__Interaction__PropAssignment_5");
					put(grammarAccess.getInteractionAccess().getConditionsBeginAssignment_7_1(), "rule__Interaction__ConditionsBeginAssignment_7_1");
					put(grammarAccess.getInteractionAccess().getConditionsEndAssignment_8_1(), "rule__Interaction__ConditionsEndAssignment_8_1");
					put(grammarAccess.getPropositionAccess().getValueAssignment_3(), "rule__Proposition__ValueAssignment_3");
					put(grammarAccess.getPropositionAccess().getActAssignment_4(), "rule__Proposition__ActAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalGamesParser typedParser = (InternalGamesParser) parser;
			typedParser.entryRuleGame();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GamesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GamesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
