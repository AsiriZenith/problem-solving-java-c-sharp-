 package weiss.util;
2
3 // Random class
4 //
5 // CONSTRUCTION: with (a) no initializer or (b) an integer
6 // that specifies the initial state of the generator.
7 // This random number generator is really only 31 bits,
8 // so it is weaker than the one in java.util.
9 //
10 // ******************PUBLIC OPERATIONS*********************
11 // Return a random number according to some distribution:
12 // int nextInt( ) --> Uniform, [1 to 2^31-1)
13 // double nextDouble( ) --> Uniform, (0 to 1)
14 // int nextInt( int high ) --> Uniform [0..high)
15 // int nextInt( int low, int high ) --> Uniform [low..high]
16 // int nextPoisson( double expectedVal ) --> Poisson
17 // double nextNegExp( double expectedVal ) --> Negative exponential
18 // void permute( Object [ ] a ) --> Randomly permutate
19
20 /**
21 * Random number class, using a 31-bit
22 * linear congruential generator.
23 */
24 public class RandomNumber
25 {
26 public Random( )
27 { /* Figure 9.2 */ }
28 public Random( int initialValue )
29 { /* Figure 9.2 */ }
30 public int nextInt( )
31 { /* Figure 9.2 */ }
32 public int nextInt( int high )
33 { /* Implementation in online code. */ }
34 public double nextDouble( )
35 { /* Implementation in online code. */ }
36 public int nextInt( int low, int high )
37 { /* Implementation in online code. */ }
38 public int nextPoisson( double expectedValue )
39 { /* Figure 9.4 */ }
40 public double nextNegExp( double expectedValue )
41 { /* Figure 9.5 */ }
42 public static final void permute( Object [ ] a )
43 { /* Figure 9.6 */ }
44 private void swapReferences( Object [ ] a, int i, int j )
45 { /* Implementation in online code. */ }
46
47 private int state;
48 }