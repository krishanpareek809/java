import java.util.*;

class Guest {
    String name;
    int age;

    public Guest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Ticket {
    List<Guest> guests;
    double totalCharge;

    public Ticket() {
        guests = new ArrayList<>();
        totalCharge = 0.0;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
        calculateTotalCharge();
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public double getTotalCharge() {
        return totalCharge;
    }

    public void calculateTotalCharge() {
        for (Guest guest : guests) {
            int age = guest.getAge();
            if (age <= 2) {
                totalCharge += 0;
            } else if (age < 18) {
                totalCharge += 100;
            } else if (age < 60) {
                totalCharge += 500;
            } else {
                totalCharge += 300;
            }
        }
    }
}

public class ZooTicketingSoftware {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of guests: ");
        int numberOfGuests = scanner.nextInt();
        scanner.nextLine();

        Ticket ticket = new Ticket();

        for (int i = 1; i <= numberOfGuests; i++) {
            System.out.print("Enter guest " + i + " name: ");
            String guestName = scanner.nextLine();
            System.out.print("Enter guest " + i + " age: ");
            int guestAge = scanner.nextInt();
            scanner.nextLine();

            Guest guest = new Guest(guestName, guestAge);
            ticket.addGuest(guest);
        }

        System.out.println("\nTotal Charges: INR " + ticket.getTotalCharge());

        System.out.println("\nTicket details:");
        List<Guest> guests = ticket.getGuests();
        for (int i = 0; i < guests.size(); i++) {
            Guest guest = guests.get(i);
            System.out.println("Guest " + (i + 1) + " (age: " + guest.getAge() + ")");
        }
        scanner.close();
    }
}
