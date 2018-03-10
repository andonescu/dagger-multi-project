package ro.andonescu.playground.di.dagger.aggregator;

public class Main {
    public static void main(String[] args) {
        DaggerAppComponent.create().function().doOperation();
    }
}
