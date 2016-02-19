Demonstrates that running an additional agent (JaCoCo) before AspectJ's agent discards that agent's instrumentations.

 1. `mvn -Pjacoco-agent,jacoco-report clean package`
 2. Decompiling `_ajdump/_before/example/*.class` shows that the instrumentation of the first agent happened
 3. Decompiling `_ajdump/example/*.class` shows that that instrumentation is gone after AspectJ touched the classes

If the first agent is instead replaced with offline-instrumentation, AspectJ honors those changes.

 1. `mvn -Pjacoco-instrument,jacoco-report clean package`
 2. Decompiling `_ajdump/example/*.class` shows both the changes of the first agent and that of AspectJ are now present
