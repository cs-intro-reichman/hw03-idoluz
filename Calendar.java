public class Calendar {

    static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		int givenYear = Integer.parseInt(args[0]); 
	   
	 	while (year < givenYear) {
	 		advance();
	 		while (year == givenYear) {
                if ( dayOfWeek == 1 ){
                    System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
                } else {
                 System.out.println(dayOfMonth + "/" + month + "/" + year);   
                }
                advance();

	 		     if (year > givenYear) { 
	 			   break;
	 		  }
          }  
        }	
	  }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		    dayOfMonth += 1;
			dayOfWeek += 1;
			if (dayOfWeek == 8) {
				dayOfWeek = 1;
			}
			if (nDaysInMonth(month, year) + 1 == dayOfMonth) {
				dayOfMonth = 1;
				month += 1;
			}
			if (month == 13) {
				month = 1;
				year += 1;
			}
			
		
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		if(((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) == true){
			return true;  
		}
	return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 1:
			return 31;

			case 2: if(isLeapYear(year) == true) {
			return 29;
			}
			return 28;

			case 3:
			return 31;

			case 4:
			return 30;

			case 5:
			return 31;

			case 6:
			return 30;

			case 7:
			return 31;

			case 8:
			return 31;

			case 9:
			return 30;

			case 10:
			return 31;

			case 11:
			return 30;

			case 12:
			return 31;

			default:
			return 0;
				
		}
		
	}

}