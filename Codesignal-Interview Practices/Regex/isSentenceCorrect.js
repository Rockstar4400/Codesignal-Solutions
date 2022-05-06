
/*
 A sentence is considered correct if:

 It starts with a capital letter
 It ends with a full stop, question mark or exclamation point ( ' . ', ' ? ', ' ! ' )
 Full stops, question marks(?) and exclamation points don't appear anywhere else in the sentence.

 Given a sentence, return true if is correct and false otherwise.

 Example:

 For sentence = "This is an example of  *correct* sentence." , the output should be
 isSentenceCorrect(sentence) = true

 For sentence = "!this sentence is TOTALLY incorrecT" , the output should be
 isSentenceCorrect(sentence) = false.

 Guaranteed constraints:
 2<= sentence.lenght <= 100

*/

function isSentenceCorrect(sentence) {

    var re = /^[A-Z][^\!\?\.]*(\!{1}|\?|\.)$/g;

    return re.test(sentence)
}

console.log(isSentenceCorrect("This is an example of  *correct* sentence."));
console.log(isSentenceCorrect("!this sentence is TOTALLY incorrecT"));
