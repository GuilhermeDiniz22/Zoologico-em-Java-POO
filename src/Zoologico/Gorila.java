package Zoologico;

import java.util.Scanner;

public class Gorila extends Animal {
	
	private Scanner scan;

	public Gorila(String nome, int idade, double peso, double altura, String raca, String habitat, boolean saudavel) {
		super(nome, idade, peso, altura, raca, habitat, saudavel);
		this.scan = new Scanner(System.in);
	}
	
	public void Som() {
		System.out.println("O gorila " + nome + " está grunhindo " + "\n");
	}
	
	public double calcularIMC() {
		return this.peso / this.altura * 2;
	}
	
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	public Gorila criarGorila() {
		
			System.out.println(" [1] Digite o nome do gorila ");
	        String nome = scan.nextLine();
	        System.out.println(" [2] Digite a idade do gorila ");
	        int idade = scan.nextInt();
	        scan.nextLine(); // Consumir a quebra de linha pendente

	        System.out.println(" [3] Digite o peso do gorila ");
	        double peso = scan.nextDouble();
	        System.out.println(" [4] Digite a altura do gorila ");
	        double altura = scan.nextDouble();
	        scan.nextLine(); // Consumir a quebra de linha pendente

	        System.out.println(" [5] Digite a raça do gorila ");
	        String raca = scan.nextLine();
	        System.out.println(" [6] Digite o habitat do gorila ");
	        String habitat = scan.nextLine();
	        System.out.println(" [7] O gorila é saudável? ");
	        boolean saudavel = scan.nextBoolean();
	        scan.nextLine();
	        
	        var novoGorila = new Gorila(nome, idade, peso, altura, raca, habitat, saudavel);
	        return novoGorila;	
        
    }
		
}
