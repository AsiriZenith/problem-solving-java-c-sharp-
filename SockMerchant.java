import java.util.*;

class SockMerchant {

    public int solution(int n, List<Integer> ar) {
        int frequency, value;
        List<Integer> frequencylist = new ArrayList<>();
        Set<Integer> set = new HashSet<>(ar);
        List<Integer> setlist = new ArrayList<>(set);

        for(int j=0; j<setlist.size(); j++) {
            frequency = 0;
            for(int i=0; i<ar.size(); i++) {
                if(setlist.get(j) == ar.get(i)){
                    frequency = frequency + 1;
                }
            }
            frequencylist.add(frequency);
        }

        for(int i=0; i<frequencylist.size(); i++) {
            value = frequencylist.get(i) / 2;
            frequencylist.set(i,value);
        }

        value = 0;
        for(int i=0; i<frequencylist.size(); i++) {
            value = value + frequencylist.get(i);
        }
        return value;
    }

    public static void main(String[] args) {
        SockMerchant sockMerchant = new SockMerchant();

        int arr[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
        }

        System.out.println(sockMerchant.solution(arr.length,list));
    }
}