public class SuperheroBattle{
    public static void main(String[] args){
        int monsterHp = 100;
        Hero[] team = {new BijliHero(), new ShaktimanHero(), new SpidermanHero()};
        for(Hero hero: team){
                monsterHp = monsterHp - hero.attack();
        }
        System.out.println("new Monster Hp is" + monsterHp);
    }
}