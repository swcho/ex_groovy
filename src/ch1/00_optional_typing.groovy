package ch1

class Person {

    def test(arg1, arg2) {
        System.out.println("this is test " + arg1 + ' ' + arg2);
    }

    def propertyA;
}

def person = new Person();

String methodName = 'test';
def value = person."$methodName"(1,2);

String propertyName = 'propertyA';
person."$propertyName" = "property value";
System.out.println(person."$propertyName");
