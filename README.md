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
