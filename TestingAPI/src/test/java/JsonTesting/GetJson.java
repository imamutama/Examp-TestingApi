package JsonTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;

public class GetJson {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONParser jsonParser = new JSONParser();

		try (FileReader reader = new FileReader("school.json")) {
			Object object = jsonParser.parse(reader);
			JSONArray studentList = (JSONArray) object;
			// System.out.println(studentList);

			studentList.forEach(stdlist -> getAllStudent((JSONObject) stdlist));
			studentList.forEach(stdlist -> getCodeStudent((JSONObject) stdlist));
			studentList.forEach(stdlist -> getLastThree((JSONObject) stdlist));
			studentList.forEach(stdlist -> getStudentwithCode((JSONObject) stdlist));
			studentList.forEach(stdlist -> getGrade((JSONObject) stdlist));
			// System.out.println(studentList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} catch (ParseException e) {
			e.printStackTrace();

		}
	}

	private static void getAllStudent(JSONObject stdObject) {
		JSONArray studentObj = (JSONArray) stdObject.get("student");
		for (int i = 0; i < studentObj.size(); i++) {
			JSONObject j = (JSONObject) studentObj.get(i);
			String name = (String) j.get("name");
			;
			System.out.println("Name Student : " + name);
		}

	}

	private static void getCodeStudent(JSONObject stdObject) {
		JSONArray studentObj = (JSONArray) stdObject.get("student");
		for (int i = 0; i < studentObj.size(); i++) {
			JSONObject j = (JSONObject) studentObj.get(i);
			String code = (String) j.get("code");
			System.out.println("Code Student : " + code);
		}

	}

	private static void getStudentwithCode(JSONObject stdObject) {
		JSONArray studentObj = (JSONArray) stdObject.get("student");
		for (int i = 0; i < studentObj.size(); i++) {
			JSONObject j = (JSONObject) studentObj.get(i);
				String type = (String) j.get("type");
				String name1 = (String) j.get("name");
				String homework = (String) j.get("homework");
				String code1 = (String) j.get("code");
				String grade = (String) j.get("grade");
				if(code1 !=null) {	
				System.out.println("Type Student : " + type);
				System.out.println("Name Student : " + name1);
				System.out.println("HomeWork Student : " + homework);
				System.out.println("Code Student : " + code1);
				System.out.println("Grade Student : " + grade);
			}

		}
	}
	
	private static void getLastThree(JSONObject stdObject) {
		JSONArray studentObj = (JSONArray) stdObject.get("student");
		for (int i = 0; i < studentObj.size(); i++) {
			JSONObject j = (JSONObject) studentObj.get(i);
			if (i == 0) {

			} else {
				String type = (String) j.get("type");
				String name1 = (String) j.get("name");
				String homework = (String) j.get("homework");
				String code1 = (String) j.get("code");
				String grade = (String) j.get("grade");
				System.out.println("Type Student : " + type);
				System.out.println("Name Student : " + name1);
				System.out.println("HomeWork Student : " + homework);
				System.out.println("Code Student : " + code1);
				System.out.println("Grade Student : " + grade);

			}

		}
	}


	private static void getGrade(JSONObject stdObject) {
		JSONArray studentObj = (JSONArray) stdObject.get("student");
		for (int i = 0; i < studentObj.size(); i++) {
			JSONObject j = (JSONObject) studentObj.get(i);
			if (i == 1) {
				String type = (String) j.get("type");
				String name1 = (String) j.get("name");
				String homework = (String) j.get("homework");
				String code1 = (String) j.get("code");
				String grade = (String) j.get("grade");
				System.out.println("Type Student : " + type);
				System.out.println("Name Student : " + name1);
				System.out.println("HomeWork Student : " + homework);
				System.out.println("Code Student : " + code1);
				System.out.println("Grade Student : " + grade);
			}
			if (i == 3) {
				String type = (String) j.get("type");
				String name1 = (String) j.get("name");
				String homework = (String) j.get("homework");
				String code1 = (String) j.get("code");
				String grade = (String) j.get("grade");
				System.out.println("Type Student : " + type);
				System.out.println("Name Student : " + name1);
				System.out.println("HomeWork Student : " + homework);
				System.out.println("Code Student : " + code1);
				System.out.println("Grade Student : " + grade);
			}

		}
	}

}
