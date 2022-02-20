package modelo;

import java.util.*;



public class CRUDCurso {

	//Fields
	
	List <Curso> cursoList= new ArrayList <Curso>();
	//cursoList=null;
	
	//-------------------------------------------
	//Methods
	//GUARDAR
	
	public int guardar(String codigo,String password,String nombre, String precio,
		String horas,String nivel,String profesor,String institución,String fechaInscricionI,
		String fechaInsncriocionF,String fechaInicio,String FechaCierre,String numAlumnos,
		String modalidad,String descripción) {
		
		Curso nuevoCurso= new Curso(codigo, password);
				nuevoCurso.setNombre(nombre);
				nuevoCurso.setPrecio(precio);
				nuevoCurso.setHoras(horas);
				nuevoCurso.setNivel(nivel);
				nuevoCurso.setProfesor(profesor);
				nuevoCurso.setInstitución(institución);
				nuevoCurso.setFechaInscricionI(fechaInscricionI);
				nuevoCurso.setFechaInsncriocionF(fechaInsncriocionF);
				nuevoCurso.setFechaInicio(fechaInicio);
				nuevoCurso.setFechaCierre(FechaCierre);
				nuevoCurso.setNumAlumnos(numAlumnos);
				nuevoCurso.setModalidad(modalidad);
				nuevoCurso.setDescripción(descripción);
		
				
				//cursoList.isEmpty();
				int flag=0;
				
				if(cursoList.isEmpty()) {
					
					cursoList.add(nuevoCurso);
					
				} else {
					
					for(Curso curso:cursoList){
						
						if(Objects.equals(curso.getNombre(),nuevoCurso.getNombre())){
							
							flag=1; }
					
				} 
					if(flag==0){
						
						
						cursoList.add(nuevoCurso);
						System.out.println("PRUEBA");
						System.out.println(cursoList.size());
						
					}
					
					
					
				}
				
		
		return flag;
	}
	//----------------------------------------------
	
	//BUSCAR
	
	public Curso buscar(String nombre) {
		
		List<Curso>getListCurso=getCursoList();
		
		System.out.println(getListCurso.size());
		Curso cursoBuscar=null;
		
				for(Curso curso:getListCurso){
					
					String nombreCurso=curso.getNombre();
					
					if (Objects.equals(nombre,nombreCurso)){
							
						cursoBuscar=curso;
							
						}
				
		
				
					}
		return cursoBuscar;
}
	//----------------------------------------------
	
	//EDITAR
	
	public void editar(Curso curso,String codigo,String password,String nombre, String precio,
			String horas,String nivel,String profesor,String institución,String fechaInscricionI,
			String fechaInsncriocionF,String fechaInicio,String FechaCierre,String numAlumnos,
			String modalidad,String descripción) {
		
					curso.setCodigo(codigo);
					curso.setPassword(password);
					curso.setNombre(nombre);
					curso.setPrecio(precio);
					curso.setHoras(horas);
					curso.setNivel(nivel);
					curso.setProfesor(profesor);
					curso.setInstitución(institución);
					curso.setFechaInscricionI(fechaInscricionI);
					curso.setFechaInsncriocionF(fechaInsncriocionF);
					curso.setFechaInicio(fechaInicio);
					curso.setFechaCierre(FechaCierre);
					curso.setNumAlumnos(numAlumnos);
					curso.setModalidad(modalidad);
					curso.setDescripción(descripción);
					
	}
	//-----------------------------------------------
	//ElIMINAR
	
	public void eliminar(Curso curso) {

			cursoList.remove(curso);
					
	}
	//-----------------------------------------------

	public List<Curso> getCursoList() {
		return cursoList;
	}

	public void setCursoList(List<Curso> cursoList) {
		this.cursoList = cursoList;
	}
	
}
