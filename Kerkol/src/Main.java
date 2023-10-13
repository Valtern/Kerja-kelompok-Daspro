import java.util.Scanner;

class proyek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customerN = "", date = "", gender, takeOrDine, eatconcl = "", confirm, confirm1, confirm2, confirm3;
        char genderh = 0;
        int totalC = 0, custFee = 3000, totalDisc = 0, pTax, restauFee = 0, comboP;
        double tax = 1.10;
        boolean consent2 = true, consent3 = true, consent4 = true, consent5 = true, comboC = true, foodC = true, drinkC = true;

        System.out.println("Take away or dine in?");
        takeOrDine = sc.nextLine();
        if (takeOrDine.endsWith("ake")) {
            restauFee = 4000;
            eatconcl = "Take away";
            System.out.println("Take away order");
        } else if (takeOrDine.endsWith("ine")) {
            System.out.println("Dine in order");
            eatconcl = "Dine in";
        }
        while (consent2) {
            System.out.println("Please enter your name:");
            customerN = sc.nextLine();

            System.out.println("Enter the current date (DD/MM/YYYY)");
            date = sc.nextLine();

            System.out.println("Are you a male or a female  (Male/Female)");
            gender = sc.nextLine();
            if (gender.equalsIgnoreCase("male")) {
                genderh = 'M';
            } else if (gender.equalsIgnoreCase("female")) {
                genderh = 'F';
            } else {
                genderh = '?';
                System.out.println("You choose to hide your gender");
            }
            System.out.println(customerN + "\n" + date + "\n" + genderh);
            System.out.println("Is this the correct information ? (Yes/No)");
            confirm = sc.nextLine();
            if (confirm.endsWith("es")) {
                consent2 = false;
            }

        }
        System.out.println("Welcome to our restaurant ! \nWe currently have a special combo going on right now would you like to order them ? (Yes/No)");
        String consent1 = sc.next();
        StringBuilder comboN = new StringBuilder();


        if (consent1.equalsIgnoreCase("yes")) {
            System.out.println("The combo that is currently up are:");
            System.out.println("1. Chicken fried rice with tea (30000) \n2. Shrimp fried rice with tea (33000) \n3. Chicken katsu (with rice) with lemon tea (31000) \n4. Beef katsu (with rice) with lemon tea (46000) \n5. Goat fried rice with tea (39000)");

            while (consent3) {
                if (!comboC) {
                    System.out.println("Combo you ordered :");
                    System.out.println(comboN + "\n" + totalC);
                    System.out.println("Is the item you ordered correct ? (Yes/no) or would you like to clear your selection");
                    confirm1 = sc.next();
                    if (confirm1.endsWith("es")) {
                        consent3 = false;
                    } else if (confirm1.endsWith("o")) {
                        comboN = new StringBuilder();
                        totalC = 0;
                        comboC = true;
                    }
                }
                while (comboC) {
                    System.out.print("Enter the combo number (Type 0 to finish): ");
                    comboP = sc.nextInt();
                        switch (comboP) {
                            case 1:
                                totalC += 30000;
                                comboN.append("Chicken fried rice with tea\n");
                                break;
                            case 2:
                                totalC += 33000;
                                comboN.append("Shrimp fried rice with tea\n");
                                break;
                            case 3:
                                totalC += 31000;
                                comboN.append("Chicken katsu (with rice) with lemon tea\n");
                                break;
                            case 4:
                                totalC += 46000;
                                comboN.append("Beef katsu (with rice) with tea\n");
                                break;
                            case 5:
                                totalC += 39000;
                                comboN.append("Goat fried rice with lemon tea\n");
                                break;
                            case 0:
                                comboC = false;
                            default:
                                System.out.println("Invalid combo number");

                        }
                }
            }

        } else {
            System.out.println("You choose not to see the special combo");
        }

        StringBuilder foodN = new StringBuilder();
        int foodP = 0;
        int foodS;

        System.out.println("Here is our food menu. Please order a food");
        System.out.println("1. Chicken fried rice (27000) \n2. Shrimp fried rice (28000) \n3. Chicken katsu with rice (26000) \n4. Goat fried rice (30000) \n5. Beef katsu with rice (35000) \n6. Fried onion rings (12000) \n7. Fried mushroom (14000) \n8. Fried chicken skin (16000)");
        while (consent4) {
            if (!foodC) {
                System.out.println("Food you ordered: ");
                System.out.println(foodN + "\n" + foodP);
                System.out.println("Is the food you ordered correct ? (Yes/No) or would you like to clear your selection");
                confirm2 = sc.next();
                if (confirm2.endsWith("es")) {
                    consent4 = false;
                }  else if (confirm2.endsWith("o")) {
                    foodN = new StringBuilder();
                    foodP = 0;
                    foodC = true;
                }
            }
            while (foodC) {
                System.out.print("Enter the food number (Type 0 to finish): ");
                foodS = sc.nextInt();
                switch (foodS) {
                    case 1:
                        foodP += 27000;
                        foodN.append("Chicken fried rice\n");
                        break;
                    case 2:
                        foodP += 28000;
                        foodN.append("Shrimp fried rice\n");
                        break;
                    case 3:
                        foodP += 26000;
                        foodN.append("Chicken katsu with rice\n");
                        break;
                    case 4:
                        foodP += 30000;
                        foodN.append("Goat fried rice\n");
                        break;
                    case 5:
                        foodP += 35000;
                        foodN.append("Beef katsu with rice\n");
                        break;
                    case 6:
                        foodP += 12000;
                        foodN.append("Fried onion rings\n");
                        break;
                    case 7:
                        foodP += 14000;
                        foodN.append("Fried mushroom\n");
                        break;
                    case 8:
                        foodP += 16000;
                        foodN.append("Fried chicken skin\n");
                        break;
                    case 0:
                        foodC = false;
                    default:
                        System.out.println("Invalid food number");
                }
            }
        }

        StringBuilder drinkN = new StringBuilder();
        int drinkP = 0;
        int drinkS;

        System.out.println("Here is our beverage menu. Please order a beverage");
        System.out.println("1. Ice tea (6000)\n2. Lemon tea (8000) \n3. Mineral water (3000) \n4. Orange juice (11000) \n5. Suspicious drink (99999)");

        while (consent5) {
            if (!drinkC) {
                System.out.println("drinks you ordered: ");
                System.out.println(drinkN + "\n" + drinkP);
                System.out.println("Is drinks you ordered correct ? (Yes/No) or would you like to clear your selection");
                confirm3 = sc.next();
                if (confirm3.endsWith("es")) {
                    consent5 = false;
                } else if (confirm3.endsWith("o")) {
                    drinkN = new StringBuilder();
                    drinkP = 0;
                    drinkC = true;
                }
            }
            while (drinkC) {
                System.out.print("Enter the beverage number (Type 0 to finish): ");
                drinkS = sc.nextInt();
                switch (drinkS) {
                    case 1:
                        drinkP += 6000;
                        drinkN.append("Ice tea\n");
                        break;
                    case 2:
                        drinkP += 8000;
                        drinkN.append("Lemon tea\n");
                        break;
                    case 3:
                        drinkP += 3000;
                        drinkN.append("Mineral water\n");
                        break;
                    case 4:
                        drinkP += 11000;
                        drinkN.append("Orange juice\n");
                        break;
                    case 5:
                        drinkP += 99999;
                        drinkN.append("Suspicious drink\n");
                        break;
                    case 0:
                        drinkC = false;
                    default:
                        System.out.println("Invalid beverage number");
                }
            }
        }

        int fanddP = drinkP + foodP + totalC;
        if (fanddP >= 50000 && fanddP <= 99999) {
            totalDisc = (int) (fanddP * 0.90);
        } else if (fanddP >= 100000) {
            totalDisc = (int) (fanddP * 0.85);
        }

        int totalDwF = totalDisc + custFee + restauFee;
        int total = (int) (totalDwF * tax);
        pTax = (int) (totalDwF * 0.10);

        System.out.println("Your receipt:");
        System.out.println(eatconcl);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Customer name: " + customerN + "\n" + "Gender: " + genderh);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Food that you ordered:");
        System.out.println(comboN + foodN.toString() + drinkN);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if ((!comboN.isEmpty()) || (!foodN.isEmpty()) || (!drinkN.isEmpty())) {
            System.out.println("Original price: " + fanddP + "\n" + "Original discount price: " + totalDisc + "\nCustomer fee: 3000" + "\n" + "Tax (10%): " + pTax);
        } else {
            System.out.println("You did not order anything");
        }

        if (eatconcl.equals("Dine in")) {
            System.out.println("Dine in order");
        } else if (eatconcl.equals("Take away")) {
            System.out.println("Take away order");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total: " + total);
        System.out.println(date);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
