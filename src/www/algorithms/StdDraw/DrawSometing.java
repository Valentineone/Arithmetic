package www.algorithms.StdDraw;

import edu.princeton.cs.algs4.StdDraw;

public class DrawSometing {
    public static void main(String[] args) {
        int n = 100;
        StdDraw.setXscale(0,n);
        StdDraw.setYscale(0,n*n);
        StdDraw.setPenColor(StdDraw.RED);
        for (int i = 1; i <= n; i++) {
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));
        }
    }
}
