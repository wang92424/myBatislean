执行过程
	1 parser.parse(解析Xml)
	2 getMapper(注册所有mapper信息)
	3 getMapper(创建proxy工厂)
	4 newinstance(创建proxy)
	5   动态代理实例化Mapper实现类
	6   返回代理对象
	7 sqlsessionfactory(sqlsession工厂)
	8 sqlsession(判断sql(insert delete select... 查询执行selectone selectlist))
	9 executor(装饰模式执行sql拼装)
	10 jdbc(查询数据库返回查询结果)

代码过程
	1 解析配置文件
	2 实现动态代理(MapperProxy)
	3 加载代理对象执行sql(sqlsession)
	4 封装jdbc(simpleExecutor)
	5 实现Mapper接口
	6 映射数据库实体 