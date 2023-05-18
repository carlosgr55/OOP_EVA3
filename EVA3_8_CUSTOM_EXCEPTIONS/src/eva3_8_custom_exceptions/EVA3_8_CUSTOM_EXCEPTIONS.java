package eva3_8_custom_exceptions;

public class EVA3_8_CUSTOM_EXCEPTIONS {

    public static void main(String[] args) {

        Persona person = new Persona();
        person.setApellido("Björk");
        person.setNombre("Bjork");
        try {
            person.setEdad(-56465);
        } catch (DatoEntradaCheckedException e) {
            System.out.println(e.getMessage());
        }

    }
}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) throws DatoEntradaCheckedException {
        this.nombre = nombre;
        this.apellido = apellido;
        this.setEdad(edad);
    }

    public Persona() {
        this.nombre = "--";
        this.apellido = "--";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoEntradaCheckedException {
        if (edad < 0) {
            //throw new DatoEntradaException(); //Unchecked
            throw new DatoEntradaCheckedException();
        }
        this.edad = edad;
    }

}

class DatoEntradaException extends RuntimeException {

    public DatoEntradaException() {
        super("Dato de entrada incorrecto solo puede ser postivo");

    }

}

class DatoEntradaCheckedException extends Exception {

    public DatoEntradaCheckedException() {
        super("Dato de entrada incorrecto solo puede ser postivo checked");
    }

}
