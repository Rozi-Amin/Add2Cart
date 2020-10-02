package com.AddToCart.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.when;

public class API_TestSteps {

    //Using BDD style with Gerkin
    @When("user send get request on {string} status code should be {int}")
    public void user_send_get_request_on(String string, Integer code) {
        when().get("https://www.microchipdirect.com/api/customer/featuredproducts")
                .then()
                .assertThat()
                .and().statusCode(200)
                .and()
                .log().all();
    }



//  This is one way using Java Http method
//    @Given("user send get request on {string} status code should be {int}")
//    public boolean user_send_get_request_on_status_code_should_be(String string, Integer int1) throws IOException {
//        HttpClient client = (HttpClient) new DefaultHttpClient();
//        HttpGet request = new HttpGet("https://www.microchipdirect.com/api/customer/featuredproducts");
//        request.addHeader("accept", "application/json");
//        HttpResponse Response = client.execute(request);
//        StatusLine response = Response.getStatusLine();
//        System.out.println(response);
//        if(!response.equals("HTTP/1.1 200 OK"))
//            return false;
//        return true;
//    }

}


/*@When("user send get request on {string} status code should be ")
    public void user_send_get_request_on(String string) {
            when().get(URL)
                    .then().statusCode(200)
                    .log().all()
    }

*/
