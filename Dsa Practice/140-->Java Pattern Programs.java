import java.util.Scanner;
public class Pattern
        {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter The Number");
                int n = sc.nextInt();
/* 1-->Square Hollow Pattern

                               ******
                               *    *
                               *    *
                               *    *
                               *    *
                               ******
 */

                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(i==1||i==n||j==1||j==n)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }
/* 2-->Number Triangle Pattern-->


                 1
                2 2
               3 3 3
              4 4 4 4

 */
                    for(int i=1;i<=n;i++)
                    {
                        for(int j=1;j<=n-i;j++)
                        {
                            System.out.print(" ");
                        }
                        for(int k=1;k<=i;k++)
                        {
                            System.out.print(i+" ");
                        }
                        System.out.println();

                    }
/* 3-->Number Increasing Pyramid-->

                1
                1 2
                1 2 3
                1 2 3 4

 */
            for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }

/* 4-->Number Increasing Reverse Pyramid-->
              1 2 3 4
              1 2 3
              1 2
              1
 */

                for(int i=n;i>0;i--)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }

/* 5-->Number Changing Pyramid-->

              1
              2 3
              4 5 6
              7 8 9 10

 */
                int num=1;
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(num+" ");
                        num++;
                    }
                    System.out.println();
                }


/* 6--> Zero-One Triangle-->

                1
                0 1
                1 0 1
                0 1 0 1

 */
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        if((i+j)%2==0)
                        System.out.print("1"+" ");
                        else
                            System.out.print("0"+" ");
                    }
                    System.out.println();
                }
/* 7--> Palindrome Triangle-->

              1
            2 1 2
          3 2 1 2 3
        4 3 2 1 2 3 4

 */
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=(n-i);j++)//for better space use-->2*(n-i),{k+" "} it take two space so we need double space
                    {
                        System.out.print(" ");
                    }
                    for(int k=i;k>=1;k--)
                    {
                        System.out.print(k);
                    }
                    for(int l=2;l<=i;l++)
                    {
                        System.out.print(l);
                    }
                    System.out.println();
                }


/* 8--> Rhombus Pattern-->

                * * * *
                 * * * *
                  * * * *
                    * * * *

 */
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int k=1;k<=n;k++)
                    {
                        System.out.print("*"+" ");
                    }
                    System.out.println();
                }

/* 9-->Diamond Pattern-->

                   *
                  * *
                 * * *
                * * * *
                 * * *
                  * *
                   *

 */

                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int k=1;k<=i;k++) {
                        System.out.print("*"+" ");
                    }
                    System.out.println();
                }
                for(int i=1;i<=n-1;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int k=n-i;k>=1;k--)
                    {
                        System.out.print("*"+" ");
                    }
                    System.out.println();
                }


/* 10-->Butterfly Star Pattern-->

                *        *
                **      **
                ***    ***
                ****  ****
                **********
                ****  ****
                ***    ***
                **      **
                *        *

 */

                for(int i=1;i<=n;i++)//Upper Part
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("*"+" ");//Here i use extra space after star for better look;
                    }
                    for(int j=1;j<=(n-i)*4;j++)//Here i use 4 for double space{actual space(2) + space after single star(2)};
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("*"+" ");
                    }
                    System.out.println();
                }
                for(int i=1;i<n;i++)//Lower Part
                {
                    for(int j=n-i;j>=1;j--)
                    {
                        System.out.print("*"+" ");
                    }
                    for(int j=1;j<=(i*4);j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=n-i;j>=1;j--)
                    {
                        System.out.print("*"+" ");
                    }
                    System.out.println();
                }

//10-->Butterfly( optimized case)-->
                    // Outer loop to handle the upper part
                    for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= 2 * n; j++) {

                        // To print spaces
                        if (j > i && j <= 2 * n - i) {
                            System.out.print(" ");
                        }

                        // To print stars
                        else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }

                // Outer loop to handle the lower part
                for (int i = n-1;i>=1;i--) {
                    for (int j = 1; j <= 2 * n; j++) {

                        // To print spaces
                        if (j > i && j <= 2 * n - i) {
                            System.out.print(" ");
                        }

                        // To print stars
                        else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }

/* 11--> Square Fill Pattern

                * * * * *
                * * * * *
                * * * * *
                * * * * *
                * * * * *

 */
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        System.out.print("*"+" ");
                    }
                    System.out.println();
                }



