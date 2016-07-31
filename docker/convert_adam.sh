#!/bin/bash 

INPUT_FILENAME=$1
OUTPUT_FILENAME="${INPUT_FILENAME%.*}.adam"

echo "INPUT: ${INPUT_FILENAME}" 
echo "OUTPUT: ${OUTPUT_FILENAME}"

/opt/cgl-docker-lib/adam/bin/adam-submit --master "local[*]" \
--conf "spark.driver.memory=1g" \
--conf "spark.executor.memory=1g" \
--conf "spark.driver.maxResultSize=0" \
--  \
transform $INPUT_FILENAME $OUTPUT_FILENAME

tar -c ${OUTPUT_FILENAME} "${OUTPUT_FILENAME}.seqdict" "${OUTPUT_FILENAME}.rgdict" | gzip > "${OUTPUT_FILENAME}.tgz"

rm -rf "${OUTPUT_FILENAME}" "${OUTPUT_FILENAME}.seqdict" "${OUTPUT_FILENAME}.rgdict"

