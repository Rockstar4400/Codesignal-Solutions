Module Module1

    Function adjacentElementsProduct(inputArray As List(Of Integer)) As Integer
        If (2 <= inputArray.Count + 1 <= 10) Then
            Dim largestProduct As Integer = inputArray.Item(0) * inputArray.Item(0 + 1)

            For i As Integer = 0 To inputArray.Count - 2 Step 1
                If (-1000 <= inputArray.Item(i) <= 1000) Then
                    If (inputArray.Item(i) * inputArray.Item(i + 1) > largestProduct) Then
                        largestProduct = inputArray.Item(i) * inputArray.Item(i + 1)
                    End If
                End If
            Next
            Return largestProduct
        End If
        Console.ReadLine()
    End Function
    Sub Main()
        Console.WriteLine(adjacentElementsProduct({3, 6, -2, -5, 7, 3}.ToList()))
        Console.ReadLine()
    End Sub

End Module
