abstract class LibraryItem{
	private String title;
	private String itemID;
	private boolean check;
	
	public LibraryItem(String title,String itemID){
		this.title=title;
		this.itemID=itemID;
		this.check=false;
	}
	
	public void checkOut(){
		if (!check){
			check= true;
            System.out.println(title + " has been checked out.");
        } 
		else {
            System.out.println(title + " is already checked out.");
		}
	}
	
	public void checkIn(){
		 if (check){
			 check = false;			 
            System.out.println(title + " has been checked in.");
        } else {
            System.out.println(title + " is already checked in.");
        }
    }
	
	
	public void displayItemDetails(){
		System.out.println("title : " + title );
		System.out.println("ItemID : " + itemID );
	}	
	
}







		


