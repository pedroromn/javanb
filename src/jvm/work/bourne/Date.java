public class Date{

    int month;
    int day;
    int year;

    public Date(int day, int month, int year){
        if(day > 0 && day <= 31){
            this.day = day;
        }

        if(month >= 1 && month <= 12){
            this.month = month;
        }

        if(year > 0){
            this.year = year;
        }
    }

    
    
}
