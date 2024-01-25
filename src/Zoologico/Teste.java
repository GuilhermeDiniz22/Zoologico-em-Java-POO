package Zoologico;

public class Teste {

	public static void main(String[] args) {
		System.out.println("#####  ###### #    #    #    # # #    # #####   ####       ##    ####     ######  ####   ####  \r\n"
				+ "#    # #      ##  ##    #    # # ##   # #    # #    #     #  #  #    #        #  #    # #    # \r\n"
				+ "#####  #####  # ## #    #    # # # #  # #    # #    #    #    # #    #       #   #    # #    # \r\n"
				+ "#    # #      #    #    #    # # #  # # #    # #    #    ###### #    #      #    #    # #    # \r\n"
				+ "#    # #      #    #     #  #  # #   ## #    # #    #    #    # #    #     #     #    # #    # \r\n"
				+ "#####  ###### #    #      ##   # #    # #####   ####     #    #  ####     ######  ####   ####  ");
		System.out.println();
		System.out.println("======Escolha uma das opções abaixo=======");
		System.out.println();
		
		Zoo zoologico = new Zoo();
		
		zoologico.escolhaConsole();
		
		//classe console recebe zoologico para usar seus metodos
		
		//zoologico.listarAnimais(); //listar todos os animais
		
		
		//apos adicionar os animais e funcionarios podemos usar os metodos da classe Zoo
		
		
		
		
		
		// para testar os outros métodos é só acessar aas instancias dos objetos.
		
	}

}
