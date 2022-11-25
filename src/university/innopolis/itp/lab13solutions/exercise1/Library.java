package university.innopolis.itp.lab13solutions.exercise1;


import university.innopolis.itp.lab13solutions.exercise1.media.Media;

public class Library<T extends Media> {

    T obj;

    public Library(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
