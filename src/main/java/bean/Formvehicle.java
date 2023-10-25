package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
@ManagedBean
@ViewScoped
public class Formvehicle implements Serializable{
	/**
	 * 
	 */
	
	private List<Integer> years;
	private List<String> brands;
	@PostConstruct
	public void init() {
		brands= new ArrayList<String>();
		brands.add("Audi");
		brands.add("Mercedez");
		brands.add("Lada");
		years = new ArrayList<Integer>();
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		for (int i = currentYear; i >= 1900; i--) {
			years.add(i);
		}
	}
	public List<Integer> getYears() {
		return years;
	}
	public List<String> getBrands() {
		return brands;
	}
}