package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //chci si nachystat zelvu do prostoru vlevo
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(450);
    zofka.turnRight(90);

    //tohle udela ctverec
    zofka.penDown();
    for (int i = 0; i < 4; i++) {;
      zofka.turnRight(90);
      zofka.move(100);
    }

    //strecha - rovnostranny trojuhelnik
    zofka.turnRight(60);
    zofka.move(60);
    zofka.turnRight(60);
    zofka.move(60);

    //zelva poposla doprava a je ready na dalsi ctverec
    zofka.penUp();
    zofka.turnLeft(30);
    zofka.move(30);

    //v dalsim kroku chci udelat z kodu vyse metodu
    //chtela bych take pomoci cyklu zkratit kod
  }

}
