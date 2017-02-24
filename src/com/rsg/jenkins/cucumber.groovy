package com.rsg.jenkins

class Cucumber implements Serializable {

    private org.jenkinsci.plugins.workflow.cps.CpsScript script

    Cucumber(org.jenkinsci.plugins.workflow.cps.CpsScript script) {
        this.script = script
    }

    def <V> V withOptions(String test) {
        node {
            script.sh "ls -l"
        }
    }

}
