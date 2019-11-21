package DatabaseGui;

public class Place {
    private String name;
    private double elevation;

    Place (String n, double e) {
        name = n;
        elevation = e;
    }
public String getName() {return name;}
public void setName (String name ){this.name = name;}
public double getElevation(){
        return elevation;
}
public void setElevation(double elevation) {this.elevation = elevation;}
public String toString () {return "place:" + name + "is at elevation" + elevation + "meters";}
}
