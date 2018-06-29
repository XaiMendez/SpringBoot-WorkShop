package tech.istrategies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {

	@Id
	@Column(name = "employeeNumber")
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeNumber;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "extension")
	private String extension;

	@Column(name = "email")
	private String email;

	// fk
	/*
	 * @Column(name="officeCode") private String officeCode;
	 */

	@ManyToOne
	@JoinColumn(name = "officeCode")
	private Offices offices;

	// fk
	@Column(name = "reportsTo", nullable = true)
	private Integer reportsTo;

	@Column(name = "jobTitle")
	private String jobTitle;

	public Employees() {
		super();
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * public String getOfficeCode() { return officeCode; }
	 * 
	 * public void setOfficeCode(String officeCode) { this.officeCode = officeCode;
	 * }
	 */

	public Integer getReportsTo() {
		return reportsTo;
	}

	public Offices getOffices() {
		return offices;
	}

	public void setOffices(Offices offices) {
		this.offices = offices;
	}

	public void setReportsTo(Integer reportsTo) {
		this.reportsTo = reportsTo;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
