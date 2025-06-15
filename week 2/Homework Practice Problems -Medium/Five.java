// Movie Details Manager Create a Movie class with attributes: name, language, rating (out of 5). Create a method displayMovieDetails(). In main(), create 4 Movie objects and call displayMovieDetails().


class Movie{
	String name;
	String language;
	int rating;
	public Movie(String name,String language,int rating){
		this.name=name;
		this.language=language;
		this.rating=rating;
	}
	public void displayMovieDetails(){
		System.out.println(name+"\n"+language+"\n"+rating);
	}
}


public class Five{
	public static void main(String[] args){
		Movie mov1=new Movie("Bahubali","Hindi",3);
		Movie mov2=new Movie("Bahubali2","Telgu",5);
		Movie mov3=new Movie("Katapa","Telgu",3);
		mov1.displayMovieDetails();
		mov2.displayMovieDetails();
		mov3.displayMovieDetails();
	}
}
