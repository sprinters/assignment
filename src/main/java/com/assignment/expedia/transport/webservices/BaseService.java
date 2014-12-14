package com.assignment.expedia.transport.webservices;

import com.assignment.expedia.base.db.storage.DealStorageHelper;
import com.assignment.expedia.model.HotelDeal;
import com.assignment.expedia.utils.json.JSONHelper;
import com.assignment.expedia.utils.misc.Pair;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * 
 * @author sandeepandey
 *
 */
@Path("/baseService")
public class BaseService {

    @GET
    @Path("/processRequest/{paramName}/{paramValue}")
    @Produces(MediaType.APPLICATION_JSON)
	public Response processRequest(@PathParam("paramName") String p_param_name,
			@PathParam("paramValue") String p_param_value){
		System.out.println("[Collected Input Param are .]"+Pair.makePair(p_param_name, p_param_value));
		List<HotelDeal> l_result =DealStorageHelper.getResults(p_param_name, p_param_value.toLowerCase());
		return Response.ok(JSONHelper.convertObjectToJSONString(l_result)).build();
	}
}
