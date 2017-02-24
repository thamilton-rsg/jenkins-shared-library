// vars/cucumber.groovy
import com.rsg.jenkins.Cucumber

def call(String name, String shard, String key, Closure body) {
    def cucumber = new Cucumber(steps)
    stage('cucumber') {
        cucumber.test(name, shard, key)
        body()
    }
}