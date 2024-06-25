package concurrency;

public class ThreadDemo {
    public static void show() {
        // We can create a thread using a lambda expression
        var thread1 = new Thread(() -> System.out.println("a"));

        // or using an instance of a class that implements the Runnable interface
        var status = new DownloadStatus();
        var thread2 = new Thread(new DownloadFileTask(status));

        // Next we start a thread
        thread1.start();

        // We can wait for the completion of a thread
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // We can put a thread to sleep
        try {
            thread1.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // We can get the current thread
        var current = Thread.currentThread();
        System.out.println(current.getId());
        System.out.println(current.getName());
    }
}

// Most computers these days have multicore processors, which can execute many tasks in parallel.
// with "Multithreading" we can write code that can leverage these multicore processors.
// This makes our application faster and more responsive.

// A "process" is an instance of a program or an application.
    // When you launch an application like your code editor or music player,
    // you're operating system loads that application inside a process.
// So a "process" can contain an image of applications code.
// It has some memory and a bunch of other resources.

// Now Your operating system can execute many "processes" at the same time (Concurrency).
    // For example, it can run an antivirus while playing music.
    // So that's concurrency at the process level, but we can also
    // have concurrency within the process or within the application using threads.

// Practically speaking, a "Thread" is actually that thing that executes your code.
    // Each process has at least one thread called the main thread,
    // but we can create additional threads to run many tasks concurrently.
    // For example, we can build a web server that can serve many clients at
    // the same time, will serve each client using a separate thread.
    // Or we can build an application that downloads multiple images concurrently.
    // we do this by starting multiple threads and have each thread download a separate image,
    // this is what we call "Multi-Threading".

