package Zoologico;

public class Teste {

	public static void main(String[] args) {
		System.out.println("======Bem Vindo ao zoologico======");
		System.out.println("======Escolha uma das opções abaixo======");
		System.out.println();
		
		Gorila gorila1 = new Gorila("Zezinho", 
				18, 180, 1.78, "Gorila de costa prateada", "Jaula 70", true);
		
		Leao leao1 = new Leao("Mufasa", 
				10, 200, 1.21, "Leão asiático", "Jaula 30", true);
		
		Veterinario vet1 = new Veterinario("Guilherme", "Diniz", "2334434", "Veterinário", "RM - 23343");
		
		Cuidador cuidador1 = new Cuidador("Milton", "Gomes", "343334", "Cuidador");
		
		Zoo zoologico = new Zoo();
		
		Console con = new Console(zoologico); //classe console recebe zoologico para usar seus metodos
		
		zoologico.adicionarAnimal(leao1); //adicionando os animais
		zoologico.adicionarAnimal(gorila1);
		
		zoologico.adicionarFuncionario(cuidador1);
		zoologico.adicionarFuncionario(vet1);
		
		//zoologico.listarAnimais(); //listar todos os animais
		
		
		con.escolhaConsole(); //apos adicionar os animais e funcionarios podemos usar os metodos da classe Zoo
		
		
		
		
		
		// para testar os outros métodos é só acessar aas instancias dos objetos.
		
	}

}
