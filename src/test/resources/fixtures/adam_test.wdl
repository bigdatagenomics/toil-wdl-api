workflow wf {

  File inputBam
  String outputBamFilename

  call adamPipeline {
    input: 
      inputBam=inputBam,
      outputBamFilename=outputBamFilename
  }
}

task adamPipeline {
  File inputBam 
  String outputBamFilename

  command {
    /bin/bash /work/convert_adam.sh ${inputBam} ${outputBamFilename}
  }

  output {
    File outputBam = "${outputBamFilename}.tgz"
  }
}
