# hello-node-cljs

This is a project to test writing ClojureScript for NodeJS and Express.

## Running it

To just compile and run the application:

    lein cljsbuild once
    node server.js

If you want some automated compilation and reloading you can use `nodemon`:

    lein cljsbuild once
    # And in another tab/pane/whatever...
    nodemon server.js

## License

Copyright © 2014 Oskar Wickström

Distributed under the Eclipse Public License, the same as Clojure.
