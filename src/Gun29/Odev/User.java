package Gun29.Odev;

public class User {
    int id;
    String username;
    String password;
    boolean active;
    boolean signedIn;
    Role userRole;
    static int idsayac=0;

    public User(String username, String password, boolean active, boolean signedIn, Role userRole) {
        setId();
        this.username = username;
        setPassword(password);
        this.active = active;
        this.signedIn = signedIn;
        this.userRole = userRole;
    }
    public int getId() {return id;}
    public void setId() {this.id = ++idsayac;}
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}

    public void setPassword(String password) {
        if (password.length()<6){
            System.out.println("tekrar sifre giriniz");
        }
        else {
            this.password = password;
        }
    }

    public boolean isActive() {return active;}

    public void setActive(boolean active) {this.active = active;}

    public boolean isSignedIn() {return signedIn;}

    public void setSignedIn(boolean signedIn) {this.signedIn = signedIn;}

    public Role getUserRole() {return userRole;}

    public void setUserRole(Role userRole) {this.userRole = userRole;}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                ", userRole=" + userRole +
                '}';
    }
}
