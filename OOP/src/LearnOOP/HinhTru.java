package LearnOOP;

public class HinhTru extends HinhTron {
    private float height;

    public HinhTru() {

    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float calculationVolume(){
        return 2*getRadius()*height;
    }
}
