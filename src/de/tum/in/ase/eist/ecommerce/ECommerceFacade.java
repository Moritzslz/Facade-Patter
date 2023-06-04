package de.tum.in.ase.eist.ecommerce;

public class ECommerceFacade {

    private OrderController oc;
    private AdvertisementController ac;
    private ShippingController sc;
    public ECommerceFacade(){
        this.oc = new OrderController();
        this.ac = new AdvertisementController();
        this.sc = new ShippingController();
    }

    public void processOrder(Order order){
        oc.processOrder(order);
    }

    public void processOrder(Order order, String phoneNumber){
        oc.processOrder(order, phoneNumber);
    }

    public Order retrieveLatestOrder(int id){
        return oc.retrieveLatestOrder(id);
    }

    public void playAdvertisement(int ageRestriction){
        ac.playAdvertisement(ageRestriction);
    }

    public void shipOrder(Order order, String adress){
        order.setShipping(sc.createShipping(adress));
        sc.shipOrder(order);
    }

}
