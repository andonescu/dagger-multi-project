package ro.andonescu.playground.di.dagger.config;

import java.util.Optional;

public interface Config {
    Optional<String> configBy(String key);
}
