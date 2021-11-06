package tech.article.listener.v1;

import tech.article.listener.common.Configuration;

public class ApplicationLauncher {

    private final Network network = new Network();

    private final ConfigurationManager configurationManager = new ConfigurationManager();

    public void initialize() {
    }

    public void startup() {
        // Implementation...
        Configuration configuration = configurationManager.getConfiguration();
        network.startup(configuration);
        // Implementation...
    }

}