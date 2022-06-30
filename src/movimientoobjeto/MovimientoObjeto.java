
package movimientoobjeto;

public class MovimientoObjeto {
    private int posX;
    private int posY;

    public MovimientoObjeto(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    public void movArriba(int inc) {
        posY += inc;
        System.out.println("Me he movido hacia arriba, mi posicion actual es ("+posX+","+posY+")");
    }
    
    public void movDerecha(int inc) {
        posX += inc;
        System.out.println("Me he movido hacia la derecha, mi posicion actual es ("+posX+","+posY+")");
    }
    
    public void movAbajo(int inc) {
        posY -= inc;
        System.out.println("Me he movido hacia abajo, mi posicion actual es ("+posX+","+posY+")");
    }
    
    public void movIzquierda(int inc) {
        posX -= inc;
        System.out.print("Me he movido hacia la izquierda, mi posicion actual es ("+posX+","+posY+")");
    }
}
