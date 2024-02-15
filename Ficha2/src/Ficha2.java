
public class Ficha2 {

	// Exercício 1
	public int minArray(int[] arr) {
		int min = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if (arr[i] < min) min = arr[i];
		}
		return min;
	}
	
	// Exercício 2
	public int[] middleArray(int i1, int i2) {
		int[] indices = new int[Math.abs(i1-i2) + 1];
		int min = Math.min(i1, i2);
		indices[0] = min;
		
		for(int i=1 ; i<indices.length; i++) {
			indices[i] = indices[i-1]+1;
		}
		
		return indices;
	}
	
	// Exercício 3
    public boolean check(int[] arr, int toCheckValue) {
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
        return test;
    }
	
	public int[] commonArray(int[] arr1, int[] arr2) {
		int[] common = new int[Math.min(arr1.length, arr2.length)];
		int commonIndex = 0;
		int count = 0;
		
		if (arr1.length > arr2.length) {
			for(int i=0; i<arr1.length; i++) {
				if(check(arr2, arr1[i]) == true) {
					common[commonIndex] = arr1[i];
					commonIndex++;
					count++;
				}
			}
		}
		
		else {
			for(int i=0; i<arr2.length; i++) {
				if(check(arr1, arr2[i]) == true) {
					common[commonIndex] = arr2[i];
					commonIndex++;
					count++;
				}
			}
		}
		
		int[] finalCommonArray = new int[count];
		for(int i=0; i<count; i++) {
			finalCommonArray[i] = common[i];
		}
		
		return finalCommonArray;
	}
	
}
