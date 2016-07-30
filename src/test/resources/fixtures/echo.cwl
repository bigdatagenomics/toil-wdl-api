cwlVersion: "cwl:draft-3"
class: "CommandLineTool"
baseCommand: "echo"
stdout: "echo_output.txt"
inputs:
- id: "voice"
  type: "string"
  inputBinding:
    position: 1
outputs:
- id: "output"
  type: "File"
  outputBinding:
    glob: "echo_output.txt"
