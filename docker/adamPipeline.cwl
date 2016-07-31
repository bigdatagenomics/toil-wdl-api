cwlVersion: "cwl:draft-3"
class: "CommandLineTool"
baseCommand: "python"
inputs:
- id: "inputBam"
  type: "string"
  inputBinding:
    position: 3
- id: "knownSites"
  type: "string"
  inputBinding:
    position: 5
- id: "memory"
  type: "int"
  inputBinding:
    position: 7
arguments: 
- position: 2
  valueFrom: "--sample" 
- position: 4
  valueFrom: "--knownSites"
- position: 6
  valueFrom: "--memory"
outputs:
- id: "outputBam"
