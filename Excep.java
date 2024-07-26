package Practica_4;

public class Excep {
    public static void main(String[] args) {
        EdadException edEx = new EdadException();

        try {
            int edad = 48;
            edEx.validarEdad(edad);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            System.out.println("Entré al catch");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Continuación del programa en Java");
    }
}