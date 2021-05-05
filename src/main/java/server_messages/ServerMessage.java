package server_messages;

import java.io.Serializable;

/**
 * Class for send message to client from server
 */
public class ServerMessage implements Serializable {
    private final String message;
    private boolean EndOfScriptExFlag;

    /**
     * Constructor for set String message
     * @param message to set it
     */
    public ServerMessage(String message) {
        this.message = message;
        this.EndOfScriptExFlag = false;
    }

    /**
     * Method for set true End of script executing flag
     */
    public void setEndOfScriptExFlag() {
        EndOfScriptExFlag = true;
    }

    /**
     * Method for get End of script executing flag
     * @return End of script executing flag
     */
    public boolean isEndOfScriptExFlag() {
        return EndOfScriptExFlag;
    }

    public String getMessage() {
        return message;
    }
}
