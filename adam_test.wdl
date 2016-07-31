workflow wf {
	call adamPipeline {
	  input: 
            knownSites='/opt/shim/data/small.vcf',
            inputBam='/opt/shim/data/small.sam',
            outputBam='/opt/shim/data/small.processed.bam',
            memory=1
	}
}

task adamPipeline {
  File knownSites
  File inputBam 
  File outputBam 
  Int memory

  command { 
	python /opt/adam-pipeline/wrapper.py --known-sites ${knownSites} --sample ${inputBam} --output ${outputBam} --memory ${memory} 
  }

  output {
	  File outputBam = "${outputBam}"
  }
}
