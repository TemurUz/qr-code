package temur.uz.listener.pin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PinResponse {
    @JsonProperty("code")
    private int code;
    @JsonProperty("message")
    private String message;
}
