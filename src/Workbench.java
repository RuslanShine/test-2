public class Workbench {
    private String name;
    private int oil;
    private boolean isOff;

    public Workbench(String name, int oil) {
        this.name = name;
        this.oil = oil;
    }
    public void start(){
        this.isOff=false;
    }
    public void delaemDetal (int liters){
        if (oil>=liters){
            oil-= liters;
            System.out.println(name +": ������ �������!" );
        } else if (oil<liters){
            System.out.println(name +": ����� ����������� !" );
            isOff =true;

        }
    }

    public void refuel(int refOil){
        oil+=refOil;
        System.out.println(name +": ����� � ������!");
        isOff= false;
    }





}


