package com.ydg.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ydg.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author: yan
 * @Date: 2019/3/8/0008 15:13
 * @Description:
 */
@Service
public class UserService  {

    @Reference
    TicketService ticketService;


    public void hello(){
        String  so = ticketService.getTicket();
        System.out.println(so);
    }
}
