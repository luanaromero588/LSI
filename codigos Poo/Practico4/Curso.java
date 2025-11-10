
/**
 * Clase que modela un curso, con la posibilidad de incribir, quitar y buscar alumnos,
 * contar la cantidad, mostrar inscriptos y promedios.
 * 
 * @author Romero Ingrid Luana
 * @version 1
 */
import java.util.HashMap;
import java.util.Map;
public class Curso{
    private String nombre;
    private HashMap alumnos;
    
     /**
     * Crea un curso con un nombre específico y sin alumnos cargados inicialmente.
     *
     * @param p_nombre Nombre del curso.
     */
    public Curso(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap());
    }
    /**
     * Crea un curso con un nombre específico y una colección de alumnos ya existente.
     *
     * @param p_nombre   Nombre del curso.
     * @param p_alumnos  HashMap que contiene a los alumnos del curso.
     */
    public Curso(String p_nombre, HashMap p_alumnos){
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    
    private void setNombre(String p_nombre){
       this.nombre = p_nombre; 
    }
    public String getNombre(){
        return this.nombre;
    }
    private void setAlumnos(HashMap p_alumnos){
        this.alumnos = p_alumnos;
    }
    public HashMap getAlumnos(){
        return this.alumnos;
    }
    
    //metodos
    /**
     *  Agrega un alumno a la coleccion de alumnos del curso.
     *  @param p_alumno alumno a agregar
     */
    public void inscribirAlumno(Alumno p_alumno){
        // Agrega un alumno a la coleccion alumnos del curso
        this.getAlumnos().put(new Integer(p_alumno.getLu()), p_alumno);
                                    // ^ -> wrapper para insertar un int como un objeto
    }
    
    /**
     * Quita un alumno según LU de la coleccion de alumnos del curso. 
     *@param p_lu nro de libreta universitaria del alumno
     *@return Retorna el objeto eliminado
     */
    public Alumno quitarAlumno(int p_lu){
        //quito un alumno segun LU. Hago el casteo (Alumno) al no usar generico al definir
        return (Alumno) this.getAlumnos().remove(new Integer(p_lu));
    }
    /**
     * Devuelve la cantidad de alumnos inscriptos en el curso.
     * @return número total de alumnos en el curso.
    */
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    /**
     * Verifica si un alumno con lu esta incripto segun su clave(key) 
     * @param p_lu libreta universitaria del alumno al que se verifica
     * @return devuelve un valor booleano, true o false, segun si se lo verifica inscripto o no.
     */
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    /**
     * Verifica si un alumno esta incripto en el curso 
     * @param p_lu objeto alumno al que se verifica
     * @return devuelve un valor booleano, true o false, segun si se lo verifica inscripto o no.
    */
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno); 
    }

    /**
      * Busqueda de alumnos
      * @param p_lu nro libreta universitaria
      * @return Retorna el alumno que corresponde a la LU pasada como parámetro
      */
    public Alumno buscarAlumno(int p_lu){
        return (Alumno) this.getAlumnos().get(new Integer(p_lu));
    }
    /**
     * Muestra el promedio de un alumno en especifico
     * @param p_lu LU del alumno del cual se desea saber el promedio
     */
    public void imprimirPromedioDelAlumno(int p_lu){
         //creo var temp. para no rehacer la busqueda
         Alumno alumno = buscarAlumno(p_lu);
         if(alumno != null){
             System.out.println("El promedio del alumno es: " +alumno.promedio());
         }else{
             System.out.println(p_lu +"No existe");
         }
    }
    
    public void mostrarInscriptos(){
      
         for(Object obj : this.getAlumnos().values()){
            //casteo cada object a alumno
            Alumno alumno = (Alumno) obj;
            System.out.println(alumno.getLu() +" " +alumno.nomYApe());

        }
        
    }
    
}    
    
    
    
    
    
      /*no use genericos por lo que todos sus metodos devuelven un object 
        for(Object obj : this.getAlumnos().entrySet()){
                            //^ devuelve conjunto de objetos tipo map.entry
            //recibo un object segun for, entonces hago el casteo de Map.Entry
            Map.Entry entry = (Map.Entry) obj;
            Alumno alumno = (Alumno) entry.getValue();
            System.out.println(alumno.getLu() +" " +alumno.nomYApe());

        }
        /*El for necesita una variable iteradora que vaya tomando cada elemento del conjunto (entrySet()).
         * Como tu Set es de Object, la variable también es Object.

            Después vos la convertís (cast) a Map.Entry para poder usar sus métodos (getKey(), getValue())*/
