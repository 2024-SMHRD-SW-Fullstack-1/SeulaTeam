package hashmap;

import java.util.HashMap;

public class Ex01hashmap활용 {

	public static void main(String[] args) {

		// <Key(값을 가지고오기위한 키값),Value(실제값)>
		HashMap<String, String> hm = new HashMap<String, String>();

		// 데이터 추가
		hm.put("key1", "Value1");
		hm.put("key2", "Value2");
		hm.put("key3", "Value3");

		// 데이터 확인(특정 key)
		String value = hm.get("key1");
		System.out.println(value);

		hm.put("key3", "new value"); 	// 이미 존재하는 key를 다시 사용해서 저장할 경우에는 새로운 키값만존재
										// key값은 겹치면 안됨!!
		System.out.println(hm.get("key3"));

		// 데이터 수정(특정 key)
		hm.replace("key2", "value6");
		System.out.println(hm.get("key2"));
		
		//hashmap이 특정 key를 포함하고 있는지 확인
		boolean isContainkey2 = hm.containsKey("key2");
		System.out.println(isContainkey2);
		System.out.println(hm.containsKey("key6"));
		
		//hashmap이 특정 value를 포함하고 있는지 확인 (boolean)
		System.out.println(hm.containsValue("Value1"));
		System.out.println(hm.containsValue("Value8"));
		
		//hashmap이 비어있는지 확인(boolean)
		boolean isEmpty = hm.isEmpty();
		System.out.println(isEmpty);
		
		//hashmap에 저장된 데이터 개수
		System.out.println(hm.size());
		
		
	}

}
