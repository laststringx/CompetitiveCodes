import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import java.util.Scanner;

public class Shootout {

	/**
	 * @param args
	 */
	public static boolean isPointOnTheLine(Point2D.Double A, Point2D.Double B,
			Point2D.Double P) {
		double m = (B.y - A.y) / (B.x - A.x);

		// handle special case where the line is vertical
		if (Double.isInfinite(m)) {
			if (A.x == P.x)
				return true;
			else
				return false;
		}

		if ((P.y - A.y) == m * (P.x - A.x))
			return true;
		else
			return false;
	}

	public static boolean shareAnyPoint(Point2D.Double A, Point2D.Double B,
			Point2D.Double C, Point2D.Double D) {
		if (isPointOnTheLine(A, B, C))
			return true;
		else if (isPointOnTheLine(A, B, D))
			return true;
		else if (isPointOnTheLine(C, D, A))
			return true;
		else if (isPointOnTheLine(C, D, B))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {

			Point2D.Double a = new Point2D.Double(sc.nextInt(), sc.nextInt());
			Point2D.Double b = new Point2D.Double(sc.nextInt(), sc.nextInt());
			Point2D.Double c = new Point2D.Double(sc.nextInt(), sc.nextInt());
			Point2D.Double d = new Point2D.Double(sc.nextInt(), sc.nextInt());

			boolean intersects = Line2D.linesIntersect(a.x, a.y, c.x, c.y, b.x,
					b.y, d.x, d.y);
			boolean shareAnyPoint = shareAnyPoint(a, b, c, d);
			if (intersects && shareAnyPoint) {
				System.out.println("Yes");
			} else if (intersects && !shareAnyPoint) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}

	}
}
