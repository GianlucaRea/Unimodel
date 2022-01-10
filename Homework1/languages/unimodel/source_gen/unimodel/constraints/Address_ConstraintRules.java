package unimodel.constraints;

/*Generated by MPS */

import jetbrains.mps.core.aspects.constraints.rules.BaseRulesConstraintsDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.constraints.rules.Rule;
import jetbrains.mps.core.aspects.constraints.rules.kinds.ContainmentContext;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.core.aspects.constraints.rules.BaseRule;
import org.jetbrains.mps.openapi.model.SNodeReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.core.aspects.constraints.rules.RuleId;
import jetbrains.mps.core.aspects.constraints.rules.kinds.PredefinedRuleKinds;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SProperty;

public final class Address_ConstraintRules extends BaseRulesConstraintsDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b538L, "unimodel.structure.Address");

  public static final Rule<ContainmentContext> check_id342464601220395635 = new Rule_Only_Letters_Country();
  public static final Rule<ContainmentContext> check_id342464601220595591 = new Rule_Only_Letters_State();
  public static final Rule<ContainmentContext> check_id342464601220607542 = new Rule_Only_Letters_City();
  public static final Rule<ContainmentContext> check_id342464601220616541 = new Rule_Post_Code_Only_Digits();
  public static final Rule<ContainmentContext> check_id342464601220624942 = new Rule_Post_Code_Length();
  public static final Rule<ContainmentContext> check_id8742999790642899071 = new Rule_ID_Positive();

  private static final List<Rule<?>> RULES = Collections.unmodifiableList(Arrays.<Rule<?>>asList(check_id342464601220395635, check_id342464601220595591, check_id342464601220607542, check_id342464601220616541, check_id342464601220624942, check_id8742999790642899071));

  @NotNull
  @Override
  public List<Rule<?>> getDeclaredRules() {
    return RULES;
  }

  public static final class Rule_Only_Letters_Country extends BaseRule<ContainmentContext> {
    private static final SNodeReference SOURCE_NODE_REF = PersistenceFacade.getInstance().createNodeReference("r:18f26838-7640-4eda-91b6-ad750b54a45f(unimodel.constraints)/342464601220395635");
    public static final RuleId ID_Only_Letters_Country = new RuleId(342464601220395635L, SOURCE_NODE_REF);

    public Rule_Only_Letters_Country() {
      super(CONCEPT, PredefinedRuleKinds.CAN_BE_CHILD, ID_Only_Letters_Country, SOURCE_NODE_REF);
    }

    @Override
    public boolean check(@NotNull ContainmentContext context) {
      return SPropertyOperations.getString(context.getChildNode(), PROPS.country$N3rs).matches("[a-zA-Z' ]+");
    }

    @Override
    public boolean appliesTo(@NotNull ContainmentContext context) {
      return true;
    }
  }

  public static final class Rule_Only_Letters_State extends BaseRule<ContainmentContext> {
    private static final SNodeReference SOURCE_NODE_REF = PersistenceFacade.getInstance().createNodeReference("r:18f26838-7640-4eda-91b6-ad750b54a45f(unimodel.constraints)/342464601220595591");
    public static final RuleId ID_Only_Letters_State = new RuleId(342464601220595591L, SOURCE_NODE_REF);

    public Rule_Only_Letters_State() {
      super(CONCEPT, PredefinedRuleKinds.CAN_BE_CHILD, ID_Only_Letters_State, SOURCE_NODE_REF);
    }

    @Override
    public boolean check(@NotNull ContainmentContext context) {
      return SPropertyOperations.getString(context.getChildNode(), PROPS.state$N8ON).matches("[a-zA-Z' ]+");
    }

    @Override
    public boolean appliesTo(@NotNull ContainmentContext context) {
      return true;
    }
  }

  public static final class Rule_Only_Letters_City extends BaseRule<ContainmentContext> {
    private static final SNodeReference SOURCE_NODE_REF = PersistenceFacade.getInstance().createNodeReference("r:18f26838-7640-4eda-91b6-ad750b54a45f(unimodel.constraints)/342464601220607542");
    public static final RuleId ID_Only_Letters_City = new RuleId(342464601220607542L, SOURCE_NODE_REF);

    public Rule_Only_Letters_City() {
      super(CONCEPT, PredefinedRuleKinds.CAN_BE_CHILD, ID_Only_Letters_City, SOURCE_NODE_REF);
    }

    @Override
    public boolean check(@NotNull ContainmentContext context) {
      return SPropertyOperations.getString(context.getChildNode(), PROPS.city$N9xQ).matches("[a-zA-Z' ]+");
    }

    @Override
    public boolean appliesTo(@NotNull ContainmentContext context) {
      return true;
    }
  }

  public static final class Rule_Post_Code_Only_Digits extends BaseRule<ContainmentContext> {
    private static final SNodeReference SOURCE_NODE_REF = PersistenceFacade.getInstance().createNodeReference("r:18f26838-7640-4eda-91b6-ad750b54a45f(unimodel.constraints)/342464601220616541");
    public static final RuleId ID_Post_Code_Only_Digits = new RuleId(342464601220616541L, SOURCE_NODE_REF);

    public Rule_Post_Code_Only_Digits() {
      super(CONCEPT, PredefinedRuleKinds.CAN_BE_CHILD, ID_Post_Code_Only_Digits, SOURCE_NODE_REF);
    }

    @Override
    public boolean check(@NotNull ContainmentContext context) {
      return SPropertyOperations.getString(context.getChildNode(), PROPS.post_code$NatU).matches("[0-9]+");
    }

    @Override
    public boolean appliesTo(@NotNull ContainmentContext context) {
      return true;
    }
  }

  public static final class Rule_Post_Code_Length extends BaseRule<ContainmentContext> {
    private static final SNodeReference SOURCE_NODE_REF = PersistenceFacade.getInstance().createNodeReference("r:18f26838-7640-4eda-91b6-ad750b54a45f(unimodel.constraints)/342464601220624942");
    public static final RuleId ID_Post_Code_Length = new RuleId(342464601220624942L, SOURCE_NODE_REF);

    public Rule_Post_Code_Length() {
      super(CONCEPT, PredefinedRuleKinds.CAN_BE_CHILD, ID_Post_Code_Length, SOURCE_NODE_REF);
    }

    @Override
    public boolean check(@NotNull ContainmentContext context) {
      return SPropertyOperations.getString(context.getChildNode(), PROPS.post_code$NatU).length() == 5;
    }

    @Override
    public boolean appliesTo(@NotNull ContainmentContext context) {
      return true;
    }
  }

  public static final class Rule_ID_Positive extends BaseRule<ContainmentContext> {
    private static final SNodeReference SOURCE_NODE_REF = PersistenceFacade.getInstance().createNodeReference("r:18f26838-7640-4eda-91b6-ad750b54a45f(unimodel.constraints)/8742999790642899071");
    public static final RuleId ID_ID_Positive = new RuleId(8742999790642899071L, SOURCE_NODE_REF);

    public Rule_ID_Positive() {
      super(CONCEPT, PredefinedRuleKinds.CAN_BE_CHILD, ID_ID_Positive, SOURCE_NODE_REF);
    }

    @Override
    public boolean check(@NotNull ContainmentContext context) {
      return SPropertyOperations.getInteger(context.getChildNode(), PROPS.id$v$QZ) >= 1;
    }

    @Override
    public boolean appliesTo(@NotNull ContainmentContext context) {
      return true;
    }
  }

  /*package*/ Address_ConstraintRules() {
    super(CONCEPT);
  }

  private static final class PROPS {
    /*package*/ static final SProperty country$N3rs = MetaAdapterFactory.getProperty(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b538L, 0x79555ffcb891b53cL, "country");
    /*package*/ static final SProperty state$N8ON = MetaAdapterFactory.getProperty(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b538L, 0x79555ffcb891b53eL, "state");
    /*package*/ static final SProperty city$N9xQ = MetaAdapterFactory.getProperty(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b538L, 0x79555ffcb891b541L, "city");
    /*package*/ static final SProperty post_code$NatU = MetaAdapterFactory.getProperty(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b538L, 0x79555ffcb891b545L, "post_code");
    /*package*/ static final SProperty id$v$QZ = MetaAdapterFactory.getProperty(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b538L, 0x79555ffcb891b8e6L, "id");
  }
}