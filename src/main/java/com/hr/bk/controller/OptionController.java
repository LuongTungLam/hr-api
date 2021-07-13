package com.hr.bk.controller;

import com.hr.bk.enitiy.Color;
import com.hr.bk.enitiy.Option;
import com.hr.bk.model.OptionModel;
import com.hr.bk.service.ColorService;
import com.hr.bk.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/options"})
@CrossOrigin("*")
public class OptionController {

    @Autowired
    ColorService colorService;

    @Autowired
    OptionService optionService;

    @GetMapping
    public OptionModel getAllOptionModel() {
        OptionModel optionModel = new OptionModel();
        optionModel.setColors(colorService.findAll());
        optionModel.setOptions(optionService.findAll());
        return optionModel;
    }

    @GetMapping("/color")
    public List<Color> getAllColors() {
        List<Color> list = colorService.findAll();
        return list;
    }

    @GetMapping("/option")
    public List<Option> getAllOptions() {
        List<Option> list = optionService.findAll();
        return list;
    }

    @PostMapping("/color")
    public boolean saveColor(@RequestBody Color color) {
        Color save = colorService.save(color);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @GetMapping("/color/{id}")
    public Color getColorById(@PathVariable(value = "id") Integer id) {
        Color color = colorService.findById(id);
        return color;
    }

    @GetMapping("/option/{id}")
    public Option getOptionById(@PathVariable(value = "id") Integer id) {
        Option option = optionService.findById(id);
        return option;
    }

    @PutMapping("/color/{id}")
    public boolean updateColor(@PathVariable(value = "id") Integer id, @RequestBody Color color) {
        Color update = colorService.findById(id);
        update.setLabel(color.getLabel());
        update.setValue(color.getValue());
        update.setCode(color.getCode());
        if (colorService.save(update) != null) {
            return true;
        } else {
            return false;
        }
    }

    @DeleteMapping("/color/{id}")
    public boolean deleteColor(@PathVariable(value = "id") Integer id) {
        Color color = colorService.findById(id);
        if (colorService.remove(color)) {
            return true;
        } else {
            return false;
        }
    }


    @PostMapping("/option")
    public boolean saveOption(@RequestBody Option option) {
        Option save = optionService.save(option);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @PutMapping("/option/{id}")
    public boolean updateOption(@PathVariable(value = "id") Integer id, @RequestBody Option option) {
        Option update = optionService.findById(id);
        update.setLabel(option.getLabel());
        update.setValue(option.getValue());
        if (optionService.save(update) != null) {
            return true;
        } else {
            return false;
        }
    }

    @DeleteMapping("/option/{id}")
    public boolean deleteOption(@PathVariable(value = "id") Integer id) {
        Option option = optionService.findById(id);
        if (optionService.remove(option)) {
            return true;
        } else {
            return false;
        }
    }

}
