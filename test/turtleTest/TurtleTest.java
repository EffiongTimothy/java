package turtleTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtle.Position;
import turtle.Turtle;
import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;

public class TurtleTest {
    private Turtle turtle;
    @BeforeEach
    public void setup(){
        turtle = new Turtle();
    }

    @Test
    public void turtleCanMovePenDowntest() {
        //given i have a turtle
        assertTrue(turtle.penIsUp());

        turtle.penIsDown();

        assertFalse(turtle.penIsUp());
        //and the turtle pen is up
        //when i move pen down
    }

    @Test
    public void turtleCanMovePenUptest() {
        turtle.penIsDown();
        assertFalse(turtle.penIsUp());
        turtle.penUp();
        assertTrue(turtle.penIsUp());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEastTest() {
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingSouthTest() {
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
    }
    //Todo add turn right fr WEST to NORTH
    @Test
    public void testTurnRightWhileFacingWestTest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
@Test
    public void turtleCanTurnLeftWhileFacingEastTest(){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
}
//
@Test
public void turtleCanTurnLeftWhileFacingNorthTest(){
    turtle.turnLeft();
    assertSame(NORTH, turtle.getCurrentDirection());
    turtle.turnLeft();
    assertSame(WEST, turtle.getCurrentDirection());
}
    @Test
    public void turtleCanTurnLeftWhileFacingWestTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

@Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        assertEquals(EAST,turtle.getCurrentDirection());
        assertEquals(new Position(0,0),turtle.getPosition());
        turtle.moveForward(3);
        assertEquals(new Position(0,3),turtle.getPosition());
}
}