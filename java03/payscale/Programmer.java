package payscale;

public class Programmer extends Employee {
    public Programmer() {
        super();
        computeProgrammerPay();
    }

    public void computeProgrammerPay() {
        System.out.print("Enter Basic pay of Programmer [enter -1 for Default [BP = 30000]]: ");
        this.basic_pay = input.nextInt();
        if (this.basic_pay == -1) {
            this.basic_pay = 30000;
            System.out.println("Default Pay Taken");
        }
        computeCurrentBasicPay("Programmer");
    }
}
