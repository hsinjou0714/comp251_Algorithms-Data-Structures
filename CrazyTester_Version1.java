/*
VERSION 1

When you run CrazyTester1Version1.java,
compare your terminal/console output with the EXPECTED OUTPUT below.
You can use text-compare.com or diffchecker.com to compare blocks of text.

There's a good chance that my testers/outputs have bugs,
so if you do spot one, even if you aren't sure, let me know! (jeffery.tang@mail.mcgill.ca or pm me on fb)

EXPECTED OUTPUT

+-------------------+
PART 1 (DISJOINT SETS
+-------------------+

------
TEST 1
------
0
0
0
1 set(s):
0 : 0

------
TEST 2
------
2 set(s):
0 : 0
1 : 1

0
1
0
0
0
0
1 set(s):
0 : 0,1

------
TEST 3
------
0
1
1
1
1
5
7
7
7
3 set(s):
1 : 0,1,2,3,4
6 : 6
7 : 5,7,8,9

------
TEST 4
------
32 set(s):
0 : 0
1 : 1
2 : 2
3 : 3
4 : 4
5 : 5
6 : 6
7 : 7
8 : 8
9 : 9
10 : 10
11 : 11
12 : 12
13 : 13
14 : 14
15 : 15
16 : 16
17 : 17
18 : 18
19 : 19
20 : 20
21 : 21
22 : 22
23 : 23
24 : 24
25 : 25
26 : 26
27 : 27
28 : 28
29 : 29
30 : 30
31 : 31

16 set(s):
1 : 0,1
3 : 2,3
5 : 4,5
7 : 6,7
9 : 8,9
11 : 10,11
13 : 12,13
15 : 14,15
17 : 16,17
19 : 18,19
21 : 20,21
23 : 22,23
25 : 24,25
27 : 26,27
29 : 28,29
31 : 30,31

16 set(s):
1 : 0,1
3 : 2,3
5 : 4,5
7 : 6,7
9 : 8,9
11 : 10,11
13 : 12,13
15 : 14,15
17 : 16,17
19 : 18,19
21 : 20,21
23 : 22,23
25 : 24,25
27 : 26,27
29 : 28,29
31 : 30,31

8 set(s):
3 : 0,1,2,3
7 : 4,5,6,7
11 : 8,9,10,11
15 : 12,13,14,15
19 : 16,17,18,19
23 : 20,21,22,23
27 : 24,25,26,27
31 : 28,29,30,31

4 set(s):
7 : 0,1,2,3,4,5,6,7
15 : 8,9,10,11,12,13,14,15
23 : 16,17,18,19,20,21,22,23
31 : 24,25,26,27,28,29,30,31

2 set(s):
15 : 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
31 : 16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31

1 set(s):
31 : 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31


+----------+
PART 2 (MST)
+-------------+
NOTE: NONE OF THE CASES BELOW DIRECTLY TEST YOUR ISSAFE FUNCTION

NOTE: YOUR LINES MAY BE ORDERED DIFFERENTLY

NOTE: HOWEVER, OUTPUT SHOULD BE OVERALL THE SAME (I MADE IT SO THAT THERE IS ONLY ONE UNIQUE MST)

------
TEST 1
------
2
0 1 1

------
TEST 2
------
3
1 2 1
0 2 2

------
TEST 3
------
13
0 1 -5
1 2 -4
2 3 -3
3 4 -2
4 5 -1
5 6 0
6 7 1
7 8 2
8 9 3
9 10 4
10 11 5
11 12 6

------
TEST 4
------
12
1 2 1
7 9 2
0 6 3
0 7 4
10 11 5
4 9 6
0 11 8
2 6 10
1 3 11
5 6 11
8 11 11


+-------------+
PART 3 (GREEDY)
+-------------+
NOTE: NONE OF THE CASES BELOW DIRECTLY TEST YOUR COMPARE FUNCTION (CUZ THERES MANY WAYS TO DO IT)

------
TEST 1
------
[0]

------
TEST 2
------
[1]

------
TEST 3
------
[1]

------
TEST 4 ([1], [2], [3], and [4] are all valid)
------
[4]

------
TEST 5
------
[1, 2, 3]

------
TEST 6
------
[1, 3, 2, 4, 6, 10, 8, 7, 5, 9]

------
TEST 7 ([0, 1, 2] and [0, 2, 1] and are both valid)
------
[0, 2, 1]

------
TEST 8 (There are multiple answers to the array)
------
[5, 4, 6, 3, 2, 1, 0, 0]
177

------
TEST 9 (There are multiple answers to the array)
------
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 5, 4, 3, 2, 1]
360

*/

package A2;
import java.util.Arrays;

