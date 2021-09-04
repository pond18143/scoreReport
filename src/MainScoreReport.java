package scoreReport;

import java.util.Scanner;

public class MainScoreReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreA obj1 = new ScoreA();
        ScoreB obj2 = new ScoreB();
        HeadReport obj = new HeadReport();

        obj.register(obj1);
        obj.register(obj2);

        boolean loop = true;
        while (loop) {
            System.out.print("Enter Score ");
            String inp = sc.nextLine();
            if (inp.equals("")) {
                break;
            } else {
                obj.setSomeData(inp);
            }
        }

    }
}
