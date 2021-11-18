package Lab02;
public class MyTime {
	private int hour;
	private int minute;
	private int second;
	
	public MyTime nextSecond() {
		int ts = this.second;
		if (ts < 59)	//less than 59sec
			setSecond(ts+1);
		else {
			setSecond(0);
			setMinute(getMinute()+1);
			nextMinute();
		}
		return this;
	}
	
	public MyTime nextMinute() {
		int tm = this.minute;
		if(tm<59)	//less than 59min
			setMinute(tm+1);
		
		else{
			setMinute(0);
			setHour(getHour()+1);
			nextHour();
		}
		
		return this;
	}
	
	public MyTime nextHour() {
		int th = this.hour;
		if(th<23)	//less than 23hour
			setHour(th+1);
		else
			setHour(0);
		return this;
	}
	
	public MyTime previousSecond() {
		int ts = this.second;
		if(ts>0)
			setSecond(ts-1);
		else
		{
			setSecond(59);
			previousMinute();
		}
		return this;
	}
	
	public MyTime previousMinute() {
		int tm=this.minute;
		if(tm>0)
			setMinute(tm-1);
		else
		{
			setMinute(59);
			previousHour();
		}
		return this;
	}
	
	public MyTime previousHour() {
		int th=this.hour;
		if(th>0)
			setHour(th-1);
		else
			setHour(23);
		return this;
	}
		
	public int getHour() {
		return hour;
	}
		
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}

	public MyTime(int hour, int minute, int second) {

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public MyTime(int hour, int minute) {

		this.hour = hour;
		this.minute = minute;
		this.second = 0;
	}

	public MyTime(int hour) {

		this.hour = hour;
		this.minute = 0;
		this.second = 0;
	}

	public MyTime() {

		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public MyTime(MyTime t) {

		this.hour = t.getHour();
		this.minute = t.getMinute();
		this.second = t.getSecond();
	}
	
	public String toString() {
		return String.format("%02d : %02d : %02d", this.getHour(), this.getMinute(), this.getSecond());
	}

	public String standardTime() {
		return String.format("%02d : %02d : %02d %s", 
				((getHour()==0 || getHour()==12)?12:getHour()%12),
				getMinute(), 
				getSecond(),
				(getHour()<12) ? "AM" : "PM"
				);
	}
}