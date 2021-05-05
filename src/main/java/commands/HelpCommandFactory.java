package commands;

/**
 * Class factory for create help command
 */
public class HelpCommandFactory implements CommandFactory {
    private final ClientCommandName clientCommandName;

    /**
     * Constructor for set command type
     */
    public HelpCommandFactory() {
        this.clientCommandName = ClientCommandName.HELP;
    }

    /**
     * Method for create command
     * @return received command that will be send to sever
     */
    @Override
    public ClientCommand createCommand() {
        return new ClientCommand(clientCommandName, null);
    }
}
