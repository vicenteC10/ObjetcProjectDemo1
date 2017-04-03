
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosalarios;

/**
 *
 * @author MANUEL
 */
public class Empleado {
/* Declaración de variables privadas de la clase*/
    private String nombreDelEmpleado;
    private int ratioHora = 30;
    private int horasTrabajadas;
/**
 * Metodo que visualiza el mensaje "Calculando el salario...
 */   
    public void printMessage()
    { 
        System.out.println("Calculando el salario...");
    }
/**
 * Método que calcula el salario cuando no hay bonus
 * @return Te devuelve un entero
 */
    public int calculoSalario()
    {
        printMessage();
        int staffPay;
        staffPay = getRatioHora() * getHorasTrabajadas();
        if (getHorasTrabajadas() > 0)
            return staffPay;
        else
            return -1;
    }
    /**
     * Método que calcula es salario cuando hay bonus
     * @param bonus es un entero que indica lo que gana de bonus
     * @param allowance es un entero que indica lo que gana de fijo
     * @return retorna un entero
     */
    public int calculatePay(int bonus, int allowance)
    {
        printMessage();
        if (getHorasTrabajadas()>0)
            return getHorasTrabajadas() * getRatioHora() + bonus + allowance;
        else
            return 0;
    }
   /**
    * Mértodo setter que verifica que horas trabajadas es mayor que cero
    * @param hours es un entero que indica las horas trabajadas
    */
    public void setHorasTrabajadas(int hours)
    {
        if (hours > 0)
            horasTrabajadas = hours;
        else {
            System.out.println("-Error: HoursWorked Cannot be Smaller than zero");
            System.out.println("-Error: HoursWorked is not updated");
            }          
    }
    /**
     * Método getter para asignar valores nombreDelEmpleado horas trabajadas 
     * @return es un entero que retornas las horas trabajadas
     */
    public int getHorasTrabajadas()
    {
        return horasTrabajadas;
    }
    /**
     * Constructores crean  objetos empleado
     * @param name es el nombre del empleado
     */
    public Empleado(String name)
    {
        String nameOfStaff = name;
        System.out.println("\n"+ nameOfStaff);
        System.out.println("-------------------------");
    }
    /**
     * Constructores crean objetos empleado dandole apellidos
     * @param firstName es el apellido 1
     * @param lastName es el apellido 2
     */
    public Empleado(String firstName, String lastName)
    {
        String nameOfStaff = firstName + lastName;
        System.out.println("\n"+nameOfStaff);
        System.out.println("-------------------------------");
    }

    /**
     * @return the nombreDelEmpleado
     */
    public String getNombreDelEmpleado() {
        return nombreDelEmpleado;
    }

    /**
     * @param nombreDelEmpleado the nombreDelEmpleado to set
     */
    public void setNombreDelEmpleado(String nombreDelEmpleado) {
        this.nombreDelEmpleado = nombreDelEmpleado;
    }

    /**
     * @return the ratioHora
     */
    public int getRatioHora() {
        return ratioHora;
    }

    /**
     * @param ratioHora the ratioHora to set
     */
    public void setRatioHora(int ratioHora) {
        this.ratioHora = ratioHora;
    }
    }
