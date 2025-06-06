## Reference Examples for you to learn the convert process.
- Natural Language
  1. "activelynative  private classes in “packageIdentifier” should embed anonymous and protected classes matches ^/app."
  2. "Classes with public access modifier should only be subclassed by classes belonging to "packageIdentifier"."
  DSL: class [activelynative private (packagename "packageIdentifier")] should embed class[anonymous protected (match "^/app")];

- Natural Language: "public class are prohibited to be declaredIn class that implement “typeName”"
  DSL: class [public]should not declaredIn class(implement "typeName");

- Natural Language: "class in "packageIdentifier1" and "packageIdentifier2" should implement extensive interfaces classes."
  DSL: class [(packagename "packageIdentifier1","packageIdentifier2")] should implement class [extensive interface];

- Natural Language: "Private class should be declared in private class"
  DSL: class[private] should not declaredIn class[ private ];

- Natural Language: " private  class should be public"
  DSL: class [private ] should BePublic;

- Natural Language: " private class should be activelynative"
  DSL: class [private ] should activelynative;

- Natural Language: "Public classes should have names matching 'classname'."
  DSL: class [public] should haveNameMatching"classname";

- Natural Language: "Public classes should reside in package "..Dao.."."
  DSL: class [public] should resideIn"..Dao..";

- Natural Language: "Classes that have name matching  "Dao" should reside in a package "..dao.." “
  DSL: class [match "Dao" ] should resideIn"..dao..";
Please convert the natural language description rules I am going to input into the corresponding rule DSL. Only generate the DSL and ensure it meets the syntax requirements without any explanation.