package cleancode.minesweeper.tobe.minsweeper.board.position;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CellPositionsTest {

    @DisplayName("지뢰를 랜덤으로 배치한다.")
    @Test
    void extractRandomPositions(){
        // given
        ArrayList<CellPosition> cellPositions = new ArrayList<>();

        cellPositions.add(CellPosition.of(0, 0));
        cellPositions.add(CellPosition.of(0, 1));
        cellPositions.add(CellPosition.of(0, 2));
        cellPositions.add(CellPosition.of(1, 0));
        cellPositions.add(CellPosition.of(1, 1));
        cellPositions.add(CellPosition.of(1, 2));

        CellPositions cellPositions1 = CellPositions.of(cellPositions);

        // when
        List<CellPosition> randomPositions = cellPositions1.extractRandomPositions(3);
        Collections.shuffle(cellPositions);

        // then
        assertThat(randomPositions)
                .hasSize(3)
                .containsAll(randomPositions)
                .isNotEqualTo(cellPositions.subList(0, 3));

    }
}