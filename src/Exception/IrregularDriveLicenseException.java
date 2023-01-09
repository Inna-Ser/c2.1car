package Exception;
import Driver.Driver;
public class IrregularDriveLicenseException extends Exception {
    private final Driver driver;

    public IrregularDriveLicenseException(String message, Driver driver) {
        super(message);
        this.driver = driver;
    }
}
