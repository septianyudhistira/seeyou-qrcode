package seeyou.qrcodegen;

public class DataTooLongException extends IllegalArgumentException {
   public DataTooLongException() {
   }

   public DataTooLongException(String msg) {
      super(msg);
   }
}
