package codingnomads.co.myfirstspringproject;

import org.springframework.stereotype.Service;

@Service
public class PositionService {

    public String processPosition(boolean buy){
        if (buy){
            return "myfirstspringproject/buy";
        } else {
            return "myfirstspringproject/sell";
        }
    }

    public String success(){
        return "myfirstspringproject/success";
    }
}
