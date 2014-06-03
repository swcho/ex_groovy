package ch1

/**
 * Created by sungwoo on 14. 6. 3.
 */

class Thing {
    String name;
    int count;

    void setName(String name) {
        this.name = name;
    }
}

Thing th = new Thing();
th.setName('This is name');
th.setCount(1);

System.out.println('Using generated method: ' + th.getName() + ' ' + th.getCount());