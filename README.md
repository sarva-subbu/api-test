# api-test
karate api test

Ensure the service which we are using in this Test is up and running [in this case, its the app on this repo -  https://github.com/sarva-subbu/spring-boot-car-app-tdd.git]

// @RunWith(Karate.class) should be removed in order to run the tests in parallel [@Test].

View Test reports @ /api-test/target/surefire-reports/com.sarva.apitest.cars-2.html, if the test was ran using @RunWith

View Test reports @ /api-test/target/surefire-reports/com.sarva.apitest.cars-2.json and /api-test/target/surefire-reports/timeline.html, if the test was ran in parallel [with no @RunWith and with @Test]

annotate a scenario in feature file or a feature file, if you dont want to run the test in parallel 

@parallel=true
Scenario: Get car by make
//
...
//

OR

@parallel=false
Feature: Cars Test

Scenario: Get all the cars
//
..
//

To run the scenarios in parallel across the features, specify the features list or if you want to run the scenarions in parallel within the features, list only one feature file below:
List<String> tags = Arrays.asList("~@ignore");
List<String> features = Arrays.asList("classpath:com/sarva/apitest/cars-1.feature", "classpath:com/sarva/apitest/cars-2.feature");
Results results = Runner.parallel(tags, features, 2, "target/surefire-reports");
