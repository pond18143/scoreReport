package scoreReport;

public class ScoreA implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println("live result: " + ((HeadReport) o).getSomeData());
    }
}