package ch1

/**
 * Created by sungwoo on 14. 6. 3.
 */

List<String> things = new ArrayList<String>();
things.add('Hello');
things.add('Groovy');
things.add('World');

List<String> things2 = ['Hello', 'Groovy', 'World'];

Set things3 = ['Hello', 'Groovy', 'World'];
def things4 = ['Hello', 'Groovy', 'World'] as Set;

def colors = [
    red: 1,
    green: 2,
    blue: 3
];

System.out.println(things);
System.out.println(things2);
System.out.println(colors);
