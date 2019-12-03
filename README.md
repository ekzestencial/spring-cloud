#Spring-cloud
The project lets to show booking rooms for hotel personnel and consist of the main spring cloud services: config, eureka, hystrix, zuul, feign

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

#How to start
1)cd to the parent directory of the project
2)mvn clean install

