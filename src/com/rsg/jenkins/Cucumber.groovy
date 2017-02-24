package com.rsg.jenkins

class Cucumber implements Serializable {

    def steps

    Cucumber(steps) {
        this.steps = steps
    }
}
