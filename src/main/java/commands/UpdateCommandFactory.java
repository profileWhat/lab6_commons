package commands;

import collectionManagementModule.CoupleIdRoute;

/**
 * Class factory for create update command
 */
public class UpdateCommandFactory implements CommandFactory {
    private final ClientCommandName clientCommandName;
    private final CoupleIdRoute coupleIdRoute;

    /**
     * Constructor for set CoupleIdRoute argument and command type
     * @param coupleIdRoute to set it
     */
    public UpdateCommandFactory(CoupleIdRoute coupleIdRoute) {
        this.clientCommandName = ClientCommandName.UPDATE;
        this.coupleIdRoute = coupleIdRoute;
    }

    /**
     * Method for create command
     * @return received command that will be send to server
     */
    @Override
    public ClientCommand createCommand() {
        return new ClientCommand(clientCommandName, coupleIdRoute);
    }
}
