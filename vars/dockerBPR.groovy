def call(String project, String hubUser){
    
    sh """

     docker image build -t '${hubUser}'/'${project}' . 
     docker login -u nishanth00 -p Nishanth@00
     docker image push '${hubUser}'/'${project}':latest
     docker rmi '${hubUser}'/'${project}':latest
     
    """
}

// docker image tag '${hubUser}'/'${project}':latest

     // sudo usermod -aG docker $USER
     // sudo chmod 666 /var/run/docker.sock
