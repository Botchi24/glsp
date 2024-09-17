# glsp


  1. glspFeatures
        - GLSP feature tree
  2. GLSPFeatureTree2MetamodelSpecificFeatureTree
        - input: metamodel
        - output: metamodel specific feature tree + empty configuration
  3. feature tree configuration
        - input: user selects features
        - output: feature tree configuration for metamodel specific feature tree
  4. MetamodelSpecificFeatureTree2ComponentModel
        - input: feature tree configuration
        - output: instance of the GLSP component model
  5. ComponentModel2Code
        - input: component model
        - output: java code
