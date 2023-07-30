public class Main {
    public static void main(String[] args) {
       int numeroUsuario = 150;

       Integer numeroUsuarioWrapper = numeroUsuario;

       Integer outroObjeto = numeroUsuario;


       if(numeroUsuarioWrapper == outroObjeto){
           System.out.println("== - É igual");
       }else{
           System.out.println("== - Não é igual");
       }

        if(numeroUsuarioWrapper.equals(outroObjeto)){
            System.out.println("Equals - É igual");
        }else{
            System.out.println("Equals - Não é igual");
        }
    }
}