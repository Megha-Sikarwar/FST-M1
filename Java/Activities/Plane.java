package test.Java;

import java.util.Date;
import java.util.List;

class Plane {
	    public List<String> passengers;
	    public int maxPassengers;
	    public Date lastTimeTookOf;
	    public Date lastTimeLanded;
	    
		public List<String> getPassengers() {
			return passengers;
		}
		public void setPassengers(List<String> passengers) {
			this.passengers = passengers;
		}
		public int getMaxPassengers() {
			return maxPassengers;
		}
		public void setMaxPassengers(int maxPassengers) {
			this.maxPassengers = maxPassengers;
		}
		public Date getLastTimeTookOf() {
			return lastTimeTookOf;
		}
		public void setLastTimeTookOf(Date lastTimeTookOf) {
			this.lastTimeTookOf = lastTimeTookOf;
		}
		public Date getLastTimeLanded() {
			return lastTimeLanded;
		}
		public void setLastTimeLanded(Date lastTimeLanded) {
			this.lastTimeLanded = lastTimeLanded;
		}
}
