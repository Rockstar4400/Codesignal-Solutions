# A sentence is considered correct if:

# It starts with a capital letter
# It ends with a full stop, question mark or exclamation point ( ' . ', ' ? ', ' ! ' )   
# Full stops, question marks(?) and exclamation points don't appear anywhere else in the sentence.

# Given a sentence, return true if is correct and false otherwise.

# Example:

# For sentence = "This is an example of  *correct* sentence." , the output should be 
# isSentenceCorrect(sentence) = true

# For sentence = "!this sentence is TOTALLY incorrecT" , the output should be 
# isSentenceCorrect(sentence) = false.

# Guaranteed constraints: 
# 2<= sentence.lenght <= 100

sub isSentenceCorrect {
  my ($sentence) = @_;

  my $re = '^[A-Z][^\!\?\.]*[\\!{1}|\\?{1}|\\.]$';
  
  if ($sentence =~ m/$re/){
    return true;
    }else{
  return false;
}
}

print &isSentenceCorrect("This is an example of *correct* sentence."); # true
print "\n";
print &isSentenceCorrect("!this sentence is TOTALLY incorrecT"); # false
print "\n";
print &isSentenceCorrect("Almost correct sentence"); # false
print "\n";
print &isSentenceCorrect("Something is !wrong! here."); # false
print "\n";
print &isSentenceCorrect("Time to roll!!!"); # false
print "\n";
print &isSentenceCorrect("This one is okay though, isn't it?"); # true
print "\n";
print &isSentenceCorrect("this sentence, I'm afraid, is a bit incorrect."); # false
print "\n";
print &isSentenceCorrect("I'm glad this sentence is correct, my friends."); # true
print "\n";
print &isSentenceCorrect("CodeFights is lame!!!"); # false
print "\n";
print &isSentenceCorrect("No way, CodeFights is awesome!"); # true
print "\n";
print &isSentenceCorrect("Correct sentence."); # true
print "\n";
print &isSentenceCorrect("incorrect sentence aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa."); # false
print "\n";
print &isSentenceCorrect("Order a correct sentence for \$50000 today and get a discount :) ."); # true
print "\n";
print &isSentenceCorrect(" Look what pesky whitespaces can do!"); # false
print "\n";
print &isSentenceCorrect("Another tricky test case? "); # false
print "\n";
print &isSentenceCorrect("Let's finish with a correct sentence, shall we?"); # true
print "\n";
print &isSentenceCorrect("I!");# true
print "\n";
print &isSentenceCorrect("Can? Anyone? Explain? It?");# false
print "\n";
print &isSentenceCorrect("No. One. Can.");# false
print "\n";
print &isSentenceCorrect("You managed to solve it???");# false
print "\n";