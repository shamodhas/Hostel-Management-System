package lk.ijse.hms.controller.user;

import lk.ijse.hms.controller.ManageUserFormController;
import lk.ijse.hms.dto.UserDTO;
import lk.ijse.hms.view.tm.UserTM;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :11:39 AM
 */

public class UpdateUserFormController {
    private UserDTO userDTO;
    public void init(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public void init(UserTM selectedItem, ManageUserFormController manageUserFormController) {

    }
}
