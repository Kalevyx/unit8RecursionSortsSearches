import java.awt.*;
import java.swing.*;

public class TreeFractalViewer{
    private final int WIDTH = 500;
    private final int HEIGHT = 500;
    
    private JFrame frame;
    
    public static void main(String[]args){
        TreeFractalViewer viewer = new TreeFractalViewer();}
        
    public TreeFractalViewer(){
        frame = new JFrame();
        frame.setTitle("Tree Fractal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);}}