package inshorancepolicymanagementsystem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PolicyManager {
    private Set<Policy> uniquePolicies;
    private Set<Policy> policiesExpiringSoon;
    private Set<Policy> policiesByCoverage;
    private Set<Policy> duplicatePolicies;

    public PolicyManager() {
        uniquePolicies = new HashSet<>();
        policiesExpiringSoon = new TreeSet<>();
        policiesByCoverage = new HashSet<>();
        duplicatePolicies = new HashSet<>();
    }

    public void addPolicy(Policy policy) {
        uniquePolicies.add(policy);
        policiesExpiringSoon.add(policy);
        policiesByCoverage.add(policy);
        if (!duplicatePolicies.add(policy)) {
            System.out.println("Duplicate policy found: " + policy.getPolicyNumber());
        }
    }

    public Set<Policy> getAllUniquePolicies() {
        return uniquePolicies;
    }

    public Set<Policy> getPoliciesExpiringSoon() {
        return policiesExpiringSoon;
    }

    public Set<Policy> getPoliciesByCoverage(String coverageType) {
        return policiesByCoverage;
    }

    public Set<Policy> findDuplicatePolicies() {
        return duplicatePolicies;
    }

}
