package client_messages;

import java.io.Serializable;

public class ClientStringMessage implements ClientMessage, Serializable {
    private final String string;

    public ClientStringMessage(String string) {
        this.string = string;
    }
    @Override
    public Object getMessage() {
        return string;
    }
}
