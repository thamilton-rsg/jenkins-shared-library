package com.rsg.jenkins

class Cucumber implements Serializable {

    private def steps
    private String image = "dockerfactory.rsglab.com/automation/mailchimpui/develop:latest"

    Cucumber(steps) {
        this.steps = steps
    }

    def execute(String name, String shard, String api_key) {
        String options = "-p ${shard} -p ci -p chrome -t @ci -p grid IAPI_KEY=${api_key} --format ParallelTests::Cucumber::FailuresLogger --out rerun.txt"
        steps.sh(script: "docker run --name ${name} --net ${name.replaceAll('_', '').toLowerCase()}_default ${image} parallel_cucumber features -n 10 -o \"${options}\"")
    }
}
