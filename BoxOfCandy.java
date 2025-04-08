public class BoxOfCandy{
    private Candy[][]box;
public BoxOfCandy(Candy[][]b){
    box  = b;
}
public boolean moveCandyToFirstRow(int col){
if(box[0][col]!=null) return true;
for(int i = 1; i<box.length; i++){
    if(box[i][col]!= null){ //If it’s not null, we’ve found a piece of candy and can move it to the first row, that is, row 0.
    box[0][col] = box[i][col];        
    box[i][col] = null;
    return true;    
    }
}
return false;
}
public String toString(){
    String s = "";
    for(int row = 0; row<box.length; row++){
        for (int col = 0; col < box[0].length; col++){
            s+=box[row][col]+" ";
        }
        s+="\n";
    }
    return s;
}
}
/* public Candy removeNextByFlavor(String flavor)
{ / to be implemented in part (b) / }

// There may be instance variables, constructors, and methods that are not shown.
}
}*/

