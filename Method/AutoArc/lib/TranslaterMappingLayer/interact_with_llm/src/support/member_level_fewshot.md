## Reference Examples for you to learn the convert process.
- Natural Language: "activelynative  private members in packageIdentifier should declaredIn  anonymous and protected classes that matches ^/app."
  DSL: member [activelynative private (packagename "packageIdentifier")] should declaredIn class[anonymous protected (match "^/app")];

- Natural Language: "public member should declaredIn class that implement “myapp1”"
  DSL: member [public]should declaredIn class (implement “myapp1”);

- Natural Language: "member in packageIdentifierA and packageIdentifierB should declaredIn extensive interfaces class."
  DSL: member [(packagename "packageIdentifierA","packageIdentifierB)] should declaredIn class [extensive interface];

- Natural Language: "Private member should be declared in private class"
  DSL: member[private] should not declaredIn class[ private ];

- Natural Language: " private  member should be public"
  DSL: member [private ] should BePublic;

- Natural Language: " "Public members in package 'packageIdentifier' should be package-private.""
  DSL: member[public(packagename “packageIdentifier”)] should BePackagePrivate;

- Natural Language: "member[protected final (haveNameMatching “regex”)] should declaredIn class [static(packagename “packageIdentifier1”)]"
  DSL: "Protected final members with names matching with 'regex' should be declared in static classes in package 'packageIdentifier1'.";

- Natural Language: "Public static members with names matching with 'String1' should have full names of 'String2'."
  DSL: member[public static (haveNameMatching “String1”)] should haveFullName “String2”;

Please convert the natural language description rules I am going to input into the corresponding rule DSL. Only generate the DSL and ensure it meets the syntax requirements without any explanation.