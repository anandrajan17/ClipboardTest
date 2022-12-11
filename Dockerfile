FROM maven:3.8.1-jdk-11


COPY src /home/SeleniumTestFramework/src

COPY pom.xml /home/SeleniumTestFramework


COPY testng.xml /home/SeleniumTestFramework
 

RUN mvn -f /home/SeleniumTestFramework/pom.xml clean test -DskipTests=true