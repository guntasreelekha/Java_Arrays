package arrays.concent;

public class HeadQuartersOfItSwitch {
    public static void main(String args[]) {
        String  india[]={"bangalore","chennai","pune",""};
        //boolean bangalore = true, chennai = true, hyderabad = true, pune = true, mumbai = true, california = true, newJersey = true;
        String mumbaiHeadQuartersOfIT[] = {"Blue_Star_InfoTech", "Atom_Technologies", "Tata_Consultancy_Services"};
        String puneHeadQuartersOfIT[] = {"Tech_Mahendra", "C-DAC", "KPIT_Technologies"};
        String hyderabadHeadQuartersOfIT[] = {"Microsoft", "Cyient", "Concent_Technologies"};
        String chennaiHeadQuartersOfIT[] = {"Prodapt_Solutions", "Ramco_Systems"};
        String bangaloreHeadQuartersOfIT[] = {"Infosys", "Wipro", "Mindtree", "Aditi_Technologies"};
        String californiaHeadQuartersOfIT[] = {"UST_Global", "Zoho_Corporation"};
        String newJerseyHeadQuartersOfIT[] = {"Cognizant", "Collabera", "IGATE"};
        String company = new String("infosys");
        switch ("india") {
            case "bangalore":
                switch ("bangaloreHeadQuartersOfIt") {
                    case "Infosys":
                        System.out.println("The company Infosys HeadQuarters is in Bangalore");
                        break;
                    case "Wipro":
                        System.out.println("The company Wipro HeadQuarters is in Bangalore");
                        break;
                    case "Mindtree":
                        System.out.println("The company Mindtree HeadQuarters is in Bangalore");
                        break;
                    case "Aditi_Technologies":
                        System.out.println("The company Aditi Technologies HeadQuarters is in Bangalore");
                        break;
                    default:
                        System.out.println("The company is not provided");
                        break;
                }
                break;
            case "chennai":
                switch ("chennaiHeadQuartersOfIt") {
                    case "Ramco_Systems":
                        System.out.println("The company Ramco Systems HeadQuarters is in chennai ");
                        break;
                    case "Prodapt_Solutions":
                        System.out.println("The company Prodapt Solutions HeadQuarters is in Chennai");
                        break;
                    default:
                        System.out.println(" The company name is not provied");
                        break;
                }
                break;
            case "hyderabad":
                switch ("hyderabadHeadQuartersOfIt") {
                    case ("Microsoft"):
                        System.out.println("The company Microsoft HeadQuarters is in Hyderabad");
                        break;
                    case ("Cyient"):
                        System.out.println("The company Cyient HeadQuarters is in Hyderabad");
                        break;
                    case ("Concent_Technologies"):
                        System.out.println("The company Concent Technologies HeadQuarters is in Hyderabad");
                        break;
                    default:
                        System.out.println(" The company name is not provied");
                        break;
                }
                break;
            case "pune":
                switch ("puneHeadQuartersOfIt") {
                    case ("Tech_Mahendra"):
                        System.out.println("The company Tech Mahendra HeadQuarters is in Pune");
                        break;
                    case ("C_DAC"):
                        System.out.println("The company C_DAC HeadQuarters is in Pune");
                        break;
                    case ("KPIT_Technologies"):
                        System.out.println("The company KPIT_Technologies HeadQuarters is in Pune");
                        break;
                    default:
                        System.out.println(" The company name is not provied");
                        break;
                }
                break;
            default:
                System.out.println(" The company name is not provied");
                break;
        }
    }
}