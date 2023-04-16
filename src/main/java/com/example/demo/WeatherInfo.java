package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherInfo {
	@JsonProperty("LocalObservationDateTime")
    private String localObservationDateTime;
	@JsonProperty("EpochTime")
    private long epochTime;
	@JsonProperty("WeatherText")
    private String weatherText;
	@JsonProperty("WeatherIcon")
    private int weatherIcon;
	@JsonProperty("HasPrecipitation")
    private boolean hasPrecipitation;
	@JsonProperty("PrecipitationType")
    private String precipitationType;
	@JsonProperty("IsDayTime")
    private boolean isDayTime;
	@JsonProperty("Temperature")
    private Temperature temperature;
	@JsonProperty("MobileLink")
    private String mobileLink;
	@JsonProperty("Link")
    private String link;

    

    public static class Temperature {
    	@JsonProperty("Metric")
        private Metric metric;
    	@JsonProperty("Imperial")
        private Imperial imperial;


        public Metric getMetric() {
			return metric;
		}

		public void setMetric(Metric metric) {
			this.metric = metric;
		}

		public Imperial getImperial() {
			return imperial;
		}

		public void setImperial(Imperial imperial) {
			this.imperial = imperial;
		}

		public static class Metric {
			@JsonProperty("Value")
            private double value;
			@JsonProperty("Unit")
            private String unit;
			@JsonProperty("UnitType")
            private int unitType;
			
			public double getValue() {
				return value;
			}
			public void setValue(double value) {
				this.value = value;
			}
			public String getUnit() {
				return unit;
			}
			public void setUnit(String unit) {
				this.unit = unit;
			}
			public int getUnitType() {
				return unitType;
			}
			public void setUnitType(int unitType) {
				this.unitType = unitType;
			}

          
        }

        public static class Imperial {
        	@JsonProperty("Value")
            private double value;
			@JsonProperty("Unit")
            private String unit;
			@JsonProperty("UnitType")
            private int unitType;
        	
			public double getValue() {
				return value;
			}
			public void setValue(double value) {
				this.value = value;
			}
			public String getUnit() {
				return unit;
			}
			public void setUnit(String unit) {
				this.unit = unit;
			}
			public int getUnitType() {
				return unitType;
			}
			public void setUnitType(int unitType) {
				this.unitType = unitType;
			}

            
        }
    }



	public String getLocalObservationDateTime() {
		return localObservationDateTime;
	}



	public void setLocalObservationDateTime(String localObservationDateTime) {
		this.localObservationDateTime = localObservationDateTime;
	}



	public long getEpochTime() {
		return epochTime;
	}



	public void setEpochTime(long epochTime) {
		this.epochTime = epochTime;
	}



	public String getWeatherText() {
		return weatherText;
	}



	public void setWeatherText(String weatherText) {
		this.weatherText = weatherText;
	}



	public int getWeatherIcon() {
		return weatherIcon;
	}



	public void setWeatherIcon(int weatherIcon) {
		this.weatherIcon = weatherIcon;
	}



	public boolean isHasPrecipitation() {
		return hasPrecipitation;
	}



	public void setHasPrecipitation(boolean hasPrecipitation) {
		this.hasPrecipitation = hasPrecipitation;
	}



	public String getPrecipitationType() {
		return precipitationType;
	}



	public void setPrecipitationType(String precipitationType) {
		this.precipitationType = precipitationType;
	}



	public boolean isDayTime() {
		return isDayTime;
	}



	public void setDayTime(boolean isDayTime) {
		this.isDayTime = isDayTime;
	}



	public Temperature getTemperature() {
		return temperature;
	}



	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}



	public String getMobileLink() {
		return mobileLink;
	}



	public void setMobileLink(String mobileLink) {
		this.mobileLink = mobileLink;
	}



	public String getLink() {
		return link;
	}



	public void setLink(String link) {
		this.link = link;
	}
    
    
}
