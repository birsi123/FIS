/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculRuta;

/**
 *
 * @author Andrei
 */
public class RutaMinima {
	int[] rute;
	int len;
	int[] visited;
	
	public RutaMinima () {}
	public RutaMinima(int[] rute, int len, int[] visited) {
		this.rute = rute;
		this.len = len;
		this.visited = visited;
	}
	
	public void initializare(int n) {
		rute = new int[n+1];
		visited = new int[n+1];
		len = -1;
	}
	
	public void calculateDistance(String[][] mat, int n, int sum, int srs, int destfin) {
		if(srs == destfin) {
			if(len<(rute.length-1)) {
				len++;
				rute[len]=sum;
			}
			return;
		}
		int sum_backup;
		sum_backup = sum;
		int[] visited_backup = visited.clone();
		for(int i=0;i<n;i++) {
			if( mat[srs][i]!=null && mat[srs][i]!="0" && visited[i]==0) {
					System.out.print("Sum: "+sum + "+" + mat[srs][i] + " = ");
					sum+=Integer.parseInt(mat[srs][i]);
					System.out.print(sum);
					visited[srs]=1;
					System.out.println();
					System.out.println("poz: "+srs + " "+i );
					calculateDistance(mat, n, sum, i, destfin);
					for(int j=0;j<n;j++)
						visited[i]=visited_backup[i];
					sum=sum_backup;
			}
		}
		return;
	}
	
	public int findRoute(String[][] mat, int n, int srs, int dest, int cond ) {
		int min=50000;
		
		// eliminam rute care nu respecta conditiile necesare 
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) {
				if(mat[i][j]!=null) {
					if(cond == 1)
						if(!mat[i][j].contains("*")) mat[i][j] = "0";
						else mat[i][j] = mat[i][j].substring(1);
					if(cond == 2)
						if(!mat[i][j].contains("#")) mat[i][j] = "0";
						else mat[i][j] = mat[i][j].substring(1);
					else {
						if(mat[i][j].contains("#") || mat[i][j].contains("*")) mat[i][j] = mat[i][j].substring(1);
					}
				}
			}
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		//initializam vectorul visited cu 0
		for(int i=0;i<n;i++)
			visited[i]=0;
		
		//calculam toate distantele posibile
		calculateDistance(mat, n, 0, srs, dest);
		
		for(int i=0;i<=len;i++) {
			System.out.print(rute[i]+" ");
		}
		System.out.println();
		for(int i=0;i<=len;i++) {
			if(rute[i]<min && rute[i]!=0)min=rute[i];
		}
		System.out.println();
		
		return min;
	}
}
