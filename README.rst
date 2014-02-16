***********************
Tomcat Extra properties
***********************

Tomcat Extra properties allow you to load properties from other files than
``catalina.properties``.

============
Installation
============

1. Put ``tomcat-extra-properties.jar`` in ``$CATALINA_HOME/lib``

2. Create or edit ``$CATALINA_HOME/bin/setenv.(sh|bat)`` to add this line:

.. code-block:: bash

    export CLASSPATH=$CATALINA_HOME/lib/tomcat-extra-properties.jar

.. code-block:: dosbatch

    set CLASSPATH=%CATALINA_HOME%/lib/tomcat-extra-properties.jar

=====
Usage
=====

Simply reference all the extra properties files with the property
``catalina.extra.properties.urls`` as a comma separated list of URLs.

.. code-block:: properties

    catalina.extra.properties.urls=\
      file://${catalina.home}/catalina.extra.properties,\
      file:///etc/tomcat/catalina.extra.properties,\
      http://example.org/tomcat/catalina.extra.properties
