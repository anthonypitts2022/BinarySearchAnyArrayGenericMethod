public class GenericBinarySearch implements BinarySearchInterface{
    
    public GenericMethods(){} //empty constructor
    
    public <AnyType extends Comparable<AnyType>> int binarySearch(AnyType[] a, AnyType x){
        GenericMethods b = new GenericMethods();
        int indexFinal = b.binarySearch(a, x, 0, a.length-1);//calls helper method
        return indexFinal;//index of target element, if exists
    }
    
    //private helper method to assist the public binary search function
    private <AnyType extends Comparable<AnyType>> int binarySearch(AnyType[] arr, AnyType x, int start, int end){
            if((arr[(end+start)/2].compareTo(x))==0 || (end-start)==0){//if target or last possible element
                if((arr[(end+start)/2].compareTo(x))==0){
                    return ((start+end)/2);
                }
                if(((arr[(end+start)/2].compareTo(x))!=0) && (end-start)==0){//if target does not exist
                    return -1;
                }
            }
            if((arr[(end+start)/2].compareTo(x))>0){
                end = ((end+start)/2)-1;
            }
            if((arr[(end+start)/2].compareTo(x))<0){
                start = ((end+start)/2)+1;
            }
            return binarySearch(arr, x, start, end);
    }
    

    
}
