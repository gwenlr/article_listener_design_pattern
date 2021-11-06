package tech.article.listener.v4;

import tech.article.listener.common.Configuration;

public class Network {


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


    private void closeSession() {
        // Implementation...
    }

    private void closeConnection() {
        // Implementation...
    }
}