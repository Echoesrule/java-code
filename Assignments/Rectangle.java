public class Rectangle {
    double x;
   double y;
   double width;
   double height;

  public Rectangle(double var1, double var3, double var5, double var7) {
      this.x = var1;
      this.y = var3;
      this.width = var5;
      this.height = var7;
   }

   double left() {
      return this.x - this.width / 2.0;
   }

   double right() {
      return this.x + this.width / 2.0;
   }

   double top() {
      return this.y + this.height / 2.0;
   }

   double bottom() {
      return this.y - this.height / 2.0;
   }
}
