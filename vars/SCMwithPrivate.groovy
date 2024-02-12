def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        credential: [[id: stageParms.credentialsId ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
