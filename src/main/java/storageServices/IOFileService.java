package storageServices;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import controllerServices.Bank;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class IOFileService {
    private static final Gson gson = new Gson();

    public static int writeToFile(File file, String toWrite) {
        try {
            Files.write(Paths.get(file.getPath()), toWrite.getBytes());
            return 0;
        } catch (IOException e) {
            System.out.print("Failed to read file, IOException.\n" + e);
            return 1;
        }
    }

    public static String readFile(File file) {
        try {return Files.readString(Paths.get(file.getPath()));} catch (IOException e) {
            System.out.print("Failed to read file, IOException.\n" + e);
            return null;
        }
    }

    public static ArrayList<Bank> getBanksFromJson(String json) {
        return gson.fromJson(json, new TypeToken<ArrayList<Bank>>(){}.getType());
    }
}
