public class Triangle {
  //Создайте класс Triangle (треугольник), принимающий три целых значения - длины трёх сторон треугольника.
  //В конструкторе нужно проверить введённые значения на корректность (например, длины не могут быть отрицательными).
  //В классе должен быть описан отдельный статический метод public static boolean checkSides(int a, int b, int c),
  //который должен проверить неравенство треугольника.
  //Этот метод необходимо использовать в конструкторе.
  //При провале любой из проверок нужно вывести на экран соответствующее сообщение или выкинуть исключение.
  private int sideA;
  private int sideB;
  private int sideC;


  public Triangle(int sideA, int sideB, int sideC) throws IllegalAccessException {
    this.sideA = checkSide(sideA);
    this.sideB = checkSide(sideB);
    this.sideC = checkSide(sideC);

  }
  static int checkSide(int side) throws IllegalAccessException {
    if (side<0){
      throw new IllegalAccessException("Сторона должны быть положителна :"+side);
    }return side;
  }
  public boolean checkSides(int a, int b, int c) {
    //Каждая сторона треугольника меньше суммы двух других сторон.

    if (this.sideA + this.sideB > this.sideC && this.sideC + this.sideB > this.sideA
        && this.sideA + this.sideC > this.sideB) {

    }
    return true;
  }
}
