package hello.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sale {

	@Id
	private Long id;
	private BigDecimal amount;
	private Date date;
	private String title;
	private String description;
	
	public Sale() {
		
	}
	
	public Sale(String title, String description, BigDecimal amount, Date date) {	
		this.title = title;
		this.description = description;
		this.amount = amount;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Sale [id=" + id + ", amount=" + amount + ", date=" + date + ", title=" + title + ", description="
				+ description + "]";
	}
	
}
