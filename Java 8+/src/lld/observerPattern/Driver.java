package lld.observerPattern;

public class Driver {

    public static void main(String[] args) {

        Observer observer = new MobileSubscriber("Raju");
        Observer observer2 = new MobileSubscriber("Kaju");

        NewsAgency news = new NewsAgency();

        news.addObserver(observer2);
        news.addObserver(observer);

        news.breakingNews("World cup Cancelled");

        news.removeObserver(observer2);


        news.breakingNews("World cup re-instated");


    }
}
