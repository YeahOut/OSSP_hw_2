import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("학번을 입력하세요 : ");
        String number = sc.nextLine();
        System.out.print("팀이름을 입력하세요 : ");
        String team = sc.nextLine();
        System.out.println( );
        System.out.println("<출력>");
        System.out.println("이름 : " + name);
        System.out.println("학번 : " + number);
        System.out.println("팀이름 : " + team);
    }
}
