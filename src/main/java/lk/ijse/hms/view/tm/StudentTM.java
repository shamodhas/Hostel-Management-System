package lk.ijse.hms.view.tm;

import lombok.*;

import java.sql.Date;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/5/2023
 * Time :12:12 AM
 * Project name : IntelliJ IDEA
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentTM {
    String studentId;
    String name;
    String address;
    String contactNo;
    Date dob;
    String gender;
}
