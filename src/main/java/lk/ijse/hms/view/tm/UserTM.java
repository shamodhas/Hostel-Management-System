package lk.ijse.hms.view.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :10:16 PM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserTM {
    private String userId;
    private String name;
    private String telNo;
    private String email;
    private String userName;
    private String password;
}
