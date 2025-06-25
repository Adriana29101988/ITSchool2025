package CleanCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SinglePrincipleAfter {
}

class UserValidation{
    public void validation(String username, String email, String password){
        if (username == null || username.length() < 2) {
            throw new IllegalArgumentException("Username must not be null and should have min 2 chars");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if(password.length()<6){
            throw new IllegalArgumentException("Password must be at least 6 chars");
        }
    }
}

class UserRepository{
    public void saveUser(String username, String email, String password){
        try (Connection connection = DriverManager.getConnection("idk idk")) {
            String sql = "insert into users (username, email, password) values (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, email);
            statement.setString(3, password);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

class UserEmailService{
    public void sendEmail(String username, String email){
        try {
            //Email implementation
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class UserRegistrationService{
    private UserValidation userValidation;
    private UserRepository userRepository;
    private UserEmailService userEmailService;

    public UserRegistrationService(UserValidation userValidation, UserRepository userRepository, UserEmailService userEmailService) {
        this.userValidation = userValidation;
        this.userRepository = userRepository;
        this.userEmailService = userEmailService;
    }

    public void registrationUser(String username, String email, String password){
        //validare
        userValidation.validation(username,email,password);
        //save in db
        userRepository.saveUser(username,email,password);
        //send email
        userEmailService.sendEmail(username,email);
    }
}