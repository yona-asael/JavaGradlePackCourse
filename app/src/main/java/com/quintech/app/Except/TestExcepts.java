package com.quintech.app.Except;

public class TestExcepts {

    public static void run() throws InterruptedException {
        try {
            // String nullString = null;
            // nullString.endsWith("test");

            // Integer divideZero = 0;
            // divideZero =  5 / divideZero;

            // Integer index = 1;
            // Integer[] items = new Integer[1];
            // items[index] = 2;

            System.out.println( (new MessageResponse("TstEcepts", "SOmething about this class", "test").toString()) );
        } catch(NullPointerException e){
            System.out.println( (new MessageException(e.getClass().getName(), e.getMessage())).toString() );
        } catch(ArithmeticException e) {
            System.out.println( (new MessageException(e.getClass().getName(), e.getMessage())).toString() );
        } catch(NumberFormatException e) {
            System.out.println( (new MessageException(e.getClass().getName(), e.getMessage())).toString() );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( (new MessageException(e.getClass().getName(), e.getMessage())).toString() );
        } catch (RuntimeException e) {
            System.out.println( (new MessageException(e.getClass().getName(), e.getMessage())).toString() );
        } catch (Exception e) {
            System.out.println( (new MessageException(e.getClass().getName(), e.getMessage())).toString() );
        } finally {
            System.out.println("Exception cacheada");
        }
    }

}
