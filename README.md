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