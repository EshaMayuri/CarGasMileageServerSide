//package edu.umkc.mobile.cargasmileageestimator.data;
package com.example.todoapp.models;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Esha Mayuri on 11/12/2017.
 */
@Document(collection="carDetails")
public class CarDetailsCollection {
	
	private String id;
    private String emailId;
    private String make;
    private String model;
    private String year;
    private String odometer;
    private String tankCapacity;
    private String mileage;
    private String fuel;
    private String totalGas;
    private String totalGasCost;

    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOdometer() {
        return odometer;
    }

    public void setOdometer(String odometer) {
        this.odometer = odometer;
    }

    public String getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(String tankCapacity) {
        this.tankCapacity = tankCapacity;
    }


    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }



    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((fuel == null) ? 0 : fuel.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((mileage == null) ? 0 : mileage.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((odometer == null) ? 0 : odometer.hashCode());
		result = prime * result + ((tankCapacity == null) ? 0 : tankCapacity.hashCode());
		result = prime * result + ((totalGas == null) ? 0 : totalGas.hashCode());
		result = prime * result + ((totalGasCost == null) ? 0 : totalGasCost.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
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
		CarDetailsCollection other = (CarDetailsCollection) obj;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (fuel == null) {
			if (other.fuel != null)
				return false;
		} else if (!fuel.equals(other.fuel))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (mileage == null) {
			if (other.mileage != null)
				return false;
		} else if (!mileage.equals(other.mileage))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (odometer == null) {
			if (other.odometer != null)
				return false;
		} else if (!odometer.equals(other.odometer))
			return false;
		if (tankCapacity == null) {
			if (other.tankCapacity != null)
				return false;
		} else if (!tankCapacity.equals(other.tankCapacity))
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
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
    
}
