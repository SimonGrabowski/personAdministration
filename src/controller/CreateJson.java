package controller;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class CreateJson {

    public void createJsonFile() {
        JSONObject jsonObject = new JSONObject();
        try {
            FileWriter fileWriter = new FileWriter("/home/simon/Documents/Projects/intellijProjects/personAdministration/output.json");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
