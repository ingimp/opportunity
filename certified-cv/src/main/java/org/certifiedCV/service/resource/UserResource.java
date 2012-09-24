/**
 * 
 */
package org.certifiedCV.service.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.certifiedCV.exception.DataAccessLayerException;
import org.certifiedCV.manager.bo.IUserBO;
import org.certifiedCV.persistence.model.User;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author luca
 * 
 */
@Component
@Path("/users")
public class UserResource {
    
    @Context
    protected UriInfo uriInfo;

    @Autowired
    protected IUserBO userManager;


    @GET
    @Produces("application/json")
    public JSONObject getUsers() throws JSONException {
	JSONObject obj = new JSONObject();
	try {
	    List<User> users = userManager.getAllUsers();
	    System.out.println(users);
	    obj.put("users", users);
	    
	} catch (DataAccessLayerException e) {
	    e.printStackTrace();
	}

	return obj;
    }
    

}
