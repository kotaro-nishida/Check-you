package models.response.Check;

import java.util.*;

public class CheckResponse {
	public Long id;
	public String name;
	public String result;
	public Date create;
	public Date modified;

	// デフォルトコンストラクタ
	public CheckResponse(){

	}

	// コンストラクタ
	public CheckResponse( Long id,String name,String result,Date create,Date modified ){
		this.id = id;
		this.name = name;
		this.result = result;
		this.create = create;
		this.modified = modified;
	}



}
