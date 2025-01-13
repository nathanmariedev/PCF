# TP1

PCF est un langage conçu pour l'étude de la reconaissance syntaxique de langages de programmation, et l'étude de la compilation.
### Différences règles syntaxiques/lexicales
Les <b>règles lexicales</b> (en bas du fichier) définissent comment reconnaître les unités lexicales (ou tokens).

* OP : reconnaît les opérateurs arithmétiques (+, -, *, /).
* LIT : reconnaît des littéraux entiers :
  * Soit 0
  * Soit un chiffre non nul suivi de plusieurs chiffres.
* WS : ignore les espaces (skip).

---
Les <b>règles syntaxiques</b> (en haut du fichier) définissent comment combiner ces tokens pour former des expressions correctes dans le langage PCF.
* program : un programme est composé d'un term suivi de la fin du fichier (EOF).
* term :
 * Soit un littéral seul (LIT).
 * Soit un terme avec un opérateur suivi d'un autre terme (term OP term).
 * Soit une structure conditionnelle de la forme ifz ... then ... else ....

## ANTLR

Clique droit sur une règle syntaxique -> Tester la règle