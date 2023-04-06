package lk.ijse.hms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomDTO {
    private String resId;
    private String studentId;
    private String name;
    private String roomTypeId;
    private String type;
    private double keyMoney;
    private String status;
    private LocalDate date;
}
