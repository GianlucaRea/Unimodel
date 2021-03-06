package unimodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_Type extends EnumerationDescriptorBase {

  public EnumerationDescriptor_Type() {
    super(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5b4L, "Type", "r:8a1ac2af-b452-4f6d-a997-fcde45094820(unimodel.structure)/8742999790642640308");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_PROFESSOR_OFFICE_0 = new EnumerationDescriptor.MemberDescriptor("PROFESSOR_OFFICE", "PROFESSOR_OFFICE", 0x79555ffcb891b5b5L, "r:8a1ac2af-b452-4f6d-a997-fcde45094820(unimodel.structure)/8742999790642640309");
  private final EnumerationDescriptor.MemberDescriptor myMember_PHD_ROOM_0 = new EnumerationDescriptor.MemberDescriptor("PHD_ROOM", "PHD_ROOM", 0x79555ffcb891b5b6L, "r:8a1ac2af-b452-4f6d-a997-fcde45094820(unimodel.structure)/8742999790642640310");
  private final EnumerationDescriptor.MemberDescriptor myMember_SECRETARIAT_0 = new EnumerationDescriptor.MemberDescriptor("SECRETARIAT", "SECRETARIAT", 0x79555ffcb891b5b9L, "r:8a1ac2af-b452-4f6d-a997-fcde45094820(unimodel.structure)/8742999790642640313");
  private final EnumerationDescriptor.MemberDescriptor myMember_ADMINISTRATION_0 = new EnumerationDescriptor.MemberDescriptor("ADMINISTRATION", "ADMINISTRATION", 0x79555ffcb891b5bdL, "r:8a1ac2af-b452-4f6d-a997-fcde45094820(unimodel.structure)/8742999790642640317");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x6069f38ad5c2473eL, 0xbe656672ae45792cL, 0x79555ffcb891b5b4L, 0x79555ffcb891b5b5L, 0x79555ffcb891b5b6L, 0x79555ffcb891b5b9L, 0x79555ffcb891b5bdL);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_PROFESSOR_OFFICE_0, myMember_PHD_ROOM_0, myMember_SECRETARIAT_0, myMember_ADMINISTRATION_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return myMember_PROFESSOR_OFFICE_0;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "PROFESSOR_OFFICE":
        return myMember_PROFESSOR_OFFICE_0;
      case "PHD_ROOM":
        return myMember_PHD_ROOM_0;
      case "SECRETARIAT":
        return myMember_SECRETARIAT_0;
      case "ADMINISTRATION":
        return myMember_ADMINISTRATION_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
