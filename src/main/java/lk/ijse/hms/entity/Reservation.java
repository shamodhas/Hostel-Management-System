package lk.ijse.hms.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/6/2023
 * Time :12:09 AM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Reservation {
    @Id
    @Column(name = "res_id")
    private String resId;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private Room room;

    private String status;
}
