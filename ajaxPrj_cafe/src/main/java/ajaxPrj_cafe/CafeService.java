package ajaxPrj_cafe;

import java.util.ArrayList;

import org.eclipse.jdt.internal.compiler.IDebugRequestor;
import org.json.JSONArray;
import org.json.JSONObject;

public class CafeService {
	
	CafeDAO cafeDAO = new CafeDAO();
	
	public JSONObject getCafeInfo() {
		
		Cafe c = new Cafe("c200","아이스아메리카노", 5000);
		Cafe c1 = new Cafe("c201","바닐라라테", 4500);
		Cafe c2 = new Cafe("c202","초코스무디", 5500);
		JSONObject object = new JSONObject();
		object.put("name", c.getName());
		object.put("price", c.getPrice());
		
		return object;
		
	}
	
	
	public JSONArray getCafeList() {
		
		ArrayList<Cafe> list = new ArrayList<>();
		list.add(new Cafe("c200","아이스아메리카노", 5000));
		list.add(new Cafe("c201","바닐라라테", 4500));
		list.add(new Cafe("c202","초코스무디", 5500));
		
		
		JSONArray array = new JSONArray();
		
		
		for(int i=0; i<list.size(); i++) {
			Cafe cafe = list.get(i);
			JSONObject object = new JSONObject();
			object.put("name", cafe.getName());
			object.put("price", cafe.getPrice());
			
			array.put(object);
		}
		
		
		
		return array;
		
	}
	
	
	public JSONArray getCafeRealList() {
		
		
		
		ArrayList<Cafe> list = cafeDAO.getCafeList();
		
		
		System.out.println("변환전" + list);
		
		JSONArray array = new JSONArray();
		
		for(int i=0; i<list.size(); i++) {
			Cafe cafe = list.get(i);
			JSONObject object = new JSONObject();
			object.put("id", cafe.getid());
			object.put("name", cafe.getName());
			object.put("price", cafe.getPrice());
			
			array.put(object);
		}
		
		
		System.out.println(array);
		return array;
		
	}
	public static void main(String[] args) {
		
		CafeService  service= new CafeService();
		
		System.out.println( service.getCafeRealList());
		
	}

}
