package main;

public class Main {

    public static void main(String[] args) {

        GameCalculator[] gameCalculators=new GameCalculator[]{new ChildGame(),new ManGame()};
        for (GameCalculator gameCalculators1:gameCalculators)
        {
            System.out.println(gameCalculators1);
        }




    }
}
