package Transport;

import java.util.ArrayList;
import java.util.List;

public class Mechanic <T extends Transport> {
    public enum Company {
        BUS("BUSTRADE"),
        TRUCK("SERVICE_TRUCK"),
        CAR("AUTOMOTIVE"),
        ALL("MOTOR_TRADE");
        private final String company;

        Company (String company) {
            this.company = company;
        }

        public String getCompany() {
            return company;
        }
    }
    private final String firstname;
    private final String lastname;
    private final Company company;
    private final List<Class<?>> typeService = new ArrayList<>();

    public Mechanic(String firstname, String lastname, Company company) {
        if (firstname == null || firstname.isBlank() || firstname.isEmpty()) {
            this.firstname = "Владимир";
        } else
            this.firstname = firstname;
        if (lastname == null || lastname.isBlank() || lastname.isEmpty()) {
            this.lastname = "Паровозов";
        } else
            this.lastname = lastname;
            this.company = company;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Company getCompany() {
        return company;
    }
    public void addTypeService(Class<?> typeService) {
        this.typeService.add((Class<?>) typeService);
    }

    public void makeDiagnostic(Transport transport) {
        if (this.typeService.contains(transport.getClass())) {
            System.out.println(getFirstname() + " " + getLastname() + " " +
                    Transport.MAKE_DIAGNOSTICS + " " + transport.getBrand() + " " +
                    transport.getModel());
        } else {
            System.out.println("Не могу обслужить " + transport.getClass().getSimpleName());
        }
    }

    public void toFixTheVehicle(Transport transport) {
        if (this.typeService.contains(transport.getClass())) {
            System.out.println(getFirstname() + " " + getLastname() + " " +
                    Transport.FIX_THE_VEHICLE + " " + transport.getBrand() + " " +
                    transport.getModel());
        } else {
            System.out.println("Не могу обслужить " + transport.getClass().getSimpleName());
        }
    }

    @Override
    public String toString() {
        return firstname + " " +
                lastname + " " +
                company;
    }
}