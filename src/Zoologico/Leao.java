package Zoologico;

import java.util.Scanner;

public class Leao extends Animal {
    
    private Scanner scan;

    public Leao(String nome, int idade, double peso, double altura, String raca, String habitat, boolean saudavel) {
        super(nome, idade, peso, altura, raca, habitat, saudavel);
        this.scan = new Scanner(System.in);
    }
    

	public void Som() {
        System.out.println("O leão " + nome + " está rugindo" + "\n");
    }

    public double calcularIMC() {
        return this.peso / this.altura * 2;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public void getPeso() {
        System.out.println("O peso atual do " + this.nome + " é " + this.peso);
    }

    public void getAltura() {
        System.out.println("A altura do " + this.nome + " é " + this.altura);
    }

    public Leao criarLeao() {
        System.out.println(" [1] Digite o nome do leão ");
        String nome = scan.nextLine();
        System.out.println(" [2] Digite a idade do leão ");
        int idade = scan.nextInt();
        scan.nextLine(); // Consumir a quebra de linha pendente

        System.out.println(" [3] Digite o peso do leão ");
        double peso = scan.nextDouble();
        System.out.println(" [4] Digite a altura do leão ");
        double altura = scan.nextDouble();
        scan.nextLine(); // Consumir a quebra de linha pendente

        System.out.println(" [5] Digite a raça do leão ");
        String raca = scan.nextLine();
        System.out.println(" [6] Digite o habitat do leão ");
        String habitat = scan.nextLine();
        System.out.println(" [7] O leão é saudável? ");
        boolean saudavel = scan.nextBoolean();
        scan.nextLine();
        
        var novoLeao = new Leao(nome, idade, peso, altura, raca, habitat, saudavel);
        return novoLeao;
    }
}

