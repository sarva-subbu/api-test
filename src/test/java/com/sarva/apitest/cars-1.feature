Feature: Cars Test

Scenario: Get all the cars
Given url 'http://localhost:8081/cars'
When method GET
Then status 200

Scenario: Get car by make
* url 'http://localhost:8081/cars' 
Given path 'toyota'
When method GET
Then status 200

#Scenario: Create new car in the inventory
#Given url 'http://localhost:8081/cars'
#And request {'make':'Hyundai','model':'Venue',year:2018}
#When method POST
#Then status 200
#And match response.make == 'Hyundai'