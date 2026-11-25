public class SuperheroBattle{
    static int attack(String hero){
    switch(hero){
        case "bijli" : 
            System.out.println("monster attacked by lightning - damage 40");
            return 40;
        case "shaktiman" :
            System.out.println("shaktimaan ka chakra - damage 50");
            return 50;
        default:
            System.out.println(hero + " is not a hero");
            return 0;
        }
    }
    public static void main(String[] args){
        int monsterHp = 100;
        monsterHp =monsterHp - attack("bijli");
        monsterHp = monsterHp - attack("shaktiman");
        attack("joker");
        System.out.println("now monster Hp is " + monsterHp);
    }
}