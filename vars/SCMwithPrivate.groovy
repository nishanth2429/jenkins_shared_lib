def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        ids: [[gitids: stageParams.credentialsId ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
