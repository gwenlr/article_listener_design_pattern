package tech.article.listener.v5;

import tech.article.listener.common.Configuration;

public class Network implements ConfigurationListener {


    public void startup(Configuration configuration) {
        connect(configuration);
    }

    public void connect(Configuration configuration) {
        openConnection(configuration.getHostname(), configuration.getPort());
        openSession(configuration.getLogin(), configuration.getPassword());
    }

    private void openConnection(String hostname, int port) {
        // Implementation...
    }

    private void openSession(String login, String password) {
        // Implementation...
    }

    public void disconnect() {
        closeSession();
        closeConnection();
    }


    @Override
    public void onConfigurationChanged(Configuration configuration) {
        disconnect();
        connect(configuration);
    }

    private void closeSession() {
        // Implementation...
    }

    private void closeConnection() {
        // Implementation...
    }
}