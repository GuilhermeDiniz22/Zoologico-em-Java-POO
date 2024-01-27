package Zoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuidador extends Funcionario {
	
	private Animal animal;
	
	private Zoo zoo;
	
	private Scanner scan;
	
	public Cuidador(String nome, String sobrenome, String rg, Zoo zoo) {
		super(nome, sobrenome, rg);
		this.scan = new Scanner(System.in);
		this.zoo = zoo;
	}
	
	public void limparJaulas() {
		System.out.println("O cuidadores limparam as jaulas dos animais " + "\n");
	}
	
	public void mudarHabitat(Animal animal, String novoHabitat) {
		System.out.println("O cuidador " + this.nome + " mudou o habitat do animal " + animal.nome + "\n");
        animal.habitat = novoHabitat;
    }
	
	public Cuidador contratarCuidador() {
        System.out.println(" [1] Digite o nome do cuidador ");
        String nome = scan.nextLine();
        System.out.println(" [2] Digite o sobrenome do cuidador ");
        String sobrenome = scan.nextLine();
        System.out.println(" [3] Digite o rg do cuidador ");
        String rg = scan.nextLine();
        
        var novoCuidador = new Cuidador(nome, sobrenome, rg, new Zoo());
        return novoCuidador;
    }
	
	public void exercitarAnimais() {
		try {
			var cuidador = zoo.getCuidador();
			if(cuidador == null) {
				System.out.println("Nenhum cuidador para exercitar o animal.\n");
			}else {
				var animais = zoo.getList();
				if(animais.size() == 0) {
					System.out.println("Nenhum animal para exercitar.\n");
				}else {
					for(Animal animal: animais) {
						animal.peso-=2;
						System.out.println("O Animal: " + animal.nome + " perdeu calorias se exercitando. \n");
					}
				}
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
