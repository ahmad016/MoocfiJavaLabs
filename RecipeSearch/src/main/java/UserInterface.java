import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipes> addThis;
    private String fileName;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.addThis = new ArrayList<>();
    }

    public void start() {

        System.out.print("Files to read: ");
        fileName = scanner.nextLine();

        System.out.println("Commands:\nlist - lists the recipes\nstop = stops the program\nfind name - searches recipes by name\n" +
        "find cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            add();

            if (command.equals("list")) {
                for (Recipes recip : addThis) {
                    System.out.println(recip.printNameTime());
                    continue;
                }
            }

            if(command.equals("find name")){
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                System.out.println("Recipes:\n");

                for (Recipes recip : addThis) {
                    if (recip.contains(word) == true){
                        System.out.println(recip.printNameTime());
                    }
                }
            }

            if (command.equals("find cooking time")){
                System.out.print("Max Cooking Time: ");
                int time = Integer.valueOf(scanner.nextLine());

                System.out.println("Recipes:\n");
                for (Recipes recip : addThis) {
                    if (recip.contains(time) == true){
                        System.out.println(recip.printNameTime());
                    }
                }
            }

            if (command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println("Recipes:\n");
                for (Recipes recip : addThis) {
                    if (recip.containsIngredient(ingredient) == true){
                        System.out.println(recip.printNameTime());
                    }
                }
            }


            if (command.equals("stop")) {
                break;
            }
        }
    }

    public void add() {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            String row = "";
            int time = 0;
            ArrayList<String> ingredients = new ArrayList<>();
            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                if (row.isEmpty() && scanner.hasNextLine()) {
                    String name = scanner.nextLine();
                    time = scanner.nextInt();
                    scanner.nextLine();
                    row = scanner.nextLine();
                    while (!row.isEmpty()) {
                        ingredients.add(row);
                        if (scanner.hasNextLine()){
                            row = scanner.nextLine();
                        } else {
                            break;
                        }
                    }
                    Recipes recipe = new Recipes(name, time, ingredients);
                    addThis.add(recipe);
                    ingredients.clear();

                }
            }

        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
