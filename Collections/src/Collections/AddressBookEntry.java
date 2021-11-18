package Collections;

public class AddressBookEntry implements Comparable<AddressBookEntry> {
   private String name, address, phone;
 //  private int ID;
 
  //  public AddressBookEntry(int i) {
  //    this.ID = i;
  // }
   public AddressBookEntry(String name) {
      this.name = name;
   }
 
   @Override
   public String toString() {
      return name;
   }
 
   @Override
   public int compareTo(AddressBookEntry another) {
      return this.name.compareToIgnoreCase(another.name);
   //   if (this.ID > another.ID)
   //       return 1;
  //    else if (this.ID < another.ID)
   //       return -1;
   //   else
   //       return 0;
   }
 
   @Override
   public boolean equals(Object o) {
      if (!(o instanceof AddressBookEntry)) {
         return false;
      }
      return this.name.equalsIgnoreCase(((AddressBookEntry)o).name);
   }
 
   @Override
   public int hashCode() {
      return name.length();
   }
}