cwlVersion: cwl:draft-3
class: Workflow
inputs:
- id: voice
  type: string
outputs:
- id: said
  type: File
  source: '#echo/output'
steps:
- id: echo
  run: echo.cwl
  inputs:
  - id: voice
    source: '#voice'
  outputs:
  - id: output
