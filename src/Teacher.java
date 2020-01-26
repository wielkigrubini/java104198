import java.util.Scanner;

public class Teacher extends UniversityPerson implements VipPerson {

    Scanner s = new Scanner(System.in);

    private boolean isVip;
    private String vipCause;

    public Teacher(String firstName, String lastName, int yearOfBirth, int firstYearOnUniversity, String universityDegree, boolean isVip) {
        super(firstName, lastName, yearOfBirth, firstYearOnUniversity, universityDegree);
        this.isVip = isVip;
        if (isVip) {
            setVipCause();
        }
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
        if(vip)
            vipCause = null;
        else
            setVipCause();
    }

    public String getVipCause() {
        return vipCause;
    }

    public void setVipCause() {
        System.out.print("Write cause of VIP status and press enter: ");
        vipCause = s.nextLine();
    }
}
