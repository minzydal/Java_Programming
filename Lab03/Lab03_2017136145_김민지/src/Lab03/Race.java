package Lab03;
import java.util.Random;

public class Race {
	
	private static final int RACE_END = 70;
	private static final Random rn = new Random();
	private static int tortoise;
	private static int hare;
	private static int timer;
	
public void run() {
	tortoise = 1;
	hare = 1;
	setTimer(0);
	//starting remark
	
	
	while(tortoise < RACE_END && hare < RACE_END) {
	
		moveHare();
		moveTortoise();
		printPosition();
		
		for(int t=0; t<100000000; t++)
			setTimer(getTimer() + 1);
	}
	// print results 
	
	if (tortoise >= hare)
		System.out.println("tortoise has won");
	else
		System.out.println("hare has won");
}

public void moveHare() {
	int percent = 1+rn.nextInt(10);
	
	if(percent == 3 || percent ==4)
		hare+=9;
	else if(percent >= 6 && percent <= 4)
		++hare;
	else if(percent == 5)
		hare-=12;
	else if(percent > 8)
		hare-=2;
	
	
	if(hare < 1)
		hare = 1;
	else if(hare > RACE_END)
		hare = RACE_END;
}


public void moveTortoise() {
	int percent = 1 + rn.nextInt(10);
	
	if(percent >= 1 && percent <=5)
		tortoise += 3;
	else if(percent == 6 || percent ==7)
		tortoise -= 6;
	else 
		++tortoise;
	if(tortoise < 1)
		tortoise = 1;
	else if(tortoise > RACE_END)
		tortoise = RACE_END;
	}

public void printPosition() {
	for(int count = 1; count <= RACE_END; count++) {
		if (count == hare && count == tortoise)
			System.out.println("OUCH..");
		else if (count == hare)
			System.out.println("H");
		else if (count == tortoise)
			System.out.println("T");
		else
			System.out.println(" ");
		}
	}

public static int getTimer() {
	return timer;
}

public static void setTimer(int timer) {
	Race.timer = timer;
}
}