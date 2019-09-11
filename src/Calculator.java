

class Calculator {

    double addition(double nombre1, double nombre2) {
        return (nombre1) + (nombre2);
    }

    double soustraction(double nombre1, double nombre2) {
        return (nombre1) - (nombre2);
    }

    double multiplication(double nombre1, double nombre2) {
        return (nombre1) * (nombre2);
    }

    Double division(double nombre1, double nombre2) {
        if(nombre2!=0.0)
          return (nombre1) / (nombre2);
        else
          return null;
    }

    Double result(String operation, double nombre1, double nombre2) {

        switch (operation) {

            case "+": {
               return   this.addition(nombre1, nombre2);
            }
            case "-": {
               return this.soustraction(nombre1, nombre2);
            }
            case "*": {
              return   this.multiplication(nombre1, nombre2);
            }
            case "/": {
               return this.division(nombre1, nombre2);
            }
            default: {
                return null;
            }
        }
    }
}
