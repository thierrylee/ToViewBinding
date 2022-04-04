package com.github.thierrylee.toviewbinding.services

import com.intellij.openapi.project.Project
import com.github.thierrylee.toviewbinding.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
