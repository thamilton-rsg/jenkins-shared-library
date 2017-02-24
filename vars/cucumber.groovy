// vars/cucumber.groovy
def call(Closure body) {
    stage("cucumber") {
        body()
    }
}