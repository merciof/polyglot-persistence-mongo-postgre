package polyglot.persistence

class User {
    
    String first_name
    String last_name
    String username
    String password
    String email
    String saldo
    Date dataNascimento
    
    static mapping = {
        table 'usuarios'
        version false
    }

    static constraints = {
    }
}
