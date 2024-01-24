package Zoologico;

public class Teste {

	public static void main(String[] args) {
		
		Gorila gorila1 = new Gorila("Zezinho", 
				18, 180, 1.78, "Gorila de costa prateada", "Jaula 70", true);
		
		Leao leao1 = new Leao("Mufasa", 
				10, 200, 1.21, "Leão asiático", "Jaula 30", true);
		
		Veterinario vet1 = new Veterinario("Guilherme", "Diniz", "2334434", "RM - 23343");
		
		Cuidador cuidador1 = new Cuidador("Milton", "Gomes", "343334");
		
		Zoo zoologico = new Zoo();
		
		zoologico.adicionarAnimal(leao1); //adicionando os animais
		zoologico.adicionarAnimal(gorila1);
		
		zoologico.adicionarFuncionario(cuidador1);
		zoologico.adicionarFuncionario(vet1);
		
		zoologico.listarAnimais(); //listar todos os animais
		
		zoologico.somAnimais();
		
		cuidador1.alimentar(leao1);//peso do leão atualizado usando um objeto do tipo cuidador
		
		cuidador1.alimentar(leao1); /**aqui como o peso passou de 200 na classe leão, 
		o objeto leão fica doente gerando um alerta para usar a classe veterinário pafra cuidar do animal doente**/
		
		leao1.getPeso();
		
		
		
		
		
		// para testar os outros métodos é só acessar aas instancias dos objetos.
		
	}

}
