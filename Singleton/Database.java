package Singleton;

class Database {
    private static Database dbObject;
    private Database() 
    {      
        
    }   
    /** 
     * @return Database Creates a new database object and returns it else returns the existing database object 
     */
    public static Database getInstance() 
    {
       if(dbObject == null) 
       {
          dbObject = new Database();
       }
        return dbObject;
    }
    public void getConnection() 
    {
        System.out.println("Connected to the database...");
    }
 }
 

 