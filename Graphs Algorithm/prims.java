import java.util.ArrayList;
import java.util.Arrays;

public class prims{
    public static void main(String[] args) {
        int[][] mat={
                {99,10,99,30,99,99},
                {10,99,50,99,40,25},
                {99,50,99,99,35,99},
                {30,99,99,99,99,20},
                {99,40,35,99,99,55},
                {99,25,15,20,55,99}};
        prims(mat,6);

    }
    static void prims(int[][] G,int V){
        Boolean[] selected=new Boolean[V];
        Arrays.fill(selected,false);
        selected[0]=true;

        ArrayList<Integer> path=new ArrayList<>();
        path.add(1);
        int noedges=0;
        while((noedges++)<V-1){
            int min= Integer.MAX_VALUE;
            int x=0,y=0;
            for (int i = 0; i < V; i++) {
                if(selected[i]){
                    for (int j = 0; j < V; j++){
                        if (!selected[j] && G[i][j]<min) {
                            min=G[i][j];
                            x=i;y=j;
                        }
                    }
                }
            }
            System.out.println(" Source: "+(x+1)+" Destination: "+(y+1)+" Cost: "+G[x][y]);
            selected[y]=true;
            path.add(y+1);
        }
        for (int i = 0; i < path.size(); i++) {

            System.out.print(path.get(i)+"->");
        }
    }
}

