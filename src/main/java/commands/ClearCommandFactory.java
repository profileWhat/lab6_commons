package commands;

/**
 * Class factory for create clear command
 */
public class ClearCommandFactory implements CommandFactory{
    private final ClientCommandName commandsName;

    /**
     * Constructor for set command type
     */
    public ClearCommandFactory() {
        this.commandsName = ClientCommandName.CLEAR;
    }

    /**
     * Method for create command
     * @return received command that will be sent to server
     */
    @Override
    public ClientCommand createCommand() {
        return new ClientCommand(commandsName, null);
    }
}
