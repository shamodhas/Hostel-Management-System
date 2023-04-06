package lk.ijse.hms.bo.custom;

import lk.ijse.hms.bo.SuperBO;
import lk.ijse.hms.dto.StudentDTO;

import java.util.Arrays;
import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :1:59 PM
 */

public interface StudentBO extends SuperBO {
    List<StudentDTO> getAllStudent();

    List<StudentDTO> searchBookByText(String text);
}