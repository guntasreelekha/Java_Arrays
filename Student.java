package arrays.concent;


public class Student {
    public static void main(String args[]) {
        /*
         * To print student is studying in which branch and Year*/
        String cse_First_Year[] = {"Satwik", "Kaveesh"};
        String cse_Second_Year[] = {"Sujitha", "Dismitha"};
        String cse_Third_Year[] = {"Rakesh", "Sreelekha"};
        String cse_Final_Year[] = {"Priya", "kavya"};
        String ece_First_year[] = {"Rekha", "Krishna"};
        String ece_Second_year[] = {"Sai", "Pravallika"};
        String ece_Third_Year[] = {"Radha", "Ayyappa"};
        String ece_Final_Year[] = {"Jashwanth", "RadhaKrishna"};
        String eee_First_year[] = {"Ram", "Rajesh"};
        String eee_Second_year[] = {"Lekha", "JeevanaPriya"};
        String eee_Third_Year[] = {"John", "Jack"};
        String eee_Final_Year[] = {"Damini", "David"};
        boolean firstYear = true, secondYear = true, thirdYear = true, finalYear = true;
        boolean cse = true, ece = true, eee = true;
        String student = "Sreelekha";
        if (cse) {
            if (firstYear) {
                if (student.equals("Satwik")) {
                    System.out.println("The student is studying Cse First Year " + student);
                } else if (student.equals("Kaveesh")) {
                    System.out.println("The student is studying Cse First year " + student);
                }/* else {
                    System.out.println("The student is not studying in Cse First year");
                }*/
            }
            if (secondYear) {
                if (student.equals("Sujitha")) {
                    System.out.println("The student is studying Cse second  year " + student);
                } else if (student.equals("Dismitha")) {
                    System.out.println("The student is studying Cse second  year " + student);
                } /*else {
                    System.out.println("The student is not studying in Cse Second year");
                }*/
            }
            if (thirdYear) {
                if (student.equals("Rakesh")) {
                    System.out.println("The student is studying Cse Third  year " + student);
                } else if (student.equals("Sreelekha")) {
                    System.out.println("The student is studying Cse Third  year " + student);
                } /*else {
                    System.out.println("The student is not studying in Cse Third year");
                }*/
            }
            if (finalYear) {
                if (student.equals("Priya")) {
                    System.out.println("The student is studying Cse Final  year " + student);
                } else if (student.equals("Kavya")) {
                    System.out.println("The student is studying Cse Final  year " + student);
                } /*else {
                    System.out.println("The student is not studying in Cse Final year");
                }*/
            }
        }
        if (ece) {
            if (firstYear) {
                if (student.equals("Rekha")) {
                    System.out.println("The student is studying Ece First Year " + student);
                } else if (student.equals("Krishna")) {
                    System.out.println("The student is studying Ece First year " + student);
                } /*else {
                    System.out.println("The student is not studying in Ece First year");
                }*/
            }
            if (secondYear) {
                if (student.equals("Sai")) {
                    System.out.println("The student is studying Ece second  year " + student);
                } else if (student.equals("Pravallika")) {
                    System.out.println("The student is studying Ece second  year " + student);
                } /*else {
                    System.out.println("The student is not studying in Ece Second year");
                }*/
            }
            if (thirdYear) {
                if (student.equals("Radha")) {
                    System.out.println("The student is studying Ece Third  year " + student);
                } else if (student.equals("Ayyappa")) {
                    System.out.println("The student is studying Ece Third  year " + student);
                } /*else {
                    System.out.println("The student is not studying in Ece Third year");
                }*/
            }
            if (finalYear) {
                if (student.equals("Jashwanth")) {
                    System.out.println("The student is studying Ece Final  year " + student);
                } else if (student.equals("RadhaKrishna")) {
                    System.out.println("The student is studying Ece Final  year " + student);
                } /*else {
                    System.out.println("The student is not studying in Ece Final year");
                }*/
            }
        }
        if (eee) {
            if (firstYear) {
                if (student.equals("Ram")) {
                    System.out.println("The student is studying Eee First Year " + student);
                } else if (student.equals("Rajesh")) {
                    System.out.println("The student is studying Eee First year " + student);
                } /*else {
                    System.out.println("The student is not studying in Eee First year");
                }*/
            }
            if (secondYear) {
                if (student.equals("Lekha")) {
                    System.out.println("The student is studying Eee second  year " + student);
                } else if (student.equals("JeevanaPriya")) {
                    System.out.println("The student is studying Eee second  year " + student);
                } /*else {
                    System.out.println("The student is not studying in Eee Second year");
                }*/
            }
            if (thirdYear) {
                if (student.equals("John")) {
                    System.out.println("The student is studying Eee Third  year " + student);
                } else if (student.equals("Jack")) {
                    System.out.println("The student is studying Eee Third  year " + student);
                } /*else {
                    System.out.println("The student is not studying in Eee Third year");
                }*/
            }
            if (finalYear) {
                if (student.equals("Damini")) {
                    System.out.println("The student is studying Eee Final  year " + student);
                } else if (student.equals("David")) {
                    System.out.println("The student is studying Eee Final  year " + student);
                } /*else {
                    System.out.println("The student is not studying in Eee Final year");
                }*/
            }
        }
    }
}


