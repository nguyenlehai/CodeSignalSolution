package level_012_LandOfLogic;

import java.util.Objects;

public class Person {
  private long id;
  private String name;

  public Person(long id, String name) {
	this.id = id;
	this.name = name;
  }

  public long getId() {
	return id;
  }

  public void setId(long id) {
	this.id = id;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    //So sánh được Object với nhau vì ở đây mình đã trả về hash value trong hàm hashCode
	//-> so sánh dạng this.hashCode == obj.hashCode
	if (this == obj) return true;
	if (obj == null || getClass() != obj.getClass()) return false;
	Person person = (Person) obj;
	return id == person.id;
  }

  @Override
  public int hashCode() {
	/*
	 hash vs hashCode
	https://docs.oracle.com/javase/7/docs/api/java/util/Objects.html#hash%28java.lang.Object...%29
	 Hash: return a hash value of the sequence of input values
	https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#hashCode(java.lang.Object[])
	HashCode: return the hash code of a non-null argument and 0 for a null argument

	Objects.hash(id) sẽ giúp trả về giá trị băm của id
	 */
	return Objects.hash(id);
  }

  @Override
  public String toString() {
	return "Customer{" +
			"id=" + id +
			", name='" + name + '\'' +
			'}';
  }
}
