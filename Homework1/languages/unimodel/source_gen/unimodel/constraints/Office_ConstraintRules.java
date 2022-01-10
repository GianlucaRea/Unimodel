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

public final class Office_ConstraintRules extends BaseRulesConstraintsDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5aeL, "unimodel.structure.Office");

  public static final Rule<ContainmentContext> check_id8742999790643036502 = new Rule_Capacity_Positive();

  private static final List<Rule<?>> RULES = Collections.unmodifiableList(Arrays.<Rule<?>>asList(check_id8742999790643036502));

  @NotNull
  @Override
  public List<Rule<?>> getDeclaredRules() {
    return RULES;
  }

  public static final class Rule_Capacity_Positive extends BaseRule<ContainmentContext> {
    private static final SNodeReference SOURCE_NODE_REF = PersistenceFacade.getInstance().createNodeReference("r:18f26838-7640-4eda-91b6-ad750b54a45f(unimodel.constraints)/8742999790643036502");
    public static final RuleId ID_Capacity_Positive = new RuleId(8742999790643036502L, SOURCE_NODE_REF);

    public Rule_Capacity_Positive() {
      super(CONCEPT, PredefinedRuleKinds.CAN_BE_CHILD, ID_Capacity_Positive, SOURCE_NODE_REF);
    }

    @Override
    public boolean check(@NotNull ContainmentContext context) {
      return SPropertyOperations.getInteger(context.getChildNode(), PROPS.capacity$TWvQ) >= 1;
    }

    @Override
    public boolean appliesTo(@NotNull ContainmentContext context) {
      return true;
    }
  }

  /*package*/ Office_ConstraintRules() {
    super(CONCEPT);
  }

  private static final class PROPS {
    /*package*/ static final SProperty capacity$TWvQ = MetaAdapterFactory.getProperty(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5aeL, 0x79555ffcb891b5e3L, "capacity");
  }
}