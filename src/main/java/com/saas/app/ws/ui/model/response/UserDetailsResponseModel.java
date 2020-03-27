/*
 * This will be used by Spring to create a Json payload to send back as REST Response
 **/
package com.saas.app.ws.ui.model.response;

import java.util.List;

import com.saas.app.ws.ui.model.request.AddressRequestModel;

public class UserDetailsResponseModel {
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private List<AddressRequestModel>addresses;
	

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<AddressRequestModel> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<AddressRequestModel> addresses) {
		this.addresses = addresses;
	}
}
