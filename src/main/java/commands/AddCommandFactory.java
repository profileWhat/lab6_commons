package commands;

import collection_management_module.Route;

/**
 * Class factory for create add command
 */
public class AddCommandFactory implements CommandFactory {
    private final Route route;
    private final ClientCommandName clientCommandName;

    /**
     * Constructor for set argument of command and type of command
     * @param route to set argument
     */
    public AddCommandFactory(Route route) {
        this.route = route;
        this.clientCommandName = ClientCommandName.ADD;
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
