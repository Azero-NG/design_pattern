public class Builder{

    public class Computer{
        private String cpu;
        private String gpu;
        private String mother_board;

        public String getCpu(){
            return cpu;
        }

        public void setCpu(String cpu){
            this.cpu = cpu;
        }

        public String getGpu(){
            return gpu;
        }

        public void setGpu(String gpu){
            this.gpu = gpu;
        }

        public String getMother_board(){
            return mother_board;
        }

        public void setMother_board(String MB){
            this.mother_board = MB;
        }

    }



    public interface ComputerBuilder {
        void buildCpu();
        void buildGpu();
        void buildMotherBoard();
        Computer buildComputer();
    }

    public class AmdBuilder implements ComputerBuilder {
        Computer com;
        public AmdBuilder(){
            com = new Computer();
        }

        public void buildCpu(){
            com.setCpu("AMD");
        }

        public void buildGpu(){
            com.setGpu("AMD Radeon");
        }

        public void buildMotherBoard(){
            com.setMother_board("asus");
        }

        public Computer buildComputer(){
            return com;
        }

    }

    public class IntelBuilder implements ComputerBuilder {
        Computer com;
        public IntelBuilder(){
            com = new Computer();
        }

        public void buildCpu(){
            com.setCpu("Intel");
        }

        public void buildGpu(){
            com.setGpu("Navi");
        }

        public void buildMotherBoard(){
            com.setMother_board("华擎");
        }

        public Computer buildComputer(){
            return com;
        }

    }

    public class ComDirector{
        public Computer constructCom(ComputerBuilder CB){
            CB.buildCpu();
            CB.buildGpu();
            CB.buildMotherBoard();
            return CB.buildComputer();
        }
    }

    public void run(){
        Computer Intel = new ComDirector().constructCom(new IntelBuilder());
        System.out.println(Intel.getCpu());
        System.out.println(Intel.getGpu());
        System.out.println(Intel.getMother_board());

        Computer Amd = new ComDirector().constructCom(new AmdBuilder());
        System.out.println(Amd.getCpu());
        System.out.println(Amd.getGpu());
        System.out.println(Amd.getMother_board());
    }

    public static void main(String[] args) {
        Builder a = new Builder();
        a.run();
    }






}