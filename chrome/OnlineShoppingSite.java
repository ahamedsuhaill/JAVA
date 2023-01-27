package chrome;
public class OnlineShoppingSite {
public void myAccount() 
      { System.out.println("Account     Name");
}
public void catalog() 
      { System.out.println("My cat");
}
public void orders() 
      { System.out.println("My Orders");
}
public void myWishList() 
      { System.out.println("MY Wish List");
}
public void payment()
      {System.out.println("payment");
}
public void gpay()
      {System.out.println("gpay");
}

public static void main(String[] args) { OnlineShoppingSite info = new 
OnlineShoppingSite(); info.catalog();
info.myAccount(); info.orders(); 
info.myWishList();
info.payment();
info.gpay();
}
}