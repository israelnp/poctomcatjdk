# POC Tomcat:9.0.68 && JDK11

## Clone project
* git clone https://github.com/israelnp/poctomcatjdk.git
## Build project
1. cd poctomcatjdk
2. ./mvnw clean build

## Docker build
* docker build -t springapppoc .

## Docker run
* docker run -p 8080:8080 springapppoc
## Open 
* http://localhost:8080/poc-0.0.1-SNAPSHOT/api/hello