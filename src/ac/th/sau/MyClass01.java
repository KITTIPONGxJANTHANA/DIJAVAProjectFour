package ac.th.sau;

public class MyClass01 {
    //Encapsulation ซ่อนข้อมูล (data member)
    private int dataA;
    private String dataB;
    //ให้ใช้งาน Data ผ่านเมธอด Getter/Setter
    public int getDataA() {
        return dataA;
    }
    public String getDataB(){
        return dataB;
    }
    public void setDataA(int dataA) {
            this.dataA = dataA;
    }
    public void setDataB (String dataB){
            this.dataB = dataB;
    }
}