//https://en.wikipedia.org/wiki/Knapsack_problem
//The knapsack problem or rucksack problem is a problem in combinatorial optimization: Given a set of items, each with a weight and a value, determine the number of each item to include in a collection so that the total weight is less than or equal to a given limit and the total value is as large as possible. It derives its name from the problem faced by someone who is constrained by a fixed-size knapsack and must fill it with the most valuable items.
//http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/
class Knapsack
{
 
    // A utility function that returns maximum of two integers
     static int max(int a, int b) { return (a > b)? a : b; }
      
     // Returns the maximum value that can be put in a knapsack of capacity W
     static int knapSack(int W, int wt[], int val[], int n)
     {
        // Base Case
    if (n == 0 || W == 0)
        return 0;
      
    // If weight of the nth item is more than Knapsack capacity W, then
    // this item cannot be included in the optimal solution
    if (wt[n-1] > W)
       return knapSack(W, wt, val, n-1);
      
    // Return the maximum of two cases: 
    // (1) nth item included 
    // (2) not included
    else return max( val[n-1] + knapSack(W-wt[n-1], wt, val, n-1),
                     knapSack(W, wt, val, n-1)
                      );
      }
 
   
   // Driver program to test above function
   public static void main(String args[])
   {
        int val[] = new int[]{1, 2, 3};
        int wt[] = new int[]{10, 20, 30};
    int  W = 50;
    int n = val.length;
    System.out.println(knapSack(W, wt, val, n));
    }
}