
var array = [[true,false,true],[false, true, false]];
var a_length = array.length;
var a_lenColumn = array[0].length;


for (var i = 0 ; i < a_length; i++){
    for (var j = 0 ; j < a_lenColumn ; j++){

        if (array[i][j]){
            console.log("f");
        }else
            console.log("t");
    }
}
