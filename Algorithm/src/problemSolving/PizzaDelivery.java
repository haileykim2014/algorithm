package problemSolving;

import java.util.*;
class Point3{
	public int x, y;
	Point3(int x, int y){
		this.x=x;
		this.y=y;
	}
}
class PizzaDelivery {
	static int n, m, len, answer=Integer.MAX_VALUE;//도시의 피자배달거리 최소값
	static int[] combi;//조합저장
	static ArrayList<Point3> hs, pz;//집,피자집
	public void DFS(int L, int s){
		if(L==m){//조합이 완성되면
			int sum=0;
			for(Point3 h : hs){
				int dis=Integer.MAX_VALUE;
				for(int i : combi){
					dis=Math.min(dis, Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y));
				}
				sum+=dis;
			}
			answer=Math.min(answer, sum);
		}
		else{
			for(int i=s; i<len; i++){
				combi[L]=i;
				DFS(L+1, i+1);
			}
		}
	}

	public static void main(String[] args){
		PizzaDelivery T = new PizzaDelivery();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		pz=new ArrayList<>();
		hs=new ArrayList<>();
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				int tmp=kb.nextInt(); //정보를 하나씩받는다.
				if(tmp==1) hs.add(new Point3(i, j));
				else if(tmp==2) pz.add(new Point3(i, j));
			}
		}
		len=pz.size();//피자집의 갯수
		combi=new int[m];//len개 중에 m개를 뽑아야한다.
		T.DFS(0, 0);
		System.out.println(answer);
	}
}