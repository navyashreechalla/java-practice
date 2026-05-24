class User {
    private String username;
    public String getUsername() {
        return username;

    }
    public void setUsername(String newName) {
        if(newName != null && !newName.trim().isEmpty()) {
            this.username = newName;

        } else {
            System.out.println("Error: Username cannot be empty!");
        }
    }
}
public class Main1 {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Code123");
        System.out.println("Username is: " + user.getUsername());

        user.setUsername("");
    }
}

