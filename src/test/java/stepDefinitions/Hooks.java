package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException 
	{
		//execute this code only when place id is null
		//write a code that will give you place id
		
		StepDefinitions m = new StepDefinitions();
		
		if(StepDefinitions.place_id==null) 
		{
			m.add_place_payload("Shetty", "French", "Asian");
			m.user_calls_with_http_request("AddPlaceAPI", "POST");
			m.user_calls_with_http_request("Shetty", "getPlaceAPI");
		}
			
	}
}
