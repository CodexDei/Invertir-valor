
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class InvertirValor {

    //atributos de la clase
    private static String valor;
    private static boolean estado = false;

    public static void main(String[] args) {

        while (!estado) {

            try {

                JOptionPane.showMessageDialog(null, " ㋡ PROGRAMAS FAMILY ACOSTA MORA & CIA ㋡\n" + "                    Bienvenid@\n"
                        + "               ────────╠╣║─────\n"
                        + "                    █ ───║─║╔═║─║─╔═╗ ───▌\n"
                        + "               ─███─╠═╣╠═║─║─║─║──██─\n"
                        + "               ─▐█▐─║─║╚═╚═╚═╚═╝──██─\n"
                        + "                ─▐▐────────────────▌▐─\n"
                        + "               ─▐▐─────-─────────▄▌ ▄▌");

                String lectura = JOptionPane.showInputDialog("Ingrese la opcion que desee:\n"
                        + "1. Ejecutar el programa\n"
                        + "2. Salir");

                int opcion = Integer.parseInt(lectura);

                switch (opcion) {
                    case 1:

                        valor = JOptionPane.showInputDialog("Ingrese el valor a invertir");

                        JOptionPane.showMessageDialog(null, "El valor invertido es:\n " + invertirValor(valor));
                        break;

                    case 2:

                        estado = true;

                        JOptionPane.showMessageDialog(null, "                            Gracias por usar\n"
                                + "㋡ PROGRAMAS FAMILY ACOSTA MORA & CIA ㋡\n");

                        JOptionPane.showMessageDialog(null,
                                "Feliz★* 。 • ˚ ˚ ˛ ˚ ˛ •\n"
                                + "•。★Navidad★ 。* 。\n"
                                + "° 。 ° ˛˚˛ * _Π_____*。*˚\n"
                                + "˚ ˛ •˛•˚ */______/~＼。˚ ˚ \n˛"
                                + "˚ ˛ •˛• ˚ ｜田田 ｜門｜ ˚\n"
                                + "Un feliz año nuevo\n");

                        break;

                    default:

                        JOptionPane.showMessageDialog(null, "Ingrese un valor valido, solo puede ingresar 1 ó 2");
                        break;
                }

            } catch (InputMismatchException e) {

                JOptionPane.showMessageDialog(null, "☢ INGRESE UNA OPCION VALIDA ☢", "ADVERTENCIA ☠☠☠", JOptionPane.WARNING_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "☢ ERROR EN LA EJECUCION: ohoh! ☢", "ADVERTENCIA ☠☠☠", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static String invertirValor(String valor) {

        char[] caracteres = valor.toCharArray();

        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }
        return new String(caracteres);
    }
}
