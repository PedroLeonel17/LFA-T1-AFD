public class App {
    static enum estados {
        q0, q1, q2
    }

    public static void main(String[] args) {

        estados estado = estados.q0;
        String palavra = "bababb";
        boolean palavraCorreta = false;
        boolean rodando = true;
        int letra = 0;

        while (rodando) {
            if (estado == estados.q0) {
                if (palavra.charAt(letra) == 'b') {
                    estado = estados.q1;
                } else if (palavra.charAt(letra) == 'a') {
                    rodando = false;
                    palavraCorreta = false;
                }
            } else if (estado == estados.q1) {
                if (palavra.charAt(letra) == 'b') {
                    estado = estados.q2;
                } else if (palavra.charAt(letra) == 'a') {
                    estado = estados.q0;
                }
            } else if (estado == estados.q2) {
                rodando = false;
                if (letra == palavra.length() - 1)
                    palavraCorreta = true;
            }
            if (estado != estados.q2)
                letra++;
        }

        System.out.println(palavraCorreta);
    }
}