package tech.article.listener.v3;

import tech.article.listener.common.Configuration;

public class ApplicationLauncher {

    private final Network network = new Network();
    private final StatusBar statusBar = new StatusBar();

    private final ConfigurationManager configurationManager = new ConfigurationManager();

    public void initialize() {
        configurationManager.setNetwork(network);
        configurationManager.setNotificationBar(statusBar);
    }

    public void startup() {
        // Implementation...
        Configuration configuration = configurationManager.getConfiguration();
        network.startup(configuration);
        statusBar.displayHostname(configuration.getHostname());
        // Implementation...
    }

}