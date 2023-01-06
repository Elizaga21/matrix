import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][], b[][], suma[][];
        int i,j;
        a = new int[2][2];
        b = new int[2][2];

        System.out.println ("Matriz 1:");
        for (i=0;i<2;i++)
        {
            for (j=0;j<2;j++)
            {
                System.out.print("Introduce el valor de ["+i+"]["+j+"]: ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println ("Matriz 2:");
        for (i=0;i<2;i++)
        {
            for (j=0;j<2;j++)
            {
                System.out.print("Introduce el valor de ["+i+"]["+j+"]: ");
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println ("Matriz 1:" );
        for (i=0;i<2;i++)
        {
            for (j=0;j<2;j++)
            {
                System.out.print (a[i][j] + " ");
            }
            System.out.println ();

        }
        System.out.println ("Matriz 2:");
        for (i=0;i<2;i++)
        {
            for (j=0;j<2;j++)
            {

                System.out.print (b[i][j] + " ");
            }
            System.out.println ();
            }

        suma = new int[2][2];
        for (i=0;i<2;i++)
        {
            for (j=0;j<2;j++)
            {
                suma[i][j] = a[i][j] + b[i][j];
            }

        }
        System.out.println ("Matriz Resultado:");
        for (i=0;i<2;i++)
        {
            for (j=0;j<2;j++)
            {
                System.out.print (suma[i][j] + " ");
            }
            System.out.println ();
    }
    }
}

