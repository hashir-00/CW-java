import java.util.ArrayList;


public class Ticket {

    int row;
    int seat;
    float price;
    person person_new;




    Ticket( int row, int seat, float price, person person_new) {

        this.row = row;
        this.price = price;
        this.seat = seat;
        this.person_new = person_new;

    }


   void print() {
        System.out.println("\nname:" + person_new.name + "\n" + "surname:" + person_new.sur_name +
                "\n" + "email:" + person_new.email + "\n" + "row:" + row + "\n" + "seat:" + seat + "\n" + "price:" + price + "\n"
                );
git




    }




}


