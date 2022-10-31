import java.util.ArrayList;


public class Recipes {
    private ArrayList<String> ingredients = new ArrayList<>();
    private String name, ingredientsList;
    private int time;

    public Recipes (String name, int time, ArrayList<String> ingredients){
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
        this.ingredientsList = addIngredients();
    }

    public String printNameTime(){
        return this.name + ", cooking time: " + this.time;
    }

    public String addIngredients(){
        String adding = "";
        for (String add : ingredients){
            adding += add + "\n";
        }
        return adding;

    }

    public String ingredients(){
        return ingredientsList;
    }

    public boolean contains(String word){
        if (this.name.contains(word)){
            return true;
        }

        return false;
    }

    public boolean contains(int time){
        if (this.time <= time){
            return true;
        }

        return false;
    }

    public boolean containsIngredient(String word){
        String[] split = ingredientsList.split("\n");
        for (String i : split){
            if (i.equals(word)){
                return true;
            }
        }
        
        return false;
    }

}

























//     public void add(){
//         try (Scanner scanner = new Scanner(Paths.get(fileName))) {
//             String row = "";
//             // we read the file until all lines have been read
//             while (scanner.hasNextLine()) {
//                 // we read one line
                

//                 if (row.isEmpty()){
//                     for (int i = 0; i < 2; i++){
//                         row = scanner.nextLine();
//                         list.add(row);

//                     }
//                     continue;
//                 }

//                 row = scanner.nextLine();
//             }
//         } catch (Exception e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }

//     public void listing(){
//         add();

//         for (int i = 1; i < list.size(); i += 2){
//             System.out.println(list.get(i -1) + ", cooking time: " + list.get(i));
//         }


//     }


//     public void find(String text){
//         if (list.contains(text)){
            
//         }
        
//         recipes.split("+");
//         System.out.println(recipes);
//     }


// }
