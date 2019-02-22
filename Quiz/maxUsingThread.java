class MaxUsingThread extends Thread {
    private int lo, hi;
    private int[] arr;
    private static int maxInArr;
    private static int[] maxArr;

    public MaxUsingThread(int[] arr, int lo, int hi) {
        this.lo = lo;
        this.hi = hi;
        this.arr = arr;
    }

    public static int max(int[] arr) throws InterruptedException {
        int len = arr.length;
        MaxUsingThread[] ts = new MaxUsingThread[4];
        for (int i = 0; i < 4; i++) {
            ts[i] = new MaxUsingThread(arr, (i * len) / 4, ((i + 1) * len / 4));
            ts[i].start();
        }

        maxArr = new int[4];
        int max = arr[0];
        for (int i = 0; i < 4; i++) {
            ts[i].join();
            for (int j = 1; j < len; j++) {      
                if ( max < arr[i] ){
                    max = arr[i];
                    for (int k = 0; k < 4; k++) {
                        maxArr[0] = max;

                    }
                }     
            }
        }
        maxInArr = maxArr[0];
        for (int i = 1; i < 4; i++) {
            if (maxInArr < maxArr[i]){
                maxInArr = maxArr[i];
            }   
        }
        return maxInArr;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int max = max(arr);
        System.out.println("Max: " + max);
    }
}