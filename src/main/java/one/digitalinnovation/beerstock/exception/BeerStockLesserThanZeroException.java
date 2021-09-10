package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockLesserThanZeroException extends Exception{

    public BeerStockLesserThanZeroException(Long id){
        super(String.format("Beers with %s ID to decrement informed would be lesser than zero", id));
    }
}
