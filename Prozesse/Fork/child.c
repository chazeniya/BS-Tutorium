#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

int main(int argc, char** argv) {
    printf("Hello I'm the Child process!\n");
    printf("My Parent says: %s\n", argv[0]);

    int timeToSleep = 10; // sleep 10 seconds
    while (timeToSleep) {
        timeToSleep = sleep(timeToSleep);
    }

    printf("Bye bye from the child process...\n");
    return 0;
}