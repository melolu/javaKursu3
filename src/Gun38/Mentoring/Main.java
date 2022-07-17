package Gun38.Mentoring;

public class Main {
    public static void main(String[] args) {
        GolfClub sube1=new GolfClub();

        Member member1=new Member("ahmet","aydin",100000);
        Member member2=new Member("coni","bravo",700000);

        sube1.addMember(member1);
        sube1.addMember(member2);

        for (Member member: sube1.members){
            System.out.println("member.getAd() = " + member.getAd());
        }
    }
}
