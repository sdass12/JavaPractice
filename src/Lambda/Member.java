package Lambda;

public class Member {
    private String name;
    private String id;
    private String address;

    public Member(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }
}
