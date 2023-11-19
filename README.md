# stage2-module4-task3
Task for behavioural design patterns

#### 1) Strategy design pattern
   You have a typical shop stock and you need to find products by manufacture or maximum price. You should implement Strategy design pattern for this search.

To do this, you have the FilteringStrategy interface and the empty ManufactureFilteringStrategy and MaxPriceFilteringStrategy classes in the com.mjc.stage2.impl package. The search by ManufactureFilteringStrategy should be case insensitive, so "APPLE" equals "apple". You also need to implement the List executeFilteringStrategy(FilteringStrategy filteringStrategy) method in the ShopStock class, which returns the products for your filtering strategy.

#### 2) Observer design pattern
   Written code overview
   com.mjs.stage2.repository.RectangleRepository is the repository where rectangles are saved.
   com.mjc.stage2.warehouse.RectangleWarehouse is the warehouse where rectangle values (such as perimeter and square) are saved such.
   com.mjs.stage2.event.RectangleEvent is the event sent to the observer when the value of one of the sides of the rectangle has changed.

Task
When you get one of the rectangle objects from the repository and change the value of one of the sides, then the RectangleObserver handles this event and the values in the rectangle warehouse must be changed. Implement the Observer and Observable interfaces where appropriate.

#### 3) Composite and Chain of responsibility design patterns
   The sentence should be parsed into an object. This object should be a tree containing lexemes , which should contain symbols. A lexeme is any word. Use Composite pattern here.

You need to extend the AbstractTextComponent class and implement methods for the TextComponent and SymbolLeaf classes. You have a TextComponentType enum for all the required text component types.
Throw UnsupportedOperationException where appropriate.

Use regular expressions to parse text. Use Chain of Responsibility when parsing sentences.
You should extend the AbstractTextParser class and implement methods for the LexemeParser and WordParser. You also need to create the appropriate method logic in the ChainParserBuilder class.
You can find a sentence for this task in resources/data/textdata.txt file. You also have some util packages (reader and validator), they are only used to read data from a file. Changes to these packages are not required for this task.
