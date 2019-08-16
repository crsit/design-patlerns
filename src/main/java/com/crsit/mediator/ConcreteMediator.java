package com.crsit.mediator;

import java.util.HashMap;

/**
 * @ClassName: ConcreteMediator
 * @Description: TODO
 * @Author: yangwuhui crsit@126.com
 * @Date: 2019-07-15 18:30
 * @Version: 1.0.0
 **/
public class ConcreteMediator extends Mediator {
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;
    public ConcreteMediator(){
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }
    @Override
    public void register(String name, Colleague colleague) {
        colleagueMap.put(name, colleague);
        if(colleague instanceof Alarm){
            interMap.put("Alarm", name);
        }else if(colleague instanceof CoffeeMachine){
            interMap.put("CoffeeMachine", name);
        }else if(colleague instanceof TV){
            interMap.put("TV", name);
        }else if(colleague instanceof Curtains){
            interMap.put("Curtains", name);
        }
    }

    @Override
    public void getMessage(int stateChange, String name) {
        if(colleagueMap.get(name) instanceof  Alarm){
            if(stateChange == 0 ) {
                ((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).startTV();
            }else if(stateChange == 1){
                ((TV) (colleagueMap.get(interMap.get("TV")))).stopTV();
            }
        }else if(colleagueMap.get(name) instanceof  CoffeeMachine){
                ((Curtains) (colleagueMap.get(interMap.get("Curtains")))).upCurtains();
        }else if(colleagueMap.get(name) instanceof  TV){

        }else if(colleagueMap.get(name) instanceof  Curtains){

        }
    }

    @Override
    public void sendMessage() {

    }
}
