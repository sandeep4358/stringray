package in.co.srl.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

/**
 * 
 * @author sandy this entity will represent the master demmurage rate setup.
 */
/**
 * @author sandy * 
 *
 */
@Entity
@Table(name = "DEM_RATE_MST")
public class DemurrageMST {
	@Id
	@GeneratedValue
	int id;
	@Column(name = "service")
	String service;
	@Column(name = "port")
	String port;
	@Column(name = "start_date")
	Date start_date;
	@Column(name = "end_date")
	Date end_date;
	@Column(name = "from_status")
	String from_status;
	@Column(name = "to_status")
	String to_status;
	@Column(name = "currency")
	String currency;
	@Column(name = "freedays")
	String freedays;
	@Column(name = "terminals")
	String terminals;
	@Column(name = "import_export")
	String imp_exp;

	@Override
	public String toString() {
		return "DemurrageMST [service=" + service + ", port=" + port
				+ ", start_date=" + start_date + ", end_date=" + end_date
				+ ", from_status=" + from_status + ", to_status=" + to_status
				+ ", currency=" + currency + ", freedays=" + freedays
				+ ", terminals=" + terminals + ", imp_exp=" + imp_exp + "]";
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getFrom_status() {
		return from_status;
	}

	public void setFrom_status(String from_status) {
		this.from_status = from_status;
	}

	public String getTo_status() {
		return to_status;
	}

	public void setTo_status(String to_status) {
		this.to_status = to_status;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFreedays() {
		return freedays;
	}

	public void setFreedays(String freedays) {
		this.freedays = freedays;
	}

	public String getTerminals() {
		return terminals;
	}

	public void setTerminals(String terminals) {
		this.terminals = terminals;
	}

	public String getImp_exp() {
		return imp_exp;
	}

	public void setImp_exp(String imp_exp) {
		this.imp_exp = imp_exp;
	}

}
