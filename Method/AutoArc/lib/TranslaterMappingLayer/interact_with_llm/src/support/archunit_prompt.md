## Reference Examples for you to learn the convert process.
- Natural Language : Classes that have name matching  "Dao" should reside in a package "..dao..". 
  DSL: class [(haveNameMatching"Dao")] should resideIn("..dao..");;

- Natural Language: "Classes annotated with "Entity.class" must reside in a package "..domain.."."
  DSL: class [annotate("Entity.class")] should resideIn("..domain..");;

- Natural Language: "classes that reside in "..dao.." should access Classes that are Assignable to "EntityManager.class""
  DSL: class [(packagename "..dao.."] should implement class [extensive interface];

- Natural Language: "Methods that declared in classes that have name Matching "Dao" must not declare that they throw "SQLException"."
  DSL: class[private] should not dependOn class[ private ];

- Natural Language: "classes should not have dependencies on classes that residing in package "..service.."."
  DSL: class [private ] should BePublic;

- Natural Language: " classes should not have dependencies on classes that are assignable to "EntityManager""
  DSL: class [private ] should activelynative;

- Natural Language: "classes that are interface should not  have a fully qualified class name that ends with the word "Interface"."
  DSL: class [ private inner API] should onlyCallMethod("com.android.internal.os.ZygoteInit", "main");

- Natural Language: "Public classes should reside in package "..Dao.."."
  DSL: class [public] should resideIn("..Dao..");

- Natural Language: "Classes that have name matching  "Dao" should reside in a package "..dao.." “
  DSL: class [match "Dao" ] should resideIn("..dao..");
  Please convert the natural language description rules I am going to input into the corresponding rule DSL. Only generate the DSL and ensure it meets the syntax requirements without any explanation.