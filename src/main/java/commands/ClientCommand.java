package commands;

import java.io.Serializable;

/**
 * Class of the command received from the client
 */
public class ClientCommand implements Serializable {
    private static final long serialVersionUID = 1L;
    private final ClientCommandName commandsName;
    private final Object argument;

    /**
     * Constructor for set commandName and argument of command
     * @param clientCommandName to set in object
     * @param argument to set in object
     */
    protected ClientCommand(ClientCommandName clientCommandName, Object argument) {
        this.commandsName = clientCommandName;
        this.argument = argument;
    }

    /**
     * Method for get argument of command
     * @return argument of command
     */
    public Object getArgument() {
        return argument;
    }

    /**
     * Method for get command name, this method useless on client, but it uses on server
     * @return command name
     */
    public ClientCommandName getCommandName() {
        return commandsName;
    }


}
