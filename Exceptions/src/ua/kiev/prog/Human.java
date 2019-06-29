package ua.kiev.prog;

public class Human {
	protected int growth;
	protected int weight;
	protected int age;
	private String name;
	private String surname;
	
	public Human(String name, String surname, int growth, int weight, int age) {
		super();
		this.growth = growth;
		this.weight = weight;
		this.age = age;
		this.name = name;
		this.surname = surname;
	}
	
	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getGrowth() {
		return growth;
	}

	public void setGrowth(int growth) {
		this.growth = growth;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void  HumanInfo(String inf) {
		System.out.println(surname + " " + name + " " + " имеет рост - " + growth + " ,вес - " + weight + " и возраст- " + age);
	}

	@Override
	public String toString() {
		return "Human [growth=" + growth + ", weight=" + weight + ", age=" + age + ", name=" + name + ", surname="
				+ surname + "]";
	}



	
	
	

}
