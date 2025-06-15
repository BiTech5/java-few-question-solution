// Simple Contact Management Create a class Contact with fields: name, phoneNumber, emailAddress. Create 3 Contact objects. Print the contact details only if the emailAddress is not empty (use if condition).

class Contact{
	String name;
	String phonenbr;
	String emailaddress;
	public Contact(String name,String phonenbr,String emailaddress){
		this.name=name;
		this.phonenbr=phonenbr;
		this.emailaddress=emailaddress;
	}
	public void contactDetails(){
		if(emailaddress!=null && !emailaddress.trim().isEmpty()){
			System.out.println("Name: "+name+"\nPhone nbr: "+phonenbr+"\nE-mail: "+emailaddress);
		}else{
			System.out.println("Fill the email adress toooo...");
		}
	}
}
class Eight{
	public static void main(String[] args){
		Contact person1=new Contact("Bikram","9999999","  ");
		person1.contactDetails();
	}
}
