package dto;

public class VehicleDto  {
	

	private String licenseplate;
	private String brands;
	private int capacity_without_equipment;
	private int capacity_with_equipment;
	private int total_capacity;
	private int year_of_manufacture;
	private String manufacturing_mode;
	
	public VehicleDto() {
		super();
	}
	public VehicleDto(String licenseplate, String brands, int capacity_without_equipment, int capacity_with_equipment,
			int total_capacity, int year_of_manufacture, String manufacturing_mode) {
		super();
		this.licenseplate = licenseplate;
		this.brands = brands;
		this.capacity_without_equipment = capacity_without_equipment;
		this.capacity_with_equipment = capacity_with_equipment;
		this.total_capacity = total_capacity;
		this.year_of_manufacture = year_of_manufacture;
		this.manufacturing_mode = manufacturing_mode;
	}

	

	public String getLicenseplate() {
		return licenseplate;
	}

	public void setLicenseplate(String licenseplate) {
		this.licenseplate = licenseplate;
	}

	public String getBrands() {
		return brands;
	}

	public void setBrands(String brands) {
		this.brands = brands;
	}

	public int getCapacity_without_equipment() {
		return capacity_without_equipment;
	}

	public void setCapacity_without_equipment(int capacity_without_equipment) {
		this.capacity_without_equipment = capacity_without_equipment;
	}

	public int getCapacity_with_equipment() {
		return capacity_with_equipment;
	}

	public void setCapacity_with_equipment(int capacity_with_equipment) {
		this.capacity_with_equipment = capacity_with_equipment;
	}

	public int getTotal_capacity() {
		return total_capacity;
	}

	public void setTotal_capacity(int total_capacity) {
		this.total_capacity = total_capacity;
	}

	public int getYear_of_manufacture() {
		return year_of_manufacture;
	}

	public void setYear_of_manufacture(int year_of_manufacture) {
		this.year_of_manufacture = year_of_manufacture;
	}

	public String getManufacturing_mode() {
		return manufacturing_mode;
	}

	public void setManufacturing_mode(String manufacturing_mode) {
		this.manufacturing_mode = manufacturing_mode;
	}
	
	
}
