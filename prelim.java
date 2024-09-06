class Main {
  public static void main(String[] args) {

    int n = 8, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci sequence" + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
