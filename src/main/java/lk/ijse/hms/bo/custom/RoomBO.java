package lk.ijse.hms.bo.custom;

import lk.ijse.hms.bo.SuperBO;
import lk.ijse.hms.dto.RoomDTO;

import java.util.Arrays;
import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :1:59 PM
 */

public interface RoomBO extends SuperBO {
    List<RoomDTO> getAllRoom();

    List<RoomDTO> searchMembersByText(String text);
}
