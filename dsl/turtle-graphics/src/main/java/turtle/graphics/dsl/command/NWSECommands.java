package turtle.graphics.dsl.command;

import jakarta.inject.Singleton;
import turtle.graphics.entity.Coordinates;

public class NWSECommands {

    @Singleton
    public static class NCommand extends AbstractCardinalMoveCommand {
        @Override
        protected Coordinates endFromStart(Coordinates start, int move) {
            return start.plusY(move);
        }

        @Override
        public String commandName() {
            return "N";
        }
    }

    @Singleton
    public static class WCommand extends AbstractCardinalMoveCommand {
        @Override
        protected Coordinates endFromStart(Coordinates start, int move) {
            return start.plusX(-move);
        }

        @Override
        public String commandName() {
            return "W";
        }
    }

    @Singleton
    public static class SCommand extends AbstractCardinalMoveCommand {
        @Override
        protected Coordinates endFromStart(Coordinates start, int move) {
            return start.plusY(-move);
        }

        @Override
        public String commandName() {
            return "S";
        }
    }

    @Singleton
    public static class ECommand extends AbstractCardinalMoveCommand {
        @Override
        protected Coordinates endFromStart(Coordinates start, int move) {
            return start.plusX(move);
        }

        @Override
        public String commandName() {
            return "E";
        }
    }
}
