package level_012_LandOfLogic;

import java.util.HashSet;

public class HashSetObject {
  public static void main(String[] args) {
	HashSet<Person> customers = new HashSet<>();
	customers.add(new Person(101, "Rajeev"));
	customers.add(new Person(102, "Rajeev"));
	customers.add(new Person(103, "Chris"));

	customers.add(new Person(101, "Rajeev"));
	customers.add(new Person(102, "Rajeev"));

	System.out.println(customers);
  }
}
