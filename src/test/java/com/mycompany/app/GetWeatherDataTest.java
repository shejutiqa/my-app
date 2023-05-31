package com.mycompany.app;

import openweatherapi.GetWeatherData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class GetWeatherDataTest {
    private static final Logger logger = LogManager.getLogger(GetWeatherData.class);

    @Test
    public void getWeatherTest(){
        String actualValue=GetWeatherData.getWeatherData();
        Assert.assertEquals("station",actualValue);
        logger.info("Test passed");
    }
}
