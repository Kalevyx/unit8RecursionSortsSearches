import java.awt.*;
import javax.swing.JPanel;

public class TreeFractalPanel extends JPanel{
    private final int PANEL_WIDTH = 500;
    private final int PANEL_HEIGHT = 500;
    
    private final int BOTTOM_X = 250, BOTTOM_Y = 450;
    private final int TOP_X = 250, TOP_Y = 350;
    
    private double fractionLength;
    private double smallestBranch;
    private double angle;
    private double angle1;
    private double angle2;
    private int endX1, endY1;
    private int endX2, endY2;
    
    
    public void drawFractal(Graphics2D g2, double startX, double startY, double length, double angleRelativeVertical){
        angle1 += angleRelativeVertical;
        angle2 -= angleRelativeVertical;
        length *= fractionLength;
        int endX1 = (int) (startX-length*Math.sin(angle1));
        int endy1 = (int) (startY-length*Math.cos(angle1));
        int endX2 = (int) (startX-length*Math.sin(angle2));
        int endY2 = (int) (startY-length.Math.cos(angle2));
        g2.draw(new Line2D.Double(BOTTOM_X, BOTTOM_Y, TOP_X, TOP_Y));}
        
    public void paintComponent(Graphics2D g2){
        super.paintComponent(g2);
        
        drawFractal(g2, BOTTOM_X, BOTTOM_Y, TOP_X, TOP_Y,Math.toRadian());}}