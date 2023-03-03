import javax.swing.JOptionPane;

public class UncheckedException {

    //Fazer a divisão de dois números inteiros 
    public static void main(String[] args) throws Exception {

        boolean continueLooping = true;
        do{

        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");


        try{
        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);
        continueLooping = false;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada inválida informe um número inteiro! ");
            //e.printStackTrace();
        }catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Impossivél dividir o número por 0 ");
            //e.printStackTrace();
        }
        finally{
            System.out.println("Chegou no finally!");
        }


        }while(continueLooping);
        
        System.out.println("Chegou até aqui...");
    }

    public static int dividir(int a, int b){
         return a / b;
        }
}
