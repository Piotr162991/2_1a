class Main {
  public static void main(String[] args) {
    int w=4;
    for(int p=0;p<=3;p++){
    for(int i=1;i<=w;i++){
      for(int j=0;j<(w-i);j++){
        System.out.print(" ");
      }
        
      for(int j=0;j<i;j++){
        System.out.print("*");
        }
      System.out.println("");
    }
    }
    }
}