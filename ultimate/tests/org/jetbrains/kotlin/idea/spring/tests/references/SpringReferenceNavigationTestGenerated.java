/*
 * Copyright 2010-2016 JetBrains s.r.o.
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

package org.jetbrains.kotlin.idea.spring.tests.references;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("ultimate/testData/spring/core/references/navigation")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SpringReferenceNavigationTestGenerated extends AbstractSpringReferenceNavigationTest {
    public void testAllFilesPresentInNavigation() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("ultimate/testData/spring/core/references/navigation"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("fileReferenceInClasspathResource.kt")
    public void testFileReferenceInClasspathResource() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/references/navigation/fileReferenceInClasspathResource.kt");
        doTest(fileName);
    }

    @TestMetadata("fileReferenceInClasspathXmlContext.kt")
    public void testFileReferenceInClasspathXmlContext() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/references/navigation/fileReferenceInClasspathXmlContext.kt");
        doTest(fileName);
    }

    @TestMetadata("scopeReference.kt")
    public void testScopeReference() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/references/navigation/scopeReference.kt");
        doTest(fileName);
    }

    @TestMetadata("springBeanRefInFactoryContainsBean.kt")
    public void testSpringBeanRefInFactoryContainsBean() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/references/navigation/springBeanRefInFactoryContainsBean.kt");
        doTest(fileName);
    }

    @TestMetadata("springBeanRefInFactoryGetBean.kt")
    public void testSpringBeanRefInFactoryGetBean() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/references/navigation/springBeanRefInFactoryGetBean.kt");
        doTest(fileName);
    }

    @TestMetadata("springBeanRefInResource.kt")
    public void testSpringBeanRefInResource() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/references/navigation/springBeanRefInResource.kt");
        doTest(fileName);
    }

    @TestMetadata("springFactoryBeanRefInResource.kt")
    public void testSpringFactoryBeanRefInResource() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("ultimate/testData/spring/core/references/navigation/springFactoryBeanRefInResource.kt");
        doTest(fileName);
    }
}
