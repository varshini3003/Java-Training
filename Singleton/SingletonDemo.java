package Singleton;

class SingletonDemo {
    public static void main(String[] args) {
       Database database;
       database= Database.getInstance();      
       database.getConnection();
    }
 }
