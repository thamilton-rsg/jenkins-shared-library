package com.rsg.jenkins

class Cucumber implements Serializable {

    private org.jenkinsci.plugins.workflow.cps.CpsScript script

    Cucumber(org.jenkinsci.plugins.workflow.cps.CpsScript script) {
        this.script = script
    }
}
