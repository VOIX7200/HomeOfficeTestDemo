 "#ADAPTAVIST" 
  Pre-requisites - Docker, Maven, Git, Real VNC viewer
  Import this project to a folder using Git pull.
  To run the tests - Go to the command line inside the AdaptavistTest folder and issue the following command in one line.
  > docker-compose up -d &&
  > mvn test
  
  Note:Please look in my setUp function, their is are two initialise options, use  initialise(no VNC viewer required), or intialiseRemote (VNC viewer required). 
            

  
