package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceExerciseTest {
    @Test
    public void testTwoPointsInAplaneRestOnLinePerpendicularToAxis(){
        assertTrue(DistanceExercise.isPerpendicular(2,3 ,4,5));
    }

}