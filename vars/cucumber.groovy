// vars/cucumber.groovy
def call(Closure body) {
    node('cucumber') {
        body()
    }
}