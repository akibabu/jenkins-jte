void call() {
  stage("Gradle Build") {
    println "gradle clean build"
  }
  stage("Gradle Test") {
    String cmd = config.test_cmd ?: "gradle check"
    println cmd
  }
}
