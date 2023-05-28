package tasks.OOP.Seminar7;

import java.util.*;

public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }



    @Override
    public void sendOffer(String nameCompany, double salary, Vacancy vacancy) {
        for (Observer observer : observers){
            observer.receiveOffer(nameCompany, salary, vacancy);
        }
    }
}
