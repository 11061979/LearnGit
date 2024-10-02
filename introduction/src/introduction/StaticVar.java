package introduction;

public class StaticVar {
	
	String name;
	String address;
	static String city = "Burgas";
	
	StaticVar (String name, String address){
		this.name = name;
		this.address = address;
		//this.city = city;
		
		
	}
	
	public void getAddress() {
		//return address;
		System.out.println("Address is " + address + city);
	}
	

	public static void main(String[] args) {
		
		StaticVar sv = new StaticVar("Anguel", "Sredna gora, ");
		StaticVar sv1 = new StaticVar("Nika", "Oborishte, ");
		sv.getAddress();
		sv1.getAddress();
		}

}
