package tech.article.listener.v6;

import tech.article.listener.common.Configuration;

public class Network implements ConfigurationListener {


    public void startup(Configuration configuration) {
        openConnection(configuration.getHostname(), configuration.getPort());
        openSession(configuration.getLogin(), configuration.getPassword());
    }

    private void openConnection(String hostname, int port) {
        // Implementation...
    }

    private void openSession(String login, String password) {
        // Implementation...
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        reconnectAndOpenSession(configuration);
    }

    private void reconnectAndOpenSession(Configuration configuration) {
        closeSession();
        closeConnection();
        openConnection(configuration.getHostname(), configuration.getPort());
        openSession(configuration.getLogin(), configuration.getPassword());
    }

    private void closeSession() {
        // Implementation...
    }

    private void closeConnection() {
        // Implementation...
    }
}