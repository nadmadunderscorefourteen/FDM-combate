package entity;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;
	private int weakAttack = 1;

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	private void takeDamage(Champion other) {
		if (armor > other.attack)
			life -= other.weakAttack;
		else
			life -= other.attack - armor;
		if (life < 0)
			life = 0;
	}

	private String status() {
		return (life == 0) ? name + ": " + life + " de vida " + "**morreu**" :
			name + ": " + life + " de vida";
	}

	public void printResult(Champion champion, Champion opponent, int repeat) {
		for (int i = 1; i <= repeat && champion.life != 0 && opponent.life != 0; i++) {
			System.out.println("Resultado do turno " + i + ":");
			champion.takeDamage(opponent);
			System.out.println(champion.status());
			opponent.takeDamage(champion);
			System.out.println(opponent.status());
			System.out.println();
		}
		System.out.println("FIM DO COMBATE");
	}
}
