cwlVersion: "cwl:draft-3"
class: "Workflow"
inputs:
- id: "inputBam"
  type: "File"
- id: "outputBamFilename"
  type: "string"
outputs:
- id: "outputBam"
  type: "File"
  source: "#adamPipeline/result"
steps:
- id: "adamPipeline"
  run: "adamPipeline.cwl"
  inputs:
  - id: "input"
    source: "#inputBam"
  - id: "outputFilename" 
    source: "#outputBamFilename"
  outputs:
  - id: "result"
