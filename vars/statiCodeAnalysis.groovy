def call(String Pname, String Pid) {
    withSonarQubeEnv('sonar-server') {
        sh """
            $SCANNER_HOME/bin/sonar-scanner \
            -Dsonar.projectName='${Pname}' \
            -Dsonar.projectKey='${Pid}' \
            -Dsonar.java.binaries='.'
        """
    }
}
