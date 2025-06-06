## Reference Examples for you to learn the convert process.
- Natural Language: "activelynative  private fields in packageIdentifier should declaredIn  anonymous and protected classes that matches ^/app."
  DSL: field [activelynative private (packagename "packageIdentifier")] should declaredIn class[anonymous protected (match "^/app")];

- Natural Language: "public field should declaredIn class that implement “myapp1”"
  DSL: field [public]should declaredIn class (implement “myapp1”);

- Natural Language: "field in packageIdentifierA and packageIdentifierB should declaredIn extensive interfaces class."
  DSL: field [(packagename "packageIdentifierA","packageIdentifierB)] should declaredIn class [extensive interface];

- Natural Language: "Private field should be declared in private class"
  DSL: field[private] should not declaredIn class[ private ];

- Natural Language: " private  field should be public"
  DSL: field [private ] should BePublic;

- Natural Language: " "Public fields in package 'packageIdentifier' should be package-private.""
  DSL: field[public(packagename “packageIdentifier”)] should BePackagePrivate;

- Natural Language: "field[protected final (haveNameMatching “regex”)] should declaredIn class [static(packagename “packageIdentifier1”)]"
  DSL: "Protected final fields with names matching with 'regex' should be declared in static classes in package 'packageIdentifier1'.";

- Natural Language: "Public static fields with names matching with 'String1' should have full names of 'String2'."
  DSL: field[public static (haveNameMatching “String1”)] should haveFullName “String2”;

Please convert the natural language description rules I am going to input into the corresponding rule DSL. Only generate the DSL and ensure it meets the syntax requirements without any explanation.