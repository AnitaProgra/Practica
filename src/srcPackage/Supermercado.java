package srcPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Supermercado {

	protected String nombreSuper; 
	protected ArrayList<Productos> productos;

	public Supermercado(String nombreSuper) {
	this.nombreSuper= nombreSuper; 
	this.productos= new ArrayList<>(); 
	} 
	
	public void agregarProductos(Productos producto) {
		productos.add(producto); 
	}
	

	public Integer tamanioListaProductos() {
	    return productos.size(); 
	}
	
	
	
	public void devolverProductosOrdenados() {
		 
		if(!productos.isEmpty()){
			Collections.sort(productos, new Ordenamiento());
			for (Productos e : productos) {
	            System.out.println(e);
	        }
		}
	}

	
	
	public ArrayList<Productos> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Productos> productos) {
		this.productos = productos;
	}
	
	
	
}
