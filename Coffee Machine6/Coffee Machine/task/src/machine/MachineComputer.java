package machine;

import java.util.Scanner;

class MachineComputer {

    private Scanner scanner = new Scanner(System.in);

    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    MachineComputer(int water, int milk, int beans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
    }

    void start() {
        boolean running = true;
        while(running){
            System.out.println("Write action (buy, fill, take, exit, remaining):");

            String userChoice = scanner.nextLine();
            switch (userChoice) {
                case "buy":
                    buy();
                    break;

                case "fill":
                    fill();
                    break;

                case "take":
                   take();
                    break;

                case "exit":
                    running = false;
                    break;

                case "remaining":
                    printOuts();
                    break;
            }
        }
    }

    private void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                "back - to main menu:");
        String buyChoice = scanner.nextLine();
        switch (buyChoice) {
            case "1":
                if(water < 250 || beans < 16 || cups < 1){
                    break;
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    beans -= 16;
                    cups--;
                    money += 4;
                    break;
                }
            case "2":
                if(water < 250 || milk < 75 || beans < 16 || cups < 1){
                    break;
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups--;
                    money += 7;
                    break;
                }
            case "3":
                if(water < 200 || milk < 100 || beans < 12 || cups < 1){
                    break;
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups--;
                    money += 6;
                    break;
                }
            case "back":
                break;
        }
    }

    private void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        this.water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        this.milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee do you want to add:");
        this.beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        this.cups += scanner.nextInt();
    }

    private void take() {
        System.out.println("I gave you $" + this.money);
        this.money = 0;
    }

    private void printOuts() {
        System.out.println("The coffee machine has:");
        System.out.println(this.water + " of water");
        System.out.println(this.milk + " of milk");
        System.out.println(this.beans + " of coffee beans");
        System.out.println(this.cups + " of disposable cups");
        System.out.println(this.money + " of money");
    }

}
