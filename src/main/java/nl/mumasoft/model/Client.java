package nl.mumasoft.model;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Class: Client
 * Created by: johan
 * Created at: 2019-08-17 14:54.
 */
@Entity
@Table(name = "client")
public class Client
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "client_id")
	private int id;
	@Column(name = "created", nullable = false, updatable = false)
	private ZonedDateTime created;
	@Column(name = "name")
	private String name;
	@OneToMany(mappedBy = "client")
	private Set<Project> projects = new LinkedHashSet<>();

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public ZonedDateTime getCreated()
	{
		return created;
	}

	public void setCreated(ZonedDateTime created)
	{
		this.created = created;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Set<Project> getProjects()
	{
		return projects;
	}
}
