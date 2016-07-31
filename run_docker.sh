#!/bin/bash

BASEDIR=`pwd`

docker run -d -t --name shim -v "${BASEDIR}:/opt/shim/data" -p 8080:8080 toil-wdl-api 
