Feature: Cars Test

Scenario: Get all the cars
Given url 'http://localhost:8081/cars'
When method GET
Then status 200
And match response[0] contains {id:'#notnull'}

@ignore
Scenario: Get car by make
* url 'http://localhost:8082/cars' 
Given path 'bmw'
When method GET
Then match response.id == '' 