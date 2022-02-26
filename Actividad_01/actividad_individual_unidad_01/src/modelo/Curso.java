package modelo;

public class Curso {

	//Fields
	private String codigo;
	private String password;
	private String nombre; 
	private String precio;
	private String horas;
	private String nivel;
	private String profesor;
	private String institución;
	private String fechaInscricionI;
	private String fechaInsncriocionF;
	private String fechaInicio;
	private String FechaCierre;
	private String numAlumnos;
	private String modalidad;
	private String descripción;
	
	//------------------------------------------------------------------------------
	//Methods
	Curso(String codigo, String password){
		
		this.codigo=codigo;
		this.password=password;
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String getInstitución() {
		return institución;
	}

	public void setInstitución(String institución) {
		this.institución = institución;
	}

	public String getFechaInscricionI() {
		return fechaInscricionI;
	}

	public void setFechaInscricionI(String fechaInscricionI) {
		this.fechaInscricionI = fechaInscricionI;
	}

	public String getFechaInsncriocionF() {
		return fechaInsncriocionF;
	}

	public void setFechaInsncriocionF(String fechaInsncriocionF) {
		this.fechaInsncriocionF = fechaInsncriocionF;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaCierre() {
		return FechaCierre;
	}

	public void setFechaCierre(String fechaCierre) {
		FechaCierre = fechaCierre;
	}

	public String getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(String numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	
	//------------------------------------------------------------------------------
	
	
	
}
