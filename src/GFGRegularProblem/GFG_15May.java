package GFGRegularProblem;

import java.util.*;

import static GFGRegularProblem.EmailAccountMerge.accountsMerge;

/* Account Merge
* Given a list of accounts of size n where each element accounts [ i ] is a list of strings, where the first element account [ i ][ 0 ]  is a name, and the rest of the elements are emails representing emails of the account.
Geek wants you to merge these accounts. Two accounts belong to the same person if there is some common email to both accounts. Note that even if two accounts have the same name, they may belong to different people as people could have the same name. A person can have any number of accounts initially, but all of their accounts have the same name.
After merging the accounts, return the accounts in the following format: The first element of each account is the name, and the rest of the elements are emails in sorted order.
Note: Accounts themselves can be returned in any order.
Example 1:
Input:
n = 4
accounts [ ] =
[["John","johnsmith@mail.com","john_newyork@mail.com"],
["John","johnsmith@mail.com","john00@mail.com"],
["Mary","mary@mail.com"],
["John","johnnybravo@mail.com"]]
Output:
[["John","john00@mail.com","john_newyork@mail.com", "johnsmith@mail.com"],
["Mary","mary@mail.com"],
["John","johnnybravo@mail.com"]]
Explanation:
The first and second John's are the same person as they have the common email "johnsmith@mail.com". The third John and Mary are different people as none of their email addresses are used by other accounts.We could return these arrays in any order, for example, the answer [['Mary', 'mary@mail.com'], ['John', 'johnnybravo@mail.com'], ['John', 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com']] would still be accepted.
Example 2:
Input:
n = 5
accounts [ ] =
[["Gabe","Gabe00@m.co","Gabe3@m.co","Gabe1@m.co"],
["Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co"],
["Ethan","Ethan5@m.co","Ethan4@m.co","Ethan0@m.co"],
["Hanzo","Hanzo3@m.co","Hanzo1@m.co","Hanzo0@m.co"],
["Fern","Fern5@m.co","Fern1@m.co","Fern0@m.co"]]
Output:
[["Ethan","Ethan0@m.co","Ethan4@m.co","Ethan5@m.co"],
["Gabe","Gabe0@m.co","Gabe1@m.co","Gabe3@m.co"],
["Hanzo","Hanzo0@m.co","Hanzo1@m.co","Hanzo3@m.co"],
["Kevin","Kevin0@m.co","Kevin3@m.co","Kevin5@m.co"],
["Fern","Fern0@m.co","Fern1@m.co","Fern5@m.co"]]
Explanation:
We don't have any common emails in any of the users. We just sorted the emails of each person and we return a array of emails.(The details can be returned in any order).
Your Task:
You don't need to read or print anything. Your task is to complete the function accountsMerge() which takes a list of lists of strings representing accounts[][] as a parameter and returns a list of lists of strings denoting the details after merging.

Expected Time Complexity: O(n*m*logn) - where n is the size of accounts and m is the size of the number of strings for a name.
Expected Auxiliary Space: O(n*m) - where n is the size of accounts and m is the size of the number of strings for a name.
Constraints:
1 <= n <= 1000
2 <= accounts[ i ].size <= 10
1 <= accounts[ i ][ j ].size <= 30
accounts[i][0] consists of English letters.
* */
class EmailAccountMerge {
    static List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, String> parent = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();
        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                parent.putIfAbsent(account.get(i), account.get(i));
                emailToName.put(account.get(i), name);
            }
        }

        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            for (int i = 2; i < account.size(); i++) {
                union(firstEmail, account.get(i), parent);
            }
        }

        Map<String, List<String>> unions = new HashMap<>();
        for (String email : parent.keySet()) {
            String rootEmail = find(email, parent);
            unions.computeIfAbsent(rootEmail, k -> new ArrayList<>()).add(email);
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> group : unions.values()) {
            Collections.sort(group);
            String name = emailToName.get(group.get(0));
            List<String> mergedAccount = new ArrayList<>();
            mergedAccount.add(name);
            mergedAccount.addAll(group);
            result.add(mergedAccount);
        }

        return result;
    }

    private static String find(String email, Map<String, String> parent) {
        if (!email.equals(parent.get(email))) {
            parent.put(email, find(parent.get(email), parent));
        }
        return parent.get(email);
    }

    private static void union(String email1, String email2, Map<String, String> parent) {
        String root1 = find(email1, parent);
        String root2 = find(email2, parent);
        if (!root1.equals(root2)) {
            parent.put(root1, root2);
        }
    }
}
public class GFG_15May {
    public static void main(String[] args) {
        //EmailAccountMerge solution = new EmailAccountMerge();

        // Example 1
        List<List<String>> accounts1 = Arrays.asList(
                Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"),
                Arrays.asList("Mary", "mary@mail.com"),
                Arrays.asList("John", "johnnybravo@mail.com")
        );
        List<List<String>> result1 = accountsMerge(accounts1);
        printResult(result1);

        // Example 2
        List<List<String>> accounts2 = Arrays.asList(
                Arrays.asList("Gabe", "Gabe00@m.co", "Gabe3@m.co", "Gabe1@m.co"),
                Arrays.asList("Kevin", "Kevin3@m.co", "Kevin5@m.co", "Kevin0@m.co"),
                Arrays.asList("Ethan", "Ethan5@m.co", "Ethan4@m.co", "Ethan0@m.co"),
                Arrays.asList("Hanzo", "Hanzo3@m.co", "Hanzo1@m.co", "Hanzo0@m.co"),
                Arrays.asList("Fern", "Fern5@m.co", "Fern1@m.co", "Fern0@m.co")
        );
        List<List<String>> result2 = accountsMerge(accounts2);
        printResult(result2);
    }

    private static void printResult(List<List<String>> accounts) {
        for (List<String> account : accounts) {
            System.out.println(account);
        }
    }
}
