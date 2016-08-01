#!/bin/bash -x

DIR=$(dirname "$1")
INPUT_FILENAME=$(basename "$1")
OUTPUT_FILENAME="${INPUT_FILENAME%.*}.adam"

echo "DIR: ${DIR}" 
echo "INPUT: ${INPUT_FILENAME}" 
echo "OUTPUT: ${OUTPUT_FILENAME}"

/opt/cgl-docker-lib/adam/bin/adam-submit --master "local[*]" \
--conf "spark.driver.memory=1g" \
--conf "spark.executor.memory=1g" \
--conf "spark.driver.maxResultSize=0" \
--  \
transform "${DIR}/$INPUT_FILENAME" "${DIR}/$OUTPUT_FILENAME"

tar -c "${DIR}/${OUTPUT_FILENAME}" "${DIR}/${OUTPUT_FILENAME}.seqdict" "${DIR}/${OUTPUT_FILENAME}.rgdict" | gzip > "${OUTPUT_FILENAME}.tgz"

rm -rf "${OUTPUT_FILENAME}" "${OUTPUT_FILENAME}.seqdict" "${OUTPUT_FILENAME}.rgdict"

