package com.github.uenowataru04.androidstudiotemplatesample.services

import com.github.uenowataru04.androidstudiotemplatesample.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
