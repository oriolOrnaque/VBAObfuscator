# VBAObfuscator
VBA Macro obfuscator

Requires ANTLR4 Runtime library 4.8

Uses ANTLR to parse a VBA file and obtain an Abstract Syntax Tree that describes the program. Then walks the tree and changes nodes acording to certain 'morphs', i.e. randomize variables names, encode literals, add useless code, etc.
