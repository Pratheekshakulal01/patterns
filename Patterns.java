class Patterns{
    void Pat1(){
        System.out.println("Pattern 1:");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                  if(i==1||i==4||j==1||j==5)
                  System.out.print("*");
                  else
                  System.out.print(" ");                                                      
            }
            System.out.println();
        }

    }
    void Pat2(){
        System.out.println("\nPattern 2:");
        for(int i=1;i<=4;i++){
           for(int j=1;j<=5;j++){
            System.out.print("*");
           }
           System.out.println();
        }
    }
    void Pat3(){
        System.out.println("\nPattern 3:");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void Pat4(){
        System.out.println("\nPattern 4:");
        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void Pat5(){
        System.out.println("\nPattern 5:");
         int n=5;
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
    void Pat6(){
        System.out.println("\nPattern 6:");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    void Pat7(){
        System.out.println("\nPattern 7:");
         for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    void Pat8(){
        System.out.println("\nPattern 8:");
         int n=1;
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
                
                }
                System.out.println();
            }
    }
    void Pat9(){
        System.out.println("\nPattern 9:");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((j-i)%2==0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }
    }
    void Pat10(){
        System.out.println("\nPattern 10:");
         int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               System.out.print("*");
                }
                for(int k=1;k<=2*(n-i);k++){
                    System.out.print(" ");
                }
                for(int l=1;l<=i;l++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n;i>0;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int k=1;k<=2*(n-i);k++){
                    System.out.print(" ");
                }
                for(int l=1;l<=i;l++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    void Pat11(){
        System.out.println("\nPattern 11:");
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void Pat12(){
        System.out.println("\nPattern 12:");
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void Pat13(){
        System.out.println("\nPattern 13:");
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
                //System.out.print(" ");
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                    //System.out.print(" ");
                }
            System.out.println();
        }
    }
    void Pat14(){
        System.out.println("\nPattern 14:");
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Patterns P=new Patterns();
        P.Pat1();
        P.Pat2();
        P.Pat3();
        P.Pat4();
        P.Pat5();
        P.Pat6();
        P.Pat7();
        P.Pat8();
        P.Pat9();
        P.Pat10();
        P.Pat11();
        P.Pat12();
        P.Pat13();
        P.Pat14();
    }
}