public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        //for(int i = 1; i <= 5; i++) {
            //System.out.println(i);
            
            //tratando exceções com try e catch
            //try {
            //	int a = i/0;
            //}
            //catch (Exception e){
            //	String msg = e.getMessage();
            //	System.out.println("Exceção: " + msg);
            //}
        //}
        
        
        throw new TesteExcecao("Erro");
        //jogando uma exceção
        //throw new ArithmeticException("Erro!");
        
        //System.out.println("Fim do metodo2");
    }
}