package commands;

/**
 * Class factory for create show command
 */
public class ShowCommandFactory implements CommandFactory{
    private final ClientCommandName clientCommandName;

    /**
     * Constructor for set command type
     */
    public ShowCommandFactory() {
        this.clientCommandName = ClientCommandName.SHOW;
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
