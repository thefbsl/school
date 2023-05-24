package org.circledev.school.student;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestTestForStudent {
    private final static String URL = "http://localhost:1010/api/students";

    @Test
    public void testCreateStudent(){
        CreateStudentRequest student = CreateStudentRequest.builder()
                .firstName("Bob")
                .lastName("Hale")
                .email("hale@gmail.com")
                .build();
        given()
                .baseUri(URL)
                .basePath("/create")
                .body(student)
                .contentType(ContentType.JSON)
                .when().post()
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    public void testGetStudents(){
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
    public void testGetStudentById(){
        long studentId = 1L;
        given()
                .baseUri(URL)
                .basePath("/get/" + studentId)
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    public void testUpdateStudent(){
        long studentId = 53L;
        UpdateStudentRequest student = UpdateStudentRequest.builder()
                .firstName("Mark")
                .lastName("KOKO")
                .email("mark@gmail.com")
                .build();
        given()
                .baseUri(URL)
                .basePath("/update/" + studentId)
                .body(student)
                .contentType(ContentType.JSON)
                .when().put()
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    public void testDeleteStudent(){
        long studentId = 103L;
        given()
                .baseUri(URL)
                .basePath("/delete/" + studentId)
                .when().delete()
                .then()
                .statusCode(200);
    }

}
