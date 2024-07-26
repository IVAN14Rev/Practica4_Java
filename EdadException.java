package Practica_4;

public class EdadException extends Exception {

    public EdadException() {

    }

    public EdadException(String mensaje) {
        super(mensaje);
    }

    public EdadException(int edad) throws EdadException {
        this.validarEdad(edad);
    }

    public void validarEdad(int edad) throws EdadException {
        if (!(edad >= 18 && edad <= 45)) {
            // 17,16,15... 46,47...
            throw new EdadException("Eror en la edad, es menos de " + edad);
        }
    }
}
