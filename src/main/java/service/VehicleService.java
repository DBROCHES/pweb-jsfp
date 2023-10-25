package service;

import java.util.List;

import dto.VehicleDto;

public interface VehicleService {
    List<VehicleDto> getVehicles();
    VehicleDto getVehicleByBrand(String brand);
    void createVehicle(VehicleDto vehicle);
    void updateVehicle(VehicleDto vehicle);
    void deleteVehicle(String brand);
}
