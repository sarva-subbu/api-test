package com.sarva.apitest;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit4.Karate;

@RunWith(Karate.class)
@KarateOptions(features = {"classpath:com/sarva/apitest/cars-1.feature", "classpath:com/sarva/apitest/cars-2.feature"})
public class CarsApiTest {

	// @Test
    public void testParallel() {
		List<String> tags = Arrays.asList("~@ignore");
        List<String> features = Arrays.asList("classpath:com/sarva/apitest/cars-1.feature", "classpath:com/sarva/apitest/cars-2.feature");
        // Results results = Runner.parallel(getClass(), 2, "target/surefire-reports");
        Results results = Runner.parallel(tags, features, 2, "target/surefire-reports");
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }
	
}
