Notes
chatper 9

Static Variables: Static variables are common to all instances (objects) of a class. They are set when the class is loaded and persist regardless of any particular object. Any modifications made to static variables will impact all instances of the class.

Final Methods and Classes: Final methods are immune to being overridden by subclasses, ensuring that specific behaviors remain unaltered. Final classes cannot be extended, preventing the formation of subclasses.
------------------------------------------------------------------
Chapter 10 
Instance vs. Local Variables: Instance variables are associated with an object and remain accessible throughout the object's existence. On the other hand, local variables are declared within methods and have a limited scope restricted to those methods.

Constructors and Object Creation: Constructors serve as specialized methods used for generating objects from classes. They are responsible for initializing an object's state or establishing initial values for its attributes. When an object is instantiated, memory is allocated on the heap to store its data, and the constructor is invoked to establish the initial state.

Constructor Overloading: Constructor overloading refers to the ability to have multiple constructors within a class, each with a distinct parameter list. This feature provides flexibility when creating objects with varying initializations.
