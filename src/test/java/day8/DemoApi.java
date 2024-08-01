package day8;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DemoApi {
    @Test
    void test_01() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,20);

    }
   void test_02(){
   }
}
