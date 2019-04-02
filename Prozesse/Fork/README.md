# Fork

`fork` erstellt einen neuen Prozess aus einem bestehenden heraus. Der Rückgabewert ist 0 beim erzeugten Kindprozess. Der Elternprozess erhält als Rückgabewert die Prozess-ID vom neuen Kindprozess, bzw -1 bei einem Fehler.

## Beispiel

```c
int pid = fork();

if (pid == 0) {     /* Child Process */
    // pid = 0
    execl("./another_program");
} else {            /* Parent Process */
    // pid = 42
    do_something();
}
```

`fork` erzeugt einen neuen Prozess und gibt je nachdem in welchem von den beiden Prozessen er sich befindet einen bestimmten Rückgabewert liefert.

<p align="center">
  <img src="https://github.com/Treborium/BS-Tutorium/blob/master/res/images/fork.svg" alt="fork flow chart"/>
</p>

## Selber ausprobieren

Beide Dateien müssen zuerst kompiliert werden:

`gcc fork.c -Wall -Og -o fork.o`

`gcc child.c -Wall -Og -o child.o`

Anschließend kann das Beispiel ausgeführt werden: `./fork.o`.

**Beachte**: `child.c` erwartet ein String als Argument und wird bei falscher eingabe eine Fehlermeldung produzieren!
