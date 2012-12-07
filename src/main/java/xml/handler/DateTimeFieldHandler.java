package xml.handler;

import java.util.Properties;

import org.exolab.castor.mapping.GeneralizedFieldHandler;
import org.exolab.castor.mapping.ValidityException;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeFieldHandler extends GeneralizedFieldHandler {

	private static String dateFormatPattern;
	
	public void setConfiguration(Properties config) throws ValidityException
	{
		dateFormatPattern = config.getProperty("date-format");
	}

	public Object convertUponGet(Object value)
	{

		LocalDate dateTime = (LocalDate) value;
		
		return format(dateTime);
	}

	public Object convertUponSet(Object value)
	{
		
		String dateTimeString = (String) value;
		
		return parse(dateTimeString);
	}

	public Class<LocalDate> getFieldType()
	{
		return LocalDate.class;
	}

	protected static String format(final LocalDate localDate)
	{

		String localDateString = "";
		
		if (localDate != null)
		{
			DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(dateFormatPattern);
			localDateString = dateTimeFormatter.print(localDate);
		}
		
		return localDateString;
		
	}
	
	protected static LocalDate parse(final String localDateString)
	{
		
		LocalDate localDate = new LocalDate();
		
		if (localDateString != null)
		{
					
			localDate = LocalDate.parse(localDateString, DateTimeFormat.forPattern(dateFormatPattern));
		}
			
		return localDate;
	}
}