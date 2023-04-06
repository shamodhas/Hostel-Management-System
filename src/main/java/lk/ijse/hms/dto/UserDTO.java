package lk.ijse.hms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {
    private String userId;
    private String name;
    private String telNo;
    private String email;
    private String userName;
    private String password;
}
