package unimodel.constraints;

/*Generated by MPS */

import jetbrains.mps.core.aspects.feedback.api.BaseFeedbackDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.feedback.api.FeedbackProvider;
import jetbrains.mps.core.aspects.constraints.rules.kinds.ContainmentContext;
import jetbrains.mps.core.aspects.feedback.messages.BaseMessageProvider;
import jetbrains.mps.core.aspects.feedback.messages.FailingRuleProblemId;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.core.aspects.feedback.messages.MessageProvider;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.stream.Stream;

public final class Office_ConstraintsFeedback extends BaseFeedbackDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5aeL, "unimodel.structure.Office");

  private static final FeedbackProvider<ContainmentContext> MSGPROVIDER_WhenConstraintRuleFails_5aohkc_a = new BaseMessageProvider<ContainmentContext>(new FailingRuleProblemId(Office_ConstraintRules.Rule_Capacity_Positive.ID_Capacity_Positive)) {
    @NotNull
    @Override
    public MessageProvider.Msg yieldMessage(ContainmentContext context) {
      return new MessageProvider.StringMsg("Warning: The capacity of a office cannot be less than 1");
    }
  };
  private static final FeedbackProvider<ContainmentContext> MSGPROVIDER_WhenConstraintRuleFails_5aohkc_b = new BaseMessageProvider<ContainmentContext>(new FailingRuleProblemId(Office_ConstraintRules.Rule_phone_Regex.ID_phone_Regex)) {
    @NotNull
    @Override
    public MessageProvider.Msg yieldMessage(ContainmentContext context) {
      return new MessageProvider.StringMsg("Warning: The phone number must be formed only by digits");
    }
  };
  private static final FeedbackProvider<ContainmentContext> MSGPROVIDER_WhenConstraintRuleFails_5aohkc_c = new BaseMessageProvider<ContainmentContext>(new FailingRuleProblemId(Office_ConstraintRules.Rule_phone_length.ID_phone_length)) {
    @NotNull
    @Override
    public MessageProvider.Msg yieldMessage(ContainmentContext context) {
      return new MessageProvider.StringMsg("Warning The phone length must be formed by 10 digits");
    }
  };

  private static final List<FeedbackProvider> PROVIDERS = Collections.unmodifiableList(Arrays.<FeedbackProvider>asList(MSGPROVIDER_WhenConstraintRuleFails_5aohkc_a, MSGPROVIDER_WhenConstraintRuleFails_5aohkc_b, MSGPROVIDER_WhenConstraintRuleFails_5aohkc_c));

  public Office_ConstraintsFeedback() {
    super(CONCEPT);
  }

  @NotNull
  @Override
  public Stream<FeedbackProvider> getDeclaredProviders() {
    return PROVIDERS.stream();
  }
}
