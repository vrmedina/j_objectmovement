
package movimientoobjeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("*** Programa que mueve un objeto en direcciones distintas ***");
        System.out.print("Digite la coordenada inicial x: ");
        int x = in.nextInt();
        System.out.print("Digite la coordenada inicial y: ");
        int y = in.nextInt();
        MovimientoObjeto objeto = new MovimientoObjeto(x,y);
        int op,n;
        do {
            System.out.println("MENU: ");
            System.out.println("1. Mover Arriba");
            System.out.println("2. Mover Derecha");
            System.out.println("3. Mover Abajo");
            System.out.println("4. Mover Izquierda");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            op = in.nextInt();
            if (op == 1) {
                System.out.print("Selecciono Arriba, cuantas unidades se quiere mover?: ");
                n = in.nextInt();
                objeto.movArriba(n);
            }else if (op == 2) {
                System.out.print("Selecciono Derecha, cuantas unidades se quiere mover?: ");
                n = in.nextInt();
                objeto.movDerecha(n);
            }else if (op == 3) {
                System.out.print("Selecciono Abajo, cuantas unidades se quiere mover?: ");
                n = in.nextInt();
                objeto.movAbajo(n);
            }else if (op == 4) {
                System.out.print("Selecciono Izquierda, cuantas unidades se quiere mover?: ");
                n = in.nextInt();
                objeto.movIzquierda(n);
            }else if (op == 5) {
                System.out.println("Selecciono salir, hasta pronto");
            }else {
                System.out.println("Lo sentimos, la opcion digitada no existe en el menu");
            }
        }while(op != 5);
        System.out.println("Ejecucion terminada...");
    }
}
