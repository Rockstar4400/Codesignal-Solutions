Module Module1

    Function centuryFromYear(Year As Integer) As Integer
        Return (Year + 99) \ 100
    End Function

    Sub Main()
        Console.WriteLine(centuryFromYear(1700))
        Console.ReadLine()
    End Sub

End Module
