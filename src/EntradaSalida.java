import javax.swing.*;

public class EntradaSalida {
    static final int SALIDA_CONSOLA = 1;
    static final int SALIDA_WINDOW = 2;

    /**
     * Salida por ventana o consola de un mensaje
     * @param msj cadena que queremos imprimir
     * @param device dispositivo de salida, consola (SALIDA_CONSOLA) o ventana (SALIDA_WINDOW)
     * @return si es true: correcto si no false
     */
    static boolean salida(String msj, int device){
        switch (device){
            case SALIDA_CONSOLA:
                System.out.println("Consola: "+ msj);
                return true;
            case SALIDA_WINDOW:
                JOptionPane.showMessageDialog(null,"Sale por consola"+msj);
                return true;
            default:
                return false;
        }
    }
}
