package commands;

/**
 * Class factory for create info command
 */
public class InfoCommandFactory implements CommandFactory {
    private final ClientCommandName clientCommandName;

    /**
     * Constructor for set command type
     */
    public InfoCommandFactory() {
        this.clientCommandName = ClientCommandName.INFO;
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
