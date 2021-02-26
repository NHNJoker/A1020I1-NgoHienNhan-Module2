package keThua;

public class Point3D extends Point2D {
    float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        setZ(z);
    }

    public float[] getXYZ(){
        float [] arr = new float[3];
        arr[0]=getX();
        arr[1]=getY();
        arr[2]=getZ();
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
