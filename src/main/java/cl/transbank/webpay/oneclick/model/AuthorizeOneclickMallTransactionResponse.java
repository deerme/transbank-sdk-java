package cl.transbank.webpay.oneclick.model;

import cl.transbank.webpay.model.CardDetail;
import lombok.*;

import java.util.List;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class AuthorizeOneclickMallTransactionResponse {
    private String transactionDate;
    private String accountingDate;
    private CardDetail cardDetail;
    private String buyOrder;
    private List<Detail> details;

    @NoArgsConstructor @AllArgsConstructor
    @Getter @Setter @ToString
    public class Detail {
        private double amount;
        private String status;
        private String authorizationCode;
        private String paymentTypeCode;
        private byte installmentsNumber;
        private String commerceCode;
        private String buyOrder;
    }
}
