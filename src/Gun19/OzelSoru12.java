package Gun19;

import java.util.Scanner;

public class OzelSoru12 {
    //12- Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.
    //Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın
    //Örnek: "abc", "cat" --> "abcat"
    //"abc", "dog" -->"abcdog"
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("bir kelime girin=");
        String str1= sc.next();
        System.out.print("ikinci kelimeyi girin=");
        String str2= sc.next();
        char ilkSon=str1.charAt(str1.length()-1);
        char ikinciIlk=str2.charAt(0);
        if (ilkSon==ikinciIlk){
            str2=str2.substring(1);

            System.out.println(str1.concat(str2));
        }
        else System.out.println(str1.concat(str2));

    }
}
