package com.rsg.jenkins

class Cucumber implements Serializable {

    private steps

    Cucumber(steps) {
        this.steps = steps
    }

    def test(String name, String shard, String api_key) {
        steps.sh(script: "echo ${name} - ${shard} - ${api_key}")
    }
}
