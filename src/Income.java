public class Income {

    int sallary;
    int other;

    public void Income(int inSallary, int inOther) {
        this.sallary = inSallary;
        this.other = inOther;
    }

    public int getSallary(){ return sallary;}
    public void setSallary(int sallary) { this.sallary = sallary; }

    public int getOther() { return other; }
    public void setOther(int other) { this.other = other; }
    
}
