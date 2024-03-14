package cadenas;

public class Ejer18Alter {
	
    public static void main(String[] args) {
        String cadena = "coger una cadena y poner la primera letra de cada palabra en mayúsculas";
        String[] palabras = cadena.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                char primeraLetra = Character.toUpperCase(palabra.charAt(0));
                String restoPalabra = palabra.substring(1);
                resultado.append(primeraLetra).append(restoPalabra).append(" ");
            }
        }

        String resultadoFinal = resultado.toString().trim();
        System.out.println(resultadoFinal);
    }
}
    
