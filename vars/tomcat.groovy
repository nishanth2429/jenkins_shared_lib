def call(credentialsId, url, contextPath){
  deploy adapters: [tomcat9(credentialsId: credentialsId, path: '', url: url)], contextPath: contextPath, war: '**/*.war'
}
