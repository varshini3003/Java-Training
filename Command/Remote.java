package Command;

public class Remote{
    private Command command;
    
    /** 
     * @param command A command object 
     */
    public void setCommand(Command command){
      this.command = command;
    }
    public void pressButton(){
      command.execute();
    }
  }