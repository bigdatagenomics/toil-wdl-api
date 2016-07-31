#!/bin/bash

INPUT_FILENAME=$1
UNZIPPED_FILENAME="${INPUT_FILENAME%.*}"
OUTPUT_FILENAME="${UNZIPPED_FILENAME%.*}.dedup"

echo "INPUT: ${INPUT_FILENAME}" 
echo "OUTPUT: ${OUTPUT_FILENAME}"

tar -xvzf $INPUT_FILENAME

/opt/cgl-docker-lib/adam/bin/adam-submit --master "local[*]" \
--conf "spark.driver.memory=1g" \
--conf "spark.executor.memory=1g" \
--conf "spark.driver.maxResultSize=0" \
--  \
transform ${UNZIPPED_FILENAME} ${OUTPUT_FILENAME}  \
-aligned_read_predicate \
-limit_projection   \
-mark_duplicate_reads 

rm -rf $UNZIPPED_FILENAME "${UNZIPPED_FILENAME}.seqdict" "${UNZIPPED_FILENAME}.rgdict"
tar -c $OUTPUT_FILENAME "${OUTPUT_FILENAME}.seqdict" "${OUTPUT_FILENAME}.rgdict" | gzip > "${OUTPUT_FILENAME}.tgz"
rm -rf $OUTPUT_FILENAME "${OUTPUT_FILENAME}.seqdict" "${OUTPUT_FILENAME}.rgdict" 

