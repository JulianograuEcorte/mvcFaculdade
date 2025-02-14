package trabalho;

import java.util.List;

public class Model {
	private View view;
	private Register register;
	
	
	public Model(View view, Register register) {
		this.view = view;
		this.register = register;
	}
	public void execucao() {
		int opcao = 0;
		do {
			 switch (opcao) {
             case 1:
                 String nome = view.obterNomeParaBuscar();
                 view.exibirPessoa(nome);
                 
                 break;
             case 2:
            	 Person pessoa = view.obterDadosCadastro();
                 register.addPerson(pessoa);
                 break;
             case 3:
            	 List<Person> pessoas = register.listarPessoas();
                 view.exibirListaPessoas(pessoas);
                 break;
             case 0:
                 System.out.println("Saindo...");
                 break;
             default:
                 System.out.println("Opção inválida!");
         }
     } while (opcao != 0);
 
	}
	
}
