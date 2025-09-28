package org.example.task2;

public class Order {

    private long id;
    private String customer;

    public Order(final long id, final String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(final Cart cart) {

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(this.id)
                .append(" for customer ").append(this.customer)
                .append("\n------------------\n");

        double sum = 0.0;

        for (int i = 0; i < cart.getIndex(); i++) {

            Item item = cart.getContents()[i];
            sum += item.getPrice();

            builder.append("Item id: ").append(item.id);
            builder.append(" name: ");
            builder.append(item.name);
            builder.append(" price: ");
            builder.append(item.price);
            builder.append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ");
        builder.append(sum);


        return builder.toString();
    }
}
