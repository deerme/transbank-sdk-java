package cl.transbank.webpay.exception;

public class CommitTransactionException extends WebpayException {
    public CommitTransactionException() {
        super();
    }

    public CommitTransactionException(Exception e) {
        super(e);
    }

    public CommitTransactionException(String message) {
        super(message);
    }
}
