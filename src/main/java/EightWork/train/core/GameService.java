package EightWork.train.core;

import EightWork.train.core.domain.MatrixCoordinate;
import EightWork.train.enums.DotType;


public interface GameService {

    MatrixCoordinate aiTurn();

    void humanTurn(int rowIndex, int columnIndex);

    boolean checkWin(DotType dotType);

    boolean isMapFull();

    boolean checkWin(DotType dotType);
}
