## Reference Examples for you to learn the convert process.
- Natural Language: "activelynative  private codeUnits in packageIdentifier should declaredIn  anonymous and protected classes that matches ^/app."
  DSL: codeUnit [activelynative private (packagename "packageIdentifier")] should declaredIn class[anonymous protected (match "^/app")];

- Natural Language: "public codeUnit should declaredIn class that implement “myapp1”"
  DSL: codeUnit [public]should declaredIn class (implement “myapp1”);

- Natural Language: "codeUnit in packageIdentifierA and packageIdentifierB should declaredIn extensive interfaces class."
  DSL: codeUnit [(packagename "packageIdentifierA","packageIdentifierB)] should declaredIn class [extensive interface];

- Natural Language: "Private codeUnit should be declared in private class"
  DSL: codeUnit[private] should not declaredIn class[ private ];

- Natural Language: " private  codeUnit should be public"
  DSL: codeUnit [private ] should BePublic;

- Natural Language: " "Public codeUnits in package 'packageIdentifier' should be package-private.""
  DSL: codeUnit[public(packagename “packageIdentifier”)] should BePackagePrivate;

- Natural Language: "codeUnit[protected final (haveNameMatching “regex”)] should declaredIn class [static(packagename “packageIdentifier1”)]"
  DSL: "Protected final codeUnits with names matching with 'regex' should be declared in static classes in package 'packageIdentifier1'.";

- Natural Language: "Public static codeUnits with names matching with 'String1' should have full names of 'String2'."
  DSL: codeUnit[public static (haveNameMatching “String1”)] should haveFullName “String2”;

Please convert the natural language description rules I am going to input into the corresponding rule DSL. Only generate the DSL and ensure it meets the syntax requirements without any explanation.