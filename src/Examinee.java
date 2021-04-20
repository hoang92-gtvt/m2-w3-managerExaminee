public class Examinee {
    private String id ;
    private String fullName;
    private String address;
    private int privacyl;
    private Group group;

    public Examinee() {

    }
 public Examinee(String id, String fullName, String address, int privacyl, Group group) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.privacyl = privacyl;
        this.group=group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrivacyl() {
        return privacyl;
    }

    public void setPrivacyl(int privacyl) {
        this.privacyl = privacyl;
    }
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Examinee{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", privacyl=" + privacyl +
                ", group=" + group +
                '}';
    }
}
