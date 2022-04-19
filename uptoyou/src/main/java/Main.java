
import buyers.BusinessManagingPartner;
import buyers.SleppingPartners;
import customer.Customer;
import damagedfruit.DamagedFruits;
import farmers.Farmers;
import farmers.MinWagePayingFarmers;
import farmers.NonMinWagePayingFarmers;
import fruit.Fruit;
import fruit.Apple;
import fruit.Mango;
import fruit.Orange;
import hotel.BuyerStay;
import hotel.HotelRoom;
import wholesalemarket.RegisteredFarmers;
import wholesalemarket.WholeSaleMarket;
import wholesalemarket.WholeSaleMarketOwners;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    //Class Fields
    private static final Scanner scanner = new Scanner(System.in);

    //Fruits
    private static final Fruit fruits = new Fruit("Palalu", "Eatable");

    private static final Mango mangoA = new Mango("Amba", "Rasalu", "South India", true);
    private static final Mango mangoB = new Mango("Motto - Amba", "Bangenipalli", "South India", true);
    private static final Mango mangoC = new Mango("Meto - Amba", "Cheruku - Rasam", "South India", true);

    public static final Apple appleA = new Apple("Rathado", "Cold Wether", "Red", 17);
    public static final Apple appleB = new Apple("Dwalo", "Cold Wether", "White", 22);
    public static final Apple appleC = new Apple("Ynganaro Rangu Sarko", "Cold Wether", "Dark Pink", 10);

    public static final Orange orangeA = new Orange("Orange Pandu", "Cold Weather", "Large", "North-East India", false);
    public static final Orange orangeB = new Orange("Chinna Organge", "Hot Weather", "Small", "Central India", false);
    public static final Orange orangeC = new Orange("Pedda Narinja Pandu", " Hot Weather", "Large", "North-West India", false);

    //WholeSale Market
    public static final WholeSaleMarket wholeSaleMarket = new WholeSaleMarket("Howard Whole Sale Market", "Nuzvid", true);

    public static final RegisteredFarmers registeredFarmer1 = new RegisteredFarmers("Howard Whole Sale Market", "Nuzvid", true, "Kondaiah", "Sevya and Sons Farm", "Siddhartha Nagar", true);
    public static final RegisteredFarmers registeredFarmer2 = new RegisteredFarmers("Howard Whole Sale Market", "Nuzvid", true, "Suresh", "Suresh and Sons Farm", "Guntur", true);
    public static final RegisteredFarmers registeredFarmer3 = new RegisteredFarmers("Howard Whole Sale Market", "Nuzvid", true, "Dav", "Amma and Sons Farm", "Simla", true);
    public static final RegisteredFarmers registeredFarmer4 = new RegisteredFarmers("Howard Whole Sale Market", "Nuzvid", true, "Gaza", "Sevak Farm", "Nagpur", true);
    public static final RegisteredFarmers registeredFarmer5 = new RegisteredFarmers("Howard Whole Sale Market", "Nuzvid", true, "Ramya", "Ramulu Farm", "Simbala", true);
    public static final RegisteredFarmers registeredFarmer6 = new RegisteredFarmers("Howard Whole Sale Market", "Nuzvid", true, "Kodandaram", "Katuri Farm", "KaramPuram", true);
    public static final RegisteredFarmers registeredFarmer7 = new RegisteredFarmers("Howard Whole Sale Market", "Nuzvid", true, "Jagadesh", "Jaggu and Banti Farm", "Madhapur", true);

    public static final WholeSaleMarketOwners wholeSaleMarketOwner1 = new WholeSaleMarketOwners("Howard Whole Sale Market", "Nuzvid", true, "Giri", "Malavathu", "Siddhartha Nagar", 22 );
    public static final WholeSaleMarketOwners wholeSaleMarketOwner2 = new WholeSaleMarketOwners("Howard Whole Sale Market", "Nuzvid", true, "Nayak", "Banavathu", "Mangalore", 14 );
    public static final WholeSaleMarketOwners wholeSaleMarketOwner3 = new WholeSaleMarketOwners("Howard Whole Sale Market", "Nuzvid", true, "Kottappa", "Malavathu", "Tiruvuru", 18 );
    public static final WholeSaleMarketOwners wholeSaleMarketOwner4 = new WholeSaleMarketOwners("Howard Whole Sale Market", "Nuzvid", true, "Koteswari", "Malavathu", "Swargam", 24 );
    public static final WholeSaleMarketOwners wholeSaleMarketOwner5 = new WholeSaleMarketOwners("Howard Whole Sale Market", "Nuzvid", true, "Aanand", "Malavathu", "Ananndale", 17 );
    public static final WholeSaleMarketOwners wholeSaleMarketOwner6 = new WholeSaleMarketOwners("Howard Whole Sale Market", "Nuzvid", true, "Srikanth", "Koda", "Vyuuru", 5 );

    //Hotel
    public static final HotelRoom hotelRoom1 = new HotelRoom("Kandhary", "Executive Suite", 5, 235.00, true);
    public static final HotelRoom mounikabai = new HotelRoom("Mounika Bai", "Family Room", 8, 185.0, true);
    public static final HotelRoom mothilalSena = new HotelRoom("Mothi Lal", "Family Room", 8, 185.0, true);
    public static final HotelRoom elizabethian = new HotelRoom("Elizabeth", "Family Room", 8, 185.0, true);
    public static final HotelRoom MarthaRao = new HotelRoom("Martha", "Family Room", 8, 185.0, true);
    public static final HotelRoom rachelCanning = new HotelRoom("Rachel", "Family Room", 8, 185.0, true);

    public static final BuyerStay buyer1 = new BuyerStay("Ajay", "Madhadi", true);
    public static final BuyerStay buyer2 = new BuyerStay("Kumar", "Maripol", false);
    public static final BuyerStay buyer3 = new BuyerStay("Srinu", "Kumar", true);
    public static final BuyerStay buyer4 = new BuyerStay("Praveen", "Kumar", true);
    public static final BuyerStay buyer5 = new BuyerStay("Satya", "Narayanan", false);
    public static final BuyerStay buyer6 = new BuyerStay("David", "Wilson", true);
    public static final BuyerStay buyer7 = new BuyerStay("Ram", "Kalnayak", true);
    public static final BuyerStay buyer8 = new BuyerStay("Srinivasa", "Pandey", true);

    //Farmers
    public static final Farmers farmer1 = new Farmers("Bimala", "Male","Mango", "Koduru");
    public static final Farmers farmer2 = new Farmers("Rabdi", "Female","Orange", "Patna");
    public static final Farmers farmer3 = new Farmers("Mounika", "Female","Apple", "Chennai");
    public static final Farmers farmer4 = new Farmers("Neraiah", "Male","Orange", "Komaram Bheem");
    public static final Farmers farmer5 = new Farmers("Satish", "Male","Mango", "Nuzvid");
    public static final Farmers farmer6 = new Farmers("Ben", "Male","Apple", "Sathenapalli");
    public static final Farmers farmer7 = new Farmers("Ratna Kumar", "Male","Mango", "PeterPalem");
    public static final Farmers farmer8 = new Farmers("Radhra", "Male","Orange", "ReddiGudem");

    public static final MinWagePayingFarmers minWagePayingFarmer1 = new MinWagePayingFarmers("Bimla", "Male", "Mango", "Koduru", "500 acres", 15, true );
    public static final MinWagePayingFarmers minWagePayingFarmer2 = new MinWagePayingFarmers("Rabdi", "Female","Orange", "Patna", "820 acres", 15, true);
    public static final MinWagePayingFarmers minWagePayingFarmer3 = new MinWagePayingFarmers("Ben", "Male","Apple", "Sathenapalli", "820 acres", 15, true);
    public static final MinWagePayingFarmers minWagePayingFarmer4 = new MinWagePayingFarmers("Neraiah", "Male","Orange", "Komaram Bheem", "820 acres", 15, true);
    public static final MinWagePayingFarmers minWagePayingFarmer5 = new MinWagePayingFarmers("Mounika", "Female","Apple", "Chennai", "820 acres", 15, true);

    public static final NonMinWagePayingFarmers nonMinWagePayingFarmer1 = new NonMinWagePayingFarmers( "Ratna Kumar", "Male","Mango", "PeterPalem","890 acres", 11, false , true, false);
    public static final NonMinWagePayingFarmers nonMinWagePayingFarmer2 = new NonMinWagePayingFarmers("Satish", "Male","Mango", "Nuzvid", "1500 acres", 9, false , false, false);
    public static final NonMinWagePayingFarmers nonMinWagePayingFarmer3 = new NonMinWagePayingFarmers("Radhra", "Male","Orange", "ReddiGudem", "3200 acres", 8, false , true, false);

    //Damaged Fruits
    public static final DamagedFruits damagedApple = new DamagedFruits("Apple ", "Yerupu", 988, 1695.00);
    public static final DamagedFruits mangoz = new DamagedFruits("Mango ", "", 89478, 12425.0);

    //Buyers
    public static final BusinessManagingPartner managingPartner1 = new BusinessManagingPartner("Samuel", 54, "Sevak Farm", "Orange", 21);
    public static final BusinessManagingPartner managingPartner2 = new BusinessManagingPartner("Balu", 65, "Balu Farm", "Mango", 18);
    public static final BusinessManagingPartner managingPartner3 = new BusinessManagingPartner("Suresh Naik", 38, "Seva Farm", "Apple", 12);
    public static final SleppingPartners sleepPartner1 = new SleppingPartners("Koti Babu", 38, "Sevak Farm", "Orange", 8);
    public static final SleppingPartners sleepPartner2 = new SleppingPartners("Suvarna", 52, "Balu Farm", "Mango", 19);
    public static final SleppingPartners sleepPartner3 = new SleppingPartners("Raja", 39, "Seva Farm", "Apple", 11);



    public static void main(String[] args) {
//Greeting
        System.out.println(greeting());


        //Register
        register();

        //Viewing Categories
        while (true) {
            switch (chooseCategory()) {
                case 1:
                    System.out.println("You are viewing the Whole Sale Market Data!");
                    System.out.println(wholeSaleMarket );
                    break;
                case 2:
                    System.out.println("You are viewing the Mango Data!");
                    System.out.println(mangoA);
                    System.out.println(mangoB);
                    System.out.println(mangoC);
                    break;
                case 3:
                    System.out.println("You are viewing the Orange Data!");
                    System.out.println(orangeA);
                    System.out.println(orangeB);
                    System.out.println(orangeC);
                    break;

                case 4:
                    System.out.println("You are viewing the Apple Data!");
                    System.out.println(appleA);
                    System.out.println(appleB);
                    System.out.println(appleC);
                    break;

                case 5:
                    System.out.println("You are viewing the Damaged Fruits Data!");
                    System.out.println(damagedApple);
                    break;

                case 6:
                    System.out.println("You are viewing the  Farmers Data!");
                    System.out.println(farmer1);
                    break;

                case 7:
                    System.out.println("You are viewing the Min Wage Paying Farmers Data!");
                    System.out.println(minWagePayingFarmer1);
                    System.out.println(minWagePayingFarmer2);
                    System.out.println(minWagePayingFarmer3);
                    break;

                case 8:
                    System.out.println("You are viewing the Non-Min Wage Paying Farmers Data!");
                    System.out.println(nonMinWagePayingFarmer1);
                    System.out.println(nonMinWagePayingFarmer2);
                    System.out.println(nonMinWagePayingFarmer3);
                    break;

                case 9:
                    System.out.println("You are viewing the Managing Partners Data!");
                    System.out.println(managingPartner1);
                    System.out.println(managingPartner2);
                    System.out.println(managingPartner3);
                    break;

                case 10:
                    System.out.println("You are viewing the Sleeping Partners Data!");
                    System.out.println(sleepPartner1);
                    System.out.println(sleepPartner2);
                    System.out.println(sleepPartner3);

                    break;

                case 11:
                    System.out.println("Thank you for checking Data!");
                    System.exit(0);

                default:
                    System.out.println("Please pick either (1 - 10)");
            }
        }
    }

    //All the Available Rooms
   // private final Set<HotelRoom> allAvailableRooms = new HashSet<HotelRoom>();

    //All the Buyers Staying Hotel
    //private final Set<BuyerStay> buyerStayList = new HashSet<BuyerStay>();

