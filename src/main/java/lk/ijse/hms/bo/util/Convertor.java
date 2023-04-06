package lk.ijse.hms.bo.util;

import lk.ijse.hms.dto.RoomDTO;
import lk.ijse.hms.dto.StudentDTO;
import lk.ijse.hms.dto.UserDTO;
import lk.ijse.hms.entity.Room;
import lk.ijse.hms.entity.Student;
import lk.ijse.hms.entity.User;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :1:53 PM
 */

public class Convertor {
    public UserDTO fromUser(User user) {
        return new UserDTO(user.getUserId(), user.getName(), user.getContactNo(), user.getEmail(), user.getUserName(), user.getPassword());
    }

    public RoomDTO fromRoom(Room room) {
        return new RoomDTO(room.getRoomTypeId(), room.getType(), room.getKeyMoney(), room.getQty());
    }

    public StudentDTO fromStudent(Student student) {
        return new StudentDTO(student.getStudentId(), student.getName(), student.getAddress(), student.getContactNo(), student.getDob(), student.getGender());
    }
}
