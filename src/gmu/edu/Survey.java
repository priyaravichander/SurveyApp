/**
 *  Team: Madeline, Vandana, Dhruv, Priya
Jersey servlet. Contains methods for get and post request
 
 */
package gmu.edu;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.transform.Transformers;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Path("/survey")
public class Survey {

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addSurveyData(String data) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		System.out.println("body "+data);
		Gson gson = new Gson();
		SurveyData surveydata = gson.fromJson(data, SurveyData.class);
		System.out.println("Survey data " + surveydata);
//		System.out.println("last name "+data.lastName);
		
		entityManager.persist(surveydata);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		return "{response: success}";
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getSurvey() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");

		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		Gson gson = new Gson();
		JsonObject json = new JsonObject();
		JsonArray jsonList = new JsonArray();
		
	      Query query = em.createQuery("from SurveyData");
	      List<SurveyData> resultList = query.getResultList();
		
		for(SurveyData data: resultList) {
			jsonList.add(gson.toJson(data));
		}
		
		em.close();
		entityManagerFactory.close();
		json.add("result", jsonList);
		return json.toString();
	}
}
