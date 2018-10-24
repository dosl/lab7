import java.lang.reflect.Array;
import java.util.Arrays;

public class GameCharacterMain {
    public static void main(String[] args) {
        UsableItem potion = new UsableItem("potion", 300, 150, 20, 0, 0, 0);
        UsableItem superPotion = new UsableItem("super potion", 700, 350, 50, 0, 0, 0);
        UsableItem xAttack = new UsableItem("X Attack",500,250,0,5,0,0);
        UsableItem xDefense = new UsableItem("X Defense",500,250,0,0,5,0);
        MonsterBall pokeball = new MonsterBall("Poke ball",200,100,0);
        MonsterBall masterball = new MonsterBall("Master Ball",99999,99999,0);
        ActiveSkill tackle = new ActiveSkill("Tackle",0);
        ActiveSkill bodyslam = new ActiveSkill("Body slam",0);
        Skill wet = new Skill("Wet",0);

        GameCharacter mudkip = new GameCharacter("Mudkip", 50, 70, 50, 15, 0, 1000);
        GameCharacter charmander = new GameCharacter("Charmander", 39, 52, 43, 5, 0, 2000);
//        mudkip.buy(superPotion, 3);
//        System.out.println("quantity super potion: " + superPotion.getQuantity());
//        System.out.println("quantity potion: " + potion.getQuantity());
//        mudkip.buy(potion, 1);
//        System.out.println("quantity potion " + potion.getQuantity());
//        System.out.println("mudkip's money: " + mudkip.getMoney());
//        mudkip.buy(potion, 1);
//        System.out.println("quantity potion " + potion.getQuantity());
//        System.out.println("mudkip's money: " + mudkip.getMoney());


//        System.out.println("use x Attack");
//        System.out.println("quantity x attack before buying: "+xAttack.getQuantity());
//        mudkip.buy(xAttack,1);
//        System.out.println("quantity x attack after buying: "+xAttack.getQuantity());
//        System.out.println("before use x attack: "+mudkip.getDamage());
//        mudkip.useItem(xAttack);
//        System.out.println("quantity x attack after using: "+xAttack.getQuantity());
//        System.out.println("after use x attack: "+mudkip.getDamage());
//        System.out.println("total money: "+mudkip.getMoney());

//        System.out.println(mudkip.getMoney());
//        mudkip.buy(potion,2);
//        System.out.println("potion's quantity "+potion.getQuantity());
//        System.out.println("money after buying"+mudkip.getMoney());
//        mudkip.sell(potion,3);
//        System.out.println("case: sell 3 potion "+potion.getQuantity());
//        mudkip.sell(potion,1);
//        System.out.println("case: sell 1 potion "+potion.getQuantity());
//        System.out.println("money after selling: "+mudkip.getMoney());


//        mudkip.learnSkill("tackle");
//        System.out.println(mudkip.getSkillList());
//        mudkip.learnSkill("d");
//        System.out.println(mudkip.getSkillList());
//        mudkip.learnSkill("water gun");
//        System.out.println(mudkip.getSkillList());

//
        charmander.learnSkill(tackle);
        System.out.println(tackle.getLevel());
        mudkip.learnSkill(tackle);
        System.out.println(tackle.getLevel());

//        charmander.buy(potion,2);
//        System.out.println(charmander.getMoney());
//        mudkip.buy(pokeball,2);
//        System.out.println(mudkip.getMoney());

    }
}
