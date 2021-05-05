package commands;

/**
 * Method for create print_field_ascending_distance command
 */
public class PrintFieldAscendingDistanceCommandFactory implements CommandFactory {
    private final ClientCommandName clientCommandName;

    /**
     * Constructor for set command type
     */
    public PrintFieldAscendingDistanceCommandFactory() {
        this.clientCommandName = ClientCommandName.PRINT_FIELD_ASCENDING_DISTANCE;
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
