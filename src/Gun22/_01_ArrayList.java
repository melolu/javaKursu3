package Gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        int [] dizi=new int[5]; //array 5 elemanli boyutu sonradan degistirilemez

        //arraylist:Boyutu dinamik olarak degisebilen,yani eleman eklendikce artan, sildikce azalan Array

        ArrayList<Integer> intList=new ArrayList<>(); //tanimlamasi boyle
        ArrayList<String> strList=new ArrayList<>();
        ArrayList<Boolean> booList=new ArrayList<>();

        //string arraylist tanimlayalim

        ArrayList<String> isimler=new ArrayList<>();
        //eleman ekleme
        isimler.add("ahmet");
        isimler.add("ayse");
        isimler.add("kaya");
        isimler.add("kaya");

        System.out.println("isimler = " + isimler);

        System.out.println("isimler size = " + isimler.size()); //list kullanimda length yerine size kullanilir. bir fonksiyondur

        isimler.add(1,"zeynep");// verilen indexe ekliyor, digerleri 1 sona kayiyor
        System.out.println("araya ekleme sonrasi isimler = " + isimler);

        isimler.set(1,"fatih");//belli bir indexteki elemani degistirme
        System.out.println("belli bir indexteki elemani degistirme isimler = " + isimler);

        int elemanSayisi=isimler.size();//dizideki eleman sayisini verir
        System.out.println("elemanSayisi = " + elemanSayisi);

        isimler.remove("fatih");//elemani kendisine gore silme
        System.out.println("fatih silindikten sonra isimler = " + isimler);

        isimler.remove(1);//elemani indexe gore silme islemi
        System.out.println("1 indexteki elemani sildikten sonra isimler = " + isimler);

        int indexOfKaya=isimler.indexOf("kaya");
        System.out.println("indexOfKaya = " + indexOfKaya);

        for (int i = 0; i < isimler.size(); i++) {
            System.out.println("isimler = " + isimler.get(i)); //belli bir indexteki elemani get ile aliyoruz
        }

        isimler.clear();//tum list bosaltildi. ilk hale geldi


    }
}
