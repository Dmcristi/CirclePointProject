Suppose that we have a set of objects with some common behaviors: they could move up, down, left or right. The exact behaviors (such as how to move and how far to move) depends on the objects themselves. One common way to model these common behaviors is to define an interface called Movable with the methods: moveUp(), moveDown(), moveLeft() and moveRight(). The classes that implement the Movable interface will provide the actual implementation to these abstract methods.

The interface is added to the assignment (it has no package, add a proper package to it), implement two classes MovablePoint and MovableCircle that implement this interfaces:

MovablePoint:

Fields:
x:int
y:int
xSpeed:int
ySpeed:int
Methods & Constructors:
MovablePoint(x:int, y:int, xSpeed:int, ySpeed:int)
toString():String
moveUp():void
moveDown():void
moveLeft():void
moveRight():void
moveUp(howMuch:int):void
moveDown(howMuch:int):void
moveLeft(howMuch:int):void
moveRight(howMuch:int):void
MovableCircle

Fields:
radius:int
center:MovablePoint
Methods & Constructors
MovableCircle(x:int, y:int, xSpeed:int, ySpeed:int, radius:int)
toString():String
moveUp():void
moveDown():void
moveLeft():void
moveRight():void
moveUp(howMuch:int):void
moveDown(howMuch:int):void
moveLeft(howMuch:int):void
moveRight(howMuch:int):void


In interface Movable add the following constants:

PLAIN_X_MAX = 1000: int
PLAIN_Y_MAX = 1000: int
PLAIN_X_MIN = -1000: int
PLAIN_Y_MIN = -1000: int


- the point and the circle should never be out of the

plain

- Add proper error handling this use cases.

Note: Classes may also have additional methods, constructors and fields (besides the ones specified) if needed, the requirement is to have AT LEAST the specified methods and fields.

