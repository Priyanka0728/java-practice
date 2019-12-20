
public class Productcons {
  private long id;
  private String productName;
  private String supplierName;
  
  public Productcons(int Id,String Pname, String Sname) {
	  this.id=Id;
	  this.productName=Pname;
	  this.supplierName=Sname;
	  
  }
  
  public String getProductName() {
	  return productName;
  }
  
  public void setProductName(String Pname) {
	  this.productName=productName;
  }
  
  public String getSupplierName( ) {
	  return supplierName;
  }
  
  public void setSupplierName(String Sname) {
	  this.supplierName=supplierName;
}
  
  public long getId() {
	 return id;
  }
  
  public void setId(int Id) {
	  this.id=Id;
  }
  
  public void display()
  { 
	  System.out.println("Product Id :"+getId());
	  System.out.println("Product Name :"+getProductName());	
	  System.out.println("PSupplier Name  :"+getSupplierName());
	  }
  }
