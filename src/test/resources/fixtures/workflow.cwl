cwlVersion: cwl:draft-3
class: Workflow
inputs:
- id: inputValue
  type: string
outputs:
- id: output
  type: File
  source: '#echo/output'
steps:
- id: echo
  run: echo.cwl
  inputs:
  - id: voice
    source: '#inputValue'
  outputs:
  - id: output
