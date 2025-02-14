package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Register {
	private List<Person> pessoas;
	
	public Register() {
		pessoas = new ArrayList<>();
	}
	public void addPerson (Person pessoa) {
		pessoas.add(pessoa);
	}
	public Person getByName(String name) {
		for (Person person : pessoas) {
			if (person.getName().contentEquals(name)) {
				return person;
			}
			else {
				System.out.println("Cadastro não encontrado!");
			}
		}
		return null;
	}
	public List<Person> listarPessoas(){
		return pessoas;
	}
}
