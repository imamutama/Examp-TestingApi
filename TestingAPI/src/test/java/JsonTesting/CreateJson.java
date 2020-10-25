package JsonTesting;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class CreateJson {
	
	@SuppressWarnings("unchecked")
	public static void main(String[]args) {
		
		JSONObject studentDetail1 = new JSONObject();
		studentDetail1.put("type", "reference");
		studentDetail1.put("name", "Aan Abdullah");
		studentDetail1.put("homework", "Saying of the Century");
		studentDetail1.put("grade", "89.95");
		
		JSONObject studentDetail2 = new JSONObject();
		studentDetail2.put("type", "fiction");
		studentDetail2.put("name", "Bima Budiarto");
		studentDetail2.put("homework", "Sword of Honour");
		studentDetail2.put("grade", "52.99");
		
		JSONObject studentDetail3 = new JSONObject();
		studentDetail3.put("type", "fiction");
		studentDetail3.put("name", "Citra Candrawijaya");
		studentDetail3.put("homework", "Moby Dick");
		studentDetail3.put("code", "0-553-21311-3");
		studentDetail3.put("grade", "81.99");
		
		JSONObject studentDetail4 = new JSONObject();
		studentDetail4.put("type", "fiction");
		studentDetail4.put("name", "Devi Dinata");
		studentDetail4.put("homework", "The Lord of the Rings");
		studentDetail4.put("code", "0-395-19395-8");
		studentDetail4.put("grade", "22.99");
		
		List<Map<String,Object>> studentListDetail = new ArrayList<Map<String,Object>>();
		studentListDetail.add(studentDetail1);
		studentListDetail.add(studentDetail2);
		studentListDetail.add(studentDetail3);
		studentListDetail.add(studentDetail4);
		
		JSONObject bicyleObject = new JSONObject();
		bicyleObject.put("color", "fiction");
		bicyleObject.put("code", "1-105-19125-3");

		JSONObject studentObjebct = new JSONObject();
		studentObjebct.put("student", studentListDetail);
	
		
		JSONArray stdListArray = new JSONArray();
		stdListArray.add(studentObjebct);
		
		try(FileWriter file = new FileWriter("school.json")){
			file.write(stdListArray.toJSONString());
			file.flush();
		}catch(IOException e){
			e.printStackTrace();
			
		}
		 System.out.println("JSON file created: "+stdListArray);
		}
		
	}


