public class Tris {

    public static void main(String[] args){

        int[] tableau=new int[100000];
        remplirAleatoirementtableau(tableau, -5000,5000);
        afficher(tableau);
        long startTime = System.currentTimeMillis();
        int[] result=plusGrandesValeurs(100,tableau);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

    public static int[] plusGrandesValeurs(int n,int[] t){
        int[] plusGrandes=new int[n];

        int indiceMax=0;
        for(int i=0;i<n;i++){
            int max=t[0];
            for(int j=0;j<t.length;j++){
                if(max<t[j]){
                    max=t[j];
                    indiceMax=j;
                }
            }
            plusGrandes[i]=max;
            t[indiceMax]=Integer.MIN_VALUE;
        }
        return plusGrandes;
    }

    public static void remplirAleatoirementtableau(int[] t, int min, int max) {
        for(int i=0;i<t.length;i++) {
            t[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    public static void afficher(int[] t){
        for(int i=0;i<t.length;i++){
            System.out.print(t[i]+"\t");
        }
        System.out.println();
    }

}
