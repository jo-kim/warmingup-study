package cleancode.minesweeper.tobe.minsweeper.io;

import cleancode.minesweeper.tobe.minsweeper.user.UserAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;

class ConsoleInputHandlerTest {

    @DisplayName("사용자가 1을 입력하면 셀은 열린다.")
    @Test
    void userInputIsOneThenOpen(){
        // given
        String userInput = "1\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        ConsoleInputHandler consoleInputHandler = new ConsoleInputHandler();
        // when
        UserAction userActionFromUser = consoleInputHandler.getUserActionFromUser();

        // then
        assertThat(userActionFromUser).isEqualTo(UserAction.OPEN);


    }

    @DisplayName("사용자가 2를 입력하면 셀에 깃발이 꽂힌다.")
    @Test
    void userInputIsTwoThenFlag(){
        // given
        String userInput = "2\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        ConsoleInputHandler consoleInputHandler = new ConsoleInputHandler();
        // when
        UserAction userActionFromUser = consoleInputHandler.getUserActionFromUser();

        // then
        assertThat(userActionFromUser).isEqualTo(UserAction.FLAG);


    }

    @DisplayName("사용자가 1과2를 제외한 것을 입력시 알 수 없음이 뜬다.")
    @Test
    void userInputIsUnknown(){
        // given
        String userInput = "test\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));

        ConsoleInputHandler consoleInputHandler = new ConsoleInputHandler();
        // when
        UserAction userActionFromUser = consoleInputHandler.getUserActionFromUser();

        // then
        assertThat(userActionFromUser).isEqualTo(UserAction.UNKNOWN);


    }
}