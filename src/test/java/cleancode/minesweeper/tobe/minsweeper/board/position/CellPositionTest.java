package cleancode.minesweeper.tobe.minsweeper.board.position;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CellPositionTest {

    @DisplayName("행과 열 모두 양수이다.")
    @Test
    void cellPositionIsPositive(){
        // given
        CellPosition cellPosition = CellPosition.of(1, 2);


        // when



        // then
        assertThat(cellPosition.getColIndex()).isPositive();
        assertThat(cellPosition.getRowIndex()).isPositive();


    }

    @DisplayName("행과 열중 하나라도 음수일때 예외를 터뜨린다.")
    @Test
    void cellPositionIsNegative(){
        // given



        // when



        // then
        assertThatThrownBy(() -> CellPosition.of(-1, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("올바르지 않은 좌표입니다.");


    }

}