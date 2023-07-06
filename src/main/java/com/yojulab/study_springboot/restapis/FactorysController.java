// package com.yojulab.study_springboot.restapis;

// import java.util.Map;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.yojulab.study_springboot.service.CarInforsService;

// @RestController
// public class FactorysController {
//     @Autowired
//     CarInforsService carInforsService;

//     // selectSearch/YEAR/2020
//     // selectSearch/CAR_NAME/소
//     @GetMapping("/selectSearch/{search}/{words}")
//     public ResponseEntity selectSearch(@PathVariable String search, @PathVariable String words) {
//         Object result = factorysService.selectSearch(search,words);
//         return ResponseEntity.ok().body(result);
//     }

//     // create
//     @PostMapping("/insert")
//     public ResponseEntity insert(@RequestBody Map paramMap) {
//         Object result = factorysService.insert(paramMap);
//         return ResponseEntity.ok().body(result);
//     }

//     // update
//     @PutMapping("/update")
//     public ResponseEntity update(@RequestBody Map paramMap) {
//         Object result = factorysService.update(paramMap);
//         return ResponseEntity.ok().body(result);
//     }

//     // delete
//     @DeleteMapping("/delete/{COMPANY_ID}")
//     public ResponseEntity delete(@PathVariable String COMPANY_ID) {
//         Object result = factorysService.delete(COMPANY_ID);
//         return ResponseEntity.ok().body(result);
//     }
// }
