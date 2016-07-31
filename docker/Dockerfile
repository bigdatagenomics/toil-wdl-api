FROM quay.io/ucsc_cgl/adam-pipeline
#FROM java:8-jre

RUN apt-get update && apt-get install -y python-setuptools python-dev build-essential
#RUN easy_install pip
RUN pip install --upgrade setuptools==25.1.1 
RUN pip install --upgrade cwlref-runner 
RUN pip install --upgrade "toil[cwl]"

WORKDIR /work
EXPOSE 8080
ADD toil-wdl-api-1.0-SNAPSHOT.jar /work/
ADD adam_test.cwl /work/ 
ADD adamPipeline.cwl /work/
ADD inputs.yml /work/ 
ADD start_server.sh /work/

ADD convert_adam.sh /work/
ADD mark_duplicates.sh /work/
ADD convert_bam.sh /work/

CMD ["/work/start_server.sh"]

#ENTRYPOINT /bin/bash


