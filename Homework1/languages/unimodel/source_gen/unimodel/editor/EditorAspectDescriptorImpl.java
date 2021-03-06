package unimodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Address_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new Book_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new Building_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new Class_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new Floor_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new Library_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new Loans_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new Office_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new Person_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new Room_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new University_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new Office_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b538L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b57fL), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b530L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5e6L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b53bL), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b557L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b58bL), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5aeL), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5f5L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5a6L), MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b526L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5aeL)).seal();
}
