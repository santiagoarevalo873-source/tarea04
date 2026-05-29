public class main{
    public static void main(String[] args) {
    System.out.println();
    Empleado empleado = new Empleado(10000000,"rodrigo");

    System.out.println(empleado.getSalario());
    System.out.println(empleado.calculeSalario());
    }
}

class Empleado{
    String nombre;
    private int salario;
    
    Empleado(int salario,String nombre){
        this.salario=salario;
        this.nombre=nombre;
    }
    int getSalario(){
        return this.salario;
    }
    int calculeSalario(){
        return this.salario=this.salario*12;
    }
}