package ExerciciosDeFixacaoAplications;

    import java.util.Scanner;

public class Aula70Exercicio03QuintoConceito {
    static public void main(String[] args){
            Scanner input = new Scanner(System.in);
            int V;
            int n[] = new int[10];


            V = input.nextInt();
            n[0] = V;

            for (int i = 1; i < 10; i++) {
                n[i] = n[i-1] * 2;
            } for(int i = 0; i < 10; i++){
                System.out.println("N[" + i + "]" + " = " + n[i]);
            }
            input.close();
        }


    }

