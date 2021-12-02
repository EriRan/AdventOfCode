package fi.eriran.twozerotwozero.day14.calculation;

import fi.eriran.twozerotwozero.day14.pojo.command.BitCommand;
import fi.eriran.twozerotwozero.day14.pojo.command.MaskCommand;
import fi.eriran.twozerotwozero.day14.pojo.command.WriteCommand;
import fi.eriran.twozerotwozero.day14.pojo.state.CalculationState;

import java.util.List;
import java.util.Map;

public class BitCommandRunner {

    public Map<Integer, Long> run(List<BitCommand> commands) {
        CalculationState state = new CalculationState();
        commands.forEach(command -> runCommand(command, state));
        return state.getValues();
    }

    private void runCommand(BitCommand command, CalculationState state) {
        if (command == null) {
            throw new IllegalArgumentException("Null command encountered");
        }
        if (command instanceof MaskCommand) {
            state.setCurrentBitmask(((MaskCommand) command).getValue());
        } else if (command instanceof WriteCommand) {
            state.getValues().put(
                    ((WriteCommand) command).getIndex(),
                    calculateValue((WriteCommand) command, state.getCurrentBitmask())
            );
        } else {
            throw new IllegalArgumentException("Unknown BitCommand encountered: " + command.getClass().getSimpleName());
        }
    }

    private Long calculateValue(WriteCommand command, String currentBitmask) {
        String binaryString = String.format(
                "%36s",
                Long.toBinaryString(command.getValue())
        ).replace(" ", "0");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < binaryString.length(); i++) {
            char currentBitmaskCharacter = currentBitmask.charAt(i);
            if (currentBitmaskCharacter == 'X') {
                result.append(binaryString.charAt(i));
            }
            //0 or 1
            else if (currentBitmaskCharacter == '0' || currentBitmaskCharacter == '1') {
                result.append(currentBitmaskCharacter);
            } else {
                throw new IllegalStateException("Unknown character encountered: " + currentBitmaskCharacter);
            }
        }
        return Long.parseLong(result.toString(), 2);
    }
}
