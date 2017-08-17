

	//一定要用this来指定当前遍历到的元素
	$("div[class='desc']").each(function(i){
		$(this).children(".soleMvCommentUser").text(data.comment[i].userName);//填充用户名
		$(this).children(".soleMvCommentContent").text(data.comment[i].content);//填充用户评论（用:first选择器，只选择第一个）
		$(this).children("a").attr(data.comment[i].thumpUpUrl);//填充评论的赞地址
	})


	//另一种实现，
	$("h3[class='soleMvCommentUser']").each(function(i){
		$(this).text(data.comment[i].userName);//填充用户名
	});
	$("p[class='soleMvCommentContent']").each(function(i){
		$(this).text(data.comment[i].content);//填充用户评论（用:first选择器，只选择第一个）
	});
	$("a[class='btn btn-primary soleMvCommentTu']").each(function(i){
		$(this).attr("href",data.comment[i].thumpUpUrl);//填充评论的赞地址，修改属性，选择含有该属性的元素，然后attr("属性名","属性值")
	});
