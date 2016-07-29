#!/bin/bash

NAME=toil-wdl-api
DIR=docker
TAG=latest

docker tag $NAME quay.io/tdanford/toil-wdl-api:$TAG
docker push quay.io/tdanford/toil-wdl-api:$TAG

