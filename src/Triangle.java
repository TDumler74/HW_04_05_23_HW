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


  public Triangle(int sideA, int sideB, int sideC) {
    if (sideA>0){
    this.sideA = sideA;
    } else {
      System.out.println("Сторона должна быть положительной: " + sideA);
    }
    if (sideB>0){
    this.sideB = sideB;
    } else {
      System.out.println("Сторона должна быть положительной: " + sideB);
    }
    if (sideC>0){
    this.sideC = sideC;
    } else {
      System.out.println("Сторона должна быть положительной: " + sideC);
    }
  }
  public static boolean checkSides(int a, int b, int c) {
    return (a < b + c) && (b < a + c) && (c < a + b);// Idea подкорригировала
  }
}
