package trabalho;

public class Main {
	public static void main(String[] args) {
		View view = new View();
		Register register = new Register();
		Model model = new Model(view, register);
		
		Controller controller = new Controller(view, model, register);
		
		controller.iniciar();
	}
}
