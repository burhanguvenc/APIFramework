Feature: Validating Place API's 
@AddPlace
Scenario Outline: Verify if Place is being successfully added using AddPlaceAPI
	Given Add Place Payload with "<name>" "<language>" "<address>"
	When User calls "AddPlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP" 
	And verify place_id created maps to "<name>" using "getPlaceAPI"
	
			
		Examples:
		| name 		| language | address 						|
		| AAhouse | English  | World cross center | 
		| BBHouse | Spanish  | Sea cross center   |

		
@DeletePlace		
Scenario: Verify if Delete Place Functionality is working 

	Given DeletePlace Payload
	When User calls "deletePlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	
	
	
	
