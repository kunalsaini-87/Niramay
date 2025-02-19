import React from "react";
import ElectronicCategoryCard from "./ElectronicCategoryCard";
import { useMediaQuery } from "@mui/material";

const electronics = [
  {
    section: "SPORTS_CATEGORIES",
    name: "Personalcare",
    image:
      "https://th.bing.com/th/id/OIP.rihHF2x8oOA4bWDiCsBlAQHaHa?w=177&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
    categoryId: "personalcare"
  },
  {
    section: "SPORTS_CATEGORIES",
    name: "Protein",
    image:
      "https://cdn.nutrabay.com/wp-content/uploads/2021/02/NB-WEL-1003-01-01.jpg",
    categoryId: "protein"
  },
  {
    section: "SPORTS_CATEGORIES",
    name: "Skincare",
    image:
      "https://images.pexels.com/photos/3762466/pexels-photo-3762466.jpeg?auto=compress&cs=tinysrgb&w=600",
    categoryId: "skincare"
  },
  {
    section: "SPORTS_CATEGORIES",
    name: "Haircare",
    image:  
    "https://m.media-amazon.com/images/I/61GGg1vs3DL._AC_UL480_FMwebp_QL65_.jpg",
    categoryId: "haircare"
  },
  {
    section: "SPORTS_CATEGORIES",
    name: "Kidsnutrition",
    image:
      "https://m.media-amazon.com/images/I/719pIvBQYEL._AC_UL480_FMwebp_QL65_.jpg",
    categoryId: "kidsnutrition"
  }
];

const ElectronicCategory = () => {
  const isSmallScreen = useMediaQuery("(max-width:600px)");

  return (
    <div className="flex flex-wrap justify-between py-5 lg:px-20 border-b">
      {electronics
        .slice(0, isSmallScreen ? 5 : electronics.length)
        .map((item) => (
          <ElectronicCategoryCard key={item.categoryId} item={item} />
        ))}
    </div>
  );
};

export default ElectronicCategory;