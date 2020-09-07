package arrays.concent;

public class HeadQuartersOfItCompanies {
    public static void main(String args[]) {
        boolean india = true, nonIndia = true;
        boolean bangalore = true, chennai = true, hyderabad = true, pune = true, mumbai = true,california=true,newJersey=true;
        String mumbaiHeadQuartersOfIT[] = {"Blue_Star_InfoTech", "Atom_Technologies", "Tata_Consultancy_Services"};
        String puneHeadQuartersOfIT[] = {"Tech_Mahendra", "C-DAC", "KPIT_Technologies"};
        String hyderabadHeadQuartersOfIT[] = {"Microsoft", "Cyient","Concent_Technologies"};
        String chennaiHeadQuartersOfIT[] = {"Prodapt_Solutions", "Ramco_Systems"};
        String bangaloreHeadQuartersOfIT[] = {"Infosys", "Wipro", "Mindtree", "Aditi_Technologies"};
        String californiaHeadQuartersOfIT[]={"UST_Global","Zoho_Corporation"};
        String newJerseyHeadQuartersOfIT[]={"Cognizant","Collabera","IGATE"};
        String company = "Infosys";
        if (india) {
            if (bangalore) {
                if (company.equals("Infosys")) {
                    System.out.println("The company Infosys HeadQuarters is in Bangalore");
                }
                if (company.equals("Wipro")) {
                    System.out.println("The company Wipro HeadQuarters is in Bangalore");
                }
                if (company.equals("Mindtree")) {
                    System.out.println("The company Mindtree HeadQuarters is in Bangalore");
                }
                if (company.equals("Aditi_Technologies")) {
                    System.out.println("The company Aditi Technologies HeadQuarters is in Bangalore");
                }
            }
            if (chennai) {
                if (company.equals("Ramco_Systems")) {
                    System.out.println("The company Ramco Systems HeadQuarters is in Chennai");
                }
                if (company.equals("Prodapt_Solutions")) {
                    System.out.println("The company Prodapt Solutions HeadQuarters is in Chennai");
                }
            }
            if (hyderabad) {
                if (company.equals("Microsoft")) {
                    System.out.println("The company Microsoft HeadQuarters is in Hyderabad");
                }
                if (company.equals("Cyient")) {
                    System.out.println("The company Cyient HeadQuarters is in Hyderabad");
                }
                if (company.equals("Concent_Technologies")) {
                    System.out.println("The company Concent Technologies HeadQuarters is in Hyderabad");
                }
            }
            if (pune) {
                if (company.equals("Tech_Mahendra")) {
                    System.out.println("The company Tech Mahendra HeadQuarters is in Pune");
                }
                if (company.equals("C_DAC")) {
                    System.out.println("The company C_DAC HeadQuarters is in Pune");
                }
                if (company.equals("KPIT_Technologies")) {
                    System.out.println("The company KPIT_Technologies HeadQuarters is in Pune");
                }
            }
            if (mumbai){
                if (company.equals("Blue_Star_InfoTech")) {
                    System.out.println("The company Blue Star InfoTech  HeadQuarters is in Mumbai");
                }
                if (company.equals("Atom_Technologies")) {
                    System.out.println("The company Atom Technologies HeadQuarters is in Mumbai");
                }
                if (company.equals("Tata_Consultancy_Services")) {
                    System.out.println("The company Tata_Consultancy_Services HeadQuarters is in Mumbai");
                }
            }
        }
        if (nonIndia){
            if (california){
                if (company.equals("UST_Global")) {
                    System.out.println("The company UST Global  HeadQuarters is in California");
                }
                if (company.equals("Zoho_Corporation")) {
                    System.out.println("The company Zoho Corporation HeadQuarters is in California");
                }
            }
            if (newJersey){
                if (company.equals("Cognizant")) {
                    System.out.println("The company Cognizant  HeadQuarters is in New Jersey");
                }
                if (company.equals("Collabera")) {
                    System.out.println("The company Collabera HeadQuarters is in New Jersey");
                }
                if (company.equals("IGATE")) {
                    System.out.println("The company IGATE HeadQuarters is in New Jersey");
                }
            }
        }
    }
}
