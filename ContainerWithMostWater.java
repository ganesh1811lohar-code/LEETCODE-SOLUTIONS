public class ContainerWithMostWater {
        public int mostWater(int[] height) {
                int maxWater = 0;
                for(int i=0;i<height.length;i++) {
                        for(int j=i+1;j<height.length;j++) {
                                int Height = Math.min(height[i],height[j]);
                                int width = j-i;
                                int currWater = Height*width;
                                maxWater = Math.max(maxWater,currWater);
                                
                        }
                }
                return maxWater;
        }
        public static void main(String[] args) {
                int[] height = {1,8,6,2,5,4,8,3,7};

                ContainerWithMostWater s1 = new ContainerWithMostWater();
                System.out.println(s1.mostWater(height)+" ");
        }
}