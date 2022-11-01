package temur.uz.listener.qr_code.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import temur.uz.listener.qr_code.service.QrcodeService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequiredArgsConstructor
public class QRCodeController {

    private final QrcodeService qrcodeService;

    @PostMapping("/showQRCode")
    public String showQRCode(String qrContent, Model model) {
        model.addAttribute("qrCodeContent", "/generateQRCode?qrContent=" + qrContent);
        return "show-qr-code";
    }

    @GetMapping("/generateQRCode")
    public void generateQRCode(String qrContent, HttpServletResponse response) throws IOException {
        response.setContentType("image/png");
        byte[] qrCode = qrcodeService.generateQrCodeService(qrContent, 400, 400);
        OutputStream outputStream = response.getOutputStream();
        outputStream.write(qrCode);
    }

    @PostMapping("/getText")
    public String get(Model model) {
        model.addAttribute("text", "/get");
        return "text";
    }

    @GetMapping("/get")
    public String getText() {
        return "Salom";
    }

}
