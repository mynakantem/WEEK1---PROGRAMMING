public class VolumeOfEarth {
public static void main(String[] args) {

double radius = 6378;
double cubickilometers = (4 / 3) * Math.PI * Math.pow(radius, 3);
double cubicmiles = cubickilometers * 0.621;

System.out.println("The volume of earth in cubic kilometers is:" + cubickilometers + "and cubic miles is" + cubicmiles);
}
}