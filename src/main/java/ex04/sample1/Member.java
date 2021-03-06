package ex04.sample1;

public class Member {
    private Password password;

    public void changePassword(String currentPassword, String newPassword) throws PasswordNotMatchException {
        if(!password.match(currentPassword)){
            throw new PasswordNotMatchException();
        }
        this.password = new Password(newPassword);
    }
}
