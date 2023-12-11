public class EmailMsgListener implements EventListener{

    @Override
    public void update(Event eventType) {
        if(eventType.equals(Event.NEW_ITEM)){
            System.out.println("New item has been added to our offer \n check it out now !!");
        } else if(eventType.equals(Event.SALE)){
            System.out.println("We have a sale for some products, get a look now !!");
        } else if (eventType.equals(Event.BACK_IN_STOCK)) {
            System.out.println("The product you're interested is now in stock order it now !!");
        }
    }
}
