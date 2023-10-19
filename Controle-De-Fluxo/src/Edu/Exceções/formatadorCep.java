package Edu.Exceções;

public class formatadorCep {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("23765041");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O Cep não corresponde com as regras de negócio");
        }

    }

        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
              throw new CepInvalidoException();
            
              //simulando um cep formatado
              return cep;
        }
    

}
