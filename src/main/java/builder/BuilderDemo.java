package builder;

public class BuilderDemo {
    public static void main(String[] args) {

//        LunchOrderBean lunchOrderBean = new LunchOrderBean();
//        lunchOrderBean.setBread("Wheat");
//        lunchOrderBean.setCondiments("lettuce");
//        lunchOrderBean.setDressing("Mustard");
//        lunchOrderBean.setMeat("Ham");
//
//        System.out.println(lunchOrderBean.getBread());
//        System.out.println(lunchOrderBean.getCondiments());
//        System.out.println(lunchOrderBean.getDressing());
//        System.out.println(lunchOrderBean.getMeat());

        LunchOrderBuilder.Builder builder = new LunchOrderBuilder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo")
                .meat("Turkey");

        LunchOrderBuilder lunchOrderBuilder = builder.build();

        System.out.println(lunchOrderBuilder.getBread());
        System.out.println(lunchOrderBuilder.getCondiments());
        System.out.println(lunchOrderBuilder.getDressing());
        System.out.println(lunchOrderBuilder.getMeat());

    }
}
