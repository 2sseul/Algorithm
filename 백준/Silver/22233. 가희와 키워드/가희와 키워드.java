import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			map.put(s, i);
		}
		
		for(int i=0;i<M;i++) {
			String s = br.readLine();
			String arr[] = s.split(",");
			for(int j=0;j<arr.length;j++) {
				if(map.containsKey(arr[j])) {
					map.remove(arr[j]);
				}else {
					continue;
				}
			}
			System.out.println(map.size());
		}
	}
}
