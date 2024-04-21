import os

print("Started");

if os.fork() == 0:
    # child process
    print("Child Process pid : ", os.getpid(), " ppid : ", os.getppid())
else :
    # parent process
    print("Parent Process pid : ", os.getpid(), " ppid : ", os.getppid())

print("END")