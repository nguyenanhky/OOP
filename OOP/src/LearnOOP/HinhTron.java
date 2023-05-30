package LearnOOP;

import java.util.Scanner;

public  class HinhTron extends HinhHoc {
   private float radius;

   public HinhTron() {
   }

   public float getRadius() {
      return radius;
   }

   public void setRadius(float radius) {
      this.radius = radius;
   }
   public float calculationPerimeter(){
      return radius*2*PI;
   }
   public float calculationAcreage(){
      return radius*radius*PI;
   }

}
