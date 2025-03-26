# glsp


## Prerequisites

  - Java = 17
  - Node.js = 20 (20.19 used)
  - Yarn >=1.7.0 < 2.x.x (1.22 used)

## start tasklist example (tasklist branch)

  1.) clone tasklist branch
  ``git clone -b tasklist https://github.com/Botchi24/glsp.git``
  
  2.) generate editor code
  ``cd glsp\epsilonGradle``
  ``.\gradlew createEditor``
  
  3.) build server + client
  ``cd glsp\epsilonGradle\model\ComponentModel2Code\target\glsp``
  ``yarn build``
  
  4.) start server + client
  ``cd glsp\epsilonGradle\model\ComponentModel2Code\target\glsp\glsp-client``
  ``yarn start``

  5.) open http://127.0.0.1:3000/ in browser

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