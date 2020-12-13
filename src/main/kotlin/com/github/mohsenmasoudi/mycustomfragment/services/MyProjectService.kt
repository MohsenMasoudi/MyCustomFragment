package com.github.mohsenmasoudi.mycustomfragment.services

import com.intellij.openapi.project.Project
import com.github.mohsenmasoudi.mycustomfragment.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
