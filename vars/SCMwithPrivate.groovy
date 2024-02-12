def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        id: [[gitids: stageParams.gitid ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
