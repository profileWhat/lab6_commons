package commands;

/**
 * Class factory for create remove_first command
 */
public class RemoveFirstCommandFactory implements CommandFactory {
    private final ClientCommandName clientCommandName;

    /**
     * Constructor for set command type
     */
    public RemoveFirstCommandFactory() {
        this.clientCommandName = ClientCommandName.REMOVE_FIRST;
    }

    /**
     * Method for create command
     * @return received command that will be send to server
     */
    @Override
    public ClientCommand createCommand() {
        return new ClientCommand(clientCommandName, null);
    }
}
