class Sample{
    public static void main(String args[]){
        System.out.println("Hello World!! This is Java code.");

        int numbers[] = {0,1,-10,32,44,11,55,-7,99};
        System.out.println("Maximum Value = " + getMaxValue(numbers));
    }

    public static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for(int i=1; i<numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    } 
}