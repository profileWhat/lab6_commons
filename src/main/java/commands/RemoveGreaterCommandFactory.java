package commands;

import collection_management_module.Route;

/**
 * Class factory to create remove_greater command
 */
public class RemoveGreaterCommandFactory implements CommandFactory{
    private final ClientCommandName clientCommandName;
    private final Route route;

    /**
     * Constructor for set Route argument and set command type
     * @param route to set it
     */
    public RemoveGreaterCommandFactory(Route route) {
        this.clientCommandName = ClientCommandName.REMOVE_GREATER;
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
