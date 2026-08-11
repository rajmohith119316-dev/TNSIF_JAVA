package marker_interface;

public class MarkerInterfaceDemo  {

	public static void main(String[] args) {
		Registration r=new Students(10,"RAJ",20003.4);
		Registration r1=new Students(11,"RANI",20003.4);
		Registration r2=new Students(12,"YUVRAJ",20003.4);
		Registration r3=new Students(13,"YUVARANI",20003.4);
		
		Object obj =new Object();//Object class present in Java 
		
		if(r instanceof Registration) {
			System.out.println("Student is registered for the course");
		}
		else {
			System.out.println("Student is not registered for the course");
		}
		if(r1 instanceof Registration) {
			System.out.println("Student is registered for the course");
		}
		else {
			System.out.println("Student is not registered for the course");
		}
		if(r2 instanceof Registration) {
			System.out.println("Student is registered for the course");
		}
		else {
			System.out.println("Student is not registered for the course");
		}
		if(r3 instanceof Registration) {
			System.out.println("Student is registered for the course");
		}
		else {
			System.out.println("Student is not registered for the course");
		}
		if(obj instanceof Registration) {
			System.out.println("Student is registered for the course");
		}
		else {
			System.out.println("Student is not registered for the course");
		}
		
	}

}
