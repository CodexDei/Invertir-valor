public class InvertirValor {

    public String invertirValor(String palabra){

        StringBuilder palabraInvertida = new StringBuilder(palabra);

        return palabraInvertida.reverse().toString();
    }

    public String reorganizarPalabra(String palabra){

        char[] caracteres = palabra.toCharArray();

        for (int i = 0, j = caracteres.length - 1; i < j; i++,j--){

            char aux = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = aux;
        }
        return new String(caracteres);
    }
}
