package demo;
// for the front end to send username, from front end to back end
public class AuthDto {
    public final String username;
    public final String password;

    public AuthDto(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
