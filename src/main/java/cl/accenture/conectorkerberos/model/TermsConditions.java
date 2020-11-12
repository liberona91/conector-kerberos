package cl.accenture.conectorkerberos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "referrals-terms-conditions")
public class TermsConditions {
	
	@Id
	private String _id;
	private String texto;
	private String titulo;
	private String politica;
	private String fecha_creacion;
	
	public TermsConditions() {
		super();
	}
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPolitica() {
		return politica;
	}
	public void setPolitica(String politica) {
		this.politica = politica;
	}
	public String getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	
	
}
