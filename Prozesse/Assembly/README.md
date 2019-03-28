# Assembly Erklärt <!-- omit in toc -->

- [Syntax](#syntax)
- [Register](#register)
- [Selber ausprobieren](#selber-ausprobieren)

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
 
 Eine Tabelle der möglichen `Mnemonics` kann unter [Common Opcodes](https://software.intel.com/en-us/articles/introduction-to-x64-assembly) gesehen werden. 

## Register

Register sind Speicherorte direkt auf der CPU, wodurch sie besonders schnell beschrieben / gelesen werden können (1 CPU-Zyklus, also ~0.25ns bei einer 4GHz CPU). In der Regel beschreibt die Größe, oder auch _Breite_, eines Registers die Architektur der CPU. Bei einer 64-Bit CPU sind die Register 64-Bit breit.

Es wird zwischen zwei Registerarten unterschieden: dem _General Purpose Register_ und dem _Special Purpose Register_. Wie die Namen schon sagen kann der _General Purpose Register_ für alle Operationen genutzt werden und seine Inhalte haben keine besondere Bedeutung für die CPU. Während das _Special Purpose Register_ für CPU-Operationen genutzt wird und die Inhalte, abhängig vom gewähltem Register, meist eine besondere Bedeutung haben. 

Im Beispiel oben ist `%eax`ein _General Purpose Register_, während `%rbp`und `%rsp` _Special Purpose Register_ sind. `%rbp` ist der Base-Pointer der auf die Basis des aktuellen Stackframes zeigt, und `%rsp` zeigt auf den Kopf des Stackframes. `%rbp` hat immer einen größeren Wert als `%rsp` da der Stack nach unten wächst (Siehe Folie 255 und folgende). 

## Selber ausprobieren

Um sein eigenes Programm zu disassemblen benötigt ihr einen Compiler und den einen Debugger, zum Beispiel [GBD](https://www.gnu.org/software/gdb/).

Nun muss das Programm mit Debug-Symbolen und keinerlei Optimierung kompiliert werden: `CFLAGS="-g -O0" make math`
Anschließend kann das Programm mit GDB debugged werden: `gdb math`

Eine detaillierterte Anleitung findet ihr in diesem [Blog Post](https://www.recurse.com/blog/7-understanding-c-by-learning-assembly).
