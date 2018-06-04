import java.util.Scanner;

public class Wspolrzedne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj współrzędną X: ");
        int x = scan.nextInt();
        System.out.println("Podaj współrzędną Y: ");
        int y = scan.nextInt();

        if(x>0){
            if(y>0){
                System.out.println("Liczba znajduje się w ćwiartce nr I");
            }else if(y<0){
                System.out.println("Liczba znajduje się w ćwiartce nr IV");
            }else{
                System.out.println("Liczba jest na osi X");
            }
            if (x<0){
                if (y<0){
                    System.out.println("Liczba znajduje się w ćwiartce nr III");
                }
            }else if(y>0){
                System.out.println("Liczba znajduje się w ćwiartce nr II");
            }else{
                System.out.println("Liczba leży na osi X");
            }

        }else{
            System.out.println("Liczba znajduje się na osi Y");
        }
    }
}
