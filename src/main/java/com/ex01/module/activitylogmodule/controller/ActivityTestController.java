//package com.ex01.module.activitylogmodule.controller;
//
//import com.ex01.module.activitylogmodule.dto.ActivityLogCreateDTO;
//import com.ex01.module.activitylogmodule.dto.ActivityLogDTO;
//import com.ex01.module.activitylogmodule.model.ActivityLogModel;
//import com.ex01.module.activitylogmodule.service.ActivityLogService;
//import com.ex01.module.activitylogmodule.utils.domain.JsonResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/ex01/log")
//public class ActivityTestController {
//
//    @Autowired
//    private ActivityLogService activityLogService;
//
//    @GetMapping("/test")
//    public String test(){
//        return "LOG";
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<?> add(@RequestBody(required=false) ActivityLogCreateDTO request){
//        ActivityLogCreateDTO datas = activityLogService.add(request);
//        JsonResponse jsonResponse = new JsonResponse(datas, true);
//        return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
//    }
//
//    @PostMapping("/update")
//    public ResponseEntity<?> update(@RequestBody(required=false) ActivityLogDTO request){
//        ActivityLogDTO datas = activityLogService.update(request);
//        JsonResponse jsonResponse = new JsonResponse(datas, true);
//        return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id){
//        boolean success = activityLogService.delete(id);
//        JsonResponse jsonResponse = new JsonResponse(success);
//        return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
//    }
//
//
//}
