package projeto.educacao.exception;


import projeto.educacao.utils.MessageUtils;

public class NotFoundException extends RuntimeException{
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
