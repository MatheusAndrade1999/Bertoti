
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String news);
}


interface Subject{
    void addObserver(Observer o );
    void removeObserver(Observer o);
    void notifyObserver();
}


class NewsAgency implements Subject {

    private String news;
    private List<Observer> observers = new ArrayList<>();


    public void setNews(String news){
        this.news = news;
        notifyObserver();
    }


    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o :observers){
            o.update(news);
        }
    }
}


class NewsChannel implements Observer {

    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("Canal recebeu notícia " + news);
    }
}


public class Main{
    public static void main(String[] args) {
          
        NewsAgency agency  = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();  
        
        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.setNews("Brasil vence a Argentina na final da Copa do Mundo!");
        agency.setNews("Novo recorde de temperatura no Brasil: 45 graus em Brasília!");

    }
}