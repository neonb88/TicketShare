import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        int x_min = 0;
        int y_min = 0;
        int x_max = W;
        int y_max = H;

        // game loop
        while (true)
        {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            if (bombDir.contains("U"))
            {
                y_max = Y0;
            }
            if (bombDir.contains("D"))
            {
                y_min = Y0;
            }
            if (bombDir.contains("R"))
            {
                x_min = X0;
            }
            if (bombDir.contains("L"))
            {
                x_max = X0;
            }

           // the location of the next window Batman should jump to.
           X0 = (x_max + x_min) / 2;
           Y0 = (y_max + y_min) / 2;
           System.out.println(X0 + " " + Y0);
        }
    }
}
