public class ContainerWithMostWater2Pointer {
        public int maxWater(int[] height) {
                int maxWater = 0;
                int lp = 0;
                int rp = height.length-1;

                while(lp < rp) {
                      int ht = Math.min(height[lp],height[rp]);
                      int wt = rp - lp;
                      int currWater = ht * wt;
                      
                      if(lp<rp) {
                        lp++;
                      } else {
                        rp++;
                      }

                      maxWater = Math.max(currWater,maxWater);

                }
                return maxWater;
        }
        public static void main(String[] args) {
                int[] height = {1,8,6,2,5,4,8,3,7};

                ContainerWithMostWater2Pointer s1 = new ContainerWithMostWater2Pointer();
                System.out.println("Maximum water stored in container : "+s1.maxWater(height));

        }
}
