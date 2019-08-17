package nl.mumasoft.rest;

import nl.mumasoft.repository.ClientRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Class: ClientResource
 * Created by: johan
 * Created at: 2019-08-17 15:20.
 */
@Path("/client")
public class ClientResource
{
	@Inject
	ClientRepository clientRepository;

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getClients()
	{
		var result = clientRepository.getAll();
		return Response
				.ok()
				.entity(result)
				.build();
	}

}
