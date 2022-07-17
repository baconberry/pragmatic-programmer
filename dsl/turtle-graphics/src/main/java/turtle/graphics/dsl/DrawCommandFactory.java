package turtle.graphics.dsl;

import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import turtle.graphics.dsl.command.DrawCommand;

import java.util.List;
import java.util.Optional;

@Singleton
@RequiredArgsConstructor
public class DrawCommandFactory {

    private final List<DrawCommand> commands;

    public Optional<DrawCommand> findCommand(String commandName){
        return commands.stream()
                .filter(command -> command.commandName().equalsIgnoreCase(commandName))
                .findAny();
    }

}
