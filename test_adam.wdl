workflow wf {
   
	#define the input files
	File input_sam
	File knownSites

	#allocate the appropriate abount of memory
	String mem

	call adam{
		#define the task inputs
		input: input_sam=input_sam, knownSites=knownSites, mem=mem
	}
}

task adam {
	
	#declare inputs in the task
	File input_sam
	File knownSites
	String mem

	command <<<

	#run the wrapper.py script that takes in the known-sites VCF and the input SAM or file to generate a new BAM file
	python /opt/adam-pipeline/wrapper.py --known-sites ${knownSites} --sample ${input_sam} --output `pwd`/small.processed.bam --memory ${mem}

	>>>

	runtime {
		docker: "adampipelineentrybash"
	}

	output {
		#define the workflow output as the BAM produced by the wrapper.py command
		File output_bam = "small.processed.bam"
	}

}
