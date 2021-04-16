package optional;

import java.util.Optional;

public class WithOptionalDemo {

	public static void main(String[] args) {
		Person person = new Person();
		Optional<Address> address = person.getAddress();
		address.ifPresent(addr -> System.out.println(addr));

	}


}
