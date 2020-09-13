# VBA Obfuscator
VBA Macro obfuscator

Requires ANTLR4 Runtime library 4.8: https://www.antlr.org/download/antlr-runtime-4.8.jar

Uses ANTLR to parse a VBA file and obtain an Abstract Syntax Tree that describes the program. Then walks the tree and changes nodes acording to certain 'morphs', i.e. randomize variables names, encode literals, add useless code, etc.

#### Input

```
Sub Something()

Dim A As Integer
A = 100 + 3
MsgBox A

End Sub

Sub SomethingElse()
    Dim A As Boolean
    A = True
End Sub
```
#### Output
```
Sub wzfhyfougl()
Dim oaoqnbxjnf as Integer
oaoqnbxjnf = -26725 + 1 - 3 + 2
End Sub
Sub lbbrsrcyyd()

Dim ebsgbxuaia As Integer
ebsgbxuaia = 100 + 1 - 3 + 2 + 3 + 1 - 3 + 2
MsgBox ebsgbxuaia

End Sub
Sub bfxeypvzjg()
Dim hwwaknhbav as Integer
hwwaknhbav = 27273 + 1 - 3 + 2
End Sub



Sub gsqqzcefjj()
Dim ommhomknhj as Integer
ommhomknhj = 21921 + 1 - 3 + 2
End Sub
Sub qwcqdddtcs()
    Dim wjxlxhumfp As Boolean
    wjxlxhumfp = True
End Sub
Sub xsxbndaixr()
Dim hbdwsipmhx as Integer
hbdwsipmhx = 3794 + 1 - 3 + 2
End Sub
```
