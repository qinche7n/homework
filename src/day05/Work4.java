package day05;

public class Work4 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(12, 23, 45);
        System.out.println(cuboid.getSuperficialArea());
        System.out.println(cuboid.getVolume());

    }


}

class Cuboid {
    double length;
    double width;
    double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSuperficialArea() {
        return length * width * 2 + height * width * 2 + height * length * 2;
    }

    public double getVolume() {
        return length * width * height;
    }
}
