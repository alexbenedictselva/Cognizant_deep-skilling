package Module_1_Design_Patterns_and_Principles.Exe_3;

public class BuilderPatternExample {
    public String cpu;
    public String ram;
    public String storage;

    private BuilderPatternExample(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public void getDetails() {
        System.out.println(this.cpu);
        System.out.println(this.storage);
        System.out.println(this.ram);
    }
    
    public static class Builder {
        public String cpu;
        public String ram;
        public String storage;
        

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        
        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public BuilderPatternExample build() {
            return new BuilderPatternExample(cpu, ram, storage);
        }
    }
}
