package Gun02;

public class _03_EscapeCharacter {
    public static void main(String[] args) {
        //escape character
        // \n yeni satir acar
        // \t tab tusu kadar bosluk birakir
        // \b backspace etkisi yani 1 karakter geri siler
        // \" cift tirnak icinde cift tirnak koyar
        // \\ ters slash isareti koyar
        // \r satir basina kadar olan karakterlerin hepsini siler
        System.out.println("merhaba dunya");
        System.out.println("merhaba \t dunya"); //merhaba ve dunya arasina tab kadar bosluk birakti
        System.out.println("merhaba\b dunya\b"); //merhaba kelimesinden a harfini sildi, dunya kelimesinden a harfini sildi
        System.out.println("merhaba\r dunya"); //merhaba dunya cumlesinden merhabayi sildi
        System.out.println("\"merhaba\\dunya\""); //merhaba dunya cumlesini tirnak icinde yazdirdi arasinda slash yazdirdi
    }
}
