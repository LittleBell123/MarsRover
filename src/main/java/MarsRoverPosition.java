public class MarsRoverPosition {
    int coordinateX;
    int coordinateY;
    String direction;
    public MarsRoverPosition(int coordinateX, int coordinateY, String direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    protected void move(String commands) {
        if(commands.equals("M")) {
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
        if(commands.equals("R")) {
            if(direction.equals("N")) {
                setDirection("E");
            } else if(direction.equals("E")) {
                setDirection("S");
            } else if(direction.equals("S")) {
                setDirection("W");
            }
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
