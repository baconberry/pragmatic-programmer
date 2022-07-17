package turtle.graphics.controller;

import io.micronaut.core.util.StringUtils;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import turtle.graphics.entity.DrawRequest;
import turtle.graphics.service.DrawService;

@Singleton
@RequiredArgsConstructor
@Slf4j
public class StringLinesController {

    private final DrawService drawService;

    public void processString(String text) {
        text.lines()
                .filter(StringUtils::isNotEmpty)
                .peek(line -> log.debug("Executing line [{}]", line))
                .forEach(this::processLine);
    }

    private void processLine(String line) {
        if (StringUtils.isEmpty(line)) {
            return;
        }
        var tokens = line.split(" ");
        var request = DrawRequest.builder()
                .action(tokens[0])
                .argument(tokens.length > 1 ? Integer.valueOf(tokens[1]) : null)
                .build();
        drawService.draw(request);
    }
}
