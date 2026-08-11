package marker_interface;
public class Students implements Registration {
	private int id;
	private String Name;
	private double fee;
	Students(int id,String Name,double fee){
		this.id=id;
		this.Name=Name;
		this.fee=fee;
	}
	
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	public int getId() {
//		return id;
//	}
//	
//	public void setName(String Name) {
//		this.Name = Name;
//	}
//	public String getName() {
//		return Name;
//	}
//	public void setFee(double fee) {
//		this.fee = fee;
//	}
//	public double getFee() {
//		return fee;
//	}
}
