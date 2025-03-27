# glsp


## Prerequisites

  - Java >= 17 (17 used)
  - Node.js = 20 (20.19 used)
  - Yarn >=1.7.0 < 2.x.x (1.22 used)
  
  - Theia prerequisites: 
  https://github.com/eclipse-theia/theia/blob/master/doc/Developing.md#prerequisites
  
  in Linux:
  - Python3 < 3.12 OR 3.12 with python3-setuptools
  - libsecret-1-dev
  - gnupg


## start tasklist example (tasklist branch)

  1.) clone tasklist branch
  ``git clone -b tasklist https://github.com/Botchi24/glsp.git``
  
  2.) build server + client
  ``cd glsp\epsilonGradle\model\ComponentModel2Code\target\glsp``
  ``yarn build``
  
  3.) start server + client
  ``cd glsp\epsilonGradle\model\ComponentModel2Code\target\glsp\glsp-client``
  ``yarn start``

  4.) open http://127.0.0.1:3000/ in browser


## Pipeline Usage with Gradle

  
  Transformation 0 : <br>
  delete /epsilonGradle/scripts/Metamodel2ViewpointModel/viewpointModel.viewpointModel <br>
  execute in /epsilonGradle : .\gradlew prepareSettings <br>
  revise viewpointModel.viewpointModel <br>
  copy viewpointModel.viewpointModel into /epsilonGradle/model <br>
  <br>
  
  Transformation I : <br>
  delete /epsilonGradle/model/GLSPFeatureTree2MetamodelSpecificFeatureTree/target/MetamodelSpecificFeatureTree.xml <br>
  execute in /epsilonGradle : .\gradlew prepareMetamodelSpecificFeatureTree <br>
  open /epsilonGradle/model/GLSPFeatureTree2MetamodelSpecificFeatureTree/target/configs/default.xml <br>
  select your features until a valid configuration and save file <br>
  <br>
  
  Transformation II : <br>
  delete /epsilonGradle/model/MetamodelSpecificFeatureTree2ComponentModel/target/componentModel.componentModel <br>
  execute in /epsilonGradle : .\gradlew createComponentModel <br>
  <br>
  
  Transformation III : <br>
  delete /epsilonGradle/model/ComponentModel2Code/target/glsp folder <br>
  create empty /epsilonGradle/model/ComponentModel2Code/target/glsp/glsp-server folder <br>
  copy /epsilonGradle/metamodel/tasklist/src-gen folder into /epsilonGradle/model/ComponentModel2Code/target/glsp/glsp-server <br>
  execute in /epsilonGradle : .\gradlew createEditor <br>
  