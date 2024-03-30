package Basics.Recursion.MidLevel;

class TowerHanoiPrblm{
    int count=0;
    void towerOfHanoi(int n, String src, String helper, String dest){
        count++;
        if(n==1){
            System.out.println("Transfer disk "+n+" from--> "+src+" to--> "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n+" from--> "+src+" to--> "+dest);
        towerOfHanoi(n-1,helper, src,dest);
    }
}
public class TowerOfHanoi {
    public static void main(String [] args){
        int n=2;
        TowerHanoiPrblm obj = new TowerHanoiPrblm();
        obj.towerOfHanoi(n,"S-Tower","H-Tower","D-Tower");
        System.out.println("Number of process for transfer: "+ obj.count);
    }

}