//Hotel - Hospitality Service

    private final List<BuyerStay> checkInList = new ArrayList<>(200);

    public static List<BuyerStay> filterByFavoriteRoom(List<BuyerStay> attendees, HotelRoom room) {

        // One -  Returns a new collection that contains guests from the provided collection
        // who have indicated the provided room is their first preference

        return attendees.stream()
                .filter(g -> g.getPreferredRooms().indexOf(room) == 0)
                .collect(Collectors.toList());

    }

    public void checkIn(BuyerStay guest) {

        // Two - Adds a guest to the check in list, placing members of the loyalty program
        // ahead of those guests not in the program, otherwise guests are ordered in the
        // sequence they are added.

        if (guest.isLoyaltyProgramMember() && !this.checkInList.isEmpty()) {

            int x = 0;
            for (; x < this.checkInList.size(); x++) {

                if (this.checkInList.get(x).isLoyaltyProgramMember()) {
                    continue;
                }

                break;

            }

            this.checkInList.add(x, guest);

        } else {
            this.checkInList.add(guest);
        }

    }

    public void swapPosition(BuyerStay guest1, BuyerStay guest2) {

        // 3.  Swaps the position of the two provided guests within the check-in list.
        // If guests are not currently in the list no action is required.

        int position1 = this.checkInList.indexOf(guest1);
        int position2 = this.checkInList.indexOf(guest2);

        if (position1 != -1 && position2 != -1) {

            this.checkInList.set(position1, guest2);
            this.checkInList.set(position2, guest1);

        }

    }

    public List<BuyerStay> getCheckInList() {
        return List.copyOf(this.checkInList);

    }


    //Methods
    public static String greeting(){
        return "Welcome to the Howard Whole Sale Market!";
    }

    public static void addCategoriesToWholeSaleMarket() {
        //Declaring a new array list of market data
        Set<WholeSaleMarket> marketData = new HashSet<>();


    }

    public static void register() {
        System.out.println("Lets get you registered!");
        System.out.println("Please enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.next();
        System.out.println("Please enter your phone number: ");
        int phoneNumber = scanner.nextInt();
        Customer c1 = new Customer(firstName, lastName, phoneNumber);
        //customer.setCustomer();
    }

    public static int chooseCategory() {
        System.out.println("""
                
                Please pick an Animal to view from the list below:
                1. Whole Sale Market 
                2. Mango
                3. Orange
                4. Apple
                5. Damaged Fruits
                6. Farmers
                7. Min Wage Paying Farmers
                8. Non Min Wage Paying Farmers
                9. Managing Partners
                10. Sleeping Partners
                11. Exit
                """);
        return scanner.nextInt();
    }
}






