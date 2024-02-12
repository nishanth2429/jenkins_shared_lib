def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        id: [[gitids: stageParams.credentialsId ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
