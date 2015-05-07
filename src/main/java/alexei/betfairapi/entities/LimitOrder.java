
   	package alexei.betfairapi.entities;
   	
	/**
	  * Place a new LIMIT order (simple exchange bet for immediate execution)
	  * This class was auto-generated from interface definition xml.
	  */
   	public class LimitOrder {
   	
   		
		/**
		  * The size of the bet.
		  */
		private double size;

		/**
		  * The limit price
		  */
		private double price;

		/**
		  * What to do with the order at turn-in-play
		  */
		private PersistenceType persistenceType;

   		
   		
		/**
		  * The size of the bet.
		  */
		public double getSize() {
			return size;
		}

		/**
		  * The size of the bet.
		  */
		public void setSize(double size) {
			this.size = size;
		}		

		/**
		  * The limit price
		  */
		public double getPrice() {
			return price;
		}

		/**
		  * The limit price
		  */
		public void setPrice(double price) {
			this.price = price;
		}		

		/**
		  * What to do with the order at turn-in-play
		  */
		public PersistenceType getPersistenceType() {
			return persistenceType;
		}

		/**
		  * What to do with the order at turn-in-play
		  */
		public void setPersistenceType(PersistenceType persistenceType) {
			this.persistenceType = persistenceType;
		}		

   	
   	}
  