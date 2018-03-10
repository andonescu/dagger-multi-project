package ro.andonescu.playground.di.dagger.config;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ConfigModule {

    @Provides
    @Singleton
    Config config() {
        return new ConfigImpl();
    }
}
