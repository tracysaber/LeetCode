/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.

 Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

 Rectangle Area

 Example:

 Input: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2
 Output: 45
 Note:

 Assume that the total area is never beyond the maximum possible value of int.
 */
public class Leet_223 {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		if(A>G||C<E||B>H||D<F)	return (D-B)*(C-A)+(G-E)*(H-F);
		else{
			int width = Math.min(G,C)-Math.max(A,E);
			int height = Math.min(H,D)-Math.max(B,F);
			return (D-B)*(C-A)+(G-E)*(H-F)-width*height;
		}
	}
}
