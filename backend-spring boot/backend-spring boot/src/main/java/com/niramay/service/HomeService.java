package com.niramay.service;

import java.util.List;

import com.niramay.model.Home;
import com.niramay.model.HomeCategory;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
