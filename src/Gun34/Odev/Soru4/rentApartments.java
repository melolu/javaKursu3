package Gun34.Odev.Soru4;

public class rentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    public rentApartments(String name, int roomCount, boolean balconyOrNo) {
        setName(name);
        setRoomCount(roomCount);
        setBalconyOrNo(balconyOrNo);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoomCount() {
        return roomCount;
    }
    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }
    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }
    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }
    public int rentApartment(int roomCount) {
        int rent = 0;
        switch (roomCount) {
            case 0: rent = 1400;break;
            case 1: rent = 1700;break;
            case 2: rent = 2200;break;
            case 3: rent = 2700;break;
        }
        if (balconyOrNo == true)
            return rent = rent + 200;
        else return rent;
    }
}
