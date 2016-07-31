cwlVersion: "cwl:draft-3"
class: "CommandLineTool"
baseCommand: [ "/work/convert_adam.sh" ]
requirements: 
- class: "ResourceRequirement"
  ramMin: 1024
- class: EnvVarRequirement
  envDef:
  - envName: SPARK_HOME
    envValue: "/opt/cgl-docker-lib/apache-spark"
inputs:
- id: "input"
  type: "File"
  inputBinding:
    position: 1
- id: "outputFilename" 
  type: "string" 
  inputBinding: 
    position: 2
outputs:
- id: "result"
  type: "File"
  outputBinding: 
    glob: "$(inputs.outputFilename).tgz"
