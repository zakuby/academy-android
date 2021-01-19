package com.dicoding.academy.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.academy.data.CourseEntity
import com.dicoding.academy.data.ModuleEntity
import com.dicoding.academy.utils.DataDummy

class DetailCourseViewModel : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity? {
        val coursesEntities = DataDummy.generateDummyCourses()
        return coursesEntities.find { it.courseId == courseId }
    }

    fun getModules(): List<ModuleEntity> = DataDummy.generateDummyModules(courseId)
}