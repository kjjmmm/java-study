package org.example.code;

public enum AtmCommand {
    DEPOSIT(1), WITHDRAW(2),CREATE_ACCOUNT(3),SEARCH_USER(4),EXIT(6);

    private int commandId;

    AtmCommand(int commandId) {
        this.commandId= commandId;
    }

    public int getCommandId() {
        return commandId;
    }

    public static AtmCommand getCommandById(int commandId) {
        for (AtmCommand command : AtmCommand.values()) {
            if(command.getCommandId()==commandId)
                return command;
        }
        return null;
    }
}
