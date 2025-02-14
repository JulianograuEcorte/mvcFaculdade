package trabalho;

import java.util.List;
import java.util.Scanner;

public class View {
	private Scanner scanner;
	
	public View() {
		scanner = new Scanner (System.in);
	}
	public int exibirMenu() {
		  System.out.println("\nEscolha uma opção:");
	        System.out.println("1. Encontrar um cadastro pelo nome");
	        System.out.println("2. Cadastrar nova pessoa");
	        System.out.println("3. Imprimir todas as pessoas cadastradas");
	        System.out.println("0. Sair");
	        System.out.print("Opção: ");
	        return scanner.nextInt();
	}
	   
	public Person obterDadosCadastro() {
        scanner.nextLine();  
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();
       

        return new Person(nome, idade, endereco, telefone);
    }
	public String exibirPessoa(String pessoa) {
		if (pessoa != null) {
			System.out.println(pessoa);
		}
		else {
			System.out.println("Pessoa não encontrada");
		}
		return null;
	}
	public void exibirListaPessoas(List<Person> pessoa) {
		if (pessoa.isEmpty()) {
			System.out.println("Pessoa não encontrada!");
		}
		else {
			for (Person person : pessoa) {
				System.out.println(person);
			}
		}
	}
	public String obterNomeParaBuscar() {
		scanner.nextLine();
		System.out.println("Digite o nome para buscar: ");
		return scanner.nextLine();
	}
}	
