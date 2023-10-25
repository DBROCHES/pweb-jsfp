package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;

import dto.VehicleDto;
import service.VehicleService;
import utils.JsfUtils;

@ManagedBean
@ViewScoped
public class VehicleBean{
	

	 private VehicleDto vehicle;
	 private VehicleDto selectedVehicle;
	 private List<VehicleDto> vehicles = new ArrayList<VehicleDto>();
	
	
	 @Autowired
		private VehicleService vehicleService;
	 
	 
	 public VehicleBean() {
		 // TODO Auto-generated constructor stub
	}
	 @PostConstruct
	    public void init() {
		    vehicles = vehicles == null ? vehicleService.getVehicles() : vehicles;
			
	    }

	

	public VehicleDto getSelectedVehicle() {
		return selectedVehicle;
	}
	public void setSelectedVehicle(VehicleDto selectedVehicle) {
		this.selectedVehicle = selectedVehicle;
	}
	public VehicleDto getVehicle() {
		return vehicle;
	}


	public void setVehicle(VehicleDto vehicle) {
		this.vehicle = vehicle;
	}


	public void setVehicles(List<VehicleDto> vehicles) {
		this.vehicles = vehicles;
	}

	 public List<VehicleDto> getVehicles() {
	        return vehicles;
	    }
	
	
	public void saveVehicle(){
		
		this.vehicles.add(this.selectedVehicle);
		JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_user_added");
		 PrimeFaces.current().executeScript("PF('insertDialog').hide()");
		 PrimeFaces.current().ajax().update("form:messages", "form:dt-vehicles");
	}

	


	 
}
