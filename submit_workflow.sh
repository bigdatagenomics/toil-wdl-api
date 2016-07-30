#!/bin/bash

curl -v -XPOST -F "wdlSource=@workflow.wdl" -F "workflowInputs=@inputs.yml" -F "workflowOptions=" -H "Accept: text/plain" -H "Content-Type: multipart/form-data" http://localhost:8080/api/workflows/v1 
