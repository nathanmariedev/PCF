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

# Pour tester
Executer le main. Ca ouvre ça :
```
/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=54208:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/nathan/Documents/IMT/1A/NOYE/PCF/out/production/PCF:/Users/nathan/Downloads/antlr-runtime-4.13.2 (1).jar main.Main




```

Ensuite, rentrer une expression à tester :
```
/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=54208:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/nathan/Documents/IMT/1A/NOYE/PCF/out/production/PCF:/Users/nathan/Downloads/antlr-runtime-4.13.2 (1).jar main.Main
1 + 1 + 2



```

Pour executer, faire Cmd D ou Ctrl D (pour windows)
```
/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=54208:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/nathan/Documents/IMT/1A/NOYE/PCF/out/production/PCF:/Users/nathan/Downloads/antlr-runtime-4.13.2 (1).jar main.Main
1 + 1 + 2
^D
ANTLR Syntax Tree: (term (term (term 1) + (term 1)) + (term 2))
AST: BinOp(PLUS, BinOp(PLUS, Lit(1), Lit(1)), Lit(2))

Process finished with exit code 0
```

`ANTLR Syntax Tree` -> arbre syntaxique format ANTLR
`AST` -> Même chose avec les classes java
