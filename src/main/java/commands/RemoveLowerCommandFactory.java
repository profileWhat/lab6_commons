package commands;

import collectionManagementModule.Route;

/**
 * Class factory for create remove_lower command
 */
public class RemoveLowerCommandFactory implements CommandFactory{
    private final ClientCommandName clientCommandName;
    private final Route route;

    /**
     * Constructor for set Route argument and command type
     * @param route to set it
     */
    public RemoveLowerCommandFactory(Route route) {
        this.clientCommandName = ClientCommandName.REMOVE_LOWER;
        this.route = route;
    }

    /**
     * Method for create command
     * @return received command that will be send to server
     */
    @Override
    public ClientCommand createCommand() {
        return new ClientCommand(clientCommandName, route);
    }
}
