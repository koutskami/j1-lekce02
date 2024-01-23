package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    zofka.penDown();
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(100);
    //tohle udelalo ctverec
    zofka.turnRight(60);
    zofka.move(60);
    zofka.turnRight(60);
    zofka.move(60);
    //strecha
    zofka.penUp();
    zofka.turnLeft(30);
    zofka.move(30);
    //zelva poposla doprava a je ready na dalsi ctverec
    //v dalsim kroku chci udelat z kodu vyse metodu
    //chtela bych take pomoci cyklu zkratit kod

  }

}
