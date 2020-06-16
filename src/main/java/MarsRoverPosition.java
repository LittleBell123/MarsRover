public class MarsRoverPosition {
    int coordinateX;
    int coordinateY;
    String direction;
    public MarsRoverPosition(int coordinateX, int coordinateY, String direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    protected void move(String[] commands) {
        for (String command:commands) {
            if(command.equals("M")) {
                moveToward();
            } else if(command.equals("R")) {
                trunRight();
            } else if(command.equals("L")) {
                turnLeft();
            }
        }
    }

    private void turnLeft() {
        if(direction.equals("N")) {
            setDirection("W");
        } else if(direction.equals("E")) {
            setDirection("N");
        } else if(direction.equals("S")) {
            setDirection("E");
        } else if(direction.equals("W")) {
            setDirection("S");
        }
    }

    private void trunRight() {
        if(direction.equals("N")) {
            setDirection("E");
        } else if(direction.equals("E")) {
            setDirection("S");
        } else if(direction.equals("S")) {
            setDirection("W");
        } else if(direction.equals("W")) {
            setDirection("N");
        }
    }

    private void moveToward() {
        if(direction.equals("N")) {
            setCoordinateY(getCoordinateY()+1);
        } else if(direction.equals("S")) {
            setCoordinateY(getCoordinateY()-1);
        } else if(direction.equals("E")) {
            setCoordinateX(getCoordinateX()+1);
        } else if(direction.equals("W")) {
            setCoordinateX(getCoordinateX()-1);
        }
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
