#!/bin/bash

INPUT_FILENAME=$1

UNZIPPED_FILENAME="${INPUT_FILENAME%.*}"
OUTPUT_FILENAME="${UNZIPPED_FILENAME%.*}.bam"

echo "INPUT: ${INPUT_FILENAME}" 
echo "OUTPUT: ${OUTPUT_FILENAME}"

tar -xvzf $INPUT_FILENAME

/opt/cgl-docker-lib/adam/bin/adam-submit --master "local[*]" \
--conf "spark.driver.memory=1g" \
--conf "spark.executor.memory=1g" \
--conf "spark.driver.maxResultSize=0" \
--  \
transform $UNZIPPED_FILENAME $OUTPUT_FILENAME -sort_reads -single

rm -rf $UNZIPPED_FILENAME "${UNZIPPED_FILENAME}.seqdict" "${UNZIPPED_FILENAME}.rgdict"

