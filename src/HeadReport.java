package scoreReport;

import java.util.ArrayList;

public class HeadReport implements Source {
    private final ArrayList<MyObserver> list;
    private String someData;

    public HeadReport() {
        this.list = new ArrayList<MyObserver>();
    }

    public void setSomeData(String aData) {
        someData = aData;
        notifyObservers();
    }

    public String getSomeData() {
        return someData;
    }

    @Override
    public void register(MyObserver observer) {
        list.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
        }
    }
}