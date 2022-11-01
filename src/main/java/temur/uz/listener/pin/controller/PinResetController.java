package temur.uz.listener.pin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import temur.uz.listener.pin.dto.BlockCardRequest;
import temur.uz.listener.pin.dto.PinResponse;

@RestController
@RequestMapping("/api/pin")
public class PinResetController {

    @PostMapping("card/pin_reset/request")
    public ResponseEntity<PinResponse> get(@RequestBody BlockCardRequest request){
        System.out.println("cardId: " + request.getCardId() + " CardType: " + request.getCardType());
        return ResponseEntity.ok(new PinResponse(456,"Xabar keldi"));
    }

    @PostMapping("/")
    public ResponseEntity<PinResponse> set(){

        return null;
    }
}
