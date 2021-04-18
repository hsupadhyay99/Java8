package funcational.interfaceExp;

public class MyInterfaceLambdaImpl {

	public static void main(String[] args) {
		MyInterface myInterfaceObj = () -> System.out.println("In MyInterfaceImpl.myAbstractMethod");
		myInterfaceObj.myAbstractMethod();

	}

}
