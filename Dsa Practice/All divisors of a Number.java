Problem-->
  
  Given an integer n, print all the divisors of N in the ascending order.

    https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1

Solution-->( Brute Force Approach )

class Solution {
    public static void print_divisors(int n) {
        // code here
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            System.out.print(i+" ");
        }
    }
}

Solution-->(Optimal Approach)

  class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer> al = new ArrayList<>();
        int num = 1;
        while (num * num <= n) {
            // find divisors
            if (n % num == 0) {
                if (num == n / num) {
                    // n is the square of current num
                    System.out.print(num + " ");
                } else {
                    System.out.print(num + " ");
                    al.add(n / num);
                }
            }
            num += 1;
        }
        for (int i = al.size() - 1; i >= 0; i--)
            System.out.print(al.get(i) + " ");
    }
}
