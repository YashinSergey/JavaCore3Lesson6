package homework6.firstTask;


import homework6.firstTask.server.ChatServer;

public class ServerStart {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        chatServer.start(7777);
    }
}
