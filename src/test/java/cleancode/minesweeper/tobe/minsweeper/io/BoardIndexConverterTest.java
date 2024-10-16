package cleancode.minesweeper.tobe.minsweeper.io;

import cleancode.minesweeper.tobe.minsweeper.exception.GameException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BoardIndexConverterTest {
    @DisplayName("알파벳을 입력하면 숫자로 변환된다.")
    @Test
    void convertColFromInputCol(){
      // given
        BoardIndexConverter converter = new BoardIndexConverter();

      // when
        String cellInput = "b";

      // then
        assertThat(converter.getSelectedColIndex(cellInput)).isEqualTo(1);
    }

    @DisplayName("입력값이 알파벳이 아니면 예외를 터뜨린다.")
    @Test
    void cannotConvertColFromInputCol(){
      // given
        BoardIndexConverter converter = new BoardIndexConverter();

      // when
        String cellInput = "1";

      // then
        assertThatThrownBy(() -> converter.getSelectedColIndex(cellInput))
                .isInstanceOf(GameException.class)
                .hasMessage("잘못된 입력입니다.");

    }
}