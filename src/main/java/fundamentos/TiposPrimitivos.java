package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionario

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //Tipo númericos reais
        float salario = 11_445.44F;
        double vendaAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false; //true

        //Tipo caractere
        char status = 'A'; // ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Numero de viagem
        System.out.println(numerosDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendaAcumuladas);

        System.out.println(id + ":ganha ->" + salario);
        System.out.println("Férias: " + estaDeFerias);
        System.out.println("Status: " +  status);
    }
}
