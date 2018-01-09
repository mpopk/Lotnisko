package foodDoor2Door;

public class User {

    private String name;

    private String nickName;

    public User(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", nickName='" + nickName + '\'' + '}';
    }
}
