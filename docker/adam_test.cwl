cwlVersion: "cwl:draft-3"
class: "Workflow"
inputs:
- id: "inputBam"
  type: "File"
- id: "knownSites"
  type: "File"
- id: "memory"
  type: "int"
- id: "outputBam"
  type: "File" 
outputs:
- id: "outputBam"
  type: "File"
  source: "#adamPipeline/output"
steps:
- id: "adamPipeline"
  run: "adamPipeline.cwl"
  inputs:
  - id: "inputBam"
    source: "#inputBam"
  - id: "knownSites"
    source: "#knownSites"
  - id: "memory"
    source: "#memory"
  outputs:
  - id: "outputBam"
