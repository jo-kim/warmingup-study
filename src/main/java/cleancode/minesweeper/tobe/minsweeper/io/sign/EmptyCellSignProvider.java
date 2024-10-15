package cleancode.minesweeper.tobe.minsweeper.io.sign;

import cleancode.minesweeper.tobe.minsweeper.board.cell.CellSnapshot;
import cleancode.minesweeper.tobe.minsweeper.board.cell.CellSnapshotStatus;

public class EmptyCellSignProvider implements CellSignProvidable{
    private static final String EMPTY_SIGN = "■";

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.EMPTY);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return EMPTY_SIGN;
    }
}
