# glsp


## Pipeline

  Model (A): glspFeatures - GLSP feature tree <br>
  User's Metamodel (B) <br>
  Model (C): viewpointModel - user configures meta information <br>
  Model (D): metamodel specific feature tree (D1) + empty metamodel specific feature tree configuration (D2) <br>
  Transformation I (A + B + C -> D): GLSPFeatureTree2MetamodelSpecificFeatureTree <br>
  <br>
  <br>
  User's Feature Selection -> metamodel specific feature tree configuration (D2) <br>
  <br>
  <br>
  Model(E): glspComponentModel - GLSP component model <br>
  Transformation II (D2 -> E): MetamodelSpecificFeatureTree2ComponentModel <br>
  <br>
  <br>
  Transformation III (E + B + C -> Java Code) ComponentModel2Code <br>


## Gradle Usage

  copy metamodel src-gen folder into /epsilonGradle/model/ComponentModel2Code/target/glsp/glsp-server <br>
  <br>
  <br>
  start commands in /epsilonGradle: <br>
  <br>
  Transformation I : .\gradlew transformFeatureTree <br>
  (user selects features) <br>
  Transformation II : .\gradlew transformMetamodelSpecificFeatureTree <br>
  Transformation III : .\gradlew transformComponentModel <br>