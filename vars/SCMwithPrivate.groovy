def call(branch, url, credentialsId){
  git branch: branch, credentialsId: credentialsId, url: url
}
