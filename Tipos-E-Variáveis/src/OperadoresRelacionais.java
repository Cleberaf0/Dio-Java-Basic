public class OperadoresRelacionais {

    public static void main(String[] args) {
        String nomeUM = "Cleber";
        String nomeDois = new String("Cleber");

        System.out.println(nomeUM.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNão = numero1 == numero2;

            if(numero1 < numero2){ //true
                System.out.println("A nossa condição é verdadeira");
            }
        System.out.println("numero1 é igual ao numero2? " + simNão);

        simNão = numero1 != numero2;

        System.out.println("numero1 é diferente do numero2? " + simNão);
        
        simNão = numero1 > numero2;

        System.out.println("numero1 é maior que o numero2? " + simNão);

    }
    
}
