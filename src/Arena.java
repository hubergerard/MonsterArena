public class Arena {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        m1.setName("Bob");
        m1.setDamage(3);
        m1.setLife(10);
        Monster m2 = new Monster();
        m2.setName("Sully");
        m2.setDamage(4);
        m2.setLife(8);

        while (m1.getLife() > 0 && m2.getLife() > 0) {
            m1.attack(m2);
            m2.attack(m1);
        }

        System.out.println("Combat terminé");
    }
}