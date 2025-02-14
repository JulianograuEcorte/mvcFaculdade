package trabalho;


import java.util.List;
import java.util.Scanner;

public class Controller {
	private View view;
	@SuppressWarnings("unused")
	private Model model;
	private Register register;
	
	public Controller(View view, Model model, Register register) {
		this.view = view;
		this.model = model;
		this.register = register;
	}
	
	public void iniciar() {
			int opcao = -1;
			Scanner scanner = new Scanner (System.in);
		do {
			view.exibirMenu();
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1: {
				
				obterNomeParaBuscar();
				break;
			}
			case 2: {
				addPerson();
				break;
			}
			case 3: {
				listarTodos();
				break;
			}
			case 0: {
				System.out.println("Saindo...");
			}
			default:
				System.out.println("Opção inválida...");
			}
			
			
			
		} while (opcao != -1);
		scanner.close();
	}
	public void obterNomeParaBuscar() {
		String nome = view.obterNomeParaBuscar();
		Person pessoa = register.getByName(nome);
		if (pessoa != null) {
			view.exibirPessoa(nome);
		}
		else {
			System.out.println("Nome não encontrado!");
		}
	}
	public void addPerson() {
		Person pessoa = view.obterDadosCadastro();
		register.addPerson(pessoa);
	}
	public void listarTodos() {
		List<Person> pessoas = register.listarPessoas();
		view.exibirListaPessoas(pessoas);
	}
	
	
}
