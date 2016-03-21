import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

public class TreeFractalPanel extends JPanel{
    private final int PANEL_WIDTH = 500;
    private final int PANEL_HEIGHT = 500;
    
    private final int BOTTOM_X = 250, BOTTOM_Y = 450;
    private final int TOP_X = 250, TOP_Y = 350;
    
    private final double ANGLE_RELATIVE_VERTICAL = 90;
    private double angle = 15;
    
    private double fractionLength = .75;
    private double smallestBranch;
    private double length = 100;
    private double angle1 = 0;
    private double angle2 = 0;
    private final double THETA = 15;
    private int endX1, endY1;
    private int endX2, endY2;
    
    private double startX = 250;
    private double startY = 350;
    
    private int current;
    
    public TreeFractalPanel(int currentOrder){
        current = currentOrder;
        setBackground(Color.black);
        setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));}
    
    public void drawFractal(int order, Graphics2D g2, double startX, double startY, double length, double angle){
        if(order == 1){
            return;}
        else{
            //angle1 += angle;
            //angle2 -= angle;
            length *= fractionLength;
            int endX1 = (int) (startX+length*Math.sin(Math.toRadians(angle)));
            int endY1 = (int) (startY-length*Math.cos(Math.toRadians(angle)));
            //int endX2 = (int) (startX-length*Math.sin(Math.toRadians(angle2)));
            //int endY2 = (int) (startY-length*Math.cos(Math.toRadians(angle2)));
            g2.draw(new Line2D.Double(startX, startY, endX1, endY1));
            g2.draw(new Line2D.Double(startX, startY, endX1, endY1));
            drawFractal(order-1, g2, endX1, endY1, length, angle+THETA);
            drawFractal(order-1, g2, endX1, endY1, length, angle-THETA);}}
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.blue);
        drawFractal(current, g2, startX, startY, length, Math.toRadians(ANGLE_RELATIVE_VERTICAL));}
        //g2.draw(new Line2D.Double(100, endX1, endY1, 0));}
        
    public void setOrder(int order){current = order;}
    
    public int getOrder(){return current;}}
