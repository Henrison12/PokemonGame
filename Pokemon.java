package game.pokemon;

public class Pokemon {
    int[] attackDmg;
    String[] attackNames;
    int healthPoints;
    String pokeName;


    public Pokemon(String name, int health,String attackOne,int dmgOne,String attackTwo,int dmgTwo,String attackThree,int dmgThree) {
        this.healthPoints=health;
        this.pokeName=name;
        attackNames= new String[]{attackOne,attackTwo,attackThree};
        attackDmg = new int[]{dmgOne,dmgTwo,dmgThree};
    }
    public static void attack(){

    }
}
