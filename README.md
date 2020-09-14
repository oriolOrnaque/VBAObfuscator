# VBA Obfuscator
VBA Macro obfuscator

Requires ANTLR4 Runtime library 4.8: https://www.antlr.org/download/antlr-runtime-4.8.jar

Uses ANTLR to parse a VBA file and obtain an Abstract Syntax Tree that describes the program. Then walks the tree and changes nodes acording to certain 'morphs', i.e. randomize variables names, encode literals, add useless code, etc.

#### Input

```
Sub Something()

Dim A As Integer
A = 100
MsgBox A

End Sub

Sub MoreSomethingElses()
Dim B As String
B = "Hello world"
MsgBox B
End Sub

Sub SomethingElse()
    Dim A As Boolean
    A = True
End Sub
```
#### Output
```

Sub mghagjjjtp()
Dim aribfoemkb as Integer
aribfoemkb = 0 + 9668 + 5823 + 401 + 1057 + 171 + 761 + 1021 + 57 + 30 + 1 + 0 + 7
MsgBox aribfoemkb
End Sub
Public Function yttijgpbbw(ByVal jjfvobhduf As String) As String
Dim nijsgknbth   As String
Dim irffjoxaoi As String
Dim txwwcoqfuf         As Long
    For txwwcoqfuf = 1 To Len(jjfvobhduf) Step 2
        nijsgknbth = Chr$(Val("&H" & Mid$(jjfvobhduf, txwwcoqfuf, 2)))
        irffjoxaoi = irffjoxaoi & nijsgknbth
    Next txwwcoqfuf
    yttijgpbbw = irffjoxaoi
End Function

Sub dokkmstphj()

Dim bqlifvcpjc As Integer
bqlifvcpjc = 0 + 51 + 17 + 1 + 28 + 0 + 2 + 0 + 1
MsgBox bqlifvcpjc

End Sub
Sub mytiopoloc()
Dim wtqkztvhxw as Integer
wtqkztvhxw = 0 + 14127 + 181 + 470 + 861 + 672 + 138 + 107 + 30 + 6 + 8 + 10
MsgBox wtqkztvhxw
End Sub



Sub bmnonjulqj()
Dim mqajwneyxz as Integer
mqajwneyxz = 0 + 300 + 141 + 84 + 70 + 16 + 11 + 5 + 0 + 1
MsgBox mqajwneyxz
End Sub
Sub hyfiuraell()
Dim sxzwqtuukc As String
sxzwqtuukc = yttijgpbbw("2248656c6c6f20776f726c6422")
MsgBox sxzwqtuukc
End Sub
Sub inffnjkgho()
Dim rzqunejswf as Integer
rzqunejswf = 0 + 6975 + 10614 + 1775 + 213 + 29 + 135 + 116 + 6 + 0 + 3 + 0 + 1
MsgBox rzqunejswf
End Sub



Sub itauwuhsgd()
Dim zpvlnofjet as Integer
zpvlnofjet = 0 - 6027 - 9475 - 409 - 66 - 1285 - 168 - 20 - 18 - 1 - 1
MsgBox zpvlnofjet
End Sub
Sub zrchsnwhyp()
    Dim zfwmcxappd As Boolean
    zfwmcxappd = True And False Or False Or True Xor (True Xor Not False Xor Not True) And False Xor Not True
End Sub
Sub behaghensy()
Dim bvtvqwdjix as Integer
bvtvqwdjix = 0 - 13116 - 319 - 130 - 23 - 1 - 0 - 2 - 2
MsgBox bvtvqwdjix
End Sub

```
