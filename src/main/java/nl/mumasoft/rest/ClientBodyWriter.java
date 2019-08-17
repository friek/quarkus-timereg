package nl.mumasoft.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Class: ClientBodyWriter
 * Created by: johan
 * Created at: 2019-08-17 22:31.
 */
public class ClientBodyWriter implements MessageBodyWriter<List>
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ClientBodyWriter.class);

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType)
	{
		return true;
	}

	@Override
	public void writeTo(List list, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException
	{
		LOGGER.error("Not working");
	}
}
