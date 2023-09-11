package com.seed;
class Cube {

  // member variable
  private double side;

  // constructor
  Cube(double side) {
    this.side = side;
  }

  // this method will check
  // if two cubes are equal
  public boolean isEqual(Cube obj) {
    if (this.side == obj.side) {
      return true;
    }
    else {
      return false;
    }
  }
}

class ObjectArgument {
  public static void main(String[] args) {
    // create 3 cubes
    Cube cube1 = new Cube(10);
    Cube cube2 = new Cube(12);
    Cube cube3 = new Cube(10);

    // check equal cubes
    if (cube1.isEqual(cube2)) {
      System.out.println("Cube 1 is equal to Cube 2");
    }

    if (cube1.isEqual(cube3)) {
      System.out.println("Cube 1 is equal to Cube 3");
    }

    if (cube2.isEqual(cube3)) {
      System.out.println("Cube 2 is equal to Cube 3");
    }
  }
}