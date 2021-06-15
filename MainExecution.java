import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainExecution {

    public String path;

    public MainExecution(String path) {
        this.path = path;
        Engine.initializeEmpty(Engine.memory);
        Engine.initializeArrayList();
        Engine.initializeArrayList();
    }

    public void runProgram() {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Engine.runInstruction(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        TODO: Change back 'txt source' to original
        MainExecution run = new MainExecution("C:\\Users\\iyade\\IdeaProjects\\" +
                "Java\\PersonalProjects\\MicroProj\\program.txt");

        run.runProgram();

    }
}
