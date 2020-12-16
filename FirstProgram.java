class Sample{
    public static void main(String args[]){
        System.out.println("Hello World!! This is Java code. - Sample");

        int numbers[] = {0,1,-10,32,44,11,55,-7,99};
        int maxRange = 50;
        System.out.println("Maximum Value under " + maxRange + " = " + getMaxValue(numbers,maxRange));
    }

    public static int getMaxValue(int[] numbers, int maxRange){
        int maxValue = numbers[0];
        for(int i=1; i<numbers.length;i++){
            if(numbers[i] > maxValue && numbers[i] <= maxRange){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    } 
}