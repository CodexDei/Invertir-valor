
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class InvertirValor {

    //atributos de la clase
    private String valor;
    private  static String valorInvertido;
    private  static boolean estado = false;

    public static void main(String[] args) {

        while (!estado) {

            try {

                String lectura = JOptionPane.showInputDialog("Ingrese la opcion que desee:\n"
                        + "1. Para ejecutar el programa\n"
                        + "2. Salir");

                int opcion = Integer.parseInt(lectura);

                switch (opcion) {
                    case 1:

                        String valor = JOptionPane.showInputDialog("Ingrese el valor que desea invertir:");
                        valorInvertido = invertirValor(valor);
                        
                        JOptionPane.showMessageDialog(null, "El valor invertido es:\n" + valorInvertido);

                        break;
                        
                    case 2:
                        
                        estado = true;
                        break;
                    
                    default:
                        
                        JOptionPane.showMessageDialog(null,"Ingrese un valor valido, solo puede ingresar 1 ó 2"); 
                        break;
                }

            } catch (InputMismatchException e) {
              JOptionPane.showMessageDialog(null,"ERROR! INGRESE UN VALOR VALIDO");
            } catch (Exception e){
              JOptionPane.showMessageDialog(null,"ERROR! POR FAVOR INGRESE UN VALOR VALIDO");
            }
        }
    }

    public static String invertirValor(String valor){
        
        char []caracteres = valor.toCharArray();
        
        for (int i = 0, j = caracteres.length -1; i < j; i++, j--) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }
        return new String(caracteres);
    }
}
