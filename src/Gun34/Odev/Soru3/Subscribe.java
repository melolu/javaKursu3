package Gun34.Odev.Soru3;

import static Gun34.Odev.Soru3.memberShip.*;

public class Subscribe {
    private String name;
    private boolean doYouWannaSub;
    private String whichMember;

    public Subscribe(String name, boolean doYouWannaSub, String whichMember) {
        setName(name);
        setDoYouWannaSub(doYouWannaSub);
        setWhichMember(whichMember);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWannaSub() {
        return doYouWannaSub;
    }

    public void setDoYouWannaSub(boolean doYouWannaSub) {
        if (doYouWannaSub==false) System.out.println("See you when you want to be a member. Thanks ");
        this.doYouWannaSub = doYouWannaSub;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public String setWhichMember(String whichMember) {
        switch (whichMember){
            case "GOLD":
                return "Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon.";
            case "BRONZE":
                return "Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos.";
            case "SILVER":
                return "Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework.";
        }
        return whichMember;
    }
}
