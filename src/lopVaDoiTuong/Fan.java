package lopVaDoiTuong;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (!on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ",fan is on " +
                    '}';
        }else {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ",fan is off " +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setColor("yelow");
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setOn(true);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setColor("blue");
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
