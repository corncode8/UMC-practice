package umc.umc.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String phone;

//    private String Location;
//    private int Manner;

//    private int Chat_num;
//
//    private Timestamp createTime;
//
//    private Timestamp updateTime;
}
