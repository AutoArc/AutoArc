## Reference Examples for you to learn the convert process.
- Natural Language: "activelynative  private constructors in packageIdentifier should declaredIn  anonymous and protected classes that matches ^/app."
  DSL: constructor [activelynative private (packagename "packageIdentifier")] should declaredIn class[anonymous protected (match "^/app")];

- Natural Language: "Non private constructor should declaredIn class that implement “myapp1”"
  DSL: constructor [notPrivate]should declaredIn class (implement “myapp1”);

- Natural Language: "constructor in packageIdentifierA and packageIdentifierB should declaredIn extensive interfaces class."
  DSL: constructor [(packagename "packageIdentifierA","packageIdentifierB)] should declaredIn class [extensive interface];

- Natural Language: "Private constructor should be declared in private class"
  DSL: constructor[private] should not declaredIn class[ private ];

- Natural Language: " private  constructor should be public"
  DSL: constructor [private ] should BePublic;

- Natural Language: " "Public constructors in package 'packageIdentifier' should be package-private.""
  DSL: constructor[public(packagename “packageIdentifier”)] should BePackagePrivate;

- Natural Language: "constructor[protected final (haveNameMatching “regex”)] should declaredIn class [static(packagename “packageIdentifier1”)]"
  DSL: "Protected final constructors with names matching with 'regex' should be declared in static classes in package 'packageIdentifier1'.";

- Natural Language: "Public static constructors with names matching with 'String1' should have full names of 'String2'."
  DSL: constructor[public static (haveNameMatching “String1”)] should haveFullName “String2”;

Please convert the natural language description rules I am going to input into the corresponding rule DSL. Only generate the DSL and ensure it meets the syntax requirements without any explanation.