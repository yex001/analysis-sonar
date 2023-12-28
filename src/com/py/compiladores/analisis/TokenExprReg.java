package com.py.compiladores.analisis;



public enum TokenExprReg {
    /**
     * Par�ntesis derecho, ")".
     */
    PAREN_DERECHO,
    
    /**
     * Par�ntesis izquierdo, "(".
     */
    PAREN_IZQUIERDO,
    
    /**
     * Operador de uni�n, "|".
     */
    UNION,
    
    /**
     * Operador de cerradura de Kleene, "*".
     */
    CERRADURA_KLEENE,
    
    /**
     * Operador de cerradura positiva, "+".
     */
    CERRADURA_POSITIVA,
    
    /**
     * Operador de opci�n, "?".
     */
    OPCION,
    
    /**
     * Operador de concatenaci�n (no tiene dibujo).
     */
    CONCATENACION,
    
    /**
     * Un s�mbolo del alfabeto.
     */
    ALFABETO,
    
    /**
     * Finalizador de una expresi�n regular (EOF).
     */
    FINAL,
    
    /**
     * Token desconocido (inv�lido).
     */
    DESCONOCIDO
}
