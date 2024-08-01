package com.example.javalibrary;

public class MoveAllZeroToEnd {
    public static void main (String[] args) {
//        int arr1[] = {2, 0, 0, 12, 0, 25};
//		for(int i = 0; i < arr1.length; i++){
//		    if(arr1[i] == 0){
//		        for(int j = i+1; j < arr1.length; j++){
//		            if(arr1[j] != 0){
//		                int temp = arr1[i];
//		                arr1[i] = arr1[j];
//		                arr1[j] = temp;
//		            }
//		        }
//		    }
//		}
//        for (int i = 0; i < arr1.length; i++){
//            System.out.println(arr1[i]+ " ");
//        }
//        int count = 0;
//        for(int i = 0; i < arr1.length; i++){
//            if(arr1[i] != 0){
//                arr1[count] = arr1[i];
//                count++;
//            }
//        }
//        for (int i = count; i < arr1.length; i++) {
//            arr1[i] = 0;
//        }
//        for(int i = 0; i < arr1.length; i++){
//            System.out.println(arr1[i]);
//        }


		int[] arr1 = {2, 0, 0, 12, 0, 25};
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] == 0){
				for (int j = i +1; j < arr1.length; j++){
					if(arr1[j] != 0){
						int temp = arr1[i];
						arr1[i] = arr1[j];
						arr1[j] = temp;
					}
				}

			}
		}
		for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]+ " ");
        }

    }

}