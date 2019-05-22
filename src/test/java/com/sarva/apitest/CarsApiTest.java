package com.sarva.apitest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit4.Karate;

@KarateOptions(features = {"classpath:com/sarva/apitest/cars-2.feature"})
public class CarsApiTest {

	@Test
    public void testParallel() {
        Results results = Runner.parallel(getClass(), 5, "target/surefire-reports");
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }
	
}
