package umc.umc.repository;
import org.springframework.stereotype.Repository;
import umc.umc.model.User;




@Repository
public interface userRepository {
    public User findByusername(String username);
    User deleteByUser(int id);
    User findById(int id);

    public void save(User user);
}