public class SquareRoot
{
    public static final double EPSILON = 1e-12;
    
    public static double squareRootGuess(double x, double g)
    {
        if (g*g - x < EPSILON)
        {
            return g;
        }
        
        return squareRootGuess(x, (g + x/g)/2);
    }
    
    public static void squareRoot(double x)
    {
        squareRootGuess(x, 2.57);
    }
    
    public static void main(String[] args)
    {
        squareRoot(7);
    }
    
}