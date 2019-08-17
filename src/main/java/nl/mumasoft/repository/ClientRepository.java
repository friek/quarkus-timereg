package nl.mumasoft.repository;

import nl.mumasoft.model.Client;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Class: ClientRepository
 * Created by: johan
 * Created at: 2019-08-17 15:21.
 */
@RequestScoped
public class ClientRepository
{
	@Inject
	EntityManager entityManager;

	public List<Client> getAll()
	{
		var q = entityManager.createQuery("SELECT c FROM Client c", Client.class);
		return q.getResultList();
	}
}
