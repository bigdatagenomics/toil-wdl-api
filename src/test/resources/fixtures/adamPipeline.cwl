cwlVersion: "cwl:draft-3"
class: "CommandLineTool"
baseCommand:
- "/bin/bash"
- "/work/convert_adam.sh"
inputs:
- id: "inputBam"
  type: "File"
  inputBinding:
    position: 2
- id: "outputBamFilename"
  type: "string"
  inputBinding:
    position: 3
outputs:
- id: "outputBam"
  type: "File"
  outputBinding:
    glob: "$(inputs.outputBamFilename).tgz"
