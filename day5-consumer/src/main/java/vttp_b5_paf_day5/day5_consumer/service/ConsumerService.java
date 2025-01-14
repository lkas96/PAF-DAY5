package vttp_b5_paf_day5.day5_consumer.service;

import org.springframework.stereotype.Service;

import vttp_b5_paf_day5.day5_consumer.model.Todo;

@Service
public class ConsumerService {

    public void handleMessage(Todo todo){
        //whatever received 
        //can carry out other processes
        //call another services
        //write to database
        //whatever you want to process the data
        
        //class example we just printing out atm
        System.out.println(todo.toString());
    }
}
