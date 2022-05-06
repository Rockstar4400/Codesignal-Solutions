Module Module1
    Function checkPallindrome(inputString As String) As Boolean
        Dim n As Integer = inputString.Length()

        For i As Integer = 1 To n \ 2 Step 1
            If (GetChar(inputString, i + 1) <> GetChar(inputString, n - i)) Then ' MISUNDERSTANDING Why? n - i and not n - 1
                Return False
            End If
        Next
        Return True
    End Function
    Sub Main()
        Console.WriteLine(checkPallindrome("aabaa"))
        Console.ReadLine()
    End Sub

End Module
