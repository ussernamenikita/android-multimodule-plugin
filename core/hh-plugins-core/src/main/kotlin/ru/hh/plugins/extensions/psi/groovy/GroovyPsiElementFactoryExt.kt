package ru.hh.plugins.extensions.psi.groovy

import com.intellij.psi.PsiElement
import org.jetbrains.plugins.groovy.lang.psi.GroovyPsiElementFactory
import ru.hh.plugins.model.BuildGradleDependency


fun GroovyPsiElementFactory.createBuildGradleDependencyElement(dependency: BuildGradleDependency): PsiElement {
    val dependencyText = when (dependency) {
        is BuildGradleDependency.Project -> "\":${dependency.projectName}\""
        is BuildGradleDependency.LibsConstant -> "\"${dependency.constant}\""
    }
    val expressionText = "${dependency.type.yamlKey} $dependencyText"

    return createExpressionFromText(expressionText)
}