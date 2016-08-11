/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.intellij.build

import groovy.transform.CompileStatic

import static org.jetbrains.intellij.build.LibraryLicense.jetbrainsLibrary

/**
 * @author nik
 */
@CompileStatic
class CommunityLibraryLicenses {
  public static final List<LibraryLicense> LICENSES_LIST = [
    new LibraryLicense(name: "aether-api-0.9.0.M2.jar", version: "0.9.0.M2", libraryName: "aether-api-0.9.0.M2.jar",
                       license: "Eclipse Public License v1.0", url: "http://www.eclipse.org/aether/",
                       licenseUrl: "http://www.eclipse.org/org/documents/epl-v10.html"),
    new LibraryLicense(name: "aether-api", version: "1.13.1", libraryName: "aether-api-1.13.1.jar", license: "Apache 2.0",
                       url: "http://maven.apache.org/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "Alloy L&F", libraryName: "alloy.jar", version: "1.4.4", license: "link (company license)",
                       url: "http://lookandfeel.incors.com/",
                       licenseUrl: "http://lookandfeel.incors.com/display_licence.php?back=purchase.php&selMenu=Purchase"),
    new LibraryLicense(name: "Android Builder Model", libraryName: "builder-model", license: "Apache 2.0", url: "http://source.android.com/"),
    new LibraryLicense(name: "Android Builder", libraryName: "android-builder", license: "Apache 2.0", url: "http://source.android.com/"),
    new LibraryLicense(name: "Android Gradle model", libraryName: "android-gradle-model", version: "0.4-SNAPSHOT", license: "Apache 2.0",
                       url: "https://android.googlesource.com/platform/tools/build/+/master/gradle-model/"),
    new LibraryLicense(name: "Android SDK Tools JPS", libraryName: "android-sdk-tools-jps", license: "Apache 2.0",
                       url: "http://source.android.com/"),
    new LibraryLicense(name: "Android SDK Tools", libraryName: "android-sdk-tools", license: "Apache 2.0", url: "http://source.android.com/"),
    new LibraryLicense(name: "Ant", version: "1.9", license: "Apache 2.0", url: "http://ant.apache.org/",
                       licenseUrl: "http://ant.apache.org/license.html"),
    new LibraryLicense(name: "ANTLR 4 Runtime", libraryName: "antlr-runtime-4.1.jar", version: "4.1", license: "BSD",
                       url: "http://www.antlr.org", licenseUrl: "http://www.antlr.org/license.html"),
    new LibraryLicense(name: "Antlr", libraryName: "antlr.jar", version: "3.4", license: "BSD", url: "http://www.antlr.org",
                       licenseUrl: "http://www.antlr.org/license.html"),
    new LibraryLicense(name: "Apache Commons BeanUtils", libraryName: "commons-beanutils.jar", version: "1.6", license: "Apache 2.0",
                       url: "http://commons.apache.org/beanutils/"),
    new LibraryLicense(name: "Apache Commons Codec", libraryName: "commons-codec", version: "1.8", license: "Apache 2.0",
                       url: "http://commons.apache.org/codec/", licenseUrl: "http://www.apache.org/licenses/"),
    new LibraryLicense(name: "Apache Commons Compress", libraryName: "commons-compress", version: "1.10", license: "Apache 2.0",
                       url: "http://commons.apache.org/proper/commons-compress/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "Apache Commons Discovery", libraryName: "commons-discovery-0.4.jar", version: "0.4", license: "Apache 2.0",
                       url: "http://jakarta.apache.org/commons/discovery/", licenseUrl: "http://www.apache.org/licenses/"),
    new LibraryLicense(name: "Apache Commons HTTPClient", libraryName: "http-client-3.1", version: "3.1&nbsp; (with patch by JetBrains)",
                       license: "Apache 2.0", url: "http://hc.apache.org/httpclient-3.x"),
    new LibraryLicense(name: "Apache Commons IO", libraryName: "commons-io-1.4.jar", version: "1.4", license: "Apache 2.0",
                       url: "http://commons.apache.org/io/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt"),
    new LibraryLicense(name: "Apache Commons Logging", libraryName: "commons-logging", version: "1.1.1", license: "Apache 2.0",
                       url: "http://commons.apache.org/logging/"),
    new LibraryLicense(name: "Apache Commons Net", libraryName: "commons-net", version: "3.3", license: "Apache 2.0",
                       url: "http://commons.apache.org/net/"),
    new LibraryLicense(name: "Apache Lucene", libraryName: "lucene-core-2.4.1.jar", version: "2.4.1", license: "Apache 2.0",
                       url: "http://lucene.apache.org/java"),
    new LibraryLicense(name: "Apache Sanselan", libraryName: "Sanselan", version: "0.98", license: "Apache 2.0",
                       url: "https://commons.apache.org/proper/commons-imaging/"),
    new LibraryLicense(name: "Apache XML Graphics Commons", libraryName: "xmlgraphics-commons-1.3.1.jar", version: "1.3.1",
                       license: "Apache 2.0", url: "http://xmlgraphics.apache.org/commons/",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "ASM Bytecode Manipulation Framework", libraryName: "ASM", version: "6.0-ALPHA (with patches by JetBrains)",
                       license: "BSD", url: "http://asm.objectweb.org/", licenseUrl: "http://asm.objectweb.org/license.html"),
    new LibraryLicense(name: "assertJ", version: "3", license: "Apache 2.0", url: "https://github.com/joel-costigliola/assertj-core"),
    new LibraryLicense(name: "Automaton", libraryName: "automaton.jar", version: "1.11", license: "BSD", url: "http://www.brics.dk/automaton/",
                       licenseUrl: "http://www.opensource.org/licenses/bsd-license.php"),
    new LibraryLicense(name: "Axis", libraryName: "axis-1.4", version: "1.4", license: "Apache 2.0", url: "http://ws.apache.org/axis/",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.html"),
    new LibraryLicense(name: "bouncy-castle", version: "1.48", license: "MIT License", url: "http://bouncycastle.org",
                       licenseUrl: "http://bouncycastle.org/licence.html"),
    new LibraryLicense(name: "CGLib", libraryName: "CGLIB", version: "2.2.2", license: "Apache", url: "http://cglib.sourceforge.net/",
                       licenseUrl: "http://www.apache.org/foundation/licence-FAQ.html"),
    new LibraryLicense(name: "classworlds", libraryName: "classworlds-1.1.jar", version: "1.1", license: "codehaus",
                       url: "https://github.com/codehaus/classworlds",
                       licenseUrl: "https://github.com/codehaus/classworlds/blob/master/classworlds/LICENSE.txt"),
    new LibraryLicense(name: "coverage.py", attachedTo: "python-helpers", version: "3.7.1", license: "Apache 2.0",
                       url: "http://coverage.readthedocs.org/"),
    new LibraryLicense(name: "Cucumber-Core", libraryName: "cucumber-core", version: "1.2.4", license: "MIT License",
                       url: "https://github.com/cucumber/cucumber-jvm/", licenseUrl: "http://www.opensource.org/licenses/mit-license.html"),
    new LibraryLicense(name: "Cucumber-Groovy", libraryName: "cucumber-groovy", version: "1.2.4", license: "MIT License",
                       url: "https://github.com/cucumber/cucumber-jvm/", licenseUrl: "http://www.opensource.org/licenses/mit-license.html"),
    new LibraryLicense(name: "Cucumber-Java", libraryName: "cucumber-java", version: "1.2.4", license: "MIT License",
                       url: "https://github.com/cucumber/cucumber-jvm/", licenseUrl: "http://www.opensource.org/licenses/mit-license.html"),
    new LibraryLicense(name: "data-binding", libraryName: "data-binding.jar", license: "Apache 2.0", url: "http://source.android.com/"),
    new LibraryLicense(name: "Diffutils", libraryName: "Diffutils", version: "1.2.1", license: "The Apache Software License, Version 2.0",
                       url: "https://code.google.com/archive/p/java-diff-utils/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "docutils", attachedTo: "python-helpers", version: "0.8", license: "BSD", url: "http://docutils.sourceforge.net/"),
    new LibraryLicense(name: "DTDParser", version: "1.13", license: "LGPL", url: "http://sourceforge.net/projects/dtdparser/",
                       licenseUrl: "http://www.opensource.org/licenses/lgpl-2.1"),
    new LibraryLicense(name: "Eclipse JDT Core", libraryName: "Eclipse", version: "4.2.1", license: "CPL 1.0",
                       url: "http://www.eclipse.org/jdt/core/index.php"),
    new LibraryLicense(name: "EditorConfig Java Core", libraryName: "editorconfig-core-java.jar", version: "1.0", license: "Apache 2.0",
                       url: "https://github.com/editorconfig/editorconfig-core-java/",
                       licenseUrl: "https://github.com/editorconfig/editorconfig-core-java/blob/master/LICENSE"),
    new LibraryLicense(name: "epydoc", attachedTo: "python-helpers", version: "3.0.1", license: "MIT", url: "http://epydoc.sourceforge.net/"),
    new LibraryLicense(name: "Fest", libraryName: "fest", version: "", license: "Apache 2.0",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt", url: "https://code.google.com/p/fest/"),
    new LibraryLicense(name: "FreeMarker", attachedTo: "coverage", version: "2.3.15", license: "BSD", url: "http://freemarker.sourceforge.net/"),
    new LibraryLicense(name: "FreeMarker", libraryName: "freemarker-2.3.20", version: "2.3.20", license: "BSD",
                       url: "http://freemarker.sourceforge.net/"),
    new LibraryLicense(name: "fxg-utils", libraryName: "fxg-utils", version: "4.9.1", license: "Apache 2.0", url: "http://flex.apache.org",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "Gant", version: "1.9.8", libraryName: "gant-1.9.11_groovy-2.3.0.jar", license: "Apache 2.0",
                       url: "https://github.com/codehaus/gant", licenseUrl: "https://github.com/codehaus/gant/blob/master/LICENCE.txt"),
    new LibraryLicense(name: "Gherkin", libraryName: "Gherkin", version: "2.12.2", license: "MIT",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt", url: "https://github.com/cucumber/gherkin"),
    new LibraryLicense(name: "Google Feedback", libraryName: "GoogleFeedback.jar", version: "", license: "TBD"),
    new LibraryLicense(name: "gradle-tooling-api-2.13.jar", version: "2.13", license: "Apache 2.0", url: "http://gradle.org/",
                       licenseUrl: "http://gradle.org/license"),
    new LibraryLicense(name: "Gradle", version: "2.13", license: "Apache 2.0", url: "http://gradle.org/",
                       licenseUrl: "http://gradle.org/license"),
    new LibraryLicense(name: "GradleGuava", version: "14.0.1", license: "Apache 2.0", url: "http://code.google.com/p/guava-libraries/",
                       licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "GradleJnaPosix", version: "1.0.3", license: "LGPL 2.1", url: "http://www.jruby.org/",
                       licenseUrl: "http://www.gnu.org/licenses/lgpl-2.1.txt"),
    new LibraryLicense(name: "Groovy", version: "2.4.6", license: "Apache 2.0", url: "http://groovy-lang.org/"),
    new LibraryLicense(name: "Gson", version: "2.2.4", libraryName: "gson", license: "Apache 2.0", url: "http://code.google.com/p/google-gson/"),
    new LibraryLicense(name: "Guava", version: "19.0", license: "Apache 2.0", url: "http://code.google.com/p/guava-libraries/",
                       licenseUrl: "http://ant.apache.org/license.html"),
    new LibraryLicense(name: "hamcrest", version: "1.3", license: "BSD", url: "http://hamcrest.org/",
                       licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    new LibraryLicense(name: "HttpComponents HttpClient", libraryName: "http-client", version: "4.3.2", license: "Apache 2.0",
                       url: "http://hc.apache.org/httpcomponents-client-ga/index.html"),
    new LibraryLicense(name: "imgscalr", libraryName: "imgscalr", version: "4.2", license: "Apache 2.0",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt", url: "https://github.com/thebuzzmedia/imgscalr"),
    new LibraryLicense(name: "batik", libraryName: "batik", version: "1.7.1", license: "Apache 2.0",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt", url: "https://xmlgraphics.apache.org/batik/"),
    new LibraryLicense(name: "xmlgraphics-commons", libraryName: "xmlgraphics-commons", version: "1.5", license: "Apache 2.0",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt", url: "https://xmlgraphics.apache.org/commons/"),
    new LibraryLicense(name: "xml-apis-ext", libraryName: "xml-apis-ext", version: "1.3", license: "Apache 2.0",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt",
                       url: "http://xerces.apache.org/xml-commons/components/external"),
    new LibraryLicense(name: "ImageIO", libraryName: "com.twelvemonkeys.imageio:imageio-tiff:3.2.1", version: "3.2.1", license: "BSD",
                       url: "https://github.com/haraldk/TwelveMonkeys", licenseUrl: "https://github.com/haraldk/TwelveMonkeys#license"),
    new LibraryLicense(name: "ini4j", libraryName: "ini4j-0.5.2-patched", version: "0.5.2 (with a patch by JetBrains)", license: "Apache 2.0",
                       url: "http://ini4j.sourceforge.net/", attachedTo: "git4idea"),
    new LibraryLicense(name: "ISO RELAX", libraryName: "isorelax.jar", license: "MIT License",
                       url: "http://sourceforge.net/projects/iso-relax/", licenseUrl: "http://www.opensource.org/licenses/mit-license.html"),
    new LibraryLicense(name: "Jakarta ORO", libraryName: "OroMatcher", version: "2.0.8", license: "Apache",
                       url: "http://jakarta.apache.org/oro/", licenseUrl: "http://svn.apache.org/repos/asf/jakarta/oro/trunk/LICENSE"),
    new LibraryLicense(name: "Java-WebSocket", libraryName: "java_websocket.jar", version: "1.4.0 Trunk", license: "MIT",
                       url: "https://github.com/TooTallNate/Java-WebSocket",
                       licenseUrl: "https://github.com/TooTallNate/Java-WebSocket/blob/master/LICENSE"),
    new LibraryLicense(name: "JavaCVS", attachedTo: "javacvs-src", version: "no version number available (with patches by JetBrains)",
                       license: "Sun Public License", url: "https://versioncontrol.netbeans.org/javacvs/library/",
                       licenseUrl: "https://netbeans.org/about/legal/license.html"),
    new LibraryLicense(name: "JavaHelp", version: "2.0_02", license: "included as license/javahelp_license.html in IntelliJ IDEA distribution",
                       url: "http://java.sun.com/products/javahelp/"),
    new LibraryLicense(name: "javawriter", libraryName: "javawriter", license: "Apache 2.0", url: "https://github.com/square/javawriter"),
    new LibraryLicense(name: "JAXB", libraryName: "JAXB", version: "2.2.4-1", license: "CDDL 1.1", url: "http://jaxb.java.net/",
                       licenseUrl: "http://glassfish.java.net/public/CDDL+GPL_1_1.html"),
    new LibraryLicense(name: "Jaxen", version: "", license: "modified Apache", url: "http://www.jaxen.org/",
                       licenseUrl: "http://www.jaxen.org/license.html"),
    new LibraryLicense(name: "jayatana", libraryName: "jayatana", version: "1.2.4", license: "MIT License",
                       url: "https://code.google.com/p/java-swing-ayatana/", licenseUrl: "http://opensource.org/licenses/mit-license.php"),
    new LibraryLicense(name: "JCIP Annotations", libraryName: "jcip", license: "Creative Commons Attribution License",
                       url: "http://www.jcip.net", licenseUrl: "http://creativecommons.org/licenses/by/2.5"),
    new LibraryLicense(name: "JDOM", version: "1.1 (with patches by JetBrains)", license: "modified Apache", url: "http://www.jdom.org/",
                       licenseUrl: "http://www.jdom.org/docs/faq.html#a0030"),
    new LibraryLicense(name: "JediTerm", libraryName: "jediterm-pty", version: "2.2", license: "LGPL 2",
                       url: "https://github.com/JetBrains/jediterm", licenseUrl: "https://github.com/JetBrains/jediterm/blob/master/COPYING"),
    new LibraryLicense(name: "JEuclid", libraryName: "jeuclid-core-3.1.9.jar", version: "3.1.9", license: "Apache 2.0",
                       url: "http://jeuclid.sourceforge.net", licenseUrl: "http://sourceforge.net/p/jeuclid/code/ci/default/tree/LICENSE.txt"),
    new LibraryLicense(name: "JGit", libraryName: "jackson", version: "2.5.1", license: "Apache 2.0",
                       licenseUrl: "http://www.eclipse.org/org/documents/edl-v10.php", url: "https://github.com/FasterXML/jackson"),
    new LibraryLicense(name: "JGit", libraryName: "jgit", version: "4.0", license: "Eclipse Distribution License 1.0",
                       licenseUrl: "http://www.eclipse.org/org/documents/edl-v10.php", url: "https://eclipse.org/jgit/"),
    new LibraryLicense(name: "JGoodies Common", libraryName: "jgoodies-common", version: "1.2.1", license: "BSD ",
                       url: "http://www.jgoodies.com/freeware/libraries/looks/", licenseUrl: "https://opensource.org/licenses/bsd-license.html"),
    new LibraryLicense(name: "JGoodies Forms", libraryName: "jgoodies-forms", version: "1.1-preview 2006-05-04 11:55:37", license: "BSD ",
                       url: "http://www.jgoodies.com/freeware/libraries/forms/", licenseUrl: "https://opensource.org/licenses/bsd-license.html"),
    new LibraryLicense(name: "JGoodies Looks", libraryName: "jgoodies-looks", version: "2.4.2", license: "BSD ",
                       url: "http://www.jgoodies.com/freeware/libraries/looks/", licenseUrl: "https://opensource.org/licenses/bsd-license.html"),
    new LibraryLicense(name: "jgraphx", libraryName: "jgraphx-3.4.0.1", version: "3.4.0.1", license: "BSD",
                       url: "https://github.com/jgraph/jgraphx"),
    new LibraryLicense(name: "JNA", libraryName: "jna", version: "4.1.0", license: "LGPL 2.1", url: "https://github.com/java-native-access/jna",
                       licenseUrl: "http://www.opensource.org/licenses/lgpl-2.1.php"),
    new LibraryLicense(name: "jsch-agent-proxy for svnkit trilead", libraryName: "jsch.agentproxy.svnkit-trilead-ssh2.jar", version: "0.0.7",
                       license: "BSD", url: "https://github.com/ymnk/jsch-agent-proxy",
                       licenseUrl: "https://github.com/ymnk/jsch-agent-proxy/blob/master/LICENSE.txt"),
    new LibraryLicense(name: "jsch-agent-proxy", libraryName: "jsch-agent-proxy", version: "0.0.7", license: "BSD",
                       url: "https://github.com/ymnk/jsch-agent-proxy",
                       licenseUrl: "https://github.com/ymnk/jsch-agent-proxy/blob/master/LICENSE.txt"),
    new LibraryLicense(name: "JSch", libraryName: "JSch", version: "0.1.53", license: "BSD", url: "http://www.jcraft.com/jsch/",
                       licenseUrl: "http://www.jcraft.com/jsch/LICENSE.txt"),
    new LibraryLicense(name: "json-path", libraryName: "json-path-0.8.0.jar", version: "0.8.0", license: "Apache 2.0",
                       url: "http://code.google.com/p/json-path/", licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "json-smart", libraryName: "json-smart-1.1.1.jar", version: "1.1.1", license: "Apache 2.0",
                       url: "http://code.google.com/p/json-smart/", licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "jsr305", libraryName: "jsr305", version: "snapshot", license: "BSD", url: "http://code.google.com/p/jsr-305/",
                       licenseUrl: "http://code.google.com/p/jsr-305/source/browse/trunk/ri/LICENSE"),
    new LibraryLicense(name: "Jsr305", version: "1.3.9", license: "New BSD", url: "http://code.google.com/p/jsr-305/",
                       licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    new LibraryLicense(name: "JUnit", libraryName: "JUnit3", version: "3.8.1", license: "CPL 1.0", url: "http://junit.org/"),
    new LibraryLicense(name: "JUnit", libraryName: "JUnit4", version: "4.11", license: "CPL 1.0", url: "http://junit.org/"),
    new LibraryLicense(name: "junit5_rt", libraryName: "junit5_rt", version: "5.0.0", license: "Eclipse Public License 1.0",
                       url: "http://junit.org/"),
    new LibraryLicense(name: "jzlib", libraryName: "jzlib", version: "1.1.1", license: "BSD", url: "http://www.jcraft.com/jzlib/",
                       licenseUrl: "http://www.jcraft.com/jzlib/LICENSE.txt"),
    new LibraryLicense(name: "Kryo", libraryName: "Kryo", version: "2.22", license: "New BSD License",
                       url: "https://github.com/EsotericSoftware/kryo",
                       licenseUrl: "https://github.com/EsotericSoftware/kryo/blob/master/license.txt"),
    new LibraryLicense(name: "kXML2", libraryName: "kxml2", version: "2.3.0", license: "BSD", url: "http://sourceforge.net/projects/kxml/"),
    new LibraryLicense(name: "Lobo evolution", libraryName: "Loboevolution.jar", version: "0.98.6 (with patches by JetBrains)", license: "MIT",
                       url: "http://sourceforge.net/projects/loboevolution/", licenseUrl: "http://opensource.org/licenses/mit-license.php"),
    new LibraryLicense(name: "Log4j", libraryName: "Log4J", version: "1.2.17", license: "Apache 2.0",
                       url: "http://logging.apache.org/log4j/1.2/index.html", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "Lombok AST", libraryName: "lombok-ast", version: "0.2.1", license: "MIT", url: "http://projectlombok.org/",
                       licenseUrl: "http://opensource.org/licenses/mit-license.php"),
    new LibraryLicense(name: "markdown4j", libraryName: "markdown4j-2.2", version: "2.2", license: "New BSD",
                       url: "https://code.google.com/p/markdown4j/", licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    new LibraryLicense(name: "markdownj", attachedTo: "tasks-core", version: "", license: "BSD", url: "https://github.com/myabc/markdownj",
                       licenseUrl: "http://www.opensource.org/licenses/bsd-license.php"),
    new LibraryLicense(name: "markdownj", libraryName: "markdownj", version: "0.4.2", license: "New BSD",
                       url: "https://github.com/myabc/markdownj", licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    new LibraryLicense(name: "maven-2.2.1-uber", version: "2.2.1", libraryName: "maven-2.2.1-uber.jar", license: "Apache 2.0",
                       url: "http://maven.apache.org/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "maven-artifact", version: "3.0.5", libraryName: "maven-artifact-3.0.5.jar", license: "Apache 2.0",
                       url: "http://maven.apache.org/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "maven-core", version: "3.0.5", libraryName: "maven-core-3.0.5.jar", license: "Apache 2.0",
                       url: "http://maven.apache.org/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "Maven", version: "2.2.1", license: "Apache 2.0", url: "http://maven.apache.org/",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "Maven3",
                       libraryName: "Maven3", additionalLibraryNames: ["maven-dependency-tree-1.2.jar", "archetype-catalog-2.2.jar", "archetype-common-2.2.jar"],
                       version: "3.0.5", license: "Apache 2.0", url: "http://maven.apache.org/",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "mercurial_prompthooks", attachedTo: "hg4idea", version: "",
                       license: "GPLv2 (used as hg extension called from hg executable)",
                       url: "https://github.com/willemv/mercurial_prompthooks",
                       licenseUrl: "https://github.com/willemv/mercurial_prompthooks/blob/master/LICENSE.txt"),
    new LibraryLicense(name: "Microba", libraryName: "microba", version: "0.4.2", license: "BSD", url: "http://microba.sourceforge.net/",
                       licenseUrl: "http://microba.sourceforge.net/license.txt"),
    new LibraryLicense(name: "MigLayout", libraryName: "miglayout-swing", version: "5.0.0", license: "BSD", url: "http://www.miglayout.com/",
                       licenseUrl: "http://www.miglayout.com/mavensite/license.html"),
    new LibraryLicense(name: "minlog", libraryName: "minlog-1.2.jar", version: "1.2", license: "BSD",
                       url: "https://github.com/EsotericSoftware/minlog", licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    new LibraryLicense(name: "NanoXML", version: "2.2.3", license: "zlib/libpng",
                       url: "http://mvnrepository.com/artifact/be.cyberelf.nanoxml/nanoxml/2.2.3",
                       licenseUrl: "http://www.opensource.org/licenses/zlib-license.html"),
    new LibraryLicense(name: "nekohtml", libraryName: "nekohtml", version: "1.9.14", license: "Apache 2.0",
                       url: "http://nekohtml.sourceforge.net/", licenseUrl: "http://apache.org/licenses/LICENSE-2.0.txt"),
    new LibraryLicense(name: "Netty", libraryName: "Netty", version: "4.1.0.Beta3", license: "Apache 2.0", url: "http://netty.io",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "Objenesis", libraryName: "objenesis-1.2.jar", version: "1.2", license: "Apache 2.0", url: "http://objenesis.org/",
                       licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "opentest4j", libraryName: "opentest4j", version: "1.0.0", license: "Apache 2.0",
                       url: "https://github.com/ota4j-team/opentest4j", licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "pep8.py", attachedTo: "python-helpers", version: "1.6.2", license: "MIT", url: "http://pep8.readthedocs.org/"),
    new LibraryLicense(name: "PicoContainer", libraryName: "picocontainer", version: "1.2", license: "BSD",
                       url: "https://github.com/codehaus/picocontainer", licenseUrl: "https://opensource.org/licenses/bsd-license.php"),
    new LibraryLicense(name: "plexus-archiver", libraryName: "plexus-archiver-2.4.4.jar", version: "2.4.4", license: "Apache 2.0",
                       url: "https://github.com/codehaus-plexus/plexus-archiver", licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "plexus-classworlds", libraryName: "plexus-classworlds-2.4.jar", version: "2.4", license: "Apache 2.0",
                       url: "https://github.com/codehaus-plexus/plexus-classworlds", licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "plexus-component-annotations", version: "1.5.5", libraryName: "plexus-component-annotations-1.5.5.jar",
                       license: "Apache 2.0", url: "http://maven.apache.org/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "plexus-util", version: "2.0.6", license: "Apache 2.0", url: "http://maven.apache.org/",
                       libraryName: 'plexus-utils-2.0.6.jar', licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "Plexus Utils", libraryName: "plexus-utils-1.5.5.jar", version: "1.5.5", license: "Apache 2.0",
                       url: "http://plexus.codehaus.org/plexus-utils"),
    new LibraryLicense(name: "pockets", attachedTo: "python-helpers", version: "0.2.4", license: "BSD", url: "http://pockets.readthedocs.org/"),
    new LibraryLicense(name: "protobuf", version: "2.5.0", license: "New BSD", url: "http://code.google.com/p/protobuf/",
                       licenseUrl: "https://github.com/google/protobuf/blob/master/LICENSE"),
    new LibraryLicense(name: "proxy-vole", libraryName: "proxy-vole", version: "20131209", license: "New BSD License",
                       url: "http://code.google.com/p/proxy-vole/", licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    new LibraryLicense(name: "pty4j", libraryName: "pty4j", version: "0.7.1", license: "Eclipse Public License v1.0",
                       url: "https://github.com/traff/pty4j"),
    new LibraryLicense(name: "PureJavaComm", libraryName: "purejavacomm", version: "0.0.16", license: "BSD",
                       url: "http://www.sparetimelabs.com/purejavacomm"),
    new LibraryLicense(name: "ReflectASM", libraryName: "reflectasm-1.0.7.jar", version: "1.0.7", license: "BSD",
                       url: "https://github.com/EsotericSoftware/reflectasm", licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    new LibraryLicense(name: "Relax NG Object Model", libraryName: "rngom-20051226-patched.jar", license: "MIT",
                       url: "http://java.net/projects/rngom/", licenseUrl: "http://www.opensource.org/licenses/mit-license.php"),
    new LibraryLicense(name: "Rhino JavaScript Engine", libraryName: "rhino-js-1_7R4", version: "1.7R4", license: "MPL 1.1",
                       url: "http://www.mozilla.org/rhino/", licenseUrl: "http://www.mozilla.org/MPL/MPL-1.1.html"),
    new LibraryLicense(name: "RMI Stubs", attachedTo: "xslt-debugger-engine", license: "Apache 2.0",
                       url: "https://confluence.jetbrains.com/display/CONTEST/XSLT-Debugger",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "Saxon-6.5.5", version: "6.5.5", license: "Mozilla Public License", url: "http://saxon.sourceforge.net/",
                       licenseUrl: "http://www.mozilla.org/MPL/"),
    new LibraryLicense(name: "Saxon-9HE", version: "9", license: "Mozilla Public License", url: "http://saxon.sourceforge.net/",
                       licenseUrl: "http://www.mozilla.org/MPL/"),
    new LibraryLicense(name: "SceneBuilderKit", version: "8.1.1", license: "BSD", url: "http://gluonhq.com/open-source/scene-builder/",
                       licenseUrl: "http://www.oracle.com/technetwork/licenses/bsd-license-1835287.html"),
    new LibraryLicense(name: "Sequence", libraryName: "sequence-library.jar", version: "bundled with SVNKit",
                       license: "BSD (see LICENSE.txt in sequence-library.jar)", url: "http://www.syntevo.com"),
    new LibraryLicense(name: "six.py", attachedTo: "python-helpers", version: "1.9.0", license: "MIT", url: "http://pythonhosted.org/six/"),
    new LibraryLicense(name: "Slf4j", version: "1.7.10", license: "MIT License", url: "http://slf4j.org/",
                       licenseUrl: "http://slf4j.org/license.html"),
    new LibraryLicense(name: "Snappy-Java", libraryName: "Snappy-Java", version: "0.3.1", license: "Apache 2.0",
                       url: "https://github.com/dain/snappy", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    new LibraryLicense(name: "SnuggleTeX", version: "1.3 (with patches by JetBrains)", license: "BSD",
                       url: "http://snuggletex.sourceforge.net/", licenseUrl: "http://snuggletex.sourceforge.net/maven/license.html"),
    new LibraryLicense(name: "Sonatype Nexus Indexer Artifact", libraryName: "nexus-indexer-artifact-1.0.1.jar", version: "1.0.1",
                       license: "Eclipse Public License v1.0", url: "http://nexus.sonatype.org/",
                       licenseUrl: "http://www.eclipse.org/org/documents/epl-v10.html"),
    new LibraryLicense(name: "Sonatype Nexus: Indexer", libraryName: "nexus-indexer-1.2.3.jar", version: "1.2.3",
                       license: "Eclipse Public License v1.0", url: "http://nexus.sonatype.org/",
                       licenseUrl: "http://www.eclipse.org/org/documents/epl-v10.html"),
    new LibraryLicense(name: "Sonatype Nexus: Indexer", libraryName: "nexus-indexer-3.0.4.jar", version: "3.0.4",
                       license: "Eclipse Public License v1.0", url: "http://nexus.sonatype.org/",
                       licenseUrl: "http://www.eclipse.org/org/documents/epl-v10.html"),
    new LibraryLicense(name: "Spantable", libraryName: "spantable.jar", version: "patched", license: "LGPL 2.1",
                       licenseUrl: "http://www.gnu.org/licenses/lgpl.html",
                       url: "https://android.googlesource.com/platform/prebuilts/tools/+/master/common/spantable/"),
    new LibraryLicense(name: "sphinxcontrib-napoleon", attachedTo: "python-helpers", version: "0.3.11", license: "BSD",
                       url: "http://sphinxcontrib-napoleon.readthedocs.org/"),
    new LibraryLicense(name: "sqljet", version: "bundled with SVNKit", libraryName: "sqljet.jar", license: "link (commercial license)",
                       url: "http://sqljet.com", licenseUrl: "http://svnkit.com/license.html"),
    new LibraryLicense(name: "svnkit-javahl", version: "bundled with SVNKit", libraryName: "svnkit-javahl.jar",
                       license: "link (commercial license)", url: "http://www.svnkit.com/", licenseUrl: "http://svnkit.com/license.html"),
    new LibraryLicense(name: "SVNKit", libraryName: "svnkit.jar", version: "1.8.12", license: "link (commercial license)",
                       url: "http://www.svnkit.com/", licenseUrl: "http://svnkit.com/license.html"),
    new LibraryLicense(name: "swingx", libraryName: "swingx", version: "1.6.2", license: "LGPL 2.1", url: "http://java.net/downloads/swingx/",
                       licenseUrl: "http://www.opensource.org/licenses/lgpl-2.1.php"),
    new LibraryLicense(name: "TestNG", version: "6.9 snapshot", license: "Apache 2.0", url: "http://testng.org/doc/",
                       licenseUrl: "https://github.com/cbeust/testng/blob/master/LICENSE.txt"),
    new LibraryLicense(name: "Trilead SSH", libraryName: "trilead-ssh2", version: "build 213 and 217",
                       license: "BSD style (see LICENSE.txt in trilead.jar)", url: "http://www.trilead.com/SSH_Library/"),
    new LibraryLicense(name: "Twitter4J", libraryName: "twitter4j-core-4.0.4.jar", version: "4.0.4", license: "Apache 2.0",
                       url: "http://twitter4j.org/", licenseUrl: "http://twitter4j.org/en/index.html#license"),
    new LibraryLicense(name: "Trove4j", version: "1.1 (with patches by JetBrains)", license: "LGPL", url: "http://trove4j.sourceforge.net/",
                       licenseUrl: "http://trove4j.sourceforge.net/html/license.html"),
    new LibraryLicense(name: "Velocity", version: "1.7", license: "Apache 2.0", url: "http://velocity.apache.org/",
                       licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt"),
    new LibraryLicense(name: "winp", version: "1.23", license: "MIT", url: "http://java.net/projects/winp",
                       licenseUrl: "http://opensource.org/licenses/mit-license.php"),
    new LibraryLicense(name: "Xalan", libraryName: "Xalan-2.7.1", version: "2.7.1", license: "Apache 2.0",
                       url: "http://xml.apache.org/xalan-j/", licenseUrl: "http://xml.apache.org/xalan-j/"),
    new LibraryLicense(name: "Xerces", version: "2.11", license: "Apache 2.0", url: "http://xerces.apache.org/xerces2-j/",
                       licenseUrl: "http://xerces.apache.org/xerces2-j/"),
    new LibraryLicense(name: "Xerial SQLite JDBC", libraryName: "sqlite", version: "3.6.20.1", license: "Apache 2.0",
                       url: "https://github.com/xerial/sqlite-jdbc"),
    new LibraryLicense(name: "XML-RPC", libraryName: "XmlRPC", version: "2.0", license: "Apache 2.0",
                       url: "http://ws.apache.org/xmlrpc/xmlrpc2/", licenseUrl: "http://ws.apache.org/xmlrpc/xmlrpc2/license.html"),
    new LibraryLicense(name: "XML Commons (xml-apis.jar, resolver.jar)", version: "",
                       license: "Apache 2.0, W3C Software License , public domain", url: "http://xml.apache.org/commons/",
                       licenseUrl: "http://xml.apache.org/commons/licenses.html"),
    new LibraryLicense(name: "XMLBeans", libraryName: "XmlBeans", version: "2.3.0", license: "Apache 2.0", url: "http://xmlbeans.apache.org/",
                       licenseUrl: "http://svn.jetbrains.org/idea/Trunk/bundled/WebServices/resources/lib/xmlbeans-2.3.0/xmlbeans.LICENSE"),
    new LibraryLicense(name: "XStream", libraryName: "XStream", version: "1.4.2", license: "BSD License",
                       url: "https://github.com/codehaus/xstream", licenseUrl: "https://github.com/codehaus/xstream/blob/master/LICENSE.txt"),
    new LibraryLicense(name: "XStream", version: "1.4.3", license: "BSD", url: "https://github.com/codehaus/xstream",
                       licenseUrl: "https://github.com/codehaus/xstream/blob/master/LICENSE.txt"),
    new LibraryLicense(name: "YourKit Java Profiler", libraryName: "yjp-controller-api-redist.jar", version: "8.0.x",
                       license: "link (commercial license)", url: "http://yourkit.com/",
                       licenseUrl: "http://www.yourkit.com/purchase/license.html"),

    jetbrainsLibrary("Coverage"),
    jetbrainsLibrary("CoverageReport"),
    jetbrainsLibrary("intellij-markdown.jar"),
    jetbrainsLibrary("JPS"),
    jetbrainsLibrary("Maven Embedder"),
    jetbrainsLibrary("tcServiceMessages"),
    jetbrainsLibrary("optimizedFileManager.jar"),
    jetbrainsLibrary("KotlinJavaRuntime")
  ] as List<LibraryLicense>
}