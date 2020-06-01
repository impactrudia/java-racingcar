package racingcar.application;

import racingcar.domain.MovingStrategy;
import racingcar.utils.Const;

import java.util.stream.IntStream;

public class RacingCarPosition {
    private final int NUMBER_MOVING_STANDARD = 4;
    private final String PROGRESS_POSITION = "-";
    private int position;

    public RacingCarPosition(int position) {
        this.position = position;
    }

    public int move(MovingStrategy movingStrategy) {
        if (movingStrategy.isMove()) {
            return ++position;
        }
        return position;
    }

    public boolean isMove(int randomNumber) {
        return randomNumber >= NUMBER_MOVING_STANDARD;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        IntStream.range(Const.INITIAL_NUM, position)
                .forEach(position -> builder.append(PROGRESS_POSITION));
        return builder.toString();
    }
}
