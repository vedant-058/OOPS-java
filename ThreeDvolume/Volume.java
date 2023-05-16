package ThreeDvolume;
import java.lang.Math;
public class Volume {
    Volume(int r){
        double x=4*(Math.PI)*r*r*r;
        System.out.println("The Volume Sphere: "+x/3);
    }
    Volume(Double l){
        double y=l*l*l;
        System.out.println("The Volume Cube: "+y);
    }
    Volume(int l,int b,int h){
        double y=l*b*h;
        System.out.println("The Volume Cuboid: "+y);
    }
    Volume(int r,int h){
        double z=2*Math.PI*h*r;
        System.out.println("The Volume Cylinder: "+z);
    }
}
