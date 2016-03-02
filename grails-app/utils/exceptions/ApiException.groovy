package exceptions


class ApiException extends Exception {

   ApiException(String message, String code) {
      super(message)

   }
//   ApiException(String var1) {
//      super(var1)
//   }
}
