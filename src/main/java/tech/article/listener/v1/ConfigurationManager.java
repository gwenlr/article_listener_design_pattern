package tech.article.listener.v1;

import org.jetbrains.annotations.NotNull;
import tech.article.listener.common.Configuration;

public class ConfigurationManager {

    @NotNull
    public Configuration getConfiguration() {
        // Fake implementation that simulates the loading of a configuration file
        Configuration configuration = new Configuration();
        configuration.setHostname("127.0.0.1");
        configuration.setPort(4500);
        configuration.setLogin("John");
        configuration.setPassword("Doe");
        return configuration;
    }
}