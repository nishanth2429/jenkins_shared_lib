def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        // credentialsId: [[credentialsId: stageParams.credentialsId ]],
        userRemoteConfigs: [[ url: stageParams.url,credentialsId: stageParams.credentialsId]]
    ])
  }
