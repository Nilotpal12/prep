package lld.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{

    List<Observer> list = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer o: list){
            o.update(message);
        }
    }

    public void breakingNews(String news){
        System.out.println("Breaking News");
        notifyObserver(news);
    }
}
