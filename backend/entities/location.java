package entities;

public class location {

	private String gwidth;
	private String glength;
	private class adress
	{
		private String streetName;
		private String cityName;
		private String postalCode;
		
		
		public adress(String streetName, String cityName, String postalCode) {
			super();
			this.streetName = streetName;
			this.cityName = cityName;
			this.postalCode = postalCode;
		}


		public String getStreetName() {
			return streetName;
		}


		public void setStreetName(String streetName) {
			this.streetName = streetName;
		}


		public String getCityName() {
			return cityName;
		}


		public void setCityName(String cityName) {
			this.cityName = cityName;
		}


		public String getPostalCode() {
			return postalCode;
		}


		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}
		
	}
	
}
