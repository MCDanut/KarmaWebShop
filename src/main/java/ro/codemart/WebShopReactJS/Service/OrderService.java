package ro.codemart.WebShopReactJS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.codemart.WebShopReactJS.Entities.OrderKarma;
import ro.codemart.WebShopReactJS.Entities.OrderItem;
import ro.codemart.WebShopReactJS.Repo.OrderItemRepo;
import ro.codemart.WebShopReactJS.Repo.OrderRepo;

import java.util.List;

@Service
public class OrderService {

    private OrderRepo orderRepo;
    private OrderItemRepo orderItemRepo;

    @Autowired

    public OrderService(OrderRepo orderRepo, OrderItemRepo orderItemRepo) {
        this.orderRepo = orderRepo;
        this.orderItemRepo = orderItemRepo;
    }

    public List<OrderKarma> getAll(){
        return (List<OrderKarma>) orderRepo.findAll();
    }

    public List<OrderKarma> getByUserID(Integer id){
       return orderRepo.findAllByUserKarmaId(id);
    }

    public void saveOrder(OrderKarma orderKarma){
        for(OrderItem oi: orderKarma.getOrderItemSet()){
            orderItemRepo.save(oi);
        }
        orderRepo.save(orderKarma);
    }

    public void deleteOrderById(Integer id){
        OrderKarma orderKarma = orderRepo.findById(id).orElse(null);
        for(OrderItem oi: orderKarma.getOrderItemSet()){
            orderItemRepo.delete(oi);
        }
        orderRepo.delete(orderKarma);
    }
}
