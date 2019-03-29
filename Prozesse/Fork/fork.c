#include <sys/types.h>
#include <sys/wait.h>
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
    pid_t pid, waitRes;
    int status;

    if ((pid = fork()) < 0) {       /* Error */
        printf("Error occurred");
        return EXIT_FAILURE;

    } else if (pid == 0) {          /* Child process */
        execl("./child", "Greetings child", (char *) NULL);

    } else {                        /* Parent process */
        do {
            if ((waitRes = wait(&status)) < 0) {
                exit(EXIT_FAILURE);
            }

            printf("Waiting for my child...\n");

        } while (waitRes != pid);
    }

    printf("Parent process says good bye");
    return EXIT_SUCCESS;
}