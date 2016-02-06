package kumc.jaxb.adapter.jodatime;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

@XmlRootElement
@XmlType(propOrder = { "dateTime", "dateMidnight", "localDate", "localTime",
		"localDateTime" })
public class Root {
	private DateTime dateTime;
	private DateMidnight dateMidnight;
	private LocalDate localDate;
	private LocalTime localTime;
	private LocalDateTime localDateTime;

	public DateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(DateTime dateTime) {
		this.dateTime = dateTime;
	}

	public DateMidnight getDateMidnight() {
		return dateMidnight;
	}

	public void setDateMidnight(DateMidnight dateMidnight) {
		this.dateMidnight = dateMidnight;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public LocalTime getLocalTime() {
		return localTime;
	}

	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
}