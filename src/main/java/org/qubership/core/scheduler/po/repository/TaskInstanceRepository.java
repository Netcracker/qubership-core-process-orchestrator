package org.qubership.core.scheduler.po.repository;

import org.qubership.core.scheduler.po.model.pojo.TaskInstanceImpl;

import java.util.List;

public interface TaskInstanceRepository {

    void putTaskInstance(TaskInstanceImpl taskInstance);
    TaskInstanceImpl getTaskInstance(String id);

    List<TaskInstanceImpl> getProcessTaskInstances(String processId);

}
