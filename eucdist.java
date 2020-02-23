public class eucdist{
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("x value of first coordinate:");
    int x1 = scanner.nextInt();
    System.out.println("y value of first coordinate:");
    int y1 = scanner.nextInt();
    System.out.println("x value of second coordinate:");
    int x2 = scanner.nextInt();
    System.out.println("x value of second coordinate:");
    int y2 = scanner.nextInt();
    
    int xSlopeDiff = x2 - x1;
    int ySlopeDiff = y2 - y1;
    int slope = xSlopeDiff / ySlopeDiff;
    
    System.out.println("Euclidean Distance is: " + slope);
  }
  
  public int distCalc(int x1, int y1, int x1, int y2) {
    //code needs to be here
  }
}
