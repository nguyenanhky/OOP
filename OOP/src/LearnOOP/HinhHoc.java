package LearnOOP;

public class HinhHoc {
    public static float PI = 3.14f;
    private String name;
    private float perimeter;
    private float acreage;
    private float volume;

    public HinhHoc() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public float getAcreage() {
        return acreage;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public void setAcreage(float acreage) {
        this.acreage = acreage;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
    public void showName(){
        System.out.println("========"+name+"===========");
    }
    public void showPerimeter(){
        System.out.println("perimeter :"+perimeter);
    }
    public void showAcreage(){
        System.out.println("Acreage :"+acreage);
    }
    public void showVolume(){
        System.out.println("Volume :"+volume);
    }
}
