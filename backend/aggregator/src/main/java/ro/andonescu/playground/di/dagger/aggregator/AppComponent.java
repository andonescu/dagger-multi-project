package ro.andonescu.playground.di.dagger.aggregator;

import dagger.Component;
import ro.andonescu.playground.di.dagger.service.Service;
import ro.andonescu.playground.di.dagger.service.ServiceModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ServiceModule.class})
public interface AppComponent {
    Service function();
}
