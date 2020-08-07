package ro.codemart.WebShopReactJS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.codemart.WebShopReactJS.Entities.OrderKarma;
import ro.codemart.WebShopReactJS.Service.OrderService;

import javax.persistence.criteria.Order;
import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/getAll")
    public List<OrderKarma> getAllOrders(){
        return orderService.getAll();
    }

    @GetMapping("/getByUserId/{id}")
    public List<OrderKarma>  getOrderByUserId(@PathVariable("id") Integer id){
        return orderService.getByUserID(id);
    }

    @PostMapping("/saveOrder/{id}")
    public void saveOrder(@RequestBody OrderKarma orderKarma){
        orderService.saveOrder(orderKarma);
    }

    @DeleteMapping("/deleteOrder/{id}")
    public void deleteOrder(@PathVariable("id") Integer id){
        orderService.deleteOrderById(id);
    }
}
