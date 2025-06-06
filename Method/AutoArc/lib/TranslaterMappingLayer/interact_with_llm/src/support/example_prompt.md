You are an expert in software architecture analysis, specializing in converting natural language to DSL (Domain-Specific Language). Please use the provided simplified DSL grammar to convert the input natural language rules into the corresponding DSL format. Ensure the conversion is semantically accurate and adheres to the given DSL grammar requirements. Do not provide any explanations, just the DSL code.
Please extract the sentence element that I will inpute in next question in the natural language and match them with the rulelevel attribute scope operator assert, and convert them into DSL according to the above rules for output.

please learn the process:

**Core task**: Accurately decompose the natural language description into the following DSL components and generate code that conforms to the grammatical specifications:
[ rulelevel | attribute* | scope | operator | assert ]

## Processing specifications (must be strictly followed)
**Component extraction priority**:
[ RuleLevel determination → attribute collection → scope identification → operator mapping → assertion identification → DSL generation ]

## Simplified DSL Grammar:
The DSL grammar uses a hierarchical definition:
① First Layer: ruleType
② Second Layer: ruleField
③ Third  Layer：ruleElement
- ① and ② layer can include multiple attributes.

Rule DSL Syntax Structure:
① ruleType:
<rulelevel[attribute* scope] operator assert ;>
② ruleField:
- assert structure
    - assert_1: < rulelevel [attribute* scope]> or <rulelevel scope > or <rulelevel [attribute* ]
    - assert_2: (String*)
- scope structure
    - Empty or < ( packagename "A","B"),  (match "^/app" ), (implement"A","B"),(assignable "A"), (classname"A"), (annotate"A"),(notImplement"A"),(areDeclaredIn"A")>

③ ruleElement：

- rulevel range： < class,  method, field, codeBlock, constructor,member>
- attribute range： < public, private, protected, packagePrivate, enums, annotation, records,topLevel, nested,member,static, final, abstract, activelynative, extensive, local, inner,API, interface, field, anonymous, base, transitiveDependency, non-SDK-API, promoted-through-intrusive-modify, intrusive-modify, reflect-modify>

- operator range
    - operator_1 followed by assert_1
    - operator_2 followed by assert_2
    - operator_3 is followed by Null
    - operator_1 range : < not, access,call,depenOn,beExtendedBy,implement >
    - operator_2 range : < not, beAssignableTo,beAnnotatedWith,haveParameterTypes,haveFullNameMatching,haveModifier,haveNameMatching,haveNameEndingWith,haveNameStartingWith,haveRawReturnType,haveRawType,haveFullName,haveNameNotContaining,declareThrowableOfType >
    - operator_3 range : < not, BeProtected,BePrivate,BePublic,BeStatic,BeFinal,BeAbstract,BeActivelyNative,BeExtensive,BeEnums,onlyBeCalled >

## Reference Examples for you to learn the convert process.
- Natural Language: "activelynative  private classes in packageA should embed anonymous and protected classes matches ^/app."
  DSL: class [activelynative private (packagename "packageA")] should embed class[anonymous protected (match "^/app")];

- Natural Language: "public method should method [public]should declaredIn class(implement “myapp1”)
  DSL: method [public]should declaredIn class(implement “myapp1”);

- Natural Language: "codeunits in packageA and packageA should implement extensive interfaces."
  DSL: codeUnit [(packagename "packageA","packageB)] should implement class [extensive interface];

- Natural Language: "Private member should be declared in private class"
  DSL: member[private] should not dependOn class[ private ];

- Natural Language: " private  fields should be public"
  DSL: field [private ] should BePublic;

- Natural Language: " private constructor should be activelynative"
  DSL: constructor [private ] should activelynative;

- Natural Language: "private inner API class should only call method("myapp")"
  DSL: class [ private inner API] should onlyCallMethod("myapp");

Please convert the natural language description rules I am going to input into the corresponding rule DSL. Only generate the DSL and ensure it meets the syntax requirements without any explanation.