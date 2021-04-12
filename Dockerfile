# Team: Madeline, Vandana, Dhruv, Priya
#Docker file to build the backend server code.
FROM tomcat:9.0-jdk15

COPY SurveyApp.war /usr/local/tomcat/webapps/
