package commands;

/**
 * Class factory for create execute_script_command
 */
public class ExecuteScriptCommandFactory implements CommandFactory{
    private final ClientCommandName clientCommandName;
    private final String filePath;

    /**
     * Constructor for set String filePath argument and type of command
     * @param filePath to set argument
     */
    public ExecuteScriptCommandFactory(String filePath) {
        this.clientCommandName = ClientCommandName.EXECUTE_SCRIPT;
        this.filePath = filePath;
    }

    /**
     * Method for create command
     * @return received command that will be send to server
     */
    @Override
    public ClientCommand createCommand() {
        return new ClientCommand(clientCommandName, filePath);
    }
}
