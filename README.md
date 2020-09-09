# VBA Obfuscator
VBA Macro obfuscator

Requires ANTLR4 Runtime library 4.8

Uses ANTLR to parse a VBA file and obtain an Abstract Syntax Tree that describes the program. Then walks the tree and changes nodes acording to certain 'morphs', i.e. randomize variables names, encode literals, add useless code, etc.

```
Sub Subroutine()

Dim A As Integer
A = 100
MsgBox A

End Sub

Sub AnotherSubroutine()
    Dim A As Boolean
    A = True
End Sub
```
```
Sub tnzlivdvmc()

Dim ehomxmngkd As Integer
ehomxmngkd = 100
MsgBox ehomxmngkd

End Sub

Sub rkdbfihdgk()
    Dim tcykwmdwjj As Boolean
    tcykwmdwjj = True
End Sub
```
