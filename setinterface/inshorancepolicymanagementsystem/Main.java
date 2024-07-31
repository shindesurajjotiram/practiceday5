package setinterface.inshorancepolicymanagementsystem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PolicyManager policyManager = new PolicyManager();

        Policy policy1 = new Policy("123","suraj shine", LocalDate.of(2017, 1, 13),"helth",200000);
        Policy policy2 = new Policy("123","suraj",LocalDate.of(2019, 1, 13),"helth",200000);

        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);


    }
}