/* 12--> Right Half Pyramid Pattern

                *
                * *
                * * *
                * * * *
                * * * * * *

 */

            for(int i=1;i<=n;i++)
                {
                    for( int j=1;j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }



/*13-->Reverse Right Half Pyramid Pattern

                * * * *
                * * *
                * *
                *


 */
                for(int i=n;i>=1;i--)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }


/*14--> Reverse Left Half Pyramid Pattern

                      *
                    * *
                  * * *
                * * * *


 */
                for(int i=1;i<=n;i++)
                {
                    for (int j=1;j<n-1;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

/*15--> Reverse Left Half Pyramid Pattern

                * * * *
                  * * *
                    * *
                      *


 */
                for(int i=n;i>=1;i--)
                {
                    for(int j=1;j<=2*(n-i);j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }


/*16-->Reverse Number Triangle Pattern

                * * * * *
                * * * *
                * * *
                * *
                *
                * *
                * * *
                * * * *
                * * * * *

 */
                for(int i=n;i>=1;i--)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                for(int i=2;i<=n;i++)
                {
                    for(int j=1;j<=i;j--)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

/*17-->Triangle Star Pattern

                    *
                   * *
                  * * *
                 * * * *
                * * * * *

 */
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }


/*18--> Reverse Number Triangle Pattern

                1 2 3 4
                 2 3 4
                  3 4
                   4

 */
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=i;j<=n;j++)
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }


/*19--> Mirror Image Triangle Pattern

                1 2 3 4
                 2 3 4
                  3 4
                   4
                  3 4
                 2 3 4
                1 2 3 4

 */

                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=i;j<=n;j++)
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                 for(int i=n-1;i>=1;i--)
                 {
                     for(int j=2;j<=i;j++)
                     {
                         System.out.print(" ");
                     }
                     for(int j=i;j<=n;j++)
                     {
                         System.out.print(j+" ");
                     }
                     System.out.println();
                 }


/*20-->Hollow Triangle Pattern

                     *
                    * *
                   *   *
                  *     *
                 *       *
                * * * * * *
 */

                for(int i=1;i<=n;i++)
                {
                    for(int j=i;j<n;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=2*i-1;j++)
                    {
                        if(j==1||j==(2*i-1)||i==n)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }


/*21-->Hollow Reverse Triangle Pattern
                * * * * * *
                 *       *
                  *     *
                   *   *
                    * *
                     *

 */

                for(int i=n;i>=1;i--)
                {
                    for(int j=i;j<n;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=(2*i-1);j++)
                    {
                        if(j==1||j==(2*i-1)||i==n)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }


/*22--> Hollow Diamond Pyramid

                        *
                      *  *
                     *    *
                    *      *
                   *        *
                    *      *
                     *    *
                      *  *
                       *

 */

                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=(2*i-1);j++)
                    {
                        if(j==1||j==(2*i-1))
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                for(int i=n-1;i>=1;i--)
                {
                    for(int j=i;j<n;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=(2*i-1);j++)
                    {
                        if(j==1||j==2*i-1)
                        System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }

/*23-->Hollow Hourglass Pattern

                 * * * * * *
                  *       *
                   *     *
                    *   *
                     * *
                      *
                     * *
                    *   *
                   *     *
                  *       *
                 * * * * * *


 */
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=i;j<=n;j++)
                    {
                        if(i==1||j==i||j==n)
                        {
                            System.out.print("* ");
                        }
                        else
                        {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                for(int i=n-1;i>=1;i--)
                {
                    for(int j=1;j<i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=i;j<=n;j++)
                    {
                        if(i==1||j==n||j==i)
                        {
                            System.out.print("* ");
                        }
                        else
                        {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }


/*24--> Pascal's Triangle

                 1
                1 1
               1 2 1
              1 3 3 1
             1 4 6 4 1
            1 5 10 10 5 1


 */

                for (int i = 1; i <= n; i++)
                {
                    for (int j = 0; j <= n - i; j++)
                    {
                        // for left spacing
                        System.out.print(" ");
                    }
                    // used to represent x(i, k)
                    int x = 1;
                    for (int k = 1; k <= i; k++) {

                        // The first value in a line is always 1
                        System.out.print(x + " ");
                        x = x * (i - k) / k;
                    }
                    System.out.println();
                }


/*25-->Right Pascal’s Triangle

                *
                * *
                * * *
                * * * *
                * * * * *
                * * * *
                * * *
                * *
                *

 */
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                for(int i=n-1;i>=1;i--)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
