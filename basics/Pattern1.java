public class Pattern1 {
    public static void main(String[] args) {
     /*  //Triangle in star pattern 
        for(int line=1; line<=4; line++){
            //one line
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }    */


    /*    //Inverted triangle in star pattern
        int n=4;
        for(int line=1; line<=n;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }     */


    /*    //Print Half Pyramid Pattern like
               //1
               //12
               //1233
               //1234
        int n=7;
        for(int line=1;line<=n;line++){
            //number print
            for(int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }        */


    /*   //Print character pattern like
                 //A
                 //BC
                 //DEF
                 //GHIJ
        int n=4;
        char ch='A';
        //outer loop
        for(int line=1; line<=4;line++){
            for(int chars=1 ;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }     */
    }
}
