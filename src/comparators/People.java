package comparators;

public class People {
	int age;
	String name;
	String birthPlace;
	
	public People(int age, String name, String birthPlace) {
		this.age = age;
		this.name = name;
		this.birthPlace = birthPlace;
	}
	
	@Override
	public String toString() {
		return age + " " + name + " " + birthPlace;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
}
