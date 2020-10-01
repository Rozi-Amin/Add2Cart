package com.AddToCart.step_definitions;

import cucumber.api.java.en.Given;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import java.io.IOException;

public class API_TestSteps {

    @Given("user send get request on {string} status code should be {int}")
    public boolean user_send_get_request_on_status_code_should_be(String string, Integer int1) throws IOException {
        HttpClient client = (HttpClient) new DefaultHttpClient();
        HttpGet request = new HttpGet("https://www.microchipdirect.com/api/customer/featuredproducts");
        request.addHeader("accept", "application/json");
        HttpResponse Response = client.execute(request);
        StatusLine response = Response.getStatusLine();
        System.out.println(response);
        if(!response.equals("HTTP/1.1 200 OK"))
            return false;
        return true;
    }

}

/*
@When("user send get request on {string} status code should be ")
    public void user_send_get_request_on(String string) {
            when().get(URL)
                    .then().statusCode(200)
                    .log().all()
    }

I had some issues with my IntelliJ configuration, therefore I couldn't run gerken(BDD) style.

 */