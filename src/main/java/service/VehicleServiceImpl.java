package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import dto.VehicleDto;


@Service
public class VehicleServiceImpl implements VehicleService{
	@Override
	public List<VehicleDto> getVehicles() {
		List<VehicleDto> vehicles = new ArrayList<VehicleDto>();
		vehicles.add(new VehicleDto("J12345","Jaguar",2,2,2,2005,"industrial"));
		vehicles.add(new VehicleDto("J12345","Jaguar",2,2,2,2005,"industrial"));
		vehicles.add(new VehicleDto("J12345","Jaguar",2,2,2,2005,"industrial"));
		vehicles.add(new VehicleDto("J12345","Jaguar",2,2,2,2005,"industrial"));
		vehicles.add(new VehicleDto("J12345","Jaguar",2,2,2,2005,"industrial"));
		vehicles.add(new VehicleDto("J12345","Jaguar",2,2,2,2005,"industrial"));
		return vehicles;
	}
	@Override
	public VehicleDto getVehicleByBrand(String brand) {
		
		return null;
	}
	@Override
	public void createVehicle(VehicleDto vehicle) {
		
		
	}
	@Override
	public void updateVehicle(VehicleDto vehicle) {
		
		
	}
	@Override
	public void deleteVehicle(String brand) {

		
	}

	
	
	
	
}
