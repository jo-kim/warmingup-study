package cleancode.minesweeper.tobe.minsweeper.board;

import cleancode.minesweeper.tobe.minsweeper.board.position.CellPosition;
import cleancode.minesweeper.tobe.minsweeper.gamelevel.VeryBeginner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameBoardTest {

    @DisplayName("입력한 행과 열의 좌표가 잘못된 위치입니다.")
    @Test
    void invalidCellPosition(){
        // given
        GameBoard gameBoard = new GameBoard(new VeryBeginner());

        // when
        CellPosition cellPosition = CellPosition.of(10, 11);

        // then
        assertThat(gameBoard.isInvalidCellPosition(cellPosition)).isTrue();

    }

}