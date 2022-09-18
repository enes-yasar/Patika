public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    public void addQuizNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.quizNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.quizNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.quizNote = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.8) + (this.fizik.quizNote * 0.2)) + 
        		((this.kimya.note * 0.7) + (this.kimya.quizNote * 0.3)) + 
        		((this.mat.note * 0.6) + (this.mat.quizNote * 0.4))) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Quz: " + this.mat.quizNote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Quz: " + this.fizik.quizNote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Quz: " + this.kimya.quizNote);
    }

}