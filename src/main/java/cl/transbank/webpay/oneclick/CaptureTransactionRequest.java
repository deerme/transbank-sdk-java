package cl.transbank.webpay.oneclick;

import cl.transbank.webpay.model.WebpayApiRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter @ToString
class CaptureTransactionRequest extends WebpayApiRequest {
    //TODO VALIDATE REQUEST FOR PROPERTIES WHEN WE HAVE DOC
}
