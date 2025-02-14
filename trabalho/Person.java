package trabalho;

public class Person {
	final String name;
	final int age;
	final String adress;
	final int phone;
	
	public Person(String name, int age, String adress, int phone) {
		
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.phone = phone;
	}
	
	
	
	public String getAdress() {
		return adress;
	}
	public int getPhone() {
		return phone;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	void addPerson() {
			
	}
	@Override
	public String toString() {
		 return "Nome: " + name + ", Idade: " + age + ", Endereço: " + adress + 
	               ", Telefone: " + phone;
	}
}
