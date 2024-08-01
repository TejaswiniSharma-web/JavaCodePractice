package day11;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoginApi  {
    String baseUrl = "https://thinking-tester-contact-list.herokuapp.com";
    String token = null;

    @Test(priority = 1)
    public void login() {
        RestAssured.baseURI = baseUrl;
        RestAssured.basePath = "/users/login";
        Login lp=new Login();
        lp.setEmail("socices933@eqvox.com");
        lp.setPassword("tejuSharma@1461");
        Response response = given().contentType(ContentType.JSON).log().all().body(lp).post();
        response.prettyPrint();
        token = response.then().extract().path("token");
        // System.out.println("Token: " + token);
    }
    String getBaseUrl="https://thinking-tester-contact-list.herokuapp.com";
    @Test(priority = 2)
    public void getContactList(){
        RestAssured.baseURI=getBaseUrl;
        RestAssured.basePath="/contacts";
        Response rp=given().contentType(ContentType.JSON).header("Authorization","Bearer "+token).log().all().get();
        rp.prettyPrint();
        String firstName = rp.then().extract().path("[0].firstName");
        System.out.println(firstName);

    }

}
