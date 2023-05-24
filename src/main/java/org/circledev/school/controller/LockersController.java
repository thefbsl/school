package org.circledev.school.controller;

import lombok.RequiredArgsConstructor;
import org.circledev.school.dto.LockerDto;
import org.circledev.school.facade.LockerFacade;
import org.circledev.school.request.locker.CreateLocker;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lockers/")
@RequiredArgsConstructor
public class LockersController {
    private final LockerFacade lockerFacade;
    @PostMapping("/create")
    public LockerDto createLocker(@RequestBody CreateLocker request){
        return lockerFacade.createLocker(request);
    }

    @GetMapping("/get")
    public List<LockerDto> getLockers(){
        return lockerFacade.getLockers();
    }

    @GetMapping("/get/{lockerId}")
    public LockerDto getLockerById(@PathVariable Long lockerId){
        return lockerFacade.getLockerById(lockerId);
    }

    @DeleteMapping("/delete/{lockerId}")
    public void deleteLocker(@PathVariable Long lockerId){
        lockerFacade.deleteLocker(lockerId);
    }
}
