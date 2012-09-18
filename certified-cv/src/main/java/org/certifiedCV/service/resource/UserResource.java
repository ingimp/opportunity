/**
 * 
 */
package org.certifiedCV.service.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.UriInfo;

import org.certifiedCV.manager.bo.IUserBO;
import org.certifiedCV.persistence.model.User;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 * @author luca
 * 
 */
public class UserResource {

	protected String userName;
	protected UriInfo uriInfo;
	protected IUserBO userManager;

	public UserResource(UriInfo uriInfo, IUserBO userManager,
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
