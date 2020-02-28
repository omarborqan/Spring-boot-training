//package com.example.demo.assignments;
//
//import com.example.demo.employee.EmployeeService;
//import com.example.demo.room.RoomService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class AssignmentService {
//    @Autowired
//    private AssignmentRepository assignmentRepository;
//
//    @Autowired
//    private RoomService roomService;
//
//    @Autowired
//    private EmployeeService employeeService;
//
//
//    public List<Assignment> getAssignments() {
//        return assignmentRepository.findAll();
//    }
//
//    public Assignment addAssignment(final Assignment assignment) {
//        boolean isManager = employeeService.isManager(assignment.getManager().getId());
//        boolean isNotManager = employeeService.isNotManager(assignment.getEmployee().getId());
//
//        if (!assignmentRepository.findById(assignment.getId()).isEmpty() || !isNotManager || !isManager) {
//            return null;
//        }
//
//        assignmentRepository.save(assignment);
//        return assignmentRepository.findById(assignment.getId()).get();
//    }
//
//
//    public Assignment getAssignmentById(final Integer id) {
//        return assignmentRepository.findById(id).isEmpty() ?
//                null : assignmentRepository.findById(id).get();
//    }
//
//    public Assignment updateAssignment(Integer id, Assignment assignment) {
//        Optional<Assignment> oldAssignment = assignmentRepository.findById(id);
//        if (assignment.getId() == id && !oldAssignment.isEmpty()) {
//            boolean isManager = employeeService.isManager(assignment.getManager().getId());
//            boolean isNotManager = employeeService.isNotManager(assignment.getEmployee().getId());
//            if (!isManager || !isNotManager)
//                return null;
//            assignmentRepository.findById(id).get().setEmployee(assignment.getEmployee());
//            assignmentRepository.findById(id).get().setManager(assignment.getManager());
//            assignmentRepository.findById(id).get().setRoom(assignment.getRoom());
//            return assignment;
//        }
//        return null;
//    }
//
//    public List<Assignment> deleteAssignment(Integer id) {
//        Optional<Assignment> assignment = assignmentRepository.findById(id);
//        if (!assignment.isEmpty())
//            assignmentRepository.delete(assignment.get());
//        return assignmentRepository.findAll();
//    }
//}
