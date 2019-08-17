package nl.mumasoft.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Class: Config
 * Created by: johan
 * Created at: 2019-08-17 22:26.
 */
@ApplicationPath("/api/v1")
public class Config extends Application
{
	@Override
	public Set<Class<?>> getClasses()
	{
		var classes = new LinkedHashSet<Class<?>>();
		classes.add(ClientResource.class);
		classes.add(ZonedDateTimeSerializer.class);
//		classes.add(ClientBodyWriter.class);

		return classes;
	}
}
