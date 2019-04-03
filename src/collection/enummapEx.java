package collection;

import java.util.EnumMap;

public class enummapEx {
	public enum cfg{code,CONTRIBUTE,QUIZ,MCQ;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<cfg,String> map=new EnumMap<cfg,String>(cfg.class);
		map.put(cfg.code, "Start Coding");
		map.put(cfg.CONTRIBUTE, "Start Contributing");
		map.put(cfg.QUIZ, "Start Quiz");
		map.put(cfg.MCQ, "Start MCQ");
		
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println("Key:"+cfg.code+"Value:"+map.get(cfg.code));
		System.out.println("Key:"+cfg.CONTRIBUTE+"Value:"+map.get(cfg.CONTRIBUTE));
		System.out.println("Key:"+cfg.QUIZ+"Value:"+map.get(cfg.QUIZ));
		System.out.println("Key:"+cfg.MCQ+"Value:"+map.get(cfg.MCQ));
		

	}

}
