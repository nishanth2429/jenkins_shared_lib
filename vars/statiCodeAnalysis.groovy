def call(credentialsId, String projectName, String projectKey){

    // withSonarQubeEnv(credentialsId: credentialsId) {
  
         // sh 'mvn clean package sonar:sonar'
        // sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=project-1 -Dsonar.projectKey=project-1 -Dsonar.java.binaries=.  '''
    withSonarQubeEnv(credentialsId) {
        sh ''' 
        $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=${projectName} -Dsonar.projectKey=${projectKey} -Dsonar.java.binaries=.
        '''
    }
}
