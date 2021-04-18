package funcational.interfaceExp;

public class MyInterfaceImpl implements MyInterface {
	
	@Override
	public void myAbstractMethod() {
		System.out.println("In MyInterfaceImpl.myAbstractMethod");
		
	}

	public static void main(String[] args) {
		MyInterface myInterfaceObj = new MyInterfaceImpl();
		myInterfaceObj.myAbstractMethod();

	}



}
