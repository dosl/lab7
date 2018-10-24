import java.util.ArrayList;

public class MonsterBall extends Item {
    ArrayList<String> ballList = new ArrayList<>();



    public ArrayList<String> getBallList() {
        ballList.add("poke ball");
        ballList.add("great ball");
        ballList.add("ultra ball");
        return ballList;
    }
}
