package com.hr.bk.model;

import com.hr.bk.enitiy.Color;
import com.hr.bk.enitiy.Option;
import lombok.Data;

import java.util.List;

@Data
public class OptionModel {
    private List<Color> colors;
    private List<Option> options;
}
