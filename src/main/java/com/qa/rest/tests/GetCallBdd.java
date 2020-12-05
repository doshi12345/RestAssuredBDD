package com.qa.rest.tests;



import org.testng.annotations.Test;


//Import These two and also remove scope<test>scope from pom.xml dependencies 
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetCallBdd {
	
	
	@Test 
	public void test_numberOfCircuitsFor2018_Season () {
		
		
//		given();
//		when();
//		then();
//		assert();
		
		given().
		when().
		   get("http://ergast.com/api/f1/2017/circuits.json").
		then().
		   assertThat().
		   
		   statusCode(200).
		   
		   and().
		   
		   body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
		   
		   and().
		   
		   header("content-length", equalTo("4551"));
		
	}
	
	

}
