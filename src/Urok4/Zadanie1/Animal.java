package Urok4.Zadanie1;

public class Animal {
//    public String name;
//    static int run;
//    public int jump;
//    public int swim;
    public int distRun;
    public int distJump;
    public int distSwim;

//    public Animal() {
//    }

//    public Animal(String name, int run, int jump, int swim, int distRun, int distJump, int distSwim) {
            public Animal(int distRun, int distJump, int distSwim) {
//        this.name = name;
//        this.jump = jump;
//        this.run = run;
//        this.swim = swim;
        this.distRun=distRun;
        this.distJump=distJump;
        this.distSwim=distSwim;

    }
    public void DistRun(int r) {
        distRun -= r;
    }
    public void DistJump(int j){
        distSwim -= j;
    }
    public void DistSwim(int s) {
        distJump -= s;
    }

    public void Info() {
//        System.out.println("Кот имя: " + name + " run: " + run + " jump: " + jump + " swim: " + swim);
        System.out.println(distRun + " " + distJump + " " + distSwim);
    }
}
