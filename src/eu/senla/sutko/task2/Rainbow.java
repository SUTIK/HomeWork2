package eu.senla.sutko.task2;

 class Rainbow {

    int colorNumber;
    String color;

    public void selectColor(int colorNumber){
        switch (colorNumber){
            case 1:
                System.out.println("RED");
                break;
            case 2:
                System.out.println("ORANGE");
                break;
            case 3:
                System.out.println("YELLOW");
                break;
            case 4:
                System.out.println("GREEN");
                break;
            case 5:
                System.out.println("SKY");
                break;
            case 6:
                System.out.println("BLUE");
                break;
            case 7:
                System.out.println("FIOLET");
                break;
            default:
                System.out.println("Введите цифру от 1 до 7");


        }
    }

}
