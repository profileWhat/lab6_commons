package commands;


/**
 * Class factory for create undefined command
 */
public class UndefinedCommandFactory implements CommandFactory{
    private final ClientCommandName clientCommandName;

    /**
     * Constructor for set CoupleIdRoute argument and command type
     */
    public UndefinedCommandFactory() {
        this.clientCommandName = ClientCommandName.UNDEFINED;
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
