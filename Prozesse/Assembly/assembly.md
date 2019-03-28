# Assembly Erklärt <!-- omit in toc -->

- [Syntax](#syntax)
- [Register](#register)
- [selber ausprobieren](#selber-ausprobieren)

## Syntax

``` assembly
    0x0000555555555119 <+0>:    push   %rbp
    0x000055555555511a <+1>:    mov    %rsp,%rbp
    0x000055555555511d <+4>:    movl   $0x5,-0x8(%rbp)
    0x0000555555555124 <+11>:   mov    -0x8(%rbp),%eax
    0x0000555555555127 <+14>:   add    $0x6,%eax
    0x000055555555512a <+17>:   mov    %eax,-0x4(%rbp)
 => 0x000055555555512d <+20>:   mov    $0x0,%eax
    0x0000555555555132 <+25>:   pop    %rbp
    0x0000555555555133 <+26>:   retq
 ```

 Dieser Codeausschnitt folgt der AT&T syntax, welche auch vom _GNU Assembler_ genutzt wird.

 Nach einer Addresse die in Hex dargestellt wird folgt immer: `Mnemonic  quelle, ziel`.
 `Mnemonic` ist der menschen-lesbare Name des Befehls, während `quelle` und `ziel` Operanten (~Variablen) sind.

 Operanten können Konstanten, Register, Speicheraddressen oder Labels sein. Konstanten werden mit dem Präfix `$0x` gekennzeichnet während Register ein `%` nutzen.

## Register

Register sind Speicherorte direkt auf der CPU, wodurch sie besonders schnell beschrieben / gelesen werden können (1 CPU-Zyklus, also ~0.25ns bei einer 4GHz CPU). In der Regel beschreibt die Größe, oder auch _Breite_, eines Registers die Architektur der CPU.
Bei einer 64-Bit CPU sind die Register 64-Bit breit.

## selber ausprobieren
