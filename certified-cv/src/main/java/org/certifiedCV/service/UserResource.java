/**
 * 
 */
package org.certifiedCV.service;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.UriInfo;

import org.certifiedCV.manager.UserManager;
import org.certifiedCV.persistence.entity.User;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 * @author luca
 * 
 */
public class UserResource {

	protected String userName;
	protected UriInfo uriInfo;
	protected UserManager userManager;

	public UserResource(UriInfo uriInfo, UserManager userManager,
			String userName) {
		this.uriInfo = uriInfo;
		this.userName = userName;
		this.userManager = userManager;
	}

	@GET
	@Produces("application/json")
	public JSONObject getUser() throws JSONException {
		JSONObject obj = new JSONObject();
		User user = this.userManager.getUser(userName);
		if (user != null) {
			obj.put("userName", user.getUserName()).put("email",
					user.getEmail());
		}
		return obj;
	}

}
