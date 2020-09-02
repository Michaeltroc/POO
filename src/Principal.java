public class Principal {

    public static void main(String[] args) {
        Vehiculo taxi = new Vehiculo();
        taxi.setMarca("Maserati");
        System.out.println("La marca de mi vehiculo es: "+taxi.getMarca());

        Vehiculo uber = new Vehiculo("Bugatti","CFD832","Negro",57000,"Sedan","12323432","Hybrido");
        System.out.println("\nLa marca del vehiculo es: "+uber.getMarca()+"\n"+"El numero de chasis es:"+uber.getNumMatricula());

    }
}
