package tech.istrategies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productlines")
public class ProductLines {

	@Id
	@Column(name = "productLine")
	private String productLine;

	@Column(name = "textDescription")
	private String textDescription;

	@Column(name = "htmlDescription")
	private String htmlDescription;

	@Column(name = "image")
	private byte[] image;

	public ProductLines() {
		super();
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}
