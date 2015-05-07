
   	package alexei.betfairapi.entities;
   	
	/**
	  * Place a new LIMIT_ON_CLOSE bet
	  * This class was auto-generated from interface definition xml.
	  */
   	public class LimitOnCloseOrder {
   	
   		
		/**
		  * The size of the bet.
		  */
		private double liability;

		/**
		  * The limit price of the bet if LOC
		  */
		private double price;

   		
   		
		/**
		  * The size of the bet.
		  */
		public double getLiability() {
			return liability;
		}

		/**
		  * The size of the bet.
		  */
		public void setLiability(double liability) {
			this.liability = liability;
		}		

		/**
		  * The limit price of the bet if LOC
		  */
		public double getPrice() {
			return price;
		}

		/**
		  * The limit price of the bet if LOC
		  */
		public void setPrice(double price) {
			this.price = price;
		}		

   	
   	}
  