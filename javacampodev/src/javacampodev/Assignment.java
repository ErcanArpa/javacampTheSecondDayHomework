package javacampodev;

public class Assignment {
	
	public Assignment () {
	System.out.println ("Kodlama.io"); // kodlana.io'yu getiren constructor blo�udur, �ok �nemlidir
}
		
	int id       ;
	String name  ;
	double unitPrice ;
	String detail;
	
	public Assignment (int id, String name, double unitPrice, String detail) { // burada i�ledik ve e�itleme yapt�k 
		this();              
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
	}	
	

}
