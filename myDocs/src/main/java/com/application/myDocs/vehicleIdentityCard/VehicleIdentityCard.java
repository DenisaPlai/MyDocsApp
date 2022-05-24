package com.application.myDocs.vehicleIdentityCard;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.application.myDocs.categoryEnum.CarCategory;

@Entity
@Table(name = "vehicle_identity_card", schema = "administration")
public class VehicleIdentityCard {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "registration_no")
	private String registrationNo;

	@Column(name = "registration_authority")
	private String registrationAuthority;

	@Column(name = "registration_date")
	private LocalDate registrationDate;

	@Column(name = "mark")
	private String mark;

	@Column(name = "type")
	private String type;

	@Column(name = "variant")
	private String variant;

	@Column(name = "version")
	private String version;

	@Column(name = "trade_name")
	private String tradeName;

	@Column(name = "identification_number")
	private String identificationNumber;

	@Column(name = "manufacture_year")
	private Integer manufactureYear;

	@Enumerated(EnumType.STRING)
	@Column(name = "category")
	private CarCategory category;

	@Column(name = "use_category")
	private String useCategory;

	@Column(name = "class")
	private String classes;

	@Column(name = "carrossery")
	private String carrossery;

	@Column(name = "type_approval_number")
	private String typeApprovalNumber;

	@Column(name = "national_register_number")
	private String nationalRegisterNumber;

	@Column(name = "axles_number")
	private Integer axlesNumber;

	@Column(name = "max_permissible_mass")
	private Integer maxPermissibleMass;

	@Column(name = "max_permissible_mass_for_axis_1")
	private Integer maxPermissibleMassForAxis1;

	@Column(name = "max_permissible_mass_for_axis_2")
	private Integer maxPermissibleMassForAxis2;

	@Column(name = "max_permissible_mass_for_axis_3")
	private Integer maxPermissibleMassForAxis3;

	@Column(name = "max_permissible_mass_for_axis_4")
	private Integer maxPermissibleMassForAxis4;

	@Column(name = "max_permissible_mass_for_axis_5")
	private Integer maxPermissibleMassForAxis5;

	@Column(name = "vehicle_assembly_max_permissible_mss")
	private Integer vehicleAssemblyMaxPermissibleMss;

	@Column(name = "mass_in_running_orders")
	private Integer massInRunningOrders;

	@Column(name = "real_mass")
	private Integer realMass;

	@Column(name = "length")
	private Integer length;

	@Column(name = "width")
	private Integer width;

	@Column(name = "height")
	private Integer height;

	@Column(name = "distance_between_the_axes")
	private Integer distanceBetweenTheAxes;

	@Column(name = "engine_code")
	private Integer engineCode;

	@Column(name = "cylinder_capacity")
	private Integer cylinderCapacity;

	@Column(name = "power")
	private Integer power;

	@Column(name = "fuel_type")
	private String fuelType;

	@Column(name = "rated_speed")
	private Integer ratedSpeed;

	@Column(name = "propulsyon_system")
	private String propulsyonSystem;

	@Column(name = "engine_series")
	private String engineSeries;

	@Column(name = "power_electric_motor")
	private Integer powerElectricMotor;

	@Column(name = "emissions_standard")
	private String emissionsStandard;

	@Column(name = "national_emission_code")
	private String nationalEmissionCode;

	@Column(name = "color")
	private String color;

	@Column(name = "seats_no")
	private Integer seatsNo;

	@Column(name = "standing_places_no")
	private Integer standingPlacesNo;

	@Column(name = "max_speed")
	private Integer maxSpeed;

	@Column(name = "stationary_sound_level")
	private Integer stationarySoundLevel;

	@Column(name = "engine_revving")
	private Integer engineRevving;

	@Column(name = "motion_sound_level")
	private Integer motionSoundLevel;

	@Column(name = "power_weight_ratio")
	private Integer powerWeightRatio;

	@Column(name = "co2")
	private String co2;

	@Column(name = "traction")
	private String traction;

	@Column(name = "front_axle_tires")
	private String frontAxleTires;

	@Column(name = "rear_axle_tires")
	private String rearAxleTires;

	@Column(name = "front_axle_suspension")
	private String frontAxleSuspension;

	@Column(name = "rear_axle_suspension")
	private String rearAxleSuspension;

	@Column(name = "tank_capacity")
	private Integer tankCapacity;

	@Column(name = "rar_office")
	private Integer rarOffice;

	@Column(name = "issue_date")
	private LocalDate issueDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getRegistrationAuthority() {
		return registrationAuthority;
	}

	public void setRegistrationAuthority(String registrationAuthority) {
		this.registrationAuthority = registrationAuthority;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public Integer getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(Integer manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public CarCategory getCategory() {
		return category;
	}

	public void setCategory(CarCategory category) {
		this.category = category;
	}

	public String getUseCategory() {
		return useCategory;
	}

	public void setUseCategory(String useCategory) {
		this.useCategory = useCategory;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getCarrossery() {
		return carrossery;
	}

	public void setCarrossery(String carrossery) {
		this.carrossery = carrossery;
	}

	public String getTypeApprovalNumber() {
		return typeApprovalNumber;
	}

	public void setTypeApprovalNumber(String typeApprovalNumber) {
		this.typeApprovalNumber = typeApprovalNumber;
	}

	public String getNationalRegisterNumber() {
		return nationalRegisterNumber;
	}

	public void setNationalRegisterNumber(String nationalRegisterNumber) {
		this.nationalRegisterNumber = nationalRegisterNumber;
	}

	public Integer getAxlesNumber() {
		return axlesNumber;
	}

	public void setAxlesNumber(Integer axlesNumber) {
		this.axlesNumber = axlesNumber;
	}

	public Integer getMaxPermissibleMass() {
		return maxPermissibleMass;
	}

	public void setMaxPermissibleMass(Integer maxPermissibleMass) {
		this.maxPermissibleMass = maxPermissibleMass;
	}

	public Integer getMaxPermissibleMassForAxis1() {
		return maxPermissibleMassForAxis1;
	}

	public void setMaxPermissibleMassForAxis1(Integer maxPermissibleMassForAxis1) {
		this.maxPermissibleMassForAxis1 = maxPermissibleMassForAxis1;
	}

	public Integer getMaxPermissibleMassForAxis2() {
		return maxPermissibleMassForAxis2;
	}

	public void setMaxPermissibleMassForAxis2(Integer maxPermissibleMassForAxis2) {
		this.maxPermissibleMassForAxis2 = maxPermissibleMassForAxis2;
	}

	public Integer getMaxPermissibleMassForAxis3() {
		return maxPermissibleMassForAxis3;
	}

	public void setMaxPermissibleMassForAxis3(Integer maxPermissibleMassForAxis3) {
		this.maxPermissibleMassForAxis3 = maxPermissibleMassForAxis3;
	}

	public Integer getMaxPermissibleMassForAxis4() {
		return maxPermissibleMassForAxis4;
	}

	public void setMaxPermissibleMassForAxis4(Integer maxPermissibleMassForAxis4) {
		this.maxPermissibleMassForAxis4 = maxPermissibleMassForAxis4;
	}

	public Integer getMaxPermissibleMassForAxis5() {
		return maxPermissibleMassForAxis5;
	}

	public void setMaxPermissibleMassForAxis5(Integer maxPermissibleMassForAxis5) {
		this.maxPermissibleMassForAxis5 = maxPermissibleMassForAxis5;
	}

	public Integer getVehicleAssemblyMaxPermissibleMss() {
		return vehicleAssemblyMaxPermissibleMss;
	}

	public void setVehicleAssemblyMaxPermissibleMss(Integer vehicleAssemblyMaxPermissibleMss) {
		this.vehicleAssemblyMaxPermissibleMss = vehicleAssemblyMaxPermissibleMss;
	}

	public Integer getMassInRunningOrders() {
		return massInRunningOrders;
	}

	public void setMassInRunningOrders(Integer massInRunningOrders) {
		this.massInRunningOrders = massInRunningOrders;
	}

	public Integer getRealMass() {
		return realMass;
	}

	public void setRealMass(Integer realMass) {
		this.realMass = realMass;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getDistanceBetweenTheAxes() {
		return distanceBetweenTheAxes;
	}

	public void setDistanceBetweenTheAxes(Integer distanceBetweenTheAxes) {
		this.distanceBetweenTheAxes = distanceBetweenTheAxes;
	}

	public Integer getEngineCode() {
		return engineCode;
	}

	public void setEngineCode(Integer engineCode) {
		this.engineCode = engineCode;
	}

	public Integer getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(Integer cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Integer getRatedSpeed() {
		return ratedSpeed;
	}

	public void setRatedSpeed(Integer ratedSpeed) {
		this.ratedSpeed = ratedSpeed;
	}

	public String getPropulsyonSystem() {
		return propulsyonSystem;
	}

	public void setPropulsyonSystem(String propulsyonSystem) {
		this.propulsyonSystem = propulsyonSystem;
	}

	public String getEngineSeries() {
		return engineSeries;
	}

	public void setEngineSeries(String engineSeries) {
		this.engineSeries = engineSeries;
	}

	public Integer getPowerElectricMotor() {
		return powerElectricMotor;
	}

	public void setPowerElectricMotor(Integer powerElectricMotor) {
		this.powerElectricMotor = powerElectricMotor;
	}

	public String getEmissionsStandard() {
		return emissionsStandard;
	}

	public void setEmissionsStandard(String emissionsStandard) {
		this.emissionsStandard = emissionsStandard;
	}

	public String getNationalEmissionCode() {
		return nationalEmissionCode;
	}

	public void setNationalEmissionCode(String nationalEmissionCode) {
		this.nationalEmissionCode = nationalEmissionCode;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSeatsNo() {
		return seatsNo;
	}

	public void setSeatsNo(Integer seatsNo) {
		this.seatsNo = seatsNo;
	}

	public Integer getStandingPlacesNo() {
		return standingPlacesNo;
	}

	public void setStandingPlacesNo(Integer standingPlacesNo) {
		this.standingPlacesNo = standingPlacesNo;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Integer getStationarySoundLevel() {
		return stationarySoundLevel;
	}

	public void setStationarySoundLevel(Integer stationarySoundLevel) {
		this.stationarySoundLevel = stationarySoundLevel;
	}

	public Integer getEngineRevving() {
		return engineRevving;
	}

	public void setEngineRevving(Integer engineRevving) {
		this.engineRevving = engineRevving;
	}

	public Integer getMotionSoundLevel() {
		return motionSoundLevel;
	}

	public void setMotionSoundLevel(Integer motionSoundLevel) {
		this.motionSoundLevel = motionSoundLevel;
	}

	public Integer getPowerWeightRatio() {
		return powerWeightRatio;
	}

	public void setPowerWeightRatio(Integer powerWeightRatio) {
		this.powerWeightRatio = powerWeightRatio;
	}

	public String getCo2() {
		return co2;
	}

	public void setCo2(String co2) {
		this.co2 = co2;
	}

	public String getTraction() {
		return traction;
	}

	public void setTraction(String traction) {
		this.traction = traction;
	}

	public String getFrontAxleTires() {
		return frontAxleTires;
	}

	public void setFrontAxleTires(String frontAxleTires) {
		this.frontAxleTires = frontAxleTires;
	}

	public String getRearAxleTires() {
		return rearAxleTires;
	}

	public void setRearAxleTires(String rearAxleTires) {
		this.rearAxleTires = rearAxleTires;
	}

	public String getFrontAxleSuspension() {
		return frontAxleSuspension;
	}

	public void setFrontAxleSuspension(String frontAxleSuspension) {
		this.frontAxleSuspension = frontAxleSuspension;
	}

	public String getRearAxleSuspension() {
		return rearAxleSuspension;
	}

	public void setRearAxleSuspension(String rearAxleSuspension) {
		this.rearAxleSuspension = rearAxleSuspension;
	}

	public Integer getTankCapacity() {
		return tankCapacity;
	}

	public void setTankCapacity(Integer tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	public Integer getRarOffice() {
		return rarOffice;
	}

	public void setRarOffice(Integer rarOffice) {
		this.rarOffice = rarOffice;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

}
