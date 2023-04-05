import java.util.ArrayList;

public class Library {



    private String name;
    private String staff;
    private String stockList;

    public Library(String name, String staff, String stockList) {
        this.staff = staff;
        this.name = name;
        this.stockList = stockList;
    }





    public String getLibraryName() {
        return this.name;
    }

    public String getStaff() {
        return this.staff;
    }



}


