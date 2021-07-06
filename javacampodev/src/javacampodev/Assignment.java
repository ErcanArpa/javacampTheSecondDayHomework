package javacampodev;

public class Assignment {
	
	public Assignment () {
	System.out.println ("Kodlama.io"); // kodlana.io'yu getiren constructor bloðudur, çok önemlidir
}
		
	int id       ;
	String name  ;
	double unitPrice ;
	String detail;
	
	public Assignment (int id, String name, double unitPrice, String detail) { // burada iþledik ve eþitleme yaptýk 
		this();              
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
	}	
	

}
