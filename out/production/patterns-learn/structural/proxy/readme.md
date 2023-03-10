One reason for controlling access to an object is to defer the full cost of its creation and initialization until we
actually need to
use it. Another reason could be to act as a local representative for an object that lives in a different JVM. The Proxy
can be very
useful in controlling the access to the original object, especially when objects should have different access rights.
In the Proxy Pattern, a client does not directly talk to the original object, it delegates it calls to the proxy object
which calls the
methods of the original object. The important point is that the client does not know about the proxy, the proxy acts as
an original
object for the client. But there are many variations to this approach which we will see soon.

• A remote proxy provides a local representative for an object in a different address space.
• A virtual proxy creates expensive objects on demand.
• A protection proxy controls access to the original object. Protection proxies are useful when objects should have
different
access rights.