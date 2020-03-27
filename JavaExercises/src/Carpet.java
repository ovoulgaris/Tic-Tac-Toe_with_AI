public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if(cost < 0){
            this.cost = 0;
        }
        else this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}


//
//        2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
//
//        The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
//
//        In case the cost parameter is less than 0 it needs to set the cost field value to 0.
//
//        Write the following methods (instance methods):
//
//        * Method named getCost without any parameters, it needs to return the value of cost field
//
//
//        3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
//
//        The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
//
//        Write the following methods (instance methods):
//
//        * Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.