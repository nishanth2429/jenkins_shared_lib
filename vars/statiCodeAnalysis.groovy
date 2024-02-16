def call(projectName, projectKey){

    // withSonarQubeEnv(credentialsId: credentialsId) {
  
         // sh 'mvn clean package sonar:sonar'
        // sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=project-1 -Dsonar.projectKey=project-1 -Dsonar.java.binaries=.  '''
    withSonarQubeEnv('sonar-server') {
        sh ''' 
        $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=${projectName} -Dsonar.projectKey=${projectKey} -Dsonar.java.binaries=.
        '''
    }
}
