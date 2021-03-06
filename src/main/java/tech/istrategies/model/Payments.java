package tech.istrategies.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payments {

	/*
	 * @Id
	 * 
	 * @Column(name="customerNumber") //@GeneratedValue(strategy =
	 * GenerationType.AUTO) private int customerNumber;
	 */

	@Id
	@Column(name = "checkNumber")
	private String checkNumber;

	@ManyToOne
	@JoinColumn(name = "customerNumber")
	private Customers customer;

	@Column(name = "paymentDate")
	private Date paymentDate;

	@Column(name = "amount")
	private double amount;

	public Payments() {
		super();
	}

	/*
	 * public int getCustomerNumber() { return customerNumber; }
	 * 
	 * public void setCustomerNumber(int customerNumber) { this.customerNumber =
	 * customerNumber; }
	 */

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
