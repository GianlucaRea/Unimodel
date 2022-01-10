package unimodel.constraints;

/*Generated by MPS */

import jetbrains.mps.core.aspects.constraints.rules.RulesConstraintsAspect;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.constraints.rules.RulesConstraintsDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public final class GeneratedRulesConstraintsAspect implements RulesConstraintsAspect {
  @Nullable
  @Override
  public RulesConstraintsDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return new Address_ConstraintRules();
      case 1:
        return new Book_ConstraintRules();
      case 2:
        return new Building_ConstraintRules();
      case 3:
        return new Class_ConstraintRules();
      case 4:
        return new Floor_ConstraintRules();
      case 5:
        return new Library_ConstraintRules();
      case 6:
        return new Office_ConstraintRules();
      case 7:
        return new Person_ConstraintRules();
      case 8:
        return new Room_ConstraintRules();
      case 9:
        return new University_ConstraintRules();
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b538L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b57fL), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b530L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5e6L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b53bL), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b557L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5aeL), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5f5L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5a6L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b526L)).seal();
}