=pod

CODEFIGHTS - INTERVIEW PRACTICE - REPETITIONENCRYPTION

Source help:
http://perldoc.perl.org/perlop.html#Regexp-Quote-Like-Operators

Jane just got a letter from her friend and realized that something's wrong: some words in the letter are 
written twice in a row. The thing is, she and her friend devised an ingenious cypher, the key to which is 
the number of pairs of repeated words in the encoded text. The cases of the words don't matter.

Formally, a word is a substring of letter consisting of English letters, such that characters to the left of 
the leftmost letter and to the right of the rightmost letter are not letters.

For obvious reasons, Jane can't tell you how the encryption works, but she needs your help with calculating 
the number of pairs of consecutive equal words. Write a function that, given a letter, returns this number.

Example

For letter = "Hi, hi Jane! I'm so. So glad to to finally be able to write - WRITE!! - to you!",
the output should be
repetitionEncryption(letter) = 4.

There are 4 pairs of consecutive identical words in the text. They are shown in different colors below:
"Hi, hi Jane! I'm so. So glad to to finally be able to write - WRITE!! - to you!"

Input/Output

[execution time limit] 4 seconds (perl)

[input] string letter

The letter Jane's friend wrote to her. It is guaranteed that there are no more than two consecutive equal words in a row.
It is also guaranteed that between two such pairs there are at least two symbols.

[output] integer

The number of pairs of consecutive equal words in the letter.

[Perl] Syntax Tips

# Prints help message to the console
# Returns a string
sub helloWorld {
	my ($name) = @_;
    print("This prints to the console when you Run Tests");
    return "Hello, " . $name;
}

=cut

sub repetitionEncryption {
  my ($letter) = @_;

  
  my $pattern = qr/([a-z]+)[^a-z]+\1\b/xi; #full_n22 RIGHT
  #my $pattern = '\b([\w]+)[^\/ae0-9]+\1\b'; #rockstar4400 WRONG
  my @matches = $letter =~ /$pattern/gi;
  my $res = @matches;
  return $res;
}

print &repetitionEncryption("Hi, hi Jane! I'm so. So glad to to finally be able to write - WRITE!! - to you!");
#4
print "\n";
print &repetitionEncryption("Yo-yo, how's s it going going for ya? Ya is okay, okay'nt ya?");
#5
print "\n";
print &repetitionEncryption("Hi Jane, how are you doing today?");
#0
print "\n";
print &repetitionEncryption("My friend, friend of mine, I am really-really happy for you! You are amazing, please write me back when you can.");
#3
print "\n";
print &repetitionEncryption("Everything is fine, fine perfectly here. Here I have fun (fun all the day!) days. Although I miss you, so please please, Jane, write, write me whenever you can! Can you do that? That is the only (!!ONLY!!) thing I ask from you, you sunshine.");
#9
print "\n";
print &repetitionEncryption("Do not notify me about this in the future");
#0
print "\n";
print &repetitionEncryption("ho-ho--he-he");
#2
print "\n";
print &repetitionEncryption("WeLl wElL");
#1
print "\n";
print &repetitionEncryption("justjustmmmsomesomeeeeetexttext");
#0
print "\n";
print &repetitionEncryption("compot potter potter");
#1
print "\n";
print &repetitionEncryption("here you can can  see see  a random random... test test teeeest case case");
#5
print "\n";
print &repetitionEncryption("badenbaden badenbaden");
#1
print "\n";
print &repetitionEncryption("OooOooO ooooooo");
#1
print "\n";
print &repetitionEncryption("this this is another another  not not  so so   tricky test test ");
#5
print "\n";
print &repetitionEncryption("let's s?,play%3with,1symbols88,/symbols");
#2
print "\n";
print &repetitionEncryption("hello hello from the the otter siiide siiide");
#3
print "\n";