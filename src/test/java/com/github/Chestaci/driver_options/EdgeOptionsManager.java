package com.github.Chestaci.driver_options;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.HashMap;

/**
 * Опции браузера Edge
 */
public class EdgeOptionsManager {
    public EdgeOptions getEdgeOptions() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--headless=new");
//        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
//            put("enableVNC", true);
//        }});
        return options;
    }
}
