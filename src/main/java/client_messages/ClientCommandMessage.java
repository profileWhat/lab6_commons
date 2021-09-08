package client_messages;

import commands.ClientCommand;

import java.io.Serializable;

public class ClientCommandMessage implements ClientMessage, Serializable {
    private final ClientCommand clientCommand;
    private final String userName;
    public ClientCommandMessage(ClientCommand clientCommand, String userName) {
        this.clientCommand = clientCommand;
        this.userName = userName;
    }

    @Override
    public Object getMessage() {
        return clientCommand;
    }

    public String getUserName() {
        return userName;
    }
}
