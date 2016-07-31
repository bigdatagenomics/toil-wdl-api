#!/bin/bash

WORKFLOW=${1:-workflow.wdl}
INPUTS=${2:-inputs.yml}

curl -XPOST -F "wdlSource=@${WORKFLOW}" -F "workflowInputs=@${INPUTS}" -F "workflowOptions=" -H "Accept: text/plain" -H "Content-Type: multipart/form-data" http://localhost:8080/api/workflows/v1 

