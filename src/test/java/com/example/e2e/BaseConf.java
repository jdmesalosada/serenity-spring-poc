import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseConf {

    private String theRestApiBaseUrl;
    private EnvironmentVariables environmentVariables;

    @Before
    public void setBaseConfiguration() {
        SerenityRest.setDefaultRequestSpecification(defaultRequestSpecification());

        theRestApiBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                .orElse("https://reqres.in/api/");

        OnStage.setTheStage(
                Cast.whereEveryoneCan(CallAnApi.at(theRestApiBaseUrl))
        );
    }

    private static RequestSpecification defaultRequestSpecification() {

        List<Filter> filters = new ArrayList<>();
        filters.add(new RequestLoggingFilter());
        filters.add(new ResponseLoggingFilter());

        return new RequestSpecBuilder()
                .addFilters(filters)
                .setContentType(ContentType.JSON).build();
    }
}