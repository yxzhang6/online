package com.mmall.controller.portal;

import com.mmall.common.TokenCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhang on 2019/4/17.
 */
public class test {
    private static Logger log = LoggerFactory.getLogger(TokenCache.class);

    public void Execute(List<String> list, String type){

        LinkedList<String> linkedList=(LinkedList)list;
        try{
//            if(type.equals("0")){
//                linkedList.addFirst("U0");
//            }else if(type.equals("1")){
//                linkedList.addFirst("U1");
//            }else if(type.equals("2")){
//                linkedList.addFirst("U2");
//            }else if(type.equals("3")){
//                linkedList.addFirst("U3");
//            }else if(type.equals("4")){
//                linkedList.addFirst("U4");
//            }else if(type.equals("5")){
//                linkedList.addFirst("U5");
//            }
            //第一种：
            switch(Integer.parseInt(type)){
                case 0:
                     linkedList.addFirst("U1");
                break;
                case 1:
                     linkedList.addFirst("U2");
                break;
                case 2:
                     linkedList.addFirst("U3");
                break;
                case 3:
                     linkedList.addFirst("U4");
                break;
                case 4:
                     linkedList.addFirst("U5");
                break;
            }

            //第二种
            String[]  arrStr ={"1","2","3","4","5"};
            if(Arrays.asList(arrStr).contains(type)){
                linkedList.addFirst("U"+type);
            }
        }catch (Exception e){
            log.info("异常{}",e.getMessage());
        }

        List arryList=  new ArrayList<>(Arrays.asList("U5","U6","U7"));
        arryList.add("U8");

    }





















    public static void main(String[] args) {



    }
}
