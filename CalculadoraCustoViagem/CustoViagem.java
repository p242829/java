/**
 * CustoViagem
 */
public class CustoViagem {

    public static void main(String[] args) {
        int distanciaPercorrida = 100;
        int rendimentoDoCarro = 10;
        int preçoDaGasolina = 5;
        float gastoComGasolina = distanciaPercorrida / rendimentoDoCarro * preçoDaGasolina;
        System.out.println("O custo da viagem é de R$" + gastoComGasolina);

    }
}