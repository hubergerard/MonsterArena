public class Monster {
    private String name;
    private int damage;
    private int life;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void attack(Monster opponent) {
        if (this.life <= 0) {
            return;
        }
        opponent.life -= this.damage;
        if (opponent.life > 0) {
            System.out.println(opponent.name + " a perdu " + this.damage + " HP. Il lui reste " + opponent.life + " HP");
        } else {
            System.out.println(opponent.name + " est KO !");
        }
    }
}
