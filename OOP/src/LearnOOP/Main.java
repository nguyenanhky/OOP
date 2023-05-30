package LearnOOP;

public class Main {
    public static void main(String[] args) {
        /**
         * handle circle
         */
        System.out.println("=======handle circle====");
        HinhTron hinhTron = new HinhTron();
        hinhTron.setRadius(4f);

        hinhTron.setPerimeter(hinhTron.calculationPerimeter());
        hinhTron.showPerimeter();
        hinhTron.setAcreage(hinhTron.calculationAcreage());
        hinhTron.showAcreage();
        /**
         * handle rectangle
         */
        System.out.println("======handle rectangle=====");
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.setWidth(20);
        hinhChuNhat.setHeight(10);
        hinhChuNhat.setPerimeter(hinhChuNhat.calculationPerimeter());
        hinhChuNhat.showPerimeter();
        hinhChuNhat.setAcreage(hinhChuNhat.calculationAcreage());
        hinhChuNhat.showAcreage();
        /**
         * handle Tru
         */
        System.out.println("hinh tru");
        HinhTru hinhTru = new HinhTru();
        hinhTru.setHeight(4);
        hinhTru.setRadius(4);
        hinhTru.setVolume(hinhTru.calculationVolume());
        hinhTru.showVolume();

    }
}
