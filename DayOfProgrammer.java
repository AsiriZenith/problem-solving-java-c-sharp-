
class DayOfProgrammer {

    private final int programmerOfDay = 256;

    public boolean isLeapYear(int year,int i) {
        boolean result = false;
        switch (i) {
            case 1:
                result = (year%4 == 0) ? true : false;
                break;
            case 2:
                result = (year%100 == 0) ? ((year%400 == 0) ? true : false) : ((year%4 == 0) ? true : false);    
                break;
            default:
                System.out.println("Something went wrong!!");
        }
        return result;
    }

    public String genareteDate(Integer year, Integer i) {
        int numberOfDaysfirstEightMonth = isLeapYear(year,i) ? 244 : 243;
        Integer remainingDays = programmerOfDay - numberOfDaysfirstEightMonth;
        return remainingDays.toString() + ".9." + year.toString();
    } 

    public String genareteDatefor1918(Integer year) {
        int numberOfDaysfirstEightMonth = 243 - 13;
        Integer remainingDays = programmerOfDay - numberOfDaysfirstEightMonth;
        return remainingDays.toString() + ".9." + year.toString();
    }

    public String dayOfProgrammer(int year) {

        String result;
        
        if(year >= 1700 && year < 1918) {
            result = genareteDate(year,1);
        } else if(year == 1918) {
            result = genareteDatefor1918(year);
        } else if(year >= 1919 && year <= 2700) {
            result = genareteDate(year,2);
        } else {
            result = null;
        }
        return result;
    }

    public static void main(String[] args) {
        
        DayOfProgrammer obj = new DayOfProgrammer();
        String result = obj.dayOfProgrammer(1918);
        System.out.println(result);
    }
}