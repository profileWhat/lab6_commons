package commands;

/**
 * Class factory for create exit command
 */
public class ExitCommandFactory implements CommandFactory {
    private final ClientCommandName clientCommandName;

    /**
     * Constructor for set command type
     */
    public ExitCommandFactory() {
        this.clientCommandName = ClientCommandName.EXIT;
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
