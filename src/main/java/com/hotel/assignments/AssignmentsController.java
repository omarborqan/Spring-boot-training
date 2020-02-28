//package com.example.demo.assignments;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/assignment")
//public class AssignmentsController {
//    @Autowired
//    private AssignmentService assignmentService;
//
//    @GetMapping(value = "/all")
//    public ResponseEntity<List<Assignment>> getAssignments() {
//        return new ResponseEntity<List<Assignment>>(assignmentService.getAssignments(), HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/addAssignment")
//    public ResponseEntity<Assignment> addAssignment(@RequestBody final Assignment assignment) {
//        Assignment result = assignmentService.addAssignment(assignment);
//        ResponseEntity<Assignment> response;
//        response = result != null ? new ResponseEntity<Assignment>(result, HttpStatus.CREATED) :
//                new ResponseEntity<Assignment>(result, HttpStatus.ALREADY_REPORTED);
//        return response;
//    }
//
//    @GetMapping(value = "/getById")
//    public ResponseEntity<Assignment> getAssignmentById(@RequestParam final Integer id) {
//        Assignment result = assignmentService.getAssignmentById(id);
//        ResponseEntity<Assignment> response;
//        response = result != null ? new ResponseEntity<>(result, HttpStatus.FOUND) :
//                new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
//        return response;
//    }
//
//    @PutMapping(value = "/updateAssignment")
//    public ResponseEntity<Assignment> updateAssignment(@RequestParam final Integer id, @RequestBody final Assignment assignment) {
//        Assignment result = assignmentService.updateAssignment(id, assignment);
//        ResponseEntity<Assignment> response;
//        response = assignment != null ? new ResponseEntity<>(result, HttpStatus.ACCEPTED) :
//                new ResponseEntity<>(assignment, HttpStatus.NOT_MODIFIED);
//        return response;
//    }
//
//    @DeleteMapping(value = "/deleteAssignment")
//    public ResponseEntity<List<Assignment>> deleteAssignment(@RequestParam final Integer id) {
//        List<Assignment> result = assignmentService.deleteAssignment(id);
//        ResponseEntity<List<Assignment>> response = new ResponseEntity<List<Assignment>>(result, HttpStatus.OK);
//        return response;
//    }
//
//}
