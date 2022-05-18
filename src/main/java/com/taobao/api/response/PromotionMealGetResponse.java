package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Meal;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.promotion.meal.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PromotionMealGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6176888178427552221L;

	/** 
	 * 搭配套餐列表。
	 */
	@ApiListField("meal_list")
	@ApiField("meal")
	private List<Meal> mealList;


	public void setMealList(List<Meal> mealList) {
		this.mealList = mealList;
	}
	public List<Meal> getMealList( ) {
		return this.mealList;
	}
	


}
