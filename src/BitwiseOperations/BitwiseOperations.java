package BitwiseOperations;

public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 12;
        int b = 63;
        BitwiseOperations.printInBinary(a);
        System.out.println("isNthBitSet(2,0) = " + isNthBitSet(2,0));
        System.out.println("unsetNBit(2,1) = " + unsetNBit(2,1));
        System.out.println("isEven(2) = " + isEven(2));
        System.out.println("setNbit(5,3) = " + setNbit(5,3));
        System.out.println("toggleNbit(a,2) = " + toggleNbit(a, 2));
        System.out.println("turnOffNBit(2,1) = " + turnOffNBit(2,1));
        System.out.println("isolateRightMostBit(10) = " + isolateRightMostBit(10));
        System.out.println("propagateRightMostBit(10) = " + propagateRightMostBit(10));
        System.out.println("isolateRightMost0Bit(10) = " + isolateRightMost0Bit(10));
        System.out.println("turnOnRightmost0BIt(10) = " + turnOnRightmost0BIt(10));
    }

    public static void printInBinary(int a){
        int b = a;
        StringBuilder s = new StringBuilder();
        for(int i=0;i<32;i++){
            if((a & 1) ==1) s.insert(0, "1");
            else s.insert(0, "0");
            a = a>>1;
        }
        System.out.println(Integer.toString(b)+"= " + s);
    }
    
    public static boolean isEven(int a){
        return (a & 1)==0;
    }
    
    public static boolean isNthBitSet(int a,int n){
        return (a & (1<<n)) !=0;
    }

    public static int setNbit(int a ,int n){
        return (a | (1<<n));
    }
    
    public static int unsetNBit(int a,int n){
        return a & ~(1<<n);
    }

    public static int toggleNbit(int a, int n){
        return a ^ (1<<n);
    }

    public static int turnOffNBit(int a, int n){
        return a & (a-1);
    }

    public static int isolateRightMostBit(int a){
        return a & (-a);
    };
    
    public static int propagateRightMostBit(int a){
        return a | (a-1);
    }
    
    public static int isolateRightMost0Bit(int a){
        return (~a) & (a+1);
    }
    
    public static int turnOnRightmost0BIt(int a){
        return a | (a+1);
    }
    
}
