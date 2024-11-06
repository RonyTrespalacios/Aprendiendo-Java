/*
    Escribe un programa que genere un número aleatorio entre 1 y 355 y lo muestre por pantalla.
 */
public class Actividad03 {
    public static void main(String[] args) {
        // int nroRandom = (int) (Math.random()*355+1);
        int nroRandom = (int) Math.floor(Math.random() * 355 + 1);
        System.out.println(nroRandom);
    }

}