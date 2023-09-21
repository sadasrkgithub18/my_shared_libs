def call() {           
  withSonarQubeEnv() {
	    sh "mvn sonar:sonar"
   }
}
