package Movie;

import java.util.ArrayList;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class MovieService {
	
	
	public JSONObject getMovieInfo() {
		
		Movie m = new Movie("타겟", "박희곤", "101분");
		JSONObject o = new JSONObject();
		o.put("name", m.getName());
		o.put("supervise", m.getSupervise());
		o.put("runtime", m.getRuntime());
		
		return o;
		
	}
	
	
	public JSONArray getMovieList() {
		
		
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("타겟", "박희곤", "101분"));
		list.add(new Movie("오펜하이머", "크리스토퍼 놀란", "180분"));
		list.add(new Movie("밀수", "류승완", "129분"));
		list.add(new Movie("콘크리트 유토피아", "엄태화", "130분"));
		list.add(new Movie("달짝지근해: 7510", "이한", "119분"));
		
		JSONArray array = new JSONArray();
		
		
		for(int i=0; i<list.size(); i++) {
			Movie m = list.get(i);
			JSONObject object = new JSONObject();
			object.put("name", m.getName());
			object.put("supervise", m.getSupervise());
			object.put("runtime", m.getRuntime());
			
			
			array.put(object);
			
			
		}
		
		
		return array;
		
	}
	
	

}
