

	//һ��Ҫ��this��ָ����ǰ��������Ԫ��
	$("div[class='desc']").each(function(i){
		$(this).children(".soleMvCommentUser").text(data.comment[i].userName);//����û���
		$(this).children(".soleMvCommentContent").text(data.comment[i].content);//����û����ۣ���:firstѡ������ֻѡ���һ����
		$(this).children("a").attr(data.comment[i].thumpUpUrl);//������۵��޵�ַ
	})


	//��һ��ʵ�֣�
	$("h3[class='soleMvCommentUser']").each(function(i){
		$(this).text(data.comment[i].userName);//����û���
	});
	$("p[class='soleMvCommentContent']").each(function(i){
		$(this).text(data.comment[i].content);//����û����ۣ���:firstѡ������ֻѡ���һ����
	});
	$("a[class='btn btn-primary soleMvCommentTu']").each(function(i){
		$(this).attr("href",data.comment[i].thumpUpUrl);//������۵��޵�ַ���޸����ԣ�ѡ���и����Ե�Ԫ�أ�Ȼ��attr("������","����ֵ")
	});
