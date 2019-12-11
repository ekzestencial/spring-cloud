#Spring-cloud
The project lets to show booking rooms for hotel personnel and consist of the main spring cloud services: config, eureka, hystrix, zuul, feign

#Security
Service is integrated with keycloak service for configuring you should use resource
 https://www.baeldung.com/spring-boot-keycloak

#Api
you can find api endpoints for import to postman in "documents-api" directory

#Modules
1)config-server - config server spring cloud
2)eureka-server - discovery server spring cloud
3)reservation-business-services - service aggregator(witch use other services) for showing information about booking rooms
http://127.0.0.1:8500/
GET
/roomReservations/{date}
Get Room Reservations

GET
/rooms
Get All Rooms

4)proxy-server - reverse proxy server
GET
/reservation/rooms

Get All Rooms

#How to start
1) Before start we need to run keycloak server standalone:
cd tools
unzip ~/Downloads/keycloak-8.0.1.zip
./standalone.sh -Djboss.socket.binding.port-offset=100 -b 0.0.0.0

1)cd to the parent directory of the project and build project:
mvn clean install

2)execute eureka server:
cd eureka-server/
mvn spring-boot:run

3)execute config server:
cd config-server/
mvn spring-boot:run

4)execute other services

