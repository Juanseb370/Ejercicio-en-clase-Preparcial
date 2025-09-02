public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;




    public Cuenta(float saldo, float tasaAnual){

        this.saldo =saldo;
        this.tasaAnual =tasaAnual;

    }

    public void consignar(float cantidad){

        saldo += cantidad;
        numeroConsignaciones++;

    }


    public void retirar(float cantidad){
        if (cantidad <= saldo ){
            saldo -= cantidad;
            numeroRetiros++;
        }else{
            System.out.println("Operacion Fallida, Saldo insuficiente");
        }
    }


    //public void calcularInteres()
}