public class SuperheroBattle{
    public static void main(String[] args){
          String hero = "Bijli Kumar";
          int monsterHp = 100;

          if(hero.equals("Bijlii Kumar")){
            monsterHp = monsterHp - 40;
            System.out.println("Bijli attack");
          }
          else if(hero.equals("Shaktiman")){
            System.out.println("Shaktiman strikes");
            monsterHp = monsterHp - 50;
          }
          else{
            System.out.println("monster escaped");
            monsterHp = monsterHp + 50;
          }

          System.out.println("Now monster health is " + monsterHp);
    }
}