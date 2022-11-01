package temur.uz.listener.qr_code.service;

public interface QrcodeService {

    byte[] generateQrCodeService(String qrContent, int width, int height);

}
