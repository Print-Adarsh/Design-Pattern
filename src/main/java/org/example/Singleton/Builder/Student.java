package org.example.Singleton.Builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private int gradeYear;
    private String batch;

    public  static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder) {

//        if(builder.getGradeYear()>2024)
//        {
//            throw new RuntimeException("Grade Year out of 2024");
//        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.gradeYear = builder.getGradeYear();
        this.batch = builder.getBatch();

    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //------------------

    static class Builder {
        private String name;
        private int age;
        private double psp;
        private int gradeYear;
        private String batch;

        public Student build() {
            if(this.getGradeYear()>2024)
            {
                throw new RuntimeException("Grade Year out of 2024");
            }
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradeYear() {
            return gradeYear;
        }

        public Builder setGradeYear(int gradeYear) {
            this.gradeYear = gradeYear;
            return this.
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }
    }
}
