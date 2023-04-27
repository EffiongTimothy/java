package turtle;


import static turtle.Direction.*;

public class Turtle {
    private boolean penIsUP =true;
    private Direction direction= EAST;
    public Position position = new Position(0,0);
public boolean penIsUp(){
        return penIsUP;
    }

    public void penIsDown() {
        penIsUP =false;
    }

    public void penUp() {
        penIsUP = true;
    }

    public Direction getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        if (direction == WEST) face(NORTH);
        else if(direction == SOUTH) face(WEST);
        else if (direction == EAST) face(SOUTH);
    }
    private void face(Direction direction) {
        this.direction = direction;
    }

    public void turnLeft() {
    if (direction ==SOUTH) face(EAST);
       else if (direction == WEST) face(SOUTH);
       else if (direction == NORTH)face(WEST);
       else if (direction == EAST)face(NORTH);
    }
public Position getPosition() {
        return position;
}

    public void moveForward(int moveForward) {
    position.setColumn(moveForward);
    }
}
