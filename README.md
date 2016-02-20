This is a simple example that illustrates the use of visibility and
phantom types to help the compiler prove where values of a certain type
are coming from.

This is useful when there are run time decisions behind the creation of a
type of value, since you can control the scope of logic that needs to be
tested in order to assure that any instances of a given type moving through
the rest of a code base are valid.
