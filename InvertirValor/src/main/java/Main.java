import javax.swing.*;
import java.util.InputMismatchException;

public class Main {

    public static boolean estado = false;

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
                        + "1. Invertir y reorganizar valor\n"
                        + "2. Salir");

                int opcion = Integer.parseInt(lectura);

                switch (opcion) {
                    case 1:

                        InvertirValor iv = new InvertirValor();

                        String valor = JOptionPane.showInputDialog("Ingrese el valor a invertir");

                        String valorInvertido = iv.invertirValor(valor);

                        JOptionPane.showMessageDialog(null,
                                            "El valor invertido es:\n " + valorInvertido);
                        JOptionPane.showMessageDialog(null,
                                            "Palabra reorganizada: " + iv.reorganizarPalabra(valorInvertido));
                        break;

                    case 2:

                        estado = true;

                        JOptionPane.showMessageDialog(null, "                            Gracias por usar\n"
                                + "㋡ PROGRAMAS FAMILY ACOSTA MORA & CIA ㋡\n");

                        JOptionPane.showMessageDialog(null,
                                "Feliz★* 。 • ˚ ˚ ˛ ˚ ˛ •\n"
                                        + "•。★Dia★ 。* 。\n"
                                        + "° 。 ° ˛˚˛ * _Π_____*。*˚\n"
                                        + "˚ ˛ •˛•˚ */______/~＼。˚ ˚ \n˛"
                                        + "˚ ˛ •˛• ˚ ｜田田 ｜門｜ ˚\n"
                                        + "Dios te bendiga\n");

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
}
