package Programs;

import java.util.Scanner;

public class ProgramSix {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	System.out.println("Month : " +month);
	float rent = sc.nextFloat();
	System.out.println("Rent : " +rent);
	int days = sc.nextInt();
	System.out.println("Days : " +days);
	float finalRoomRent = rent;
    
    // Use a switch construct to check the month and adjust the tariff
    switch(month) {
        case 4: // April
        case 5: // May
        case 6: // June
        case 11: // November
        case 12: // December
            // Apply 20% increase during peak season
            finalRoomRent = rent * 1.20f;
            break;
        default:
            // No increase during off-peak months
            finalRoomRent = rent;
            break;
    }
    
    
    float totalTariff = finalRoomRent * days;
    
    
    System.out.printf("%.2f\n", totalTariff);
    
  
}

	
}

