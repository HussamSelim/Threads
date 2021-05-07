public class Opers implements Runnable {
    String x="2 + 8";
    String out=" ";

    @Override
    public void run() {
        String[] parts = x.split(" ");
        if (parts.length != 3) {
            System.out.println("Wrong Input ");

        }
        else {
            Float operand1=Float.parseFloat(parts[0]);
            Float operand2=Float.parseFloat(parts[2]);
            switch (parts[1]) {
                case "+": out= out +(operand1+operand2);
                    break;
                case"-":out= out +(operand1-operand2);
                    break;
                case"*":out= out +(operand1*operand2);
                    break;
                default:
                    System.out.println("Unknown Operation");

            }
            
        } System.out.println(out);
    }
}
