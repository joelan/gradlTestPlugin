package com.lrq.joe.testgradle

import org.gradle.api.Plugin
import org.gradle.api.Project


public  class MytestPlugin  implements Plugin<Project> {


    @Override
    void apply(Project project) {
       // project.task('testTask') << {
            println "Hello this Joe's gradle plugin"
      //  }
    }
}