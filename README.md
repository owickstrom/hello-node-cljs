# hello-node-cljs

This is a project to test writing ClojureScript for NodeJS and Express.

I started out with the [nodecljs template](http://blog.lauripesonen.com/leiningen-template-for-cljs-on-node-projects/).

## Running it

To just compile and run the application:

    lein cljsbuild once
    node server.js

If you want automated compilation and reloading of the server you can
use [nodemon](https://github.com/remy/nodemon).

    lein cljsbuild auto
    # And in another tab/pane/whatever...
    nodemon server.js

## License

Copyright © 2014 Oskar Wickström

Distributed under the Eclipse Public License, the same as Clojure.
