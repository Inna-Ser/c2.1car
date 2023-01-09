package Exception;


import Transport.Transport;

public class NotPassDiagnosticException extends Exception {
    private final Transport transport;

    public NotPassDiagnosticException(String message, Transport transport) {
        super(message);
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }
}
