package unimodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Address = 0;
  public static final int Book = 1;
  public static final int Building = 2;
  public static final int Class = 3;
  public static final int Floor = 4;
  public static final int Library = 5;
  public static final int Loans = 6;
  public static final int Office = 7;
  public static final int Person = 8;
  public static final int Room = 9;
  public static final int University = 10;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x6069f38ad5c2473eL, 0xbe656672ae45792cL);
    builder.put(0x79555ffcb891b538L, Address);
    builder.put(0x79555ffcb891b57fL, Book);
    builder.put(0x79555ffcb891b530L, Building);
    builder.put(0x79555ffcb891b5e6L, Class);
    builder.put(0x79555ffcb891b53bL, Floor);
    builder.put(0x79555ffcb891b557L, Library);
    builder.put(0x79555ffcb891b58bL, Loans);
    builder.put(0x79555ffcb891b5aeL, Office);
    builder.put(0x79555ffcb891b5f5L, Person);
    builder.put(0x79555ffcb891b5a6L, Room);
    builder.put(0x79555ffcb891b526L, University);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
