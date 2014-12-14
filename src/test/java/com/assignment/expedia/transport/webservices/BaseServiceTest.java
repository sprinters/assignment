package com.assignment.expedia.transport.webservices;

import com.assignment.expedia.manager.DataManager;
import com.assignment.expedia.manager.Manager;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.expect;

/**
 * * @author sandeepandey
 */
public class BaseServiceTest {

    private static Manager startingManager =   null;

    @BeforeClass
    public static void setUp() {
        System.out.println("[URL And Data is going to populate]");
        RestAssured.basePath    =   "http://localhost:8080/expedia-final";
        startingManager         =   new DataManager();
        startingManager.manage();

    }

    @Test
    public void testProcessRequestForCity() throws Exception {
        expect().statusCode(200).contentType(ContentType.JSON).when().get("/webservice/baseService/processRequest/0/Prague").thenReturn();
    }


    @Test
    public void testProcessRequestForLongitudeAndLatitude() throws Exception {
        expect().statusCode(200).contentType(ContentType.JSON).when().get("/webservice/baseService/processRequest/2/41.388982,2.175942").thenReturn();
    }


    @Test
    public void testProcessRequestForAddress() throws Exception {
        expect().statusCode(200).contentType(ContentType.JSON).when().get("/webservice/baseService/processRequest/1/3535 Las Vegas Blvd South Suite 1").thenReturn();
    }


    @Test
    public void testProcessRequestForMinMaxStartRate() throws Exception {
        expect().statusCode(200).contentType(ContentType.JSON).when().get("/webservice/baseService/processRequest/1/3535 Las Vegas Blvd South Suite 1").thenReturn();
    }

}
