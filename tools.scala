object tools extends App{

  def convert(x:Double)=x*1.8+32;
  println(convert(35));

  def vol(y:Double)=(4.0/3.0)*(22.0/7.0)*y*y*y;
  println(vol(5));

  def cost(z:Int):Double={
    var total:Double=z*24.95;
    var discount:Double=(total*40.0)/100.0;
    var ship:Double=if(z>50){3.0+0.75*(z-50)} else z*3.0;
    return total-discount+ship;
  }
  println(cost(60));
  






}
