import java.awt.Color;

public class ChatGPT {
    public static void main(String[] args) {
        // Set the canvas size to 200x200 pixels
        StdDraw.setCanvasSize(200, 200);

        // Set the scale of the coordinate system
        StdDraw.setXscale(0, 200);
        StdDraw.setYscale(0, 200);

        // Set the pen radius to 0.005
        StdDraw.setPenRadius(0.005);

        // Set the pen color to blue
        StdDraw.setPenColor(Color.BLUE);

        // Draw the diamonds
        drawDiamond(50, 150, 25);
        drawDiamond(75, 125, 25);
        drawDiamond(100, 100, 25);
        drawDiamond(125, 125, 25);
        drawDiamond(150, 150, 25);

        // Set the pen color to white
        StdDraw.setPenColor(Color.WHITE);

        // Draw the "D" in the center of the logo
        StdDraw.text(100, 100, "D");
    }

    // Method to draw a diamond shape
    public static void drawDiamond(double x, double y, double size) {
        StdDraw.line(x, y, x + size, y - size);
        StdDraw.line(x + size, y - size, x + size * 2, y);
        StdDraw.line(x + size * 2, y, x + size, y + size);
        StdDraw.line(x + size, y + size, x, y);
    }
}
