public class testMenu {
    public static void main(String[]args){
        Menu testMenu = new Menu();
        testMenu.addOption("Add a account.");
        testMenu.addOption("Log into existing account.");
        testMenu.addOption("Help.");
        testMenu.addOption("Quit.");
        int input = testMenu.getInput();
        System.out.println("Input:" + input);
    }
}
