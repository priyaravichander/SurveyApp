/**
 *  Team: Madeline, Vandana, Dhruv, Priya
POJO for data mapping. Maps data members to columns in the DB
 
 */

package gmu.edu;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class SurveyData implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int responseid;

	private String firstname;
	
	private String lastname;
	
	private String streetAddress;
	
	private String city;
	
	private String state;
	
	private String zipcode;
	
	private String phone;
	
	private String email;
	
	private String date;
	
	private String favorite;
	
	private String interest;
	
	private String recommendation;
	
	private String raffle;
	
	private String comments;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFavorite() {
		return favorite;
	}

	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public String getRaffle() {
		return raffle;
	}

	public void setRaffle(String raffle) {
		this.raffle = raffle;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "SurveyData [firstname=" + firstname + ", lastName=" + lastname + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", phone=" + phone + ", email="
				+ email + ", date=" + date + ", favorite=" + favorite + ", interest=" + interest + ", recommendation="
				+ recommendation + ", raffle=" + raffle + ", comments=" + comments + "]";
	}

	
	
}


