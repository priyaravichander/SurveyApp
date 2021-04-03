package gmu.edu;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("/survey")
public class Survey {

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addSurveyData(String data) {
		
		
		
		System.out.println("body "+data);
		Gson gson = new Gson();
		SurveyData surveydata = gson.fromJson(data, SurveyData.class);
		System.out.println("Survey data " + surveydata);
//		System.out.println("last name "+data.lastName);
		return "{response: success}";
	}
	
	
	@GET
	public String getSurvey() {
		
		
		return "success";
	}
}
