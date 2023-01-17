class MyArrayList {
  private int size = 0;
  private int[] items;

  public MyArrayList(int size) {
    this.size = size;
    this.items = new int[size];
  }

  public void setItem(int index, int newItem) {
    this.items[index] = newItem;
  }

  public int getItem(int index){
    if(index<0 || index > (this.items.length -1)){
      return -1;
    }
    else{
      return this.items[index];
    }
  }

  public int size() {
    return size;
  }

  public void addItem(int newItem){
    size++;
    int[] a = new int[size];
    for(int i = 0; i<size-1; i++){
      a[i] = this.items[i];
    }
    a[size-1] = newItem;
    this.items = new int[size];
    for(int i = 0; i<size; i++){
      this.items[i] = a[i];
    }
  }

  public int removeItem(int index){
    if(index > this.items.length || index<0){
      return -1;
    }
    else{
      size--;
      int[] b = new int[size];
      int element = items[index];
      for(int i = 0; i<index; i++){
        b[i] = this.items[i];
      }
      for(int i = index; i<size; i++){
        b[i] = this.items[i+1];
      }
      this.items = new int[size];
      for(int i = 0; i<size; i++){
        this.items[i] = b[i];
      }
      return element;
    }
  }

  public void expandAndCopyArray(int newsize) {
    //Declare new array to temporarily store the exisiting values and expand.
    int[] newArr = new int[newsize];
    
    //Populate temporary array with existing values.
    for (int i = 0; i < size; i++) {
      newArr[i] = this.items[i];
    }

    //Set the size to the user-defined size.
    size = newsize;
    
    //Initialize items as a new array with new size.
    this.items = new int[size];
    
    //Copy values from temporary array to the items array.
    for(int i = 0; i < size; i++) {
      this.items[i] = newArr[i];
    }
    
  }
}