public class CrazyTester_Version1 {
  public static void main(String[] args) {
    /*****
    PART 1
    *****/
    System.out.println("\n+-------------------+");
    System.out.println("PART 1 (DISJOINT SETS");
    System.out.println("+-------------------+\n");

    // Base Case
    System.out.println("------");
    System.out.println("TEST 1");
    System.out.println("------");
    DisjointSets myset = new DisjointSets(1);
    System.out.println(myset.find(0));
    System.out.println(myset.union(0, 0));
    System.out.println(myset.find(0));
    System.out.println(myset);

    // Small Case
    System.out.println("------");
    System.out.println("TEST 2");
    System.out.println("------");
    myset = new DisjointSets(2);
    System.out.println(myset);
    System.out.println(myset.find(0));
    System.out.println(myset.find(1));
    System.out.println(myset.union(0, 0));
    System.out.println(myset.union(1, 0));
    System.out.println(myset.union(0, 1));
    System.out.println(myset.union(1, 1));
    System.out.println(myset);

    // Medium Case
    System.out.println("------");
    System.out.println("TEST 3");
    System.out.println("------");
    myset = new DisjointSets(10);
    System.out.println(myset.union(0, 0));
    System.out.println(myset.union(0, 1));
    System.out.println(myset.union(0, 2));
    System.out.println(myset.union(0, 3));
    System.out.println(myset.union(0, 4));
    System.out.println(myset.union(5, 5));
    System.out.println(myset.union(5, 7));
    System.out.println(myset.union(8, 5));
    System.out.println(myset.union(9, 8));
    System.out.println(myset);

    // Big Case
    System.out.println("------");
    System.out.println("TEST 4");
    System.out.println("------");
    myset = new DisjointSets(32);
    System.out.println(myset);
    for (int i = 0; i < 32; i += 2) {
      myset.union(i, i + 1);
    }
    System.out.println(myset);
    for (int i = 0; i < 32; i += 2) {
      myset.union(i, i + 1);
    }
    System.out.println(myset);
    for (int i = 0; i < 32; i += 4) {
      myset.union(i, i + 2);
    }
    System.out.println(myset);
    for (int i = 0; i < 32; i += 8) {
      myset.union(i, i + 4);
    }
    System.out.println(myset);
    myset.union(3, 13);
    myset.union(18, 30);
    System.out.println(myset);
    myset.union(7, 24);
    System.out.println(myset);

    /*****
    PART 2
    *****/
    System.out.println("\n+----------+");
    System.out.println("PART 2 (MST)");
    System.out.println("+-------------+");
    System.out.println("NOTE: NONE OF THE CASES BELOW DIRECTLY TEST YOUR ISSAFE FUNCTION\n");
    System.out.println("NOTE: YOUR LINES MAY BE ORDERED DIFFERENTLY\n");
    System.out.println("NOTE: HOWEVER, OUTPUT SHOULD BE OVERALL THE SAME (I MADE IT SO THAT THERE IS ONLY ONE UNIQUE MST)\n");

    // Base Case
    System.out.println("------");
    System.out.println("TEST 1");
    System.out.println("------");
    WGraph g = new WGraph();
    g.addEdge(new Edge(0, 1, 1));
    WGraph t = Kruskal.kruskal(g);
    System.out.println(t + "\n");

    // Small Case
    System.out.println("------");
    System.out.println("TEST 2");
    System.out.println("------");
    g = new WGraph();
    g.addEdge(new Edge(0, 1, 3));
    g.addEdge(new Edge(1, 2, 1));
    g.addEdge(new Edge(0, 2, 2));
    t = Kruskal.kruskal(g);
    System.out.println(t + "\n");

    // Long Straightforward Case
    System.out.println("------");
    System.out.println("TEST 3");
    System.out.println("------");
    g = new WGraph();
    g.addEdge(new Edge(0, 1, -5));
    g.addEdge(new Edge(1, 2, -4));
    g.addEdge(new Edge(2, 3, -3));
    g.addEdge(new Edge(3, 4, -2));
    g.addEdge(new Edge(4, 5, -1));
    g.addEdge(new Edge(5, 6, 0));
    g.addEdge(new Edge(6, 7, 1));
    g.addEdge(new Edge(7, 8, 2));
    g.addEdge(new Edge(8, 9, 3));
    g.addEdge(new Edge(9, 10, 4));
    g.addEdge(new Edge(10, 11, 5));
    g.addEdge(new Edge(11, 12, 6));
    t = Kruskal.kruskal(g);
    System.out.println(t + "\n");

    // Long Case
    System.out.println("------");
    System.out.println("TEST 4");
    System.out.println("------");
    g = new WGraph();
    g.addEdge(new Edge(0, 6, 3));
    g.addEdge(new Edge(0, 7, 4));
    g.addEdge(new Edge(0, 11, 8));
    g.addEdge(new Edge(1, 2, 1));
    g.addEdge(new Edge(1, 3, 11));
    g.addEdge(new Edge(1, 6, 100));
    g.addEdge(new Edge(1, 9, 100));
    g.addEdge(new Edge(1, 10, 100));
    g.addEdge(new Edge(1, 11, 100));
    g.addEdge(new Edge(2, 6, 10));
    g.addEdge(new Edge(4, 9, 6));
    g.addEdge(new Edge(5, 6, 11));
    g.addEdge(new Edge(6, 7, 7));
    g.addEdge(new Edge(7, 8, 100));
    g.addEdge(new Edge(7, 9, 2));
    g.addEdge(new Edge(7, 10, 9));
    g.addEdge(new Edge(8, 9, 100));
    g.addEdge(new Edge(8, 11, 11));
    g.addEdge(new Edge(9, 10, 9));
    g.addEdge(new Edge(10, 11, 5));
    t = Kruskal.kruskal(g);
    System.out.println(t + "\n");

    /*****
    PART 3
    *****/
    System.out.println("\n+-------------+");
    System.out.println("PART 3 (GREEDY)");
    System.out.println("+-------------+");
    System.out.println("NOTE: NONE OF THE CASES BELOW DIRECTLY TEST YOUR COMPARE FUNCTION (CUZ THERES MANY WAYS TO DO IT)\n");

    // Base Case 1
    System.out.println("------");
    System.out.println("TEST 1");
    System.out.println("------");
    int[] weights = new int[] {0}; 
		int[] deadlines = new int[] {0};
		int m = weights.length;
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		int[] res = schedule.SelectAssignments();
    System.out.println(Arrays.toString(res) + "\n");
    
    // Base Case 2
    System.out.println("------");
    System.out.println("TEST 2");
    System.out.println("------");
    weights = new int[] {0}; 
		deadlines = new int[] {1};
		m = weights.length;
		schedule =  new HW_Sched(weights, deadlines, m);
		res = schedule.SelectAssignments();
    System.out.println(Arrays.toString(res) + "\n");

    // Base Case 3
    System.out.println("------");
    System.out.println("TEST 3");
    System.out.println("------");
    weights = new int[] {1}; 
		deadlines = new int[] {1};
		m = weights.length;
		schedule =  new HW_Sched(weights, deadlines, m);
		res = schedule.SelectAssignments();
    System.out.println(Arrays.toString(res) + "\n");

    // Base Case 4
    System.out.println("------");
    System.out.println("TEST 4 ([1], [2], [3], and [4] are all valid)");
    System.out.println("------");
    weights = new int[] {50}; 
		deadlines = new int[] {4};
		m = weights.length;
		schedule =  new HW_Sched(weights, deadlines, m);
		res = schedule.SelectAssignments();
    System.out.println(Arrays.toString(res) + "\n");

    // Small Straightforward Case
    System.out.println("------");
    System.out.println("TEST 5");
    System.out.println("------");
    weights = new int[] {20, 40, 40}; 
		deadlines = new int[] {1, 2, 3};
		m = weights.length;
		schedule =  new HW_Sched(weights, deadlines, m);
		res = schedule.SelectAssignments();
    System.out.println(Arrays.toString(res) + "\n");

    // Large Straightforward Case
    System.out.println("------");
    System.out.println("TEST 6");
    System.out.println("------");
    weights = new int[] {5, 5, 5, 5, 10, 10, 10, 15, 15, 20}; 
		deadlines = new int[] {1, 3, 2, 4, 6, 10, 8, 7, 5, 9};
		m = weights.length;
		schedule =  new HW_Sched(weights, deadlines, m);
		res = schedule.SelectAssignments();
    System.out.println(Arrays.toString(res) + "\n");

    // Small Tricky Case
    System.out.println("------");
    System.out.println("TEST 7 ([0, 1, 2] and [0, 2, 1] and are both valid)");
    System.out.println("------");
    weights = new int[] {20, 40, 40}; 
		deadlines = new int[] {1, 2, 2};
		m = weights.length;
		schedule =  new HW_Sched(weights, deadlines, m);
		res = schedule.SelectAssignments();
    System.out.println(Arrays.toString(res) + "\n");

    // Medium Tricky Case
    System.out.println("------");
    System.out.println("TEST 8 (There are multiple answers to the array)");
    System.out.println("------");
    weights = new int[] {35, 35, 2, 30, 25, 50, 20, 100}; 
		deadlines = new int[] {5, 4, 6, 3, 4, 1, 2, 0};
		m = weights.length;
		schedule =  new HW_Sched(weights, deadlines, m);
		res = schedule.SelectAssignments();
    System.out.println(Arrays.toString(res));
    int sumOfWeights = 0;
    for (int i = 0; i < res.length; i++) {
      sumOfWeights += Math.min(res[i], 1) * weights[i];
    }
    System.out.println(sumOfWeights + "\n");

    // Large Tricky Case
    System.out.println("------");
    System.out.println("TEST 9 (There are multiple answers to the array)");
    System.out.println("------");
    weights = new int[] {10, 20, 20, 30, 30, 30, 40, 40, 40, 40, 50, 50, 50, 50, 50, 60, 60, 60, 60, 60, 60}; 
		deadlines = new int[] {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6};
		m = weights.length;
		schedule =  new HW_Sched(weights, deadlines, m);
		res = schedule.SelectAssignments();
    System.out.println(Arrays.toString(res));
    sumOfWeights = 0;
    for (int i = 0; i < res.length; i++) {
      sumOfWeights += Math.min(res[i], 1) * weights[i];
    }
    System.out.println(sumOfWeights + "\n");
  }
}