package ecomerce.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Product")
public class Product {

	@Id
	
	private long pid;
	
	@Column(name ="productName")
	private String productName;
	
	@Column(name="quantity")
	private long quantity;
	
	@Column(name="price")
	private long price;
	
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Product(long pid, String productName, long quantity, long price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
	
	


}
