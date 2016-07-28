FROM java:8-jre
#FROM quay.io/ucsc_cgl/adam-pipeline

RUN apt-get update && apt-get install -y python-pip python-dev build-essential
RUN pip install cwlref-runner "toil[cwl]"

WORKDIR /work
EXPOSE 8080
ADD toil-wdl-api-1.0-SNAPSHOT.jar /work/

CMD ["java", "-jar", "/work/toil-wdl-api-1.0-SNAPSHOT.jar", "server"]

#ENTRYPOINT /bin/bash


