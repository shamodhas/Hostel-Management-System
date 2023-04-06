package lk.ijse.hms.view.tm;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 4/7/2023
 * Time :12:09 AM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartTM {
    String roomTypeId;
    String type;
    Double keyMoney;
    String status;
}
