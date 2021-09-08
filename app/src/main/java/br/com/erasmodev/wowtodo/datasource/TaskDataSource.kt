package br.com.erasmodev.wowtodo.datasource

import br.com.erasmodev.wowtodo.model.Task

object TaskDataSource {
    private val list = arrayListOf<Task>()

    fun getList() = list

    fun insertTask(task: Task) {
        list.add(task.copy(id = list.size + 1))
    }
}