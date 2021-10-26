public class SimCards{

public boolean isDualSimPortAvailable;
public int totalNoOfPorts;

public void setIsDualSimPortAvailable(boolean isDualSimPortAvailable){
this.isDualSimPortAvailable=isDualSimPortAvailable;
}
public void setTotalNoOfPorts(int totalNoOfPorts){
this.totalNoOfPorts=totalNoOfPorts;
}

@Override
public String toString(){
return "details are -- {isDualSimPortAvailable="+this.isDualSimPortAvailable+" , totalNoOfPorts="+this.totalNoOfPorts+"}";
}
}





