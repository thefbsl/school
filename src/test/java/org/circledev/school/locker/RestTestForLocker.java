package org.circledev.school.locker;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestTestForLocker {
    private final static String URL = "http://localhost:1010/api/lockers";

    @Test
    public void testCreateLocker(){
        CreateLockerRequest locker = CreateLockerRequest.builder()
                .lockerNumber(197)
                .studentId(155L)
                .build();
        given()
                .baseUri(URL)
                .basePath("/create")
                .body(locker)
                .contentType(ContentType.JSON)
                .when().post()
                .then()
                .log().body()
                .statusCode(200);
    }
    @Test
    public void testGetLockers(){
        given()
                .baseUri(URL)
                .basePath("/get")
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    public void testGetLockerById(){
        long lockerId = 2L;
        given()
                .baseUri(URL)
                .basePath("/get/" + lockerId)
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    public void testDeleteLocker(){
        long lockerId = 5L;
        given()
                .baseUri(URL)
                .basePath("/delete/" + lockerId)
                .when().delete()
                .then()
                .statusCode(200);
    }

}
