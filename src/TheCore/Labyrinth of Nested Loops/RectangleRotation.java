package TheCore.Labyrinth

public class RectangleRotation {
    public static void main(String[] args) {
        System.out.println(bestSolution(6,4));
    }

    private static int bestSolution(int a, int b){
        a=(int)(a/Math.sqrt(2));
        b=(int)(b/Math.sqrt(2));
        int c = (a+1)*(b+1)+a*b;
//        System.out.println("a - " + a + " b - " + b + " c - " + c);
        return c%2==0?c-1:c;
    }

    private static int solutionUsingJavaAWT(int a, int b){
        java.awt.geom.AffineTransform at = new java.awt.geom.AffineTransform();
        at.rotate(Math.toRadians(45));
        java.awt.Shape s = at.createTransformedShape(new java.awt.geom.Rectangle2D.Double(-a/2., -b/2., a, b));
        java.awt.Rectangle bounds = s.getBounds();
        at.
        int cnt=0;
        for(int x=bounds.x; x<bounds.x+bounds.width; x++) {
            for(int y=bounds.y; y<bounds.y+bounds.height; y++) {
                if(s.contains(x, y)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
