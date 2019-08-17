package nl.mumasoft.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Class: Project
 * Created by: johan
 * Created at: 2019-08-17 14:55.
 */
@Entity
@Table(name = "project")
public class Project
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "project_id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	@Column(name = "created", nullable = false, updatable = false)
	private ZonedDateTime created;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "hourly_rate", nullable = false)
	private BigDecimal hourlyRate;
	@OneToMany(mappedBy = "project")
	private Set<Task> tasks = new LinkedHashSet<>();

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
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

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public BigDecimal getHourlyRate()
	{
		return hourlyRate;
	}

	public void setHourlyRate(BigDecimal hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}

	public Set<Task> getTasks()
	{
		return tasks;
	}

	public void setTasks(Set<Task> tasks)
	{
		this.tasks = tasks;
	}
}
