<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:b310ea12-fafb-4a15-846e-8239ef33c286(Playground.test)">
  <persistence version="9" />
  <languages>
    <use id="614ae6dc-3f27-404c-b394-21bcf98b0265" name="Printer" version="0" />
  </languages>
  <imports />
  <registry>
    <language id="614ae6dc-3f27-404c-b394-21bcf98b0265" name="Printer">
      <concept id="2181457300133012002" name="Printer.structure.Printer" flags="ng" index="1lmBnT">
        <child id="2181457300133047083" name="prints" index="1lmJNK" />
      </concept>
      <concept id="2181457300133046878" name="Printer.structure.PrintStatement" flags="ng" index="1lmJQ5">
        <property id="2181457300133046883" name="data" index="1lmJQS" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1lmBnT" id="1T65XHb7gUw">
    <property role="TrG5h" value="print" />
    <node concept="1lmJQ5" id="6NfKoFYZ94C" role="1lmJNK">
      <property role="1lmJQS" value="hello" />
    </node>
    <node concept="1lmJQ5" id="6NfKoFYZ94I" role="1lmJNK">
      <property role="1lmJQS" value="world" />
    </node>
  </node>
</model>

