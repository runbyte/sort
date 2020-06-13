```
quickSort(int leftIndex , int rightIndex , int[] array){
	int left = leftIndex;
	int right = rightIndex;
	int pivodIndex = array[(leftIndex + rightIndex) / 2];
	int temp;

	while(left < right){
		while(array[left] < pivodIndex) left++;
		while(array[right] > pivodIndex) right--;
		if(left >= right) break;

		temp = array[left];
		array[left] = array[right];
		array[right] = temp;

		if(array[left] == pivodIndex) --right;
		if(array[right] == pivodIndex) ++left;
	}
	if(left == right){
		left++;
		right--;
	}

	if(leftIndex < right) quickSort(leftIndex,right,array);
	if(rightIndex > left) quickSort(left, rightIndex , array);
}

```
public static void bubbleSort(int[] array){
	for(int i = 0 ; i < array.length ; i++){
		for(int j = 0 ; j < array.length - 1 - i;j++){
			if(array[j] > array[j+1]){
				int temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}
		}
	}
}

```
public static void selectSort(int[] array){
	for(int i = 0 ; i < array.length - 1; i++){
		for(int j = i+ 1; j < array.length ; j++){
			if(array[i] > array[j]){
				int temp = array[i];
				array[i] =  array[j];
				array[j] = temp;
			}
		}
	}
}

```
public static void insertSort(int[] array){
	for(int i = 1; i < array.length;i++){
		int insertValue = array[i];
		index = i - 1;
		while(index >= 0 && insertValue < array[index]){
			array[index + 1] = array[index];
			index--;
		}
		array[index + 1] = insertValue;
	}
}
