class EligibleToVote{
    public static void main(String[] args){
        int requiredAge = 18;
        int voterAge = 9;
        if(voterAge >= requiredAge){
            System.out.println("Voater is Eligible For Vote");
        } else {
            System.out.println("Voater is Not Eligible For Vote");
        }
    }
}