//package Driver;
//import Exception.IrregularDriveLicenseException;
//import Transport.Car;
//
//public class GradeB extends Driver<Car> {
//    private String drivingLicense;
//
//    public GradeB(String fullName, String drivingLicense, int drivingExperience, String drivingLicense1) {
//        super(fullName, drivingLicense, drivingExperience);
//        this.drivingLicense = drivingLicense1;
//    }
//
//    public String isDrivingLicense() {
//        if (isDrivingLicense() != null || !isDrivingLicense().isEmpty() || !isDrivingLicense().isBlank());
//        return "B";
//    }
//
//    public void setDrivingLicense(String drivingLicense) {
//        if (drivingLicense == null || drivingLicense.isBlank() ||
//                drivingLicense.isEmpty() || !drivingLicense.equals("B")) {
//            try {
//                throw new IrregularDriveLicense("Необходимо корректно указать тип прав!" + toString().toString());
//            } catch (IrregularDriveLicense e) {
//                System.out.println(e.getMessage());
//            }
//        } else this.drivingLicense = drivingLicense;
//    }
//
//    @Override
//    public void doStartMove() {
//        super.doStartMove();
//    }
//
//    @Override
//    public void doFinishMove() {
//        super.doFinishMove();
//    }
//
//    @Override
//    public void refuelCar() {
//        super.refuelCar();
//    }
//
//}
