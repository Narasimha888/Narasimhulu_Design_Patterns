package Creational_Design_Patterns;

public class Builder_Pattern {

	  //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
 
	    private Builder_Pattern(UserBuilder builder) {
	        this.firstName = builder.firstName;
	        this.lastName = builder.lastName;
	        this.age = builder.age;
	        this.phone = builder.phone;
	        this.address = builder.address;
	    }
	 
	    //All getter, and NO setter to provde immutability
	    public String getFirstName() {
	        return firstName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public int getAge() {
	        return age;
	    }
	    public String getPhone() {
	        return phone;
	    }
	    public String getAddress() {
	        return address;
	    }
	 
	    @Override
	    public String toString() {
	        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
	    }
	 
	    public static class UserBuilder 
	    {
	        private final String firstName;
	        private final String lastName;
	        private int age;
	        private String phone;
	        private String address;
	 
	        public UserBuilder(String firstName, String lastName) {
	            this.firstName = firstName;
	            this.lastName = lastName;
	        }
	        public UserBuilder age(int age) {
	            this.age = age;
	            return this;
	        }
	        public UserBuilder phone(String phone) {
	            this.phone = phone;
	            return this;
	        }
	        public UserBuilder address(String address) {
	            this.address = address;
	            return this;
	        }
	        //Return the finally consrcuted User object
	        public Builder_Pattern build() {
	            Builder_Pattern user =  new Builder_Pattern(this);
	            validateBuilder_PatternObject(user);
	            return user;
	        }
	       private void validateBuilder_PatternObject(Builder_Pattern user) {
	            //Do some basic validations to check 
	            //if user object does not break any assumption of system
	        }
	    }
	
	    public static void main(String[] args) {
	        Builder_Pattern user1 = new Builder_Pattern.UserBuilder("Rahul", "Vijay")
	        .age(20)
	        .phone("9868567689")
	        .address("address 17-987")
	        .build();
	     
	        System.out.println(user1);
	     
	        Builder_Pattern user2 = new Builder_Pattern.UserBuilder("Kiran", "Rampalli")
	        .age(30)
	        .phone("7898678756")
	        //no address
	        .build();
	     
	        System.out.println(user2);
	     
	        Builder_Pattern user3 = new Builder_Pattern.UserBuilder("Sreenu", "Reddy")
	        .age(45)
	        //No phone
	        //no address
	        .build();
	     
	        System.out.println(user3);
	    }
}