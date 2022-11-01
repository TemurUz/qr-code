package temur.uz.listener.pin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BlockCardRequest {
    @JsonProperty("request_id")
    private String requestId;
    @JsonProperty("card_id")
    private String cardId;
    @JsonProperty("card_type")
    private String cardType;
}
