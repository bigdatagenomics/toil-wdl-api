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
  source: "#adamPipeline/outputBam"
steps:
- id: "adamPipeline"
  run: "adamPipeline.cwl"
  inputs:
  - id: "inputBam"
    source: "#inputBam"
  - id: "outputBamFilename"
    source: "#outputBamFilename"
  outputs:
  - id: "outputBam"
