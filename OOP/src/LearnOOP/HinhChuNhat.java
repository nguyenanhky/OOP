package LearnOOP;

public class HinhChuNhat extends HinhHoc {
    private float width;
    private float height;

    public HinhChuNhat() {
    }


    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float calculationPerimeter(){
        return (width+height)*2;
    }
    public float calculationAcreage(){
        return width*height;
    }

}
