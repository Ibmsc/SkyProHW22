//умеют колдовать с мощностью в сколько-то баллов
//могут трансгрессировать на какое-то расстояние
//
public class Hogwarts {


    public void campare(Student studentFirst, Student studentSecond) {
        int powerStudentOne = studentFirst.getPowerOfMagic() + studentFirst.getDistanceTransgression();
        int powerStudentSecond = studentSecond.getPowerOfMagic() + studentSecond.getDistanceTransgression();
        if (powerStudentOne > powerStudentSecond) {
            System.out.println(studentFirst.getName() + studentFirst.getSurname() + " обладает большей мощностью магии, чем " +
                    studentSecond.getName() + studentSecond.getSurname());
        } else if (powerStudentOne < powerStudentSecond){
            System.out.println(studentSecond.getName() + studentSecond.getSurname() + "обладает большей мощностью магии, чем"
                    + studentFirst.getName() + studentFirst.getSurname());
        }else {
            System.out.println("Победила дружба!");
        }
    }

}
