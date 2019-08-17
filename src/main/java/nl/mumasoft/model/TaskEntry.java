package nl.mumasoft.model;

import javax.persistence.*;
import java.time.ZonedDateTime;

/**
 * Class: TaskEntry
 * Created by: johan
 * Created at: 2019-08-17 14:59.
 */
@Entity
@Table(name = "task_entry")
public class TaskEntry
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_entry_id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "task_id", nullable = false)
	private Task task;
	@Column(name = "start", nullable = false)
	private ZonedDateTime start;
	@Column(name = "end")
	private ZonedDateTime end;
	@Column(name = "description")
	private String description;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Task getTask()
	{
		return task;
	}

	public void setTask(Task task)
	{
		this.task = task;
	}

	public ZonedDateTime getStart()
	{
		return start;
	}

	public void setStart(ZonedDateTime start)
	{
		this.start = start;
	}

	public ZonedDateTime getEnd()
	{
		return end;
	}

	public void setEnd(ZonedDateTime end)
	{
		this.end = end;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
