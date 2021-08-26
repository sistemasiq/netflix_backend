package mx.tecnm.piedad.modelos;

public class Plan {
	int id;
	String descripcion;
	Float precio_mensual;
	String calidad_video;
	String resolucion;
	int cantidad_dispositivos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Float getPrecio_mensual() {
		return precio_mensual;
	}
	public void setPrecio_mensual(Float precio_mensual) {
		this.precio_mensual = precio_mensual;
	}
	public String getCalidad_video() {
		return calidad_video;
	}
	public void setCalidad_video(String calidad_video) {
		this.calidad_video = calidad_video;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public int getCantidad_dispositivos() {
		return cantidad_dispositivos;
	}
	public void setCantidad_dispositivos(int cantidad_dispositivos) {
		this.cantidad_dispositivos = cantidad_dispositivos;
	}
	
	
}
