package application;

import java.util.Scanner;

import entity.Champion;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Champion firstChamp = null, secondChamp = null;
		String name;
		int life, attack, armor, times;

		for (int i = 1; i <= 2; i++) {
			String ordem = (i == 1) ? "primeiro" : "segundo";
			System.out.println("Digite os dados do " + ordem + " campeão:");
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Vida inicial: ");
			life = sc.nextInt();
			System.out.print("Ataque: ");
			attack = sc.nextInt();
			System.out.print("Armadura: ");
			armor = sc.nextInt();
			sc.nextLine();
			if (i == 1)
				firstChamp = new Champion(name, life, attack, armor);
			else
				secondChamp = new Champion(name, life, attack, armor);
			System.out.println();
		}
		
		System.out.print("Quantos turnos você deseja executar? ");
		times = sc.nextInt();

		System.out.println();
		firstChamp.printResult(firstChamp, secondChamp, times);
		
		sc.close();
	}
}
