package org.apache.catalina.startup;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Test;

public class CatalinaPropertiesTest {

    @BeforeClass
    public static void setUpClass() {
        URL url = CatalinaPropertiesTest.class.getClassLoader().getResource("org/apache/catalina/startup/");
        System.setProperty("catalina.home", url.getFile());
    }

    @Test
    public void loadProperties() {
        assertEquals("Catalina extra properties 1 not loaded", "true", CatalinaProperties.getProperty("catalina.extra.1.loaded"));
        assertEquals("Catalina extra properties 2 not loaded", "true", CatalinaProperties.getProperty("catalina.extra.2.loaded"));
    }

}
