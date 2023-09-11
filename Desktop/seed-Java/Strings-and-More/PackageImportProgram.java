package testpack;
 import mypack.MyFirstPackageProgram;
 // To import all classes of mypack package
 // import mypack.*; 
 
 class PackageImportProgram {
   public static void main(String args []) {
      System.out.println("package import demo");
      MyFirstPackageProgram mfp = new MyFirstPackageProgram();
      mfp.printMessage();
    }
 }