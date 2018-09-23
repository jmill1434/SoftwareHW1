public class MyDate{
	private int my_date_;

	public MyDate(int date) {
		SetMyDate(date);
	}
	public MyDate(String date){
		SetMyDate(date);
	}

	public void SetMyDate(int date) {
		//assume that the date will be in the format yyyymmdd
		//date is an integer
		my_date_ = date;
	}

	public void SetMyDate(String date) {
		//assume that the date will be in the format mm/dd/yyyy
		String[] dateArray = date.split("/");
		String month = dateArray[0];
		String day = dateArray[1];
		String year = dateArray[2];
		String strDate = year + month + day;
		my_date_ = Integer.parseInt(strDate);
	}

	public int GetMyDate() {
		return my_date_;
	}

	public String GetMyDateString() {
		//please return a date string in the format yyyymmdd
		return Integer.toString(my_date_);
	}

	/*public String GetMyDateString1() {
		//please return a date string in the format of mm/dd/yyyy
	}

	public String GetMyDateString2() {
		//please return a date string in the format of dd/mm/yyyy
	}
*/
	public boolean IsLeapYear(int year) {
		//please return true if the year is a leap year
		//return false if the year is not a leap year
		if(year % 4 == 0){
            return true;
		}
		else{
            return false;
		}
	}


}
