This assignment is completed on Framework built from scratch. It supports running the test on localhost(with chrome and chrome driver installed), Selenium Grid and docker.

### From IDE
Open the project & navigate to the `TestPageNavigation` class. Right-click the `AmazonTest`class test method and select `Run` option. It takes a few seconds to start the test run

### From Terminal
Open Terminal, navigate the project root. Assuming the above dependencies are installed, run the below command to run the test:
"mvn test"


##features of the Framework

* Code structure is based on page object model, which is easier to maintain.
* Page structure can be seen following inheritance (Base page contains header/menu which is present on all pages) 
* Intergation with extent reports for better visual reporting.
* javadoc added 
* Docker Image support added 

##Steps to create a Docker Image and Run 
make sure in cofig properties runmode = remote 
make sure docker is installed  
Makre sure chrome latest docker image is pulled 

* Download the project folder
* Navigate to project folder in Terminal/CMD
* Enter this command 'Docker build -t clipboardtestimage .'
* Run this command  'docker run -d -p 4444:4444 -p 5900:5900 -v /dev/shm:/dev/shm selenium/standalone-chrome '
* docker run -d --network="host" clipboardtestimage mvn -f  /home/SeleniumTestFramework/pom.xml clean test -Dbrowser="chrome" 
* Enter docker logs "container image generated" you can view the result in logs