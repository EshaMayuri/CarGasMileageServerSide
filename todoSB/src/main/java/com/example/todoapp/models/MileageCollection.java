package com.example.todoapp.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="todos")
public class MileageCollection {
 
	private String id;
	
    private String distance;
    
    private String gasRemaining;
    
    private String range;
    
    private String mileage;
    
    private String date;
    
    private String car_id;
    
    private String totalDistance;
    
    private String totalGas;
    
    private String totalGasCost;
    
	public String getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(String totalDistance) {
		this.totalDistance = totalDistance;
	}

	public String getTotalGas() {
		return totalGas;
	}

	public void setTotalGas(String totalGas) {
		this.totalGas = totalGas;
	}

	public String getTotalGasCost() {
		return totalGasCost;
	}

	public void setTotalGasCost(String totalGasCost) {
		this.totalGasCost = totalGasCost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getGasRemaining() {
		return gasRemaining;
	}

	public void setGasRemaining(String gasRemaining) {
		this.gasRemaining = gasRemaining;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCar_id() {
		return car_id;
	}

	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((car_id == null) ? 0 : car_id.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((distance == null) ? 0 : distance.hashCode());
		result = prime * result + ((gasRemaining == null) ? 0 : gasRemaining.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mileage == null) ? 0 : mileage.hashCode());
		result = prime * result + ((range == null) ? 0 : range.hashCode());
		result = prime * result + ((totalDistance == null) ? 0 : totalDistance.hashCode());
		result = prime * result + ((totalGas == null) ? 0 : totalGas.hashCode());
		result = prime * result + ((totalGasCost == null) ? 0 : totalGasCost.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MileageCollection other = (MileageCollection) obj;
		if (car_id == null) {
			if (other.car_id != null)
				return false;
		} else if (!car_id.equals(other.car_id))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (distance == null) {
			if (other.distance != null)
				return false;
		} else if (!distance.equals(other.distance))
			return false;
		if (gasRemaining == null) {
			if (other.gasRemaining != null)
				return false;
		} else if (!gasRemaining.equals(other.gasRemaining))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mileage == null) {
			if (other.mileage != null)
				return false;
		} else if (!mileage.equals(other.mileage))
			return false;
		if (range == null) {
			if (other.range != null)
				return false;
		} else if (!range.equals(other.range))
			return false;
		if (totalDistance == null) {
			if (other.totalDistance != null)
				return false;
		} else if (!totalDistance.equals(other.totalDistance))
			return false;
		if (totalGas == null) {
			if (other.totalGas != null)
				return false;
		} else if (!totalGas.equals(other.totalGas))
			return false;
		if (totalGasCost == null) {
			if (other.totalGasCost != null)
				return false;
		} else if (!totalGasCost.equals(other.totalGasCost))
			return false;
		return true;
	}
    
    

}