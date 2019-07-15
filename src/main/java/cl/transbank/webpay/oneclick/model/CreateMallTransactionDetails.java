package cl.transbank.webpay.oneclick.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@ToString
public class CreateMallTransactionDetails {
    @Getter private List<Detail> details = new ArrayList<>();

    private CreateMallTransactionDetails() {}

    public static CreateMallTransactionDetails build() {
        return new CreateMallTransactionDetails();
    }

    public static CreateMallTransactionDetails build(double amount, String commerceCode, String buyOrder, byte installmentsNumber) {
        return CreateMallTransactionDetails.build().add(amount, commerceCode, buyOrder, installmentsNumber);
    }

    public CreateMallTransactionDetails add(double amount, String commerceCode, String buyOrder, byte installmentsNumber) {
        getDetails().add(new Detail(amount, commerceCode, buyOrder, installmentsNumber));
        return this;
    }

    public boolean remove(double amount, String commerceCode, String buyOrder, byte installmentsNumber) {
        return getDetails().remove(new Detail(amount, commerceCode, buyOrder, installmentsNumber));
    }

    @NoArgsConstructor @AllArgsConstructor
    @Getter @Setter @ToString
    public class Detail {
        @SerializedName("amount") private double amount;
        @SerializedName("commerce_code")private String commerceCode;
        @SerializedName("buy_order")private String buyOrder;
        @SerializedName("installments_number")private byte installmentsNumber;

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Detail))
                return false;

            Detail another = (Detail) obj;
            return getAmount() == another.getAmount() && getCommerceCode().equals(another.getBuyOrder()) &&
                    getBuyOrder().equals(another.getBuyOrder()) && getInstallmentsNumber() == another.getInstallmentsNumber();
        }
    }
}
