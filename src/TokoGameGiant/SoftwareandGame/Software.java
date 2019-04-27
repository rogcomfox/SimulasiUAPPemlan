package TokoGameGiant.SoftwareandGame;

public class Software {
    private String code, name;

    Software(String code, String name){
        this.name = name;
        this.code = code;
    }

    String getName() {
        return name;
    }

    String getCode() {
        return code;
    }

    @Override
    public String toString(){
        return String.format("%-10s %-10s", code, name);
    }
}
