package Java_Projets.Day7;

public class AppConfig {
    private String serverIP;
    private int port;
    private String databaseName;

    public AppConfig(String serverIP, int port, String databaseName) {
        setServerIP(serverIP);
        if (port > 0 && port < 65535) {
            setPort(port);
        } else {
            System.out.println("Invalid port");
            setPort(0);
        }
        setDatabaseName(databaseName);
    }

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig("10.0.0.10", 6654888, "MathiasServer");
        appConfig.printMessage();
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        if (port > 0 && port < 65535) this.port = port;
        // else System.out.println("Invalid port");
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void printMessage() {
        System.out.println("Server IP: " + getServerIP());
        System.out.println("Server port: " + getPort());
        System.out.println("Server Name: " + getDatabaseName());
    }
}
