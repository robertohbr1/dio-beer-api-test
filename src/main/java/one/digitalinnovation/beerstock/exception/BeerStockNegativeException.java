package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockNegativeException extends Exception {

    public BeerStockNegativeException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed exceeds the qtd stock capacity: %s", id, quantityToDecrement));
    }

}
