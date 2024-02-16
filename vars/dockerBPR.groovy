def call(String project, String hubUser){
    
    sh """
     docker image build -t ${hubUser}/${project} . 
     docker image tag ${hubUser}/${project}:latest
     docker login -u nishanth00 -p Nishanth@00
     docker image push ${hubUser}/${project}:latest
     docker rmi ${hubUser}/${project}:latest
     
    """
}
