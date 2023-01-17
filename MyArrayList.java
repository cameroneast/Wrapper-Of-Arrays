class MyArrayList {
  int size = 0;
  int[] items;

  public MyArrayList(int size) {
    this.size = size;
    items = new int[size];
  }

  public void setItem(int index, int newItem){
    items[index] = newItem;
  }

  public int getItem(int index){
    return items[index];
  }

  public int size() {
    return size;
  }

  public void addItem(int newItem){
    size++;
    int[] a = new int[size];
    for(int i = 0; i<size-1; i++){
      a[i] = items[i];
    }
    a[size-1] = newItem;
  }

  public void removeItem(int index){
    size--;
    int[] b = new int[size];
    for(int i = 0; i<index; i++){
      b[i] = items[i];
    }
    for(int i = index; i<size-1; i++){
      b[i] = items[i+1];
    }
  }

  public void expandAndCopyArray(int newsize) {
    //Declare new array to temporarily store the exisiting values and expand.
    int[] newArr = new int[newsize];
    
    for (int i = 0; i < size; i++) {
      newArr[i] = items[i];
    }
    
    size = newsize;
    //Initialize items as a new array with new size.
    items = new int[size];
    //Copy values from temporary array to the items array.
    for(int i = 0; i < size; i++) {
      items[i] = newArr[i];
    }
    
  }
}