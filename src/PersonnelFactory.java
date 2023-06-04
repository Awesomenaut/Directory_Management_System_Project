public class PersonnelFactory {

    public static Person createPersonnel(String last, String first, String middle, int id, double sal, int type) {

        switch (type) {
            case 1:
                 return new Employee(last, first, middle, id, sal, "Employee");
            case 2:
                 return new Executives(last, first, middle, id, sal, "Executives");
            case 3:
                 return new Security(last, first, middle, id, sal, "Security");
            case 4:
                 return new Volunteers(last, first, middle, id, sal, "Volunteers");
            default:
                 return null;
        }
    }

}
