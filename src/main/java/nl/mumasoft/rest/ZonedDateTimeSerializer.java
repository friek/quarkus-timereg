package nl.mumasoft.rest;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.ZonedDateTime;

/**
 * Class: ZonedDateTimeSerializer
 * Created by: johan
 * Created at: 2019-08-17 22:40.
 */
public class ZonedDateTimeSerializer extends JsonSerializer<ZonedDateTime>
{
	@Override
	public void serialize(ZonedDateTime zonedDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException
	{
		jsonGenerator.writeString(zonedDateTime.toString());
	}
}
