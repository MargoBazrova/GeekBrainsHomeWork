package EightWork.train.enums;

public enum DotType {
    X, O, EMPTY;

    public static DotType getEnemyType(DotType playerType) {
        if (playerType == DotType.X) {
            return DotType.O;
        } else {
            return DotType.X;
        }
    }

}
