package tech.article.listener.v2;

import tech.article.listener.common.Configuration;
import tech.article.listener.v3.StatusBar;

public class ApplicationLauncher {

    private final Network network = new Network();
    private final StatusBar statusBar = new StatusBar();

    private final ConfigurationManager configurationManager = new ConfigurationManager();

    public void initialize() {
        configurationManager.setNetwork(network);
    }

    public void startup() {
        // Implementation...
        Configuration configuration = configurationManager.getConfiguration();
        network.startup(configuration);
        // Implementation...
    }

}