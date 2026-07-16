package tns.org.java;

public class VariableDemo {
	int var=10;
	void print() {
		String msg="HI";
	}
	static String messi="Hello World";
	public static void main(String[] args) {
	 VariableDemo vd = new VariableDemo();
	 System.out.println(vd.var);
	 vd.print();
	 System.out.println(messi);
	}

}
