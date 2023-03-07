package TEST.ZAD1;

class Dog {
    public String name;
    int run;
    public int jump;
    public int swim;

    public Dog(String name, int run,  int jump, int swim) {

//        super(name, run, jump, swim);
        this.name=name;
        this.run=run;
        this.jump=jump;
        this.swim=swim;
    }
    public void DistR(Animal r) {
        r.DistRun(run);
        System.out.println("Собака имя: " + name + " run: " + run);
    }
    public void DistJ(Animal j) {
        j.DistJump(jump);
        System.out.println("Собака имя: " + name + " jump: " + jump);
    }
    public void DistS(Animal s) {
        s.DistSwim(swim);
        System.out.println("Собака имя: " + name + " swim: " + swim);
    }

    public void catInfo() {
//        System.out.println("Кот имя: " + name + " run: " + run + " jump: " + jump + " swim: " + swim);

//        System.out.println(DR);
    }

}
