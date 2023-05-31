package openweatherapi;
import com.mycompany.app.App;
import io.restassured.*;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.response.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetWeatherData {

    private static final Logger logger = LogManager.getLogger(GetWeatherData.class);

    public static String getWeatherData(){



        String endpointUrl = "https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=7e4a5f90989b1b8ba1c106a7f72ac962";


        Response response = RestAssured.get(endpointUrl);



        String responseBody = response.getBody().asString();

        logger.info("Response Body " + responseBody);

        String base = response.path("base");
        String coord = response.path("coord.lon").toString();

        //JsonPathConfig jsonPathConfig = response.;

        // How to get coord value and base value????
        // response.getBody().jsonPath("coord");
        logger.info(base);
        logger.info(coord);
        return base;

    }
}