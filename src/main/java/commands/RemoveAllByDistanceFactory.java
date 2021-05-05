package commands;

/**
 * Class factory for create remove_all_by_distance command
 */
public class RemoveAllByDistanceFactory implements CommandFactory {
    private final ClientCommandName clientCommandName;
    private final Double distance;

    /**
     * Constructor for set double distance argument and command type
     * @param distance to set it
     */
    public RemoveAllByDistanceFactory(Double distance) {
        this.clientCommandName = ClientCommandName.REMOVE_ALL_BY_DISTANCE;
        this.distance = distance;
    }

    /**
     * Method for create command
     * @return received command that will be send to server
     */
    @Override
    public ClientCommand createCommand() {
        return new ClientCommand(clientCommandName, distance);
    }
}
