FROM tomcat:9.0.68-jdk11
ADD target/*.war /usr/local/tomcat/webapps/
