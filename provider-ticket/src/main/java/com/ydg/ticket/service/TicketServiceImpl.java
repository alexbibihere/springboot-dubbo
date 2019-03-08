package com.ydg.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author: yan
 * @Date: 2019/3/8/0008 15:10
 * @Description:
 */
@Component
@Service
public class TicketServiceImpl  implements  TicketService{
    @Override
    public String getTicket() {
        return "买到票了";
    }
}
