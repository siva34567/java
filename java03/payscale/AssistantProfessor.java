package payscale;

public class AssistantProfessor extends Employee {
    public AssistantProfessor() {
        super();
        computeAssistantProfessorPay();
    }

    public void computeAssistantProfessorPay() {
        System.out.print("Enter Basic pay of Assistant Professor [enter -1 for Default [BP = 25000]]: ");
        this.basic_pay = input.nextInt();
        if (this.basic_pay == -1) {
            this.basic_pay = 25000;
            System.out.println("Default Pay Taken");
        }
        computeCurrentBasicPay("Assistant Professor");
    }
}
