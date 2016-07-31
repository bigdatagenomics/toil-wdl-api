cwlVersion: "cwl:draft-3"
class: "CommandLineTool"
baseCommand: [ "/opt/cgl-docker-lib/adam/bin/adam-submit", "--master", "local[*]", "--conf", "spark.driver.memory=1g", "--conf", "spark.executor.memory=1g", "--conf", "spark.driver.maxResultSize=0", "--", "transform" ]
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
    position: 11
- id: "outputFilename" 
  type: "string" 
  inputBinding: 
    position: 12
arguments: 
- position: 13
  valueFrom: "-sort_reads"
- position: 14
  valueFrom: "-single"
outputs:
- id: "result"
  type: "File"
  outputBinding: 
    glob: "$(inputs.outputFilename)"
