package resources;

//ENUM IS A CLASS IN JAVA WHICH HAS COLLECTION OF CONSTANTS OR METHODS

public enum APIResources {
	
	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");

	private String resource;
	
	APIResources(String resource) 
	{
		this.resource=resource;
	}
	
	public String getResource() {
		return resource;
	}

}
