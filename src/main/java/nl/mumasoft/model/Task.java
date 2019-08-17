package nl.mumasoft.model;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Class: Tasks
 * Created by: johan
 * Created at: 2019-08-17 14:56.
 */
@Entity
@Table(name = "task")
public class Task
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "project_id", nullable = false)
	private Project project;
	@Column(name = "description", nullable = false)
	private String description;
	@Column(name = "created", nullable = false, updatable = false)
	private ZonedDateTime created;
	@OneToMany(mappedBy = "task")
	private Set<TaskEntry> taskEntries = new LinkedHashSet<>();

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Project getProject()
	{
		return project;
	}

	public void setProject(Project project)
	{
		this.project = project;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public ZonedDateTime getCreated()
	{
		return created;
	}

	public void setCreated(ZonedDateTime created)
	{
		this.created = created;
	}

	public Set<TaskEntry> getTaskEntries()
	{
		return taskEntries;
	}
}
