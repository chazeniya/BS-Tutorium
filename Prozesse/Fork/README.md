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

![fork Zustandsdiagramm](https://github.com/Treborium/BS-Tutorium/res/images/fork.svg)