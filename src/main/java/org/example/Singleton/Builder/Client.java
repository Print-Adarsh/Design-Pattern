    package org.example.Singleton.Builder;

    public class Client {
        public static void main(String[] args) {
           // Builder builder = new Builder();
//            Builder builder = Student.getBuilder();
//            builder.setName("Adarsh Raj");
//            builder.setAge(24);
//            builder.setBatch("May25");
//            builder.setGradeYear(2023);;



            //Student student = new Student(builder);

           // Student student = builder.build();


            Student student=Student.getBuilder()
                    .setName("Adarsh")
                    .setAge(24)
                    .setBatch("may24")
                    .setGradeYear(2024)
                    .build();


//            System.out.println(student);
           System.out.println("Testing output");


        }
    }
