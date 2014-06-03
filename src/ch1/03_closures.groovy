package ch1

/**
 * Created by sungwoo on 14. 6. 3.
 */


def hello = {
    println "hello"
}

hello.call();
hello();

def printTheParam = {
    println it;
}

printTheParam();
printTheParam 'hello';
printTheParam('hello');

def printTheParam2 = { whatToPrint ->
    println whatToPrint;
}

printTheParam2("this is what");

def add = { int x, int y ->
    return x + y;
}

println add(1,1);

def printCurrentDate = { ->
    println new Date();
}

printCurrentDate();

// *************************************

interface Clickable {
    void onClick();
}

int i=0;
Clickable c = new Clickable() {
    @Override
    void onClick() {
        System.out.println("i: " + i);
        i++;
    }
}

c.onClick();
c.onClick();

//final int[] i2 = {0};
//Clickable c2 = new Clickable() {
//    @Override
//    void onClick() {
//        System.out.println("i: " + i[0]);
//        i[0]++;
//    }
//};
//
//c2.onClick();
//c2.onClick();

int i3=0;
def c3 = { ->
    println "i: $i";
    i++;
} as Clickable;

c3.onClick();
c3.onClick();