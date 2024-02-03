package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  public static final int PRAVY_UHEL = 90;
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //chci si nachystat zelvu do prostoru vlevo
    zofka.penUp();
    zofka.turnLeft(PRAVY_UHEL);
    zofka.move(450);
    zofka.turnRight(PRAVY_UHEL);

    //tohle udela ctverec - zdi domecku
    zofka.penDown();
    for (int i = 0; i < 4; i++) {
      zofka.turnRight(PRAVY_UHEL);
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

    //druhy domek
    nakresliCtverec(100);
    nakresliStrechu(60);

    //popojiti doprava, jsme ready na treti domek
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(30);

    //v dalsim kroku chci udelat metodu pro cely domek
  }
  public void nakresliCtverec(int strCtverce) {
    zofka.penDown();
    for (int i = 0; i < 4; i++) {
      int pravyUhel = PRAVY_UHEL;
      zofka.move(strCtverce);
      zofka.turnRight(pravyUhel);
    }
  }
  public void nakresliStrechu(int strStrechy) {
    zofka.turnLeft(30);
    for (int i = 0; i < 2; i++) {
      int uhelTrojuhelniku = 60;
      zofka.move(strStrechy);
      zofka.turnRight(uhelTrojuhelniku);
    }
  }
  //public void Domecek()
}
