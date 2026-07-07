class Computer {
    private String cpu;
    private int ram;

    private Computer(Builder builder) {
        cpu = builder.cpu;
        ram = builder.ram;
    }

    static class Builder {
        private String cpu;
        private int ram;

        Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        Builder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        Computer build() {
            return new Computer(this);
        }
    }

    void show() {
        System.out.println(cpu + " " + ram);
    }
}

public class BuilderTest {
    public static void main(String[] args) {
        Computer c = new Computer.Builder()
                .setCPU("i7")
                .setRAM(16)
                .build();

        c.show();
    }
}