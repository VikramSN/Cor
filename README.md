# Cor
=====
<b>Step 1. Add the JitPack repository to your build file</b>
<ul>Add it in your root build.gradle at the end of repositories:</ul>

<pre>
<b>allprojects {
repositories {
...
maven { url 'https://jitpack.io' }
}
}
</b>
</pre>

<b>Step 2. Add the dependency</b>
<pre>
<b>dependencies {
implementation 'com.github.VikramSN:Coro:1.0'
}
</b></pre>

<pre><i>

           <b>Utilization of Library </b>
         --------------------------------------

        // Main
        Coro.main {
        // your asyncronous task here
        }
        
        // I/O
        Coro.io {
        // your asyncronous task here
        }
        
        // Default
        Coro.default {
        // your asyncronous task here
        }
        
        // Unconfined
        Coro.Unconfined {
        // your asyncronous task here
        }

</i></pre>


