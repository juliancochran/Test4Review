public class Bus {
    private int currentStop;
    private int maxStops;
    private boolean movingUp;

    public Bus(int max) {
        maxStops = max;
        currentStop = 1;
        movingUp = true;
    }

    public int getCurrentStop() {
        return currentStop;
    }

    public void move()  {
        currentStop += (movingUp) ? 1 : -1;
        movingUp = (currentStop == maxStops || currentStop == 1) ?
            !movingUp : movingUp;



        /*if (movingUp) {
            currentStop++;
            if (currentStop == maxStops) {
                movingUp = false;
            }
        }
        else {
            currentStop--;
            if (currentStop == 0) {
                movingUp = true;
            }
        }*/
    }
}
