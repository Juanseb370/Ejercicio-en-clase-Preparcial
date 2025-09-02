public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual;




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


    public void calcularInteres(){
        float tasaMensual = tasaAnual /12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
        
    }

    public void extractoMensual(){
    
    saldo -= comisionMensual;
    calcularInteres();
    }


    public void imprimir(){

        System.out.println("saldo:" + saldo);
        System.out.println("Numero de consignaciones: " + numeroConsignaciones);
        System.out.println("Numero de retiros: " + numeroRetiros);
        System.out.println("Tasa Anual: "+ tasaAnual );
    }


    }


    
