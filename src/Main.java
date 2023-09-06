import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.print("Test Edilecek Kelimeyi Giriniz :");
    Scanner input=new Scanner(System.in);
    String str=input.nextLine();
        if (isPalindrome(str)) {
            System.out.println("Girilen metin bir palindromdur.");
        } else {
            System.out.println("Girilen metin bir palindrom degildir.");
        }

    }
    public static boolean isPalindrome(String str){
        str=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int uzunluk=str.length();
        for (int i = 0; i < uzunluk / 2; i++) {
            if (str.charAt(i) != str.charAt(uzunluk - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